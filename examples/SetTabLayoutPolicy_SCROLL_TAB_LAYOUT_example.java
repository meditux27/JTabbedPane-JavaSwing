package examples;
import javax.swing.*;
public class SetTabLayoutPolicy_SCROLL_TAB_LAYOUT_example {
	  public static void main(String[] args) {
	        JFrame frame = new JFrame("JTabbedPane Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Agregar pestañas al JTabbedPane
	        tabbedPane.addTab("Tab 1", new JPanel());
	        tabbedPane.addTab("Tab 2", new JPanel());
	        tabbedPane.addTab("Tab 3", new JPanel());
	        tabbedPane.addTab("Tab 4", new JPanel());
	        tabbedPane.addTab("Tab 5", new JPanel());
	        tabbedPane.addTab("Tab 6", new JPanel());
	        tabbedPane.addTab("Tab 7", new JPanel());
	        tabbedPane.addTab("Tab 8", new JPanel());
	        tabbedPane.addTab("Tab 9", new JPanel());

	        // Cambiar la política de diseño de las pestañas a SCROLL_TAB_LAYOUT
	        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

	        frame.add(tabbedPane);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
}
