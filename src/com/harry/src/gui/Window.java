package com.harry.src.gui;

import java.awt.Dimension;
import java.awt.Panel;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {

	public void createWindow(String title, int width, int height, JPanel canvas, JPanel controls) {
		JFrame frame = new JFrame(title);
		Dimension dimensions = new Dimension(width, height);
		frame.setMinimumSize(dimensions);
		frame.setMaximumSize(dimensions);
		frame.setPreferredSize(dimensions);
		
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel panel = new Panel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(canvas);
		panel.add(controls);
		
		frame.setContentPane(panel);
		frame.setVisible(true);
	}
	
}
