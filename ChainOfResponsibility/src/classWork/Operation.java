package classWork;

public interface Operation {
	
	public int calculate(String a, String b, String o);

	public void setNext(Operation op);

}
