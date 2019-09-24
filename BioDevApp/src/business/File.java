package business;

import java.sql.Blob;

public class File {
	
	private int idFile;
	private String Name;
	private String Type;
	private String Date;
	private String Ref;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	public String getRef() {
		return Ref;
	}

	public void setRef(String ref) {
		Ref = ref;
		}
	
	public File() {
		this(0,"","","","");
	}
	
	
	public File(int idFile, String name,String ref,  String date , String type) {
		super();
		this.idFile = idFile;
		Name = name;
		Type = type;
		Date = date;
		Ref = ref;
		
	}

	public int getIdFile() {
		return idFile;
	}
	public void setIdFile(int idFile) {
		this.idFile = idFile;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "File [idFile=" + idFile + ", Type=" + Type + ", Date=" + Date + "]";
	}
	
	

}
