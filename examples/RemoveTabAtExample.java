package examples;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class RemoveTabAtExample {
	 public static void main(String[] args) {
	        JFrame frame = new JFrame("Ejemplo de JTabbedPane");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 300);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        JPanel panel1 = new JPanel();
	        panel1.add(new JLabel("Contenido de la pestaña 1"));

	        
	        JPanel panelc = new JPanel();
	        panelc.add(new JLabel("Contenido de la pestaña comodin"));
	        
	        JPanel panel2 = new JPanel();
	       
	        JButton btnpanel2=new JButton("Eliminar Posición 1");
	        btnpanel2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					tabbedPane.removeTabAt(0);
//nota: Elimina el elemento que esta en la posición 0, si se presiona de nuevo el botón eliminara de nuevo el nuevo elemento que se recorrio a posición 0
				}
			});

	        // Agregar dos pestañas
	        
	        tabbedPane.addTab("Pestaña 1", panel1);
	        tabbedPane.addTab("Pestaña comodin", panelc);
	        tabbedPane.addTab("Pestaña 2", panel2);
	        panel2.add(btnpanel2);
	        // Eliminar la pestaña en la posición 0 (Pestaña 1)
	        

	        frame.add(tabbedPane);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
}
