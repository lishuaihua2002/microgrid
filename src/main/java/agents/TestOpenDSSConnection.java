package agents;

public class TestOpenDSSConnection {
    public static void main(String[] args) {
        OpenDSSBridge bridge = new OpenDSSBridge();

        try {
            if (bridge.startDSS()) {
                System.out.println("✅ OpenDSS 启动成功");

                // 关键修改 1：使用绝对路径确保模型文件可访问（示例路径需替换为你的实际路径）
                String modelPath = "D:\\develop\\code_energy_platform\\energy-platform\\ieee123\\IEEE123Master.dss";
                System.out.println("📂 尝试加载模型：" + modelPath);

                bridge.loadModel(modelPath);
                System.out.println("✔️ 模型加载成功");

                // 关键修改 2：添加电路存在性检查（可选）
                // 如果模型未自动创建电路，需手动创建：
                //bridge.getDssText().call("Command", "New Circuit.MyTestCircuit");

                System.out.println("🔧 开始执行潮流计算...");
                if (bridge.solve()) {
                    System.out.println("✔️ 潮流计算成功收敛");
                } else {
                    System.out.println("❌ 潮流未收敛，无法获取损耗");
                    return;
                }


                // 关键修改 3：验证结果有效性
                double totalLoss = bridge.getTotalSystemLossKW();
                if (totalLoss >= 0) {
                    System.out.println("📊 系统总损耗为：" + totalLoss + " kW");
                } else {
                    System.out.println("❌ 获取损耗失败，请检查模型是否包含线路和负载");
                }

            } else {
                System.out.println("❌ OpenDSS 启动失败，请检查：");
                System.out.println("   - Jacob DLL 配置是否正确");
                System.out.println("   - OpenDSSEngine 是否已注册（regsvr32）");
            }
        } catch (Exception e) {
            System.err.println("‼️ 发生未捕获异常：");
            e.printStackTrace();
        } finally {
            // 关键修改 4：确保无论成功与否都释放资源
            bridge.close();
            System.out.println("🛑 已关闭 OpenDSS 连接");
        }
    }
}