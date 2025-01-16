package agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

import java.text.DecimalFormat;
import java.util.Random;

public class StrA_ESSlocal_1 extends Agent {

    // 属性
    private static final double CAPACITY = 30.0; // 容量 (kWh)
    private static final double POWER = 10.0; // 功率 (kW)
    private static final double MAX_SOC = 1.0; // 最大SOC
    private static final double MIN_SOC = 0.1; // 最小SOC
    private static final double MAX_CHARGE_DISCHARGE = 2.5; // 每次充放电的最大容量 (kWh)
    private double soc; // 当前充电状态 (0.1~1.0)
    private static final double ALPHA_C = 0.5; // 充电调节因子 αC
    private static final double ALPHA_D = 0.5; // 放电调节因子 αD
    private static final double DEGRADATION_COST = 0.1; // 电池寿命退化成本 Λ
    private double totalProfit = 0.0; // 总利润
    private DecimalFormat df = new DecimalFormat("#.##");

    @Override
    protected void setup() {
        // 随机初始化SOC
        Random random = new Random();
        soc = MIN_SOC + (MAX_SOC - MIN_SOC) * random.nextDouble();

        System.out.println(getLocalName() + ": StrA_ESSlocal_1 agent started.");
        System.out.println(getLocalName() + ": Initial SOC: " + df.format(soc * 100)
                + "%, Current Capacity: " + df.format(getCurrentCapacity()) + " kWh");

        // 添加行为监听来自SMA1的消息
        addBehaviour(new RespondToSMA1Behaviour());
    }

    /**
     * 获取当前容量 (kWh)
     */
    private double getCurrentCapacity() {
        return CAPACITY * soc;
    }

    /**
     * 计算充电报价 (CBid)
     */
    private double getChargeBid() {
        return 11.25 - (soc - MIN_SOC) / (MAX_SOC - MIN_SOC) * ALPHA_C;
    }

    /**
     * 计算放电报价 (DBid)
     */
    private double getDischargeBid() {
        return 11.25 + (1 - soc) / (MAX_SOC - MIN_SOC) * ALPHA_D + DEGRADATION_COST;
    }

    /**
     * 计算当前可放电容量 (kWh)
     */
    private double getAvailableDischargeCapacity() {
        return Math.min(MAX_CHARGE_DISCHARGE, Math.max(0, getCurrentCapacity() - CAPACITY * MIN_SOC));
    }

    /**
     * 计算当前可充电容量 (kWh)
     */
    private double getAvailableChargeCapacity() {
        return Math.min(MAX_CHARGE_DISCHARGE, Math.max(0, CAPACITY * MAX_SOC - getCurrentCapacity()));
    }

    /**
     * 行为：响应来自SMA1的消息
     */
    private class RespondToSMA1Behaviour extends CyclicBehaviour {

        @Override
        public void action() {
            ACLMessage msg = receive();
            if (msg != null) {
                String content = msg.getContent();
                System.out.println(getLocalName() + ": Received message from SMA1: " + content);

                if (content.contains("Demand")) {
                    // 外界有电量需求，计算可放电容量和放电报价
                    double availableDischargeCapacity = getAvailableDischargeCapacity();
                    double dischargeBid = getDischargeBid();

                    ACLMessage response = new ACLMessage(ACLMessage.INFORM);
                    response.addReceiver(msg.getSender());
                    response.setContent("Agent: " + getLocalName() + ", Discharge Capacity: "
                            + df.format(availableDischargeCapacity) + " kWh, Discharge Bid: "
                            + df.format(dischargeBid) + " $/kWh");
                    send(response);

                    System.out.println(getLocalName() + ": Sent Discharge Info to SMA1 -> Discharge Capacity: "
                            + df.format(availableDischargeCapacity) + " kWh, Discharge Bid: "
                            + df.format(dischargeBid) + " $/kWh");

                } else if (content.contains("Surplus")) {
                    // 外界有电量多余，计算可充电容量和充电报价
                    double availableChargeCapacity = getAvailableChargeCapacity();
                    double chargeBid = getChargeBid();

                    ACLMessage response = new ACLMessage(ACLMessage.INFORM);
                    response.addReceiver(msg.getSender());
                    response.setContent("Agent: " + getLocalName() + ", Charge Capacity: "
                            + df.format(availableChargeCapacity) + " kWh, Charge Bid: "
                            + df.format(chargeBid) + " $/kWh");
                    send(response);

                    System.out.println(getLocalName() + ": Sent Charge Info to SMA1 -> Charge Capacity: "
                            + df.format(availableChargeCapacity) + " kWh, Charge Bid: "
                            + df.format(chargeBid) + " $/kWh");
                }
            } else {
                block();
            }
        }
    }
}
