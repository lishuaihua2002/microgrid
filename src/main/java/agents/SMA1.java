package agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import org.json.JSONArray;
import org.json.JSONObject;

import java.text.DecimalFormat;
import java.util.*;

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
                        List<RemainingInfo> parsedInfos = parseMessagesFromMACA1(content); // 解析 MACA1 的 JSON 消息
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
     * 解析来自 MACA1 的 JSON 消息
     */
    private List<RemainingInfo> parseMessagesFromMACA1(String content) {
        List<RemainingInfo> parsedInfos = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(content); // 解析为 JSONObject
            JSONArray jsonArray = jsonObject.getJSONArray("remainingBids"); // 获取 "remainingBids" 数组

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject json = jsonArray.getJSONObject(i);
                String agentName = json.getString("agent"); // 获取代理名称
                double remainingAmount = json.getDouble("remaining"); // 获取剩余量
                double price = json.getDouble("price"); // 获取价格
                String type = json.getString("type"); // 获取类型（负载/发电）

                // 根据消息中的 type 字段，决定是否存储这个信息
                if (type.equals("load") || type.equals("generation")) {
                    RemainingInfo info = new RemainingInfo(agentName, remainingAmount, price);
                    parsedInfos.add(info); // 将解析的结果加入列表

                    System.out.println(getLocalName() + ": Parsed -> Agent: " + agentName + ", Remaining: " + remainingAmount + " kWh, Price: " + price + " $/kWh, Type: " + type);
                }
            }
        } catch (Exception e) {
            System.err.println(getLocalName() + ": Error parsing JSON from MACA1: " + content);
            e.printStackTrace();
        }
        return parsedInfos;
    }


    /**
     * 向储能代理发送市场状态信息（JSON 格式）
     */
    private void sendToStorageAgents(String marketState, double deltaP, double predictedPrice) {
        String[] storageAgents = {"StrA_ESSlocal_1","StrA_ESSout_2A", "StrA_ESSout_3A"};

        JSONObject json = new JSONObject();
        json.put("market_state", marketState);
        json.put("delta_p", deltaP);
        json.put("predicted_price", predictedPrice);

        for (String agent : storageAgents) {
            ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
            msg.addReceiver(getAID(agent));
            msg.setContent(json.toString());
            send(msg);

            System.out.println(getLocalName() + ": Sent to " + agent + " -> " + json.toString(2));
        }
    }

    /**
     * 解析来自储能代理的 JSON 消息
     */
    private RemainingInfo parseStorageBid(String sender, String content) {
        try {
            JSONObject json = new JSONObject(content);
            double remainingAmount = json.getDouble("available_capacity");
            double price = json.getDouble("bid_price");

            return new RemainingInfo(sender, remainingAmount, price);
        } catch (Exception e) {
            System.err.println(getLocalName() + ": Error parsing JSON from " + sender + ": " + content);
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 广义第二价格拍卖
     */
    private void executeAuction() {
        System.out.println(getLocalName() + ": Starting auction with updated rules...");
        List<AuctionRecord> auctionRecords = new ArrayList<>();

        boolean isDGAsSeller = remainingBids.stream().allMatch(info -> info.agentName.contains("DG"));
        List<RemainingInfo> buyers = isDGAsSeller ? new ArrayList<>(storageAgentBids.values()) : new ArrayList<>(remainingBids);
        List<RemainingInfo> sellers = isDGAsSeller ? new ArrayList<>(remainingBids) : new ArrayList<>(storageAgentBids.values());

        buyers.sort(Comparator.comparingDouble(info -> -info.price)); // 买方按价格降序排列
        sellers.sort(Comparator.comparingDouble(info -> info.price)); // 卖方按价格升序排列

        while (!buyers.isEmpty() && !sellers.isEmpty()) {
            RemainingInfo buyer = buyers.get(0);  // 当前最高出价的买方
            RemainingInfo seller = sellers.get(0);  // 当前最低出价的卖方

            double tradedAmount = Math.min(buyer.remainingAmount, seller.remainingAmount);

            // 根据储能代理的角色确定第二价格
            double secondPrice;
            if (isDGAsSeller) {
                // 如果储能代理是买方，第二价格来自买方列表中的第二个元素（如果存在）
                secondPrice = buyers.size() > 1 ? buyers.get(1).price : buyer.price;
            } else {
                // 如果储能代理是卖方，第二价格来自卖方列表中的第二个元素（如果存在）
                secondPrice = sellers.size() > 1 ? sellers.get(1).price : seller.price;
            }

            // 交易价格为储能代理的第二价格和当前交易方价格的平均值
            double transactionPrice;
            if (isDGAsSeller) {
                // 如果储能代理是买方，当前交易方价格取卖方价格
                transactionPrice = (secondPrice + seller.price) / 2;
            } else {
                // 如果储能代理是卖方，当前交易方价格取买方价格
                transactionPrice = (secondPrice + buyer.price) / 2;
            }

            System.out.println(getLocalName() + ": Transaction -> Buyer: " + buyer.agentName + " buys from Seller: " + seller.agentName + ", Volume: " + tradedAmount + ", Price: " + transactionPrice);

            // 更新买卖双方的剩余量
            buyer.remainingAmount -= tradedAmount;
            seller.remainingAmount -= tradedAmount;

            // 如果剩余量为0，移除当前买卖方
            if (buyer.remainingAmount == 0) buyers.remove(0);
            if (seller.remainingAmount == 0) sellers.remove(0);

            // 记录交易信息
            auctionRecords.add(new AuctionRecord(buyer.agentName, seller.agentName, tradedAmount, transactionPrice));
        }
        System.out.println(getLocalName() + ": Auction completed. Summary of transactions:");
        for (AuctionRecord record : auctionRecords) {
            System.out.println("  Buyer: " + record.buyer + " - Seller: " + record.seller + " - Volume: " + record.volume + " - Price: " + record.price);
        }

        sendAuctionResultsToStorageAgents(isDGAsSeller);
        sendAuctionRecordsToDataCollect(auctionRecords);
    }

    /**
     * 发送拍卖结果给储能代理（JSON 格式）
     */
    private void sendAuctionResultsToStorageAgents(boolean isDGAsSeller) {
        for (Map.Entry<String, AuctionResult> entry : auctionResults.entrySet()) {
            String agentName = entry.getKey();
            AuctionResult result = entry.getValue();

            // 根据 isDGAsSeller 处理正负
            double adjustedVolume = isDGAsSeller ? result.totalVolume : -result.totalVolume;
            double adjustedRevenue = isDGAsSeller ? -result.totalRevenue : result.totalRevenue;

            JSONObject json = new JSONObject();
            json.put("total_volume", adjustedVolume);
            json.put("total_revenue", adjustedRevenue);

            ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
            msg.addReceiver(getAID(agentName));
            msg.setContent(json.toString());
            send(msg);

            System.out.println(getLocalName() + ": Sent auction results to " + agentName + ": " + json.toString(2));
        }
    }

    /**
     * 发送拍卖记录给数据收集代理（JSON 格式）
     */
    private void sendAuctionRecordsToDataCollect(List<AuctionRecord> records) {
        JSONArray jsonArray = new JSONArray();
        for (AuctionRecord record : records) {
            JSONObject json = new JSONObject();
            json.put("buyer", record.buyer);
            json.put("seller", record.seller);
            json.put("volume", record.volume);
            json.put("price", record.price);
            jsonArray.put(json);
        }

        ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
        msg.addReceiver(getAID("data_collect"));
        msg.setContent(jsonArray.toString());
        send(msg);

        System.out.println(getLocalName() + ": Sent auction records to data_collect:\n" + jsonArray.toString(2));
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

        String marketState = deltaP > 0 ? "generation" : "load";

        // 发送市场状态信息给储能代理
        sendToStorageAgents(marketState, deltaP, predictedPrice);
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
            totalVolume = volume;
            totalRevenue = volume * price;
        }
    }
}