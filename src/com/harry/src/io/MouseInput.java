package com.harry.src.io;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.harry.src.main.Main;

public class MouseInput extends MouseAdapter {
	
	private Main main;
	
	public MouseInput(Main main) {
		this.main = main;
	}
	
	public void mousePressed(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		
		main.setDrawCoords(mouseX, mouseY);
		main.repaint();
	}
	
	public void mouseDragged(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		
		main.setDrag(true);
		main.setDrawCoords(mouseX, mouseY);
		main.repaint();
	}
	
	public void mouseReleased(MouseEvent e) {
		main.setDrag(false);
	}

}
