//package assignment;

import java.awt.Graphics2D;
import java.util.*;

public abstract class CompositeShape implements IShape{
	private List<IShape> shapes = new ArrayList<IShape>();
	@Override
	public void draw(Graphics2D g2d) {
		buildShape();
		for (IShape shape : shapes) {
			shape.draw(g2d);
		}
		
	}
	public abstract void buildShape();
	public void addShape(IShape object) {
		shapes.add(object);
		
	}

}
