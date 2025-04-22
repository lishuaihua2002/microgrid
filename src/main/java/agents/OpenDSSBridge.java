package agents;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

public class    OpenDSSBridge {
    private ActiveXComponent dssObj;
    private Dispatch dssText;
    private Dispatch dssCircuit;

    // 启动 DSS 引擎
    public boolean startDSS() {
        try {
            // 推荐使用绝对路径加载 jacob.dll（你已经做对了！）
            System.setProperty("jacob.dll.path", "D:/develop/code_energy_platform/energy-platform/lib/jacob-1.21-x64.dll");

            System.out.println("🚀 正在启动 OpenDSS 引擎...");

            // 初始化 Jacob 接口
            dssObj = new ActiveXComponent("OpenDSSEngine.DSS");

            // 使用 Dispatch.call 正确调用无参 COM 方法
            Variant result = Dispatch.call(dssObj, "Start");
            boolean started = result.getBoolean();

            if (!started) {
                System.out.println("❌ OpenDSS 启动失败（返回 false）");
                return false;
            }

            dssText = dssObj.getProperty("Text").toDispatch();
            dssCircuit = dssObj.getProperty("ActiveCircuit").toDispatch();

            System.out.println("✅ OpenDSS 启动成功！");
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("❌ OpenDSS 启动失败（发生异常）");
            return false;
        }
    }


    // 加载模型（.dss 文件）
    public void loadModel(String modelPath) {
        Dispatch.call(dssText, "Command", "Clear");
        Dispatch.call(dssText, "Command", "Redirect " + modelPath);
    }

    // 执行潮流计算
    public void solve() {
        Dispatch.call(dssText, "Command", "Solve");
    }

    // 设置 Generator 输出功率（kW）
    public void setGenerator(String name, double kw) {
        Dispatch.call(dssText, "Command", "edit Generator." + name + " kw=" + kw);
    }

    // 设置 Load 负载功率（kW）
    public void setLoad(String name, double kw) {
        Dispatch.call(dssText, "Command", "edit Load." + name + " kw=" + kw);
    }

    // 设置 Storage 状态（Charging/Discharging）和功率
    public void setStorage(String name, double kw, String state) {
        String command = String.format("edit Storage.%s kW=%f State=%s", name, kw, state);
        Dispatch.call(dssText, "Command", command);
    }

    // 获取某条线路的有功损耗（单位：kW）
    public double getLineLossKW(String lineName) {
        Dispatch.call(dssText, "Command", "select Line." + lineName);
        Variant losses = Dispatch.get(dssCircuit, "Losses");
        double realLossW = losses.toSafeArray().toVariantArray()[0].getDouble();
        return realLossW / 1000.0;
    }

    // 获取某条线路的有功+无功损耗（单位：kW/kVar）
    public double[] getLineLosses(String lineName) {
        Dispatch.call(dssText, "Command", "select Line." + lineName);
        Variant losses = Dispatch.get(dssCircuit, "Losses");
        Variant[] array = losses.toSafeArray().toVariantArray();
        return new double[]{array[0].getDouble() / 1000.0, array[1].getDouble() / 1000.0};
    }

    // 获取整个系统的总损耗（单位：kW）
    public double getTotalSystemLossKW() {
        Variant losses = Dispatch.get(dssCircuit, "Losses");
        return losses.toSafeArray().toVariantArray()[0].getDouble() / 1000.0;
    }

    // 关闭 DSS 引擎（可选）
    public void close() {
        dssObj.safeRelease();
    }
}
