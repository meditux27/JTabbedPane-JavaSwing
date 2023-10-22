package examples;
import javax.swing.*;
public class SetTabPlacement_example {
	  public static void main(String[] args) {
	        JFrame frame = new JFrame("JTabbedPane Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Agregar pestañas al JTabbedPane
	        tabbedPane.addTab("Tab 1", new JPanel());
	        tabbedPane.addTab("Tab 2", new JPanel());
	        tabbedPane.addTab("Tab 3", new JPanel());

	        // Cambiar la ubicación de las pestañas a la parte izquierda
	        tabbedPane.setTabPlacement(JTabbedPane.LEFT);

	        frame.add(tabbedPane);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
}
