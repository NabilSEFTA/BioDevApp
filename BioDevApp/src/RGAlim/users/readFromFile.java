package RGAlim.users;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readFromFile {
	 FileInputStream fis;
	 ObjectInputStream ois ;
	 public readFromFile (String file) throws IOException {
		 this.fis = new FileInputStream(file);
		 this.ois = new ObjectInputStream(fis);
	 }
	 public ObjectInputStream getOis () {return this.ois;}
	 public FileInputStream getFis () {return this.fis;}
}
