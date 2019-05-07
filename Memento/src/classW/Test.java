package classW;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator o1  = new Originator(2, 4, 6);
		Caretaker ct  = new Caretaker();
		MementoClass m1 = o1.saveMemento();
		ct.addMemento(m1);
		
		o1.change(4, 7, 5);
		MementoClass m2 = o1.saveMemento();
		ct.addMemento(m2);
		
		o1.restore(m1);
		System.out.println();
		o1.restore(m2);

	}

}
