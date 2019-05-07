package classWork;

public class DecoratedFile implements IFile{
	protected IFile file;
	public DecoratedFile(IFile file) {
		this.file = file;
	}
	
	public void read() {
		file.read();
	}
	public void write() {
		file.write();
	}
	

}
