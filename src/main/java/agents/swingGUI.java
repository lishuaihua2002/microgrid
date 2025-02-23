package agents;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.lang.reflect.Field;
import java.util.*;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class swingGUI {
    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;
    private Map<Object, List<Field>> monitoredFields = new HashMap<>();

    public swingGUI() {
        // 创建 GUI 界面
        frame = new JFrame("变量监视器");
        frame.setSize(800, 400); // 调整窗口大小
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // 创建表格
        tableModel = new DefaultTableModel(new Object[]{"对象", "类名", "变量名", "值"}, 0);
        table = new JTable(tableModel);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);

        frame.setVisible(true);

        // 启动定时刷新
        startMonitoring();
    }

    // 添加要监视的类实例和变量名
    public void addObjectToMonitor(Object obj, String... fieldNames) {
        List<Field> fields = new ArrayList<>();
        for (String fieldName : fieldNames) {
            try {
                Field field = obj.getClass().getDeclaredField(fieldName);
                field.setAccessible(true); // 允许访问，即使是 private 变量
                fields.add(field);
            } catch (NoSuchFieldException e) {
                System.err.println("变量 " + fieldName + " 不存在于 " + obj.getClass().getSimpleName());
            }
        }
        monitoredFields.put(obj, fields);
    }

    // 启动定时任务，每秒刷新表格
    private void startMonitoring() {
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateTable();
            }
        }, 0, 1000); // 每秒更新一次
    }

    // 更新表格内容
    private void updateTable() {
        SwingUtilities.invokeLater(() -> {
            tableModel.setRowCount(0); // 清空表格
            for (Map.Entry<Object, List<Field>> entry : monitoredFields.entrySet()) {
                Object obj = entry.getKey();
                for (Field field : entry.getValue()) {
                    try {
                        Object value = field.get(obj);
                        tableModel.addRow(new Object[]{
                                obj.toString(), obj.getClass().getSimpleName(), field.getName(), value
                        });
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        // 创建 GUI 监视器
        swingGUI monitor = new swingGUI();

        // 监视的对象（你的类实例）
        SMA1 sma = new SMA1();
        StrA_ESSlocal_1 obj1 = new StrA_ESSlocal_1();
        StrA_ESSout_2A obj2 = new StrA_ESSout_2A();
        StrA_ESSout_3A obj3 = new StrA_ESSout_3A();

        // 添加 SMA1 的拍卖结果变量进行监视
        monitor.addObjectToMonitor(sma, "auctionResults");

        // 添加储能代理的电量、报价和利润变量进行监视
        monitor.addObjectToMonitor(obj1, "soc", "totalProfit", "chargeBid", "dischargeBid");
        monitor.addObjectToMonitor(obj2, "soc", "totalProfit", "chargeBid", "dischargeBid");
        monitor.addObjectToMonitor(obj3, "soc", "totalProfit", "chargeBid", "dischargeBid");

    }
}