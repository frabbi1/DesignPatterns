//package assignment;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Circle implements IShape{
	private int r, x, y;
	public Circle(int r, int x, int y) {
		this.r = r;
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics2D g2d) {
		g2d.setStroke(new BasicStroke(5.0f));
		g2d.setColor(Color.red);
		g2d.drawOval(x,y,r*2,r*2);
	}

}
