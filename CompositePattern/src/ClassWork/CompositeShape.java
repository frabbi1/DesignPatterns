package ClassWork;

import java.util.List;
import java.util.ArrayList;

public abstract class CompositeShape implements IShape{
	private List<IShape> shapes = new ArrayList<IShape>();
	
	public void draw() {
		buildShape();
		for (IShape shape : shapes) {
			shape.draw();
		}
	}
	
	public abstract void buildShape();
	public void addShape(IShape obj) {
		shapes.add(obj);
	}

}
