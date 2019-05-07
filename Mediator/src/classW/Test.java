package classW;

public class Test {
	public static void main(String[] args) {
		Mediator m  = new Mediator();
		Colleague c1 = new Colleague(m);
		Colleague c2 = new Colleague(m);
		Colleague c3 = new Colleague(m);
		
		c1.send("msg1");
		System.out.println();
		c3.send("msg 2");
	
		
		
	}

}
