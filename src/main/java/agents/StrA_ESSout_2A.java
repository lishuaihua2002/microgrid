package agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import org.json.JSONException;
import org.json.JSONObject; // 导入 JSON 库

import java.text.DecimalFormat;
import java.util.Random;

public class StrA_ESSout_2A extends Agent {

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

        System.out.println(getLocalName() + ": StrA_ESSout_2A agent started.");
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
     * 设置SOC（剩余电量）
     */
    public synchronized void setSoc(double newSoc) {
        if (newSoc >= MIN_SOC && newSoc <= MAX_SOC) {
            this.soc = newSoc;
        } else {
            System.err.println(getLocalName() + ": Invalid SOC value. Must be between " + MIN_SOC + " and " + MAX_SOC);
        }
    }

    /**
     * 获取SOC（剩余电量）
     */
    public synchronized double getSoc() {
        return soc;
    }

    /**
     * 设置总利润
     */
    public synchronized void setTotalProfit(double profit) {
        this.totalProfit = profit;
    }

    /**
     * 获取总利润
     */
    public synchronized double getTotalProfit() {
        return totalProfit;
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

                // 如果收到的是拍卖结果，更新电量和利润，不返回消息
                if (content.contains("total_volume")) {
                    try {
                        JSONObject json = new JSONObject(content);
                        double totalVolume = json.getDouble("total_volume");
                        double totalrevenue = json.getDouble("total_revenue");
                            totalProfit += totalrevenue;
                            soc += totalVolume / CAPACITY;
                        System.out.println(getLocalName() + ": Updated SOC and total profit based on auction result.");
                    } catch (JSONException e) {
                        System.err.println(getLocalName() + ": Error parsing auction result JSON.");
                    }
                    return; // **跳过消息回复**
                }

                // 构造 JSON 响应
                JSONObject responseJson = new JSONObject();
                responseJson.put("agent", getLocalName());
                responseJson.put("soc", df.format(soc * 100)); // 剩余电量百分比
                responseJson.put("total_profit", df.format(totalProfit)); // 总利润

                if (content.contains("load")) {
                    // 外界有电量需求，计算可放电容量和放电报价
                    double availableDischargeCapacity = getAvailableDischargeCapacity();
                    double dischargeBid = getDischargeBid();

                    responseJson.put("type", "discharge");
                    responseJson.put("available_capacity", df.format(availableDischargeCapacity));
                    responseJson.put("bid_price", df.format(dischargeBid));

                } else if (content.contains("generation")) {
                    // 外界有电量多余，计算可充电容量和充电报价
                    double availableChargeCapacity = getAvailableChargeCapacity();
                    double chargeBid = getChargeBid();

                    responseJson.put("type", "charge");
                    responseJson.put("available_capacity", df.format(availableChargeCapacity));
                    responseJson.put("bid_price", df.format(chargeBid));
                }

                // 发送 JSON 格式的消息
                ACLMessage response = new ACLMessage(ACLMessage.INFORM);
                response.addReceiver(msg.getSender());
                response.setContent(responseJson.toString());
                send(response);

                System.out.println(getLocalName() + ": Sent JSON response to SMA1 -> " + responseJson.toString(2));
            } else {
                block();
            }
        }
    }
}