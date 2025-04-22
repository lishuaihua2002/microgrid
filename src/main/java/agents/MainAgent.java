package agents;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class MainAgent {
    public static void main(String[] args) {
        try {
            // 创建 JADE 容器
            Profile profile = new ProfileImpl();
            profile.setParameter(Profile.GUI, "true"); // 显示 GUI（等于 -gui 参数）
            AgentContainer container = Runtime.instance().createMainContainer(profile);

            // 启动多个 agent
            container.createNewAgent("MG1_Load1", "agents.MG1_Load1", null).start();
            container.createNewAgent("MG1_Load2", "agents.MG1_Load2", null).start();
            container.createNewAgent("MG1_DG1", "agents.MG1_DG1", null).start();
            container.createNewAgent("MG1_DG2", "agents.MG1_DG2", null).start();
            container.createNewAgent("MACA1",     "agents.MACA1", null).start();
            container.createNewAgent("SMA1",      "agents.SMA1", null).start();
            container.createNewAgent("StrA_ESSlocal_1", "agents.StrA_ESSlocal_1", null).start();
            container.createNewAgent("StrA_ESSout_2A",  "agents.StrA_ESSout_2A", null).start();
            container.createNewAgent("StrA_ESSout_3A",  "agents.StrA_ESSout_3A", null).start();

            // 启动 Sniffer 工具（可选）
            container.createNewAgent("Sniffer", "jade.tools.sniffer.Sniffer", new Object[]{"MACA1"}).start();

            System.out.println("✅ 所有 agent 已启动！");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
