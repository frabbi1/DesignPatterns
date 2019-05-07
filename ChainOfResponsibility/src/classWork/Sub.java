package classWork;

public class Sub implements Operation{
	private Operation op;
	public int calculate(String a, String b, String o) {
		if(o.equals("sub")) {
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			return x-y;
		}
		else return  op.calculate(a, b, o);
	}
	public void setNext(Operation op) {
		this.op = op;
	}

}
