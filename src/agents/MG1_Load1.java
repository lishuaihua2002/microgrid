package agents;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;
import jade.core.AID;

import java.text.DecimalFormat;
import java.util.Random;

public class MG1_Load1 extends Agent {

    @Override
    protected void setup() {
        System.out.println(getLocalName() + ": MG1_Load1 agent started.");

        // 定义负载行为
        addBehaviour(new LoadBehaviour(this, 50000)); // 每10秒发送一次负载数据
    }

    private class LoadBehaviour extends TickerBehaviour {

        private final Random random = new Random();
        private final DecimalFormat decimalFormat = new DecimalFormat("#.##");

        public LoadBehaviour(Agent a, long period) {
            super(a, period);
        }

        @Override
        protected void onTick() {
            // 生成负载（150kWh到200kWh之间的随机整数）
            int load = 150 + random.nextInt(51); // 51是因为upperBound是exclusive

            // 生成报价（11.25到12.25之间的随机两位小数）
            double price = 11.25 + (random.nextDouble() * (12.25 - 11.25));
            price = Double.parseDouble(decimalFormat.format(price)); // 格式化两位小数

            // 创建消息
            ACLMessage message = new ACLMessage(ACLMessage.INFORM);
            message.addReceiver(new AID("MACA1", AID.ISLOCALNAME)); // 目标代理名为MACA1
            message.setContent("Load: " + load + " kWh, Price: " + price + " $/kWh");

            // 发送消息
            send(message);

            // 控制台打印日志
            System.out.println(getLocalName() + ": Sent to MACA1 -> Load: " + load + " kWh, Price: " + price + " $/kWh");
        }
    }
}
