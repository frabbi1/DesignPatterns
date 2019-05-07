package classWork;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFile file = new EncryptedFile(new CompressedFile(new File()));
		file.write();
		System.out.println();
		file.read();
		
		
		System.out.println("-----------");
		IFile file2 = new PasswordProtectedFile(file);
		file2.write();
		System.out.println();
		file2.read();
		

	}

}
