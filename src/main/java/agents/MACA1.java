package agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import org.json.JSONObject;

import java.util.*;
import java.text.DecimalFormat;

public class MACA1 extends Agent {

    private final List<Bid> loadBids = new ArrayList<>();       // 负载出价列表
    private final List<Bid> generationBids = new ArrayList<>(); // 发电出价列表
    private final List<String> remainingBidsOutput = new ArrayList<>(); // 用于存储剩余信息
    private final DecimalFormat df = new DecimalFormat("#.##");

    private long windowEndTime = 0; // 当前时间窗口的结束时间
    private final int WINDOW_TIME = 5000; // 时间窗口长度（毫秒）
    private static final String SMA_AGENT = "SMA1"; // SMA代理的名称

    @Override
    protected void setup() {
        System.out.println(getLocalName() + ": MACA1 agent started.");

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
                    System.out.println(getLocalName() + ": Received first message, starting new auction cycle...");
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
     * 处理接收的JSON消息
     */
    private void processMessage(ACLMessage msg) {
        try {
            JSONObject json = new JSONObject(msg.getContent());
            String sender = json.getString("sender");
            double amount = json.getDouble("amount");
            double price = json.getDouble("price");

            if (json.has("type")) {
                String type = json.getString("type");
                if (type.equals("load")) {
                    loadBids.add(new Bid(sender, amount, price));
                } else if (type.equals("generation")) {
                    generationBids.add(new Bid(sender, amount, price));
                }
            }
        } catch (Exception e) {
            System.err.println(getLocalName() + ": Error parsing JSON message from " + msg.getSender().getLocalName());
            e.printStackTrace();
        }
    }
    /**
     * 执行拍卖逻辑：优先匹配负载出价高的和发电出价低的
     */
    private void performAuction() {
        loadBids.sort(Comparator.comparingDouble(b -> -b.price)); // 负载按价格降序
        generationBids.sort(Comparator.comparingDouble(b -> b.price)); // 发电按价格升序

        System.out.println(getLocalName() + ": Starting auction matching...");

        while (!loadBids.isEmpty() && !generationBids.isEmpty()) {
            Bid load = loadBids.get(0);
            Bid generation = generationBids.get(0);

            // 检查价格是否匹配（负载出价 >= 发电出价）
            if (load.price >= generation.price) {
                double tradedAmount = Math.min(load.remaining, generation.remaining);
                double price = (load.price + generation.price) / 2;
                price = Double.parseDouble(df.format(price));

                // 输出匹配结果
                System.out.println(getLocalName() + ": Matched: " + load.agentName + " with " + generation.agentName
                        + " | Amount: " + tradedAmount + " kWh, Price: " + price + " $/kWh");

                load.remaining -= tradedAmount;
                generation.remaining -= tradedAmount;

                if (load.remaining == 0) loadBids.remove(0);
                if (generation.remaining == 0) generationBids.remove(0);
            } else {
                // 如果负载出价 < 发电出价，停止匹配
                break;
            }
        }
    }

    /**
     * 输出剩余的负载和发电余量
     */
    private void printRemainingBids() {
        remainingBidsOutput.clear(); // 清空之前的存储
        System.out.println(getLocalName() + ": Remaining Bids after auction:");

        for (Bid load : loadBids) {
            JSONObject json = new JSONObject();
            json.put("agent", load.agentName);
            json.put("remaining", load.remaining);
            json.put("price", load.price);
            json.put("type", "load");

            System.out.println(getLocalName() + ": " + json.toString(2));
            remainingBidsOutput.add(json.toString());
        }

        for (Bid generation : generationBids) {
            JSONObject json = new JSONObject();
            json.put("agent", generation.agentName);
            json.put("remaining", generation.remaining);
            json.put("price", generation.price);
            json.put("type", "generation");

            System.out.println(getLocalName() + ": " + json.toString(2));
            remainingBidsOutput.add(json.toString());
        }
    }

    /**
     * 发送剩余信息到SMA
     */
    private class SendRemainingBidsBehaviour extends CyclicBehaviour {
        @Override
        public void action() {
            if (!remainingBidsOutput.isEmpty()) {
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                msg.addReceiver(new jade.core.AID(SMA_AGENT, jade.core.AID.ISLOCALNAME));

                JSONObject json = new JSONObject();
                json.put("remainingBids", remainingBidsOutput);

                msg.setContent(json.toString());
                send(msg);
                System.out.println(getLocalName() + ": Remaining bids sent to SMA:\n" + json.toString(2));

                remainingBidsOutput.clear();
            }
            block(1000);
        }
    }

    /**
     * 出价信息类
     */
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
