package assignment;

public class Rectangle extends CompositeShape{
	private int x,y,w,h;
	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y =y;
		this.w = w;
		this.h = h;
	}
	public void buildShape() {
		
		addShape(new Line(x,y,x+w,y));
		addShape(new Line(x+w,y,x+w,y+h));
		addShape(new Line(x+w,y+h,x,y+h));
		addShape(new Line(x,y+h,x,y));
	}

}
