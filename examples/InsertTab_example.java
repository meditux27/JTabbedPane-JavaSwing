package examples;
import javax.swing.*;
public class InsertTab_example {
	   public static void main(String[] args) {
	        JFrame frame = new JFrame("Ejemplo de JTabbedPane");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 400);

	        JTabbedPane tabbedPane = new JTabbedPane();

	        JPanel panel1 = new JPanel();
	        panel1.add(new JLabel("Contenido de la pestaña 1"));

	        JPanel panel2 = new JPanel();
	        panel2.add(new JLabel("Contenido de la pestaña 2"));
	        
	        JPanel panel3 = new JPanel();
	        panel3.add(new JLabel("Contenido de la pestaña 3"));

	        JPanel panel4 = new JPanel();
	        panel4.add(new JLabel("Contenido de la pestaña 4"));

	        // Insertar pestaña en la posición 0
	        Icon icon = new ImageIcon("/home/user/Imagenes/iconos/linux.png"); // Reemplaza "ruta_del_icono.png" con la ruta de tu archivo de imagen
	        tabbedPane.insertTab("Pestaña 2", icon, panel2, "Tooltip de la Pestaña 2", 0);
	        
	        Icon icon2 = new ImageIcon("/home/user/Imagenes/iconos/linux.png"); // Reemplaza "ruta_del_icono.png" con la ruta de tu archivo de imagen
	        tabbedPane.insertTab("Pestaña 4", icon2, panel4, "Tooltip de la Pestaña 4", 1);
	        
	        // Agregar otra pestaña al final
	        tabbedPane.addTab("Pestaña 1", panel1);
	        tabbedPane.addTab("Pestaña 3", panel3);
	        frame.add(tabbedPane);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
}
