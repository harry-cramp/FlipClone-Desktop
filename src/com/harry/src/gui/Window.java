package com.harry.src.gui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Window {

	public void createWindow(String title, int width, int height) {
		JFrame frame = new JFrame(title);
		Dimension dimensions = new Dimension(width, height);
		frame.setMinimumSize(dimensions);
		frame.setMaximumSize(dimensions);
		frame.setPreferredSize(dimensions);
		
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setVisible(true);
	}
	
}
