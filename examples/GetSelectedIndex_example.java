package examples;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetSelectedIndex_example {
	 public static void main(String[] args) {
	        JFrame frame = new JFrame("JTabbedPane Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Agregar pestañas al JTabbedPane
	        tabbedPane.addTab("Tab 1", new JPanel());
	        tabbedPane.addTab("Tab 2", new JPanel());
	        tabbedPane.addTab("Tab 3", new JPanel());

	        JButton button = new JButton("Obtener índice de pestaña seleccionada");
	        button.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                int selectedIndex = tabbedPane.getSelectedIndex();
	                System.out.println("Índice de la pestaña seleccionada: " + selectedIndex);
	                JDialog dialog = new JDialog(frame, "Información", true);
	                JLabel label = new JLabel("Índice de la pestaña seleccionada: " + selectedIndex);
	                dialog.add(label);
	                dialog.setSize(300,200);
	                dialog.setLocationRelativeTo(null);
	                dialog.setVisible(true);
	            }
	        });

	        frame.add(tabbedPane);
	        frame.add(button, BorderLayout.SOUTH);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
}
