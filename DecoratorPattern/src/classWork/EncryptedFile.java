package classWork;

public class EncryptedFile extends DecoratedFile{
	
	public EncryptedFile(IFile file) {
		super(file);
	}
	
	public void read() {
		System.out.println("de-encryption processing...");
		super.read();
		
	}
	public void write() {
		super.write();
		System.out.println("Encrypting...");
		
	}

}
