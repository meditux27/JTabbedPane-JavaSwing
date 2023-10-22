package examples;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SetTabPlacement_test {
	  public static void main(String[] args) {
	        JFrame frame = new JFrame("JTabbedPane Example");
	        JTabbedPane tabbedPane = new JTabbedPane();
	        JPanel panel =new JPanel(new GridBagLayout());
	        GridBagConstraints c = new GridBagConstraints();
	     


	        JButton buttonNorth = new JButton("TOP");
	        c.gridx = 1;
	        c.gridy = 0;
	        panel.add(buttonNorth, c);
	        buttonNorth.setPreferredSize(new Dimension(100, 30));
	        buttonNorth.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JFrame frameJTabbed=new JFrame("Top");
					frameJTabbed.setSize(200,200);
					frameJTabbed.setVisible(true);
					frameJTabbed.setLocationRelativeTo(null);
					tabbedPane.setTabPlacement(JTabbedPane.TOP);
					frameJTabbed.add(tabbedPane);
				}
			});
	        
	        
	        JButton buttonSouth = new JButton("BOTTOM");
	        c.gridx = 1;
	        c.gridy = 2;
	        panel.add(buttonSouth, c);
	        buttonSouth.setPreferredSize(new Dimension(100, 30));
	        buttonSouth.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JFrame exp1=new JFrame("Top");
					exp1.setSize(200,200);
					exp1.setVisible(true);
					exp1.setLocationRelativeTo(null);
					tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
					exp1.add(tabbedPane);
				}
			});
	    
	        
	        JButton buttonEast = new JButton("LEFT");
	        c.gridx = 0;
	        c.gridy = 1;
	        panel.add(buttonEast, c);	        
	        buttonEast.setPreferredSize(new Dimension(100, 30));
	        buttonEast.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JFrame exp1=new JFrame("Top");
					exp1.setSize(200,200);
					exp1.setVisible(true);
					exp1.setLocationRelativeTo(null);
					tabbedPane.setTabPlacement(JTabbedPane.LEFT);
					exp1.add(tabbedPane);
				}
			});
	        
	        
	        JButton buttonWest = new JButton("RIGHT");
	        c.gridx = 2;
	        c.gridy = 1;
	        panel.add(buttonWest, c);
	        buttonWest.setPreferredSize(new Dimension(100, 30));
	        buttonWest.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JFrame exp1=new JFrame("Top");
					exp1.setSize(200,200);
					exp1.setVisible(true);
					exp1.setLocationRelativeTo(null);
					tabbedPane.setTabPlacement(JTabbedPane.RIGHT);
					exp1.add(tabbedPane);
				}
			});
	        tabbedPane.addTab("Tab 1", new JPanel());
	        tabbedPane.addTab("Tab 2", new JPanel());
	        tabbedPane.addTab("Tab 3", new JPanel());
	       
	        frame.add(panel);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
}
