package examples;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SetEnabledAt_test {
	   public static void main(String[] args) {
	        JFrame frame = new JFrame("JTabbedPane Example");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JTabbedPane tabbedPane = new JTabbedPane();
	        JPanel panel1 = new JPanel();
	        JPanel panel2 = new JPanel();
	       
	        JButton btn_Desactivado=new JButton("Desactivar");
	        
	        btn_Desactivado.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					// Deshabilitar la segunda pestaña (índice 1)
			        tabbedPane.setEnabledAt(1, false);		
				}
			});
	        
	        JButton btn_Activado=new JButton("Activar");
	        
	        btn_Activado.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					// Habilita la segunda pestaña (índice 1)
			        tabbedPane.setEnabledAt(1, true);		
				}
			});
	        tabbedPane.addTab("Pestaña 1", panel1);
	        panel1.add(new JLabel("Contenido de la pestaña 1"));
	        panel1.add(btn_Desactivado);
	        panel1.add(btn_Activado);
	       
	        tabbedPane.addTab("Pestaña 2", panel2);
	        panel2.add(new JLabel("Contenido de la pestaña 2"));
	       	        
	        frame.add(tabbedPane);
	        
	        frame.setSize(300, 200);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
}
