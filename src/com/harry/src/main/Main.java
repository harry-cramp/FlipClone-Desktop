package com.harry.src.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import com.harry.src.gui.Window;
import com.harry.src.io.MouseInput;

public class Main extends JPanel {
	
	public static final int SCALE = 2;
	public static final int WIDTH = 256 * SCALE;
	public static final int HEIGHT = 192 * 2 * SCALE;
	
	private static final long serialVersionUID = -3890687506829904482L;
	
	private int x;
	private int y;
	private int xCache;
	private int yCache;
	
	private boolean drag;
	
	private BufferedImage drawCanvas;
	private ControlPanel controlPanel;

	public Main() {
		drag = false;
		
		controlPanel = new ControlPanel();
		
		new Window().createWindow("FlipClone", WIDTH, HEIGHT, this, controlPanel);
		this.addMouseListener(new MouseInput(this));
		this.addMouseMotionListener(new MouseInput(this));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT / 2);
	}
	
	public void paint(Graphics g) {
		if(drag) {
			g.drawLine(xCache, yCache, x, y);
		}else
			g.fillRect(x, y, 1, 1);
	}
	
	public void setDrawCoords(int x, int y) {
		this.xCache = this.x;
		this.yCache = this.y;
		this.x = x;
		this.y = y;
	}
	
	public void setDrag(boolean drag) {
		this.drag = drag;
	}
	
	public BufferedImage getCanvas() {
		return drawCanvas;
	}
	
	public ControlPanel getControlPanel() {
		return controlPanel;
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}
