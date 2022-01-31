package com.Anmol.KeyBoardEvents;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyEvent {
   public static void main(String[] args) {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel(new FlowLayout());
	JTextField field=new JTextField(20);
	field.addKeyListener(new KeyDemoKeyListener());
	panel.add(field);
	frame.getContentPane().add(panel);
	
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setSize(500, 500);
	frame.setVisible(true);
	
}
}
