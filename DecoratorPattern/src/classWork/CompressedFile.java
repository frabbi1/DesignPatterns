package classWork;


public class CompressedFile extends DecoratedFile{
	
	public CompressedFile(IFile file) {
		super(file);
	}
	
	public void read() {
		System.out.println("de-compression processing...");
		super.read();
		
	}
	public void write() {
		super.write();
		System.out.println("compressing...");
		
	}

}