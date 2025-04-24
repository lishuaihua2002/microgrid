package agents;

import com.myproject.opendss.*;
import com4j.Com4jObject;
public class OpenDSSBridge {
    private IDSS dssObj;
    private IText dssText;
    private ICircuit dssCircuit;

    // 启动 DSS 引擎
    public boolean startDSS() {
        try {
            System.out.println("🚀 正在启动 OpenDSS 引擎（COM4J）...");
            dssObj = ClassFactory.createDSS();

            boolean started = dssObj.start(0);  // 参数通常为 0 表示默认启动
            if (!started) {
                System.out.println("❌ OpenDSS 启动失败（返回 false）");
                return false;
            }

            dssText = dssObj.text();
            dssCircuit = dssObj.activeCircuit();

            System.out.println("✅ OpenDSS 启动成功！");
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("❌ OpenDSS 启动失败（发生异常）");
            return false;
        }
    }

    // 加载 .dss 模型
    public void loadModel(String modelPath) {
        dssText.command("Clear");
        dssText.command("Redirect " + modelPath);
    }

    // 执行潮流计算
    public void solve() {
        dssText.command("Solve");
    }

    // 设置 Generator 输出功率（kW）
    public void setGenerator(String name, double kw) {
        dssText.command("edit Generator." + name + " kw=" + kw);
    }

    // 设置 Load 负载功率（kW）
    public void setLoad(String name, double kw) {
        dssText.command("edit Load." + name + " kw=" + kw);
    }

    // 设置 Storage 状态和功率
    public void setStorage(String name, double kw, String state) {
        String cmd = String.format("edit Storage.%s kW=%.2f State=%s", name, kw, state);
        dssText.command(cmd);
    }

    // 获取线路有功损耗（单位：kW）
    public double getLineLossKW(String lineName) {
        dssText.command("select Line." + lineName);
        Object[] losses = (Object[]) dssCircuit.losses();
        return ((Double) losses[0]) / 1000.0;
    }

    // 获取线路有功 + 无功损耗（单位：kW, kVar）
    public double[] getLineLosses(String lineName) {
        dssText.command("select Line." + lineName);
        Object[] losses = (Object[]) dssCircuit.losses();
        return new double[]{
                ((Double) losses[0]) / 1000.0,
                ((Double) losses[1]) / 1000.0
        };
    }

    // 获取整个系统的总有功损耗
    public double getTotalSystemLossKW() {
        Object[] losses = (Object[]) dssCircuit.losses();
        return ((Double) losses[0]) / 1000.0;
    }

    // 关闭 DSS 引擎（释放资源）
    public void close() {
        if (dssObj != null) {
            ((Com4jObject) dssObj).dispose();
        }
    }
}
