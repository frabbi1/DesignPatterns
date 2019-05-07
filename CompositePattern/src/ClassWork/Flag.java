package ClassWork;

public class Flag extends CompositeShape{
	
	public void buildShape() {
		Rectangle rect = new Rectangle();
		//rect.buildShape();
		addShape(rect);
		addShape(new Circle());
	}

}
