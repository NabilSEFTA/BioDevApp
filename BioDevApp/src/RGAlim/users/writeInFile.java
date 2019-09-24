package RGAlim.users;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class writeInFile {
	FileOutputStream fos;
	ObjectOutputStream oos;
	public writeInFile (String file)throws IOException {
		this.fos = new FileOutputStream(file);
		this.oos = new ObjectOutputStream(fos);
	}
	public FileOutputStream getFos() {
		return fos;
	}
	public ObjectOutputStream getOos() {
		return oos;
	}
	
}
