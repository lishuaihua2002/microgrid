package agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.*;

public class SMA1 extends Agent {

    private final List<RemainingInfo> remainingBids = new ArrayList<>(); // 存储未匹配的代理信息
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
                    // 分类处理消息
                    if (sender.equals("MACA1")) {
                        System.out.println(getLocalName() + ": Received unmatched bid(s) from MACA1:\n" + content);
                        List<RemainingInfo> parsedInfos = parseMessages(content);
                        if (!parsedInfos.isEmpty()) {
                            remainingBids.addAll(parsedInfos);
                            printRemainingBids();
                            determineMarketStateAndInform(parsedInfos);
                        }
                    } else if (sender.startsWith("StrA_ESSout") || sender.equals("StrA_ESSlocal_1")) {
                        // 处理来自储能代理的响应消息
                        System.out.println(getLocalName() + ": Received response from " + sender + ": " + content);
                        handleStorageAgentResponse(sender, content);
                    }
                }
            } else {
                block(100);
            }
        }
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
     * 处理来自储能代理的响应消息
     */
    private void handleStorageAgentResponse(String sender, String content) {
        System.out.println(getLocalName() + ": Processing response from " + sender + ": " + content);
        // 根据业务逻辑处理储能代理的响应（可扩展）
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
     * 向储能代理发送市场状态信息
     */
    private void sendToStorageAgents(String content) {
        String[] storageAgents = {"StrA_ESSout_2A", "StrA_ESSout_3A", "StrA_ESSlocal_1"};

        for (String agent : storageAgents) {
            ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
            msg.addReceiver(getAID(agent));
            msg.setContent(content);
            send(msg);

            System.out.println(getLocalName() + ": Sent to " + agent + " -> " + content);
        }
    }

    /**
     * 输出所有存储的未匹配代理信息
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
}
