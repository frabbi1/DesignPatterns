package classWork;


public class PasswordProtectedFile extends DecoratedFile{
	
	public PasswordProtectedFile(IFile file) {
		super(file);
	}
	
	public void read() {
		System.out.println("breaking password processing...");
		super.read();
		
	}
	public void write() {
		super.write();
		System.out.println("giving password protection...");
		
	}

}
