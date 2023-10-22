package examples;
import javax.swing.*;
public class SetToolTipTextAt_example {
	   public static void main(String[] args) {
	        JFrame frame = new JFrame("JTabbedPane Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Agregar pestañas al JTabbedPane
	        tabbedPane.addTab("Tab 1", new JPanel());
	        tabbedPane.addTab("Tab 2", new JPanel());
	        tabbedPane.addTab("Tab 3", new JPanel());

	        // Asignar un tooltip a la primera pestaña (índice 0)
	        tabbedPane.setToolTipTextAt(0, "Esta es la primera pestaña");
	        tabbedPane.setToolTipTextAt(1, "Esta es la segunda pestaña");
	        tabbedPane.setToolTipTextAt(2, "Esta es la tercera pestaña");
	        
	        frame.add(tabbedPane);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
}
