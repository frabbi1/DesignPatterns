package classW;

public class Originator {
	
	private int a, b, c;
	//Caretaker ct ;
	public Originator(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		//this.ct = ct;
	}
	public MementoClass saveMemento() {
		MementoClass m = new MementoClass(a, b, c);
		return m;
		
	}
	public void change(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void restore(MementoClass m) {
		System.out.println(m.a);
		System.out.println(m.b);
		System.out.println(m.c);
		
	}

}
