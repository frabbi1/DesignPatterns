package classWork;

public class NullObject implements Operation{
	private Operation op;
	public int calculate(String a, String b, String o) {
		System.out.println("operation Not found");
		return -999999;
	}
	public void setNext(Operation op) {
		this.op = op;
	}
}
