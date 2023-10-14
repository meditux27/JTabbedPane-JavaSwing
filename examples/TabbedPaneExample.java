package examples;

import javax.swing.*;


public class TabbedPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JTabbedPane");
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Contenido de la pestaña 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Contenido de la pestaña 2"));

        tabbedPane.addTab("Pestaña 1", panel1);
        tabbedPane.addTab("Pestaña 2", panel2);

        frame.add(tabbedPane);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
