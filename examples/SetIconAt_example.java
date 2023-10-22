package examples;
import javax.swing.*;
public class SetIconAt_example {
	   public static void main(String[] args) {
	        JFrame frame = new JFrame("JTabbedPane Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Agregar pestañas al JTabbedPane
	        tabbedPane.addTab("Tab 1", new JPanel());
	        tabbedPane.addTab("Tab 2", new JPanel());
	        tabbedPane.addTab("Tab 3", new JPanel());

	        // Asignar un ícono a la segunda pestaña (índice 1)
	        ImageIcon icon = new ImageIcon("/home/icon/linux.png"); // Reemplaza "icono.png" con la ubicación de tu ícono
	        tabbedPane.setIconAt(1, icon);

	        frame.add(tabbedPane);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
}
