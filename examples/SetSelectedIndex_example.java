package examples;
import javax.swing.*;
public class SetSelectedIndex_example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTabbedPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Agregar pestañas al JTabbedPane
        tabbedPane.addTab("Tab 1", new JPanel());
        tabbedPane.addTab("Tab 2", new JPanel());
        tabbedPane.addTab("Tab 3", new JPanel());

        // Establecer la tercera pestaña como la pestaña seleccionada (índice 2)
        tabbedPane.setSelectedIndex(2);

        frame.add(tabbedPane);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
