package classWork;

public class Division implements Operation{
	private Operation op;
	public int calculate(String a, String b, String o) {
		if(o.equals("div")) {
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			if(y==0) return 9999999;
			return x/y;
		}
		else return  op.calculate(a, b, o);
	}
	public void setNext(Operation op) {
		this.op = op;
	}

}
