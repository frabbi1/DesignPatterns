//package assignment;

public class Flag extends CompositeShape{
	private int x, y, w, h;
	public Flag(int x,int y,int w,int h) {
		
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
	
	
	public void buildShape() {
		int r = w/5;
		int cx = (int)((9.0/20.0)*w)+x-r;
		int cy=(h/2)+y-r;
		addShape(new Rectangle(x, y, w, h));
		
		addShape(new Circle(r, cx, cy));
		
	}

}
