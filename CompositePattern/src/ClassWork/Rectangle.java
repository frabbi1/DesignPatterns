package ClassWork;

public class Rectangle extends CompositeShape{
	public void buildShape() {
		addShape(new Line());
		addShape(new Line());
		addShape(new Line());
		addShape(new Line());
	}
}
