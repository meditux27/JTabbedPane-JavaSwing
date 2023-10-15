package examples;
import javax.swing.*;

public class AddTab_example {
	 public static void main(String[] args) {
	        JFrame frame = new JFrame("Ejemplo de JTabbedPane");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        JPanel panel1 = new JPanel();
	        panel1.add(new JLabel("Contenido de la pestaña 1"));

	        JPanel panel2 = new JPanel();
	        panel2.add(new JButton("Contenido de la pestaña 2"));

	        // Agregar pestañas utilizando addTab
	        tabbedPane.addTab("Pestaña 1", panel1);
	        tabbedPane.addTab("Pestaña 2", panel2);

	        frame.add(tabbedPane);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
}
