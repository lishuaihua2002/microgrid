package agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

import java.util.*;
import java.text.DecimalFormat;

public class MACA1 extends Agent {

    private final List<Bid> loadBids = new ArrayList<>();       // 负载出价列表
    private final List<Bid> generationBids = new ArrayList<>(); // 发电出价列表
    private final List<String> remainingBidsOutput = new ArrayList<>(); // 用于存储剩余信息
    private final DecimalFormat df = new DecimalFormat("#.##");

    private long windowEndTime = 0; // 当前时间窗口的结束时间
    private final int WINDOW_TIME = 5000; // 时间窗口长度（毫秒）
    private static final String SMA_AGENT = "SMA"; // SMA代理的名称

    @Override
    protected void setup() {
        System.out.println("MACA1 agent " + getLocalName() + " started.");

        // 启动拍卖行为和发送未匹配信息行为
        addBehaviour(new AuctionBehaviour());
        addBehaviour(new SendRemainingBidsBehaviour()); // 添加新行为
    }

    /**
     * 主要拍卖逻辑
     */
    private class AuctionBehaviour extends CyclicBehaviour {
        @Override
        public void action() {
            if (windowEndTime == 0) {
                ACLMessage msg = receive();
                if (msg != null) {
                    System.out.println("Received first message, starting new auction cycle...");
                    windowEndTime = System.currentTimeMillis() + WINDOW_TIME;
                    processMessage(msg);
                } else {
                    block(100);
                }
            } else {
                if (System.currentTimeMillis() > windowEndTime) {
                    performAuction(); // 执行拍卖
                    printRemainingBids(); // 输出剩余信息
                    loadBids.clear();
                    generationBids.clear();
                    windowEndTime = 0;
                } else {
                    ACLMessage msg = receive();
                    if (msg != null) {
                        windowEndTime = System.currentTimeMillis() + WINDOW_TIME; // 刷新时间窗口
                        processMessage(msg);
                    } else {
                        block(100);
                    }
                }
            }
        }
    }

    /**
     * 处理接收的消息
     */
    private void processMessage(ACLMessage msg) {
        String content = msg.getContent();
        String sender = msg.getSender().getLocalName();

        if (content.contains("Load")) {
            Bid load = parseBid(content, sender, "Load");
            loadBids.add(load);
        } else if (content.contains("Generation")) {
            Bid generation = parseBid(content, sender, "Generation");
            generationBids.add(generation);
        }
    }

    /**
     * 执行拍卖逻辑：优先匹配负载出价高的和发电出价低的
     */
    private void performAuction() {
        loadBids.sort(Comparator.comparingDouble(b -> -b.price)); // 按出价降序
        generationBids.sort(Comparator.comparingDouble(b -> b.price)); // 按出价升序

        System.out.println("Starting auction matching...");

        while (!loadBids.isEmpty() && !generationBids.isEmpty()) {
            Bid load = loadBids.get(0);
            Bid generation = generationBids.get(0);

            // 计算交易量和价格
            double tradedAmount = Math.min(load.remaining, generation.remaining);
            double price = (load.price + generation.price) / 2;
            price = Double.parseDouble(df.format(price));

            // 输出匹配结果
            System.out.println("Matched: " + load.agentName + " with " + generation.agentName
                    + " | Amount: " + tradedAmount + " kWh, Price: " + price + " $/kWh");

            load.remaining -= tradedAmount;
            generation.remaining -= tradedAmount;

            // 移除完全匹配的项
            if (load.remaining == 0) loadBids.remove(0);
            if (generation.remaining == 0) generationBids.remove(0);
        }
    }

    /**
     * 输出剩余的负载和发电余量，同时将信息存储到remainingBidsOutput
     */
    private void printRemainingBids() {
        remainingBidsOutput.clear(); // 清空之前的存储
        System.out.println("Remaining Bids after auction:");
        for (Bid load : loadBids) {
            String output = "Load Agent: " + load.agentName + ", Remaining: " + load.remaining + " kWh, Price: " + load.price;
            System.out.println(output);
            remainingBidsOutput.add(output);
        }
        for (Bid generation : generationBids) {
            String output = "Generation Agent: " + generation.agentName + ", Remaining: " + generation.remaining + " kWh, Price: " + generation.price;
            System.out.println(output);
            remainingBidsOutput.add(output);
        }
    }

    /**
     * 新增行为：发送剩余信息到SMA
     */
    private class SendRemainingBidsBehaviour extends CyclicBehaviour {
        @Override
        public void action() {
            if (!remainingBidsOutput.isEmpty()) {
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                msg.addReceiver(new jade.core.AID(SMA_AGENT, jade.core.AID.ISLOCALNAME));

                StringBuilder contentBuilder = new StringBuilder();
                for (String output : remainingBidsOutput) {
                    contentBuilder.append(output).append("\n");
                }
                msg.setContent(contentBuilder.toString());
                send(msg);
                System.out.println("Remaining bids sent to SMA:\n" + msg.getContent());

                remainingBidsOutput.clear(); // 清空已发送的内容
            }
            block(1000); // 每隔1秒检查是否有新信息需要发送
        }
    }

    /**
     * 解析出价信息
     */
    private Bid parseBid(String content, String sender, String type) {
        double amount = 0.0;
        double price = 0.0;

        try {
            String amountRegex = type.equals("Load") ? "Load: ([0-9]+(?:\\.[0-9]+)?) kWh" : "Generation: ([0-9]+(?:\\.[0-9]+)?) kWh";
            String priceRegex = "Price: ([0-9]+(?:\\.[0-9]+)?) \\$/kWh";

            java.util.regex.Matcher amountMatcher = java.util.regex.Pattern.compile(amountRegex).matcher(content);
            if (amountMatcher.find()) {
                amount = Double.parseDouble(amountMatcher.group(1));
            }

            java.util.regex.Matcher priceMatcher = java.util.regex.Pattern.compile(priceRegex).matcher(content);
            if (priceMatcher.find()) {
                price = Double.parseDouble(priceMatcher.group(1));
            }

            System.out.println(type + " Bid received from " + sender + " -> Amount: " + amount + " kWh, Price: " + price + " $/kWh");
        } catch (Exception e) {
            System.err.println("Error parsing message: " + content + " from " + sender);
            e.printStackTrace();
        }

        return new Bid(sender, amount, price);
    }

    private static class Bid {
        String agentName;
        double remaining;
        double price;

        Bid(String agentName, double remaining, double price) {
            this.agentName = agentName;
            this.remaining = remaining;
            this.price = price;
        }
    }
}
