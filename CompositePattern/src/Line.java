//package assignment;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Line implements IShape{
	private int x1, y1, x2, y2;
	public Line(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void draw(Graphics2D g2d) {
		g2d.setStroke(new BasicStroke(5.0f));
		g2d.setColor(Color.green);
		g2d.drawLine(x1, y1, x2, y2);
	}

}
