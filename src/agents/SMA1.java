package agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

import java.util.*;
import java.util.regex.*;

public class SMA1 extends Agent {

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
                    System.out.println("Received unmatched bid(s) from MACA:\n" + content);

                    // 解析多条消息内容
                    List<RemainingInfo> parsedInfos = parseMessages(content);
                    if (!parsedInfos.isEmpty()) {
                        remainingBids.addAll(parsedInfos); // 存储解析结果
                        printRemainingBids(); // 输出解析后的信息
                    }
                }
            } else {
                block(100);
            }
        }
    }

    /**
     * 解析来自 MACA 的多条消息内容
     *
     * @param content 消息内容（可能包含多条信息）
     * @return List<RemainingInfo> 对象列表，包含代理名称、剩余量和报价
     */
    private List<RemainingInfo> parseMessages(String content) {
        List<RemainingInfo> parsedInfos = new ArrayList<>();

        try {
            // 使用正则表达式提取所有代理信息
            Pattern pattern = Pattern.compile("Agent: ([^,]+), Remaining: ([0-9]+(?:\\.[0-9]+)?) kWh, Price: ([0-9]+(?:\\.[0-9]+)?)");
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                String agentName = matcher.group(1);
                double remainingAmount = Double.parseDouble(matcher.group(2));
                double price = Double.parseDouble(matcher.group(3));

                RemainingInfo info = new RemainingInfo(agentName, remainingAmount, price);
                parsedInfos.add(info);

                System.out.println("Parsed -> Agent: " + agentName + ", Remaining: " + remainingAmount + " kWh, Price: " + price + " $/kWh");
            }

            if (parsedInfos.isEmpty()) {
                System.err.println("No valid information found in message: " + content);
            }
        } catch (Exception e) {
            System.err.println("Error parsing messages: " + content);
            e.printStackTrace();
        }

        return parsedInfos;
    }

    /**
     * 输出所有存储的剩余代理信息
     */
    private void printRemainingBids() {
        if (remainingBids.isEmpty()) {
            System.out.println("No remaining bids stored in SMA.");
        } else {
            System.out.println("Current Remaining Bids in SMA:");
            for (RemainingInfo info : remainingBids) {
                System.out.println("Agent: " + info.agentName + ", Remaining: " + info.remainingAmount + " kWh, Price: " + info.price + " $/kWh");
            }
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
