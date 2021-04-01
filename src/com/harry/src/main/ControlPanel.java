package com.harry.src.main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ControlPanel extends JPanel {

	private static final long serialVersionUID = 7063005525901789797L;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, Main.WIDTH, Main.HEIGHT / 2);
	}

}
