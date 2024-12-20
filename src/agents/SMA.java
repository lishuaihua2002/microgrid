package agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

import java.util.*;
import java.util.regex.*;

public class SMA extends Agent {

    private final List<RemainingInfo> remainingBids = new ArrayList<>(); // 存储未匹配的代理信息

    @Override
    protected void setup() {
        System.out.println("SMA agent " + getLocalName() + " started.");

        // 添加行为，接收和处理来自 MACA 的未匹配出价信息
        addBehaviour(new ReceiveUnmatchedBidsBehaviour());
    }

    /**
     * 行为：接收并解析来自 MACA 的未匹配出价信息
     */
    private class ReceiveUnmatchedBidsBehaviour extends CyclicBehaviour {

        @Override
        public void action() {
            ACLMessage msg = receive();
            if (msg != null) {
                if (msg.getPerformative() == ACLMessage.INFORM) {
                    String content = msg.getContent();
                    System.out.println("Received unmatched bid from MACA: " + content);

                    // 解析消息内容
                    RemainingInfo info = parseMessage(content);
                    if (info != null) {
                        remainingBids.add(info); // 存储解析结果
                        printRemainingBids(); // 输出解析后的信息
                    }
                }
            } else {
                block(100);
            }
        }
    }

    /**
     * 解析来自 MACA 的消息内容
     *
     * @param content 消息内容
     * @return RemainingInfo 对象，包含代理名称、剩余量和报价
     */
    private RemainingInfo parseMessage(String content) {
        try {
            // 使用正则表达式提取信息
            Pattern pattern = Pattern.compile("Agent: ([^,]+), Remaining: ([0-9]+(?:\\.[0-9]+)?) kW, Price: ([0-9]+(?:\\.[0-9]+)?) \\$/kW");
            Matcher matcher = pattern.matcher(content);

            if (matcher.find()) {
                String agentName = matcher.group(1);
                double remainingAmount = Double.parseDouble(matcher.group(2));
                double price = Double.parseDouble(matcher.group(3));

                System.out.println("Parsed -> Agent: " + agentName + ", Remaining: " + remainingAmount + " kW, Price: " + price + " $/kW");
                return new RemainingInfo(agentName, remainingAmount, price);
            } else {
                System.err.println("Failed to parse message: " + content);
            }
        } catch (Exception e) {
            System.err.println("Error parsing message: " + content);
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 输出所有剩余代理信息
     */
    private void printRemainingBids() {
        System.out.println("Current Remaining Bids in SMA:");
        for (RemainingInfo info : remainingBids) {
            System.out.println("Agent: " + info.agentName + ", Remaining: " + info.remainingAmount + " kW, Price: " + info.price + " $/kW");
        }
    }

    /**
     * 内部类：表示剩余的代理信息
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
}
