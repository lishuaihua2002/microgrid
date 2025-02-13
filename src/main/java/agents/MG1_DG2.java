package agents; // 确保文件路径与包名一致

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;
import jade.lang.acl.ACLMessage;
import jade.core.AID;

import java.text.DecimalFormat;
import java.util.Random;

public class MG1_DG2 extends Agent {

    @Override
    protected void setup() {
        System.out.println(getLocalName() + ": MG1_DG2 agent started.");

        // 添加行为，每10秒发送一次数据
        addBehaviour(new DGBehaviour(this, 50000)); // 10000 毫秒 = 10 秒
    }

    /**
     * 自定义行为：生成随机发电量和报价，并发送给MACA1
     */
    private class DGBehaviour extends TickerBehaviour {

        private final Random random = new Random();
        private final DecimalFormat decimalFormat = new DecimalFormat("#.##");

        public DGBehaviour(Agent a, long period) {
            super(a, period);
        }

        @Override
        protected void onTick() {
            // 生成发电量（150kWh到200kWh之间的随机整数）
            int generation = 150 + random.nextInt(51); // 51确保范围为150到200

            // 生成报价（11.25到10.25之间的随机两位小数）
            double price = 11.25 - (random.nextDouble() * (11.25 - 10.25));
            price = Double.parseDouble(decimalFormat.format(price)); // 保留两位小数

            // 生成发送者名字
            String senderName = myAgent.getLocalName();

            // 创建消息
            ACLMessage message = new ACLMessage(ACLMessage.INFORM);
            message.addReceiver(new AID("MACA1", AID.ISLOCALNAME)); // 发送给MACA1
            message.setContent("Sender: " + senderName + " | Generation: " + generation + " kWh, Price: " + price + " $/kWh");

            // 发送消息
            myAgent.send(message);

            // 控制台打印日志，显示发送者名字
            System.out.println(getLocalName() + ": Sent to MACA1 -> Generation: " + generation + " kWh, Price: " + price + " $/kWh");
        }
    }
}
