package agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.*;

public class SMA1 extends Agent {

    private final List<RemainingInfo> remainingBids = new ArrayList<>(); // 存储未匹配的代理信息
    private final Map<String, AuctionResult> auctionResults = new HashMap<>(); // 存储拍卖结果
    private final Map<String, RemainingInfo> storageAgentBids = new HashMap<>(); // 储能代理的报价信息
    private static final double C0 = 11.25; // 市场预测价格公式的常数项
    private static final double C1 = -0.042;  // 市场预测价格公式的斜率
    private DecimalFormat df = new DecimalFormat("#.##");

    @Override
    protected void setup() {
        System.out.println(getLocalName() + ": SMA1 agent started.");

        // 添加行为：接收和处理消息
        addBehaviour(new ReceiveMessagesBehaviour());
    }

    /**
     * 行为：接收和分类处理消息
     */
    private class ReceiveMessagesBehaviour extends CyclicBehaviour {

        @Override
        public void action() {
            ACLMessage msg = receive();
            if (msg != null) {
                String sender = msg.getSender().getLocalName();
                String content = msg.getContent();

                if (msg.getPerformative() == ACLMessage.INFORM) {
                    if (sender.equals("MACA1")) {
                        System.out.println(getLocalName() + ": Received unmatched bid(s) from MACA1:\n" + content);
                        List<RemainingInfo> parsedInfos = parseMessages(content); // 保留原MACA解析方法
                        if (!parsedInfos.isEmpty()) {
                            remainingBids.addAll(parsedInfos);
                            printRemainingBids();
                            determineMarketStateAndInform(parsedInfos);
                        }
                    } else if (sender.startsWith("StrA_ESSout") || sender.equals("StrA_ESSlocal_1")) {
                        // 收集储能代理的报价信息
                        System.out.println(getLocalName() + ": Received response from " + sender + ": " + content);
                        RemainingInfo bid = parseStorageBid(sender, content);
                        if (bid != null) {
                            storageAgentBids.put(sender, bid);
                        }

                        // 当收到所有储能代理的报价后，触发拍卖
                        if (storageAgentBids.size() == 3) {
                            executeAuction();
                            storageAgentBids.clear(); // 清空已处理的报价
                        }
                    }
                }
            } else {
                block(100);
            }
        }
    }
    /**
     * 向储能代理发送市场状态信息
     */
    private void sendToStorageAgents(String content) {
        String[] storageAgents = {"StrA_ESSout_2A", "StrA_ESSout_3A"};

        for (String agent : storageAgents) {
            ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
            msg.addReceiver(getAID(agent));
            msg.setContent(content);
            send(msg);

            System.out.println(getLocalName() + ": Sent to " + agent + " -> " + content);
        }
    }

    /**
     * 广义第二价格拍卖
     */
    private void executeAuction() {
        System.out.println(getLocalName() + ": Starting auction...");
        List<AuctionRecord> auctionRecords = new ArrayList<>();

        while (!remainingBids.isEmpty() && !storageAgentBids.isEmpty()) {
            // 获取买方和卖方的排序
            remainingBids.sort(Comparator.comparingDouble(info -> -info.price)); // 按买方出价从高到低排序
            List<RemainingInfo> sellers = new ArrayList<>(storageAgentBids.values());
            sellers.sort(Comparator.comparingDouble(info -> info.price)); // 按卖方出价从低到高排序

            // 如果买方或卖方为空，则终止拍卖
            if (remainingBids.isEmpty() || sellers.isEmpty()) {
                break;
            }

            // 获取最高出价的买方和最低出价的卖方
            RemainingInfo buyer = remainingBids.get(0);
            RemainingInfo seller = sellers.get(0);

            // 计算交易量和交易价格
            double tradedAmount = Math.min(buyer.remainingAmount, seller.remainingAmount);
            double secondPrice = sellers.size() > 1 ? sellers.get(1).price : seller.price;
            double price = Math.max(buyer.price, secondPrice);

            // 更新买方和卖方剩余量
            buyer.remainingAmount -= tradedAmount;
            seller.remainingAmount -= tradedAmount;

            if (buyer.remainingAmount == 0) {
                remainingBids.remove(0);
            }
            if (seller.remainingAmount == 0) {
                storageAgentBids.remove(seller.agentName);
            }

            // 记录交易
            auctionRecords.add(new AuctionRecord(buyer.agentName, seller.agentName, tradedAmount, price));

            // 更新拍卖结果
            auctionResults.computeIfAbsent(seller.agentName, k -> new AuctionResult()).addResult(tradedAmount, price);
        }

        // 将拍卖结果发送给储能代理和数据收集代理
        sendAuctionResultsToStorageAgents();
        sendAuctionRecordsToDataCollect(auctionRecords);
    }

    /**
     * 解析来自 MACA1 的多条消息内容
     */
    private List<RemainingInfo> parseMessages(String content) {
        List<RemainingInfo> parsedInfos = new ArrayList<>();
        try {
            Pattern pattern = Pattern.compile("Agent: ([^,]+), Remaining: ([0-9]+(?:\\.[0-9]+)?) kWh, Price: ([0-9]+(?:\\.[0-9]+)?)");
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                String agentName = matcher.group(1);
                double remainingAmount = Double.parseDouble(matcher.group(2));
                double price = Double.parseDouble(matcher.group(3));

                RemainingInfo info = new RemainingInfo(agentName, remainingAmount, price);
                parsedInfos.add(info);

                System.out.println(getLocalName() + ": Parsed -> Agent: " + agentName + ", Remaining: " + remainingAmount + " kWh, Price: " + price + " $/kWh");
            }

        } catch (Exception e) {
            System.err.println(getLocalName() + ": Error parsing messages: " + content);
            e.printStackTrace();
        }
        return parsedInfos;
    }
    /**
     * 分析剩余信息，确定市场状态并通知储能代理
     */
    private void determineMarketStateAndInform(List<RemainingInfo> infos) {
        double totalSupply = infos.stream()
                .filter(info -> info.agentName.startsWith("MG1_DG")) // 筛选发电代理
                .mapToDouble(info -> info.remainingAmount)
                .sum();

        double totalDemand = infos.stream()
                .filter(info -> info.agentName.startsWith("MG1_Load")) // 筛选负载代理
                .mapToDouble(info -> info.remainingAmount)
                .sum();

        double deltaP = totalSupply - totalDemand;
        double predictedPrice = C0 + C1 * deltaP;

        String marketState = deltaP > 0 ? "Surplus" : "Demand";

        String messageContent = String.format("Market State: %s, ΔP: %.2f kWh, Predicted Price: %.2f $/kWh",
                marketState, deltaP, predictedPrice);
        sendToStorageAgents(messageContent);
    }

    /**
     * 解析来自储能代理的出价
     */
    private RemainingInfo parseStorageBid(String sender, String content) {
        try {
            Pattern pattern = Pattern.compile("Capacity: ([0-9]+(?:\\.[0-9]+)?) kWh, Price: ([0-9]+(?:\\.[0-9]+)?)");
            Matcher matcher = pattern.matcher(content);

            if (matcher.find()) {
                double remainingAmount = Double.parseDouble(matcher.group(1));
                double price = Double.parseDouble(matcher.group(2));
                return new RemainingInfo(sender, remainingAmount, price);
            }
        } catch (Exception e) {
            System.err.println(getLocalName() + ": Error parsing bid from " + sender + ": " + content);
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 发送拍卖结果给储能代理
     */
    private void sendAuctionResultsToStorageAgents() {
        for (Map.Entry<String, AuctionResult> entry : auctionResults.entrySet()) {
            String agentName = entry.getKey();
            AuctionResult result = entry.getValue();

            ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
            msg.addReceiver(getAID(agentName));
            msg.setContent("Auction Results: Total Volume: " + df.format(result.totalVolume)
                    + " kWh, Total Revenue: " + df.format(result.totalRevenue) + " $");
            send(msg);

            System.out.println(getLocalName() + ": Sent auction results to " + agentName + ": Total Volume: "
                    + df.format(result.totalVolume) + " kWh, Total Revenue: " + df.format(result.totalRevenue) + " $");
        }
    }

    /**
     * 输出当前剩余
     */
    private void printRemainingBids() {
        if (remainingBids.isEmpty()) {
            System.out.println(getLocalName() + ": No remaining bids stored in SMA1.");
        } else {
            System.out.println(getLocalName() + ": Current Remaining Bids in SMA1:");
            for (RemainingInfo info : remainingBids) {
                System.out.println(getLocalName() + ": Agent: " + info.agentName + ", Remaining: " + info.remainingAmount + " kWh, Price: " + info.price + " $/kWh");
            }
        }
    }

    /**
     * 发送拍卖记录给数据收集代理
     */
    private void sendAuctionRecordsToDataCollect(List<AuctionRecord> records) {
        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.addReceiver(getAID("data_collect"));

        StringBuilder content = new StringBuilder();
        for (AuctionRecord record : records) {
            content.append("Buyer: ").append(record.buyer)
                    .append(", Seller: ").append(record.seller)
                    .append(", Volume: ").append(df.format(record.volume))
                    .append(" kWh, Price: ").append(df.format(record.price)).append(" $/kWh\n");
        }
        msg.setContent(content.toString());
        send(msg);

        System.out.println(getLocalName() + ": Sent auction records to data_collect:\n" + content);
    }

    /**
     * 内部类：表示剩余代理信息
     */
    private static class RemainingInfo {
        String agentName;
        double remainingAmount;
        double price;

        RemainingInfo(String agentName, double remainingAmount, double price) {
            this.agentName = agentName;
            this.remainingAmount = remainingAmount;
            this.price = price;
        }
    }

    /**
     * 内部类：表示拍卖记录
     */
    private static class AuctionRecord {
        String buyer;
        String seller;
        double volume;
        double price;

        AuctionRecord(String buyer, String seller, double volume, double price) {
            this.buyer = buyer;
            this.seller = seller;
            this.volume = volume;
            this.price = price;
        }
    }

    /**
     * 内部类：表示拍卖结果
     */
    private static class AuctionResult {
        double totalVolume;
        double totalRevenue;

        void addResult(double volume, double price) {
            totalVolume += volume;
            totalRevenue += volume * price;
        }
    }
}
