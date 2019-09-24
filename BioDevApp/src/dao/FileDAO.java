package dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import RGAlim.model.Utilisateur;
import business.File;


public class FileDAO  extends DAOContext{
	protected static String dbURL= "jdbc:postgresql://localhost:5432/RGTech";;
	protected static String 	dbLogin = "RGAdmin";
	protected static String dbPassword = "root00";

	public static boolean uploadFile(HttpServletRequest request) throws IOException, ServletException, ClassNotFoundException  {
		InputStream inputStream = null;
		Part filePart = request.getPart("file");
		HttpSession session = request.getSession();
		String IdSession = session.getId();
		Utilisateur u = (Utilisateur) request.getSession(true).getAttribute(IdSession);
		//request.getSession(true).setAttribute("Utilisateur",1); // FOR TEST PURPOSES TO DELETE
		inputStream = filePart.getInputStream();
		System.out.println(dbURL);
		Class.forName("org.postgresql.Driver");
		
	
		
		try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			Class.forName("org.postgresql.Driver");

			String sql = "INSERT INTO \"RG\".t_files (Name,Ref,Date,Type, Url, userID) values (?,?,?,?,?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)){
		        filePart.getSubmittedFileName();
            	statement.setString(1, request.getParameter("fileName"));//filePart.getSubmittedFileName()
            	statement.setString(2, request.getParameter("fileRef"));
            	statement.setDate(3,  new java.sql.Date(stringToDate(request.getParameter("date")).getTime()));
            	statement.setString(4, request.getParameter("type"));
            	statement.setInt(6, 1);
                
                if (inputStream != null) 
                {
                	System.out.println("non nule imput ");
                	
                    statement.setBinaryStream(5, inputStream, (int) filePart.getSize());
                }
                int row = statement.executeUpdate();
                if (row > 0) 
                {
                    System.out.println("File uploaded!!!");
                    return true;
                    
                 }
                else {
                	System.out.println("Couldn't upload your file!!!");
                	return false;
                }
            	
            }
		    
            
			
        } catch (Exception e) {
			throw new RuntimeException( e );
		}
		
	}
	
	public static ArrayList<File> getFilesInfos () throws SQLException {
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			
			String sql = "SELECT * FROM \"RG\".T_Files";
			System.out.println("here");
    		
	            try (PreparedStatement statement = connection.prepareStatement(sql)){
	            	try ( ResultSet rs = statement.executeQuery() ) {
	            		ArrayList<File> files = new ArrayList<File>();
	            		while(rs.next()) {
	            			files.add(new File(
	            					Integer.parseInt(rs.getString("idfile")),
	            					rs.getString("name"),
	            					rs.getString("ref"),
	            					dateToString(rs.getDate("Date")),
	            					rs.getString("type") ));
	            		}
	            		return files;
	            	}
	            	
	            }	            
			}
	}
	
	public static byte[] getFileBlob (int fileID) throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

try ( Connection connection = DriverManager.getConnection( dbURL, dbLogin, dbPassword ) ) {
			Blob url = null;
		    byte[] fileData = null ;
				
			String sql = "SELECT url FROM \"RG\".t_files WHERE idfile = '"+fileID+"'";
			//sql = "SELECT encode(url::bytea, 'escape') FROM T_Files as o where o.url != '' AND idfile= '"+fileID+"' ";
			    		
	            try (PreparedStatement statement = connection.prepareStatement(sql)){
	            	try ( ResultSet rs = statement.executeQuery() ) {

	            		if (rs.next()) 
	                    {
	            			System.out.println("Name");
	                        fileData = rs.getBytes("url");
	                        //fileData = rs.getBytes(1,(int)url.length());
	                    } else 
	                    {
	                       System.out.println("file not found!");
	                       
	                    }
	            	}
	            	return fileData;
	            	
	            }	            
			}
		
	}
	
	private static String  dateToString (Date d){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
		String s = dateFormat.format(d);
		return s;  
	}
	
	private static Date  stringToDate (String s) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
        return dateFormat.parse(s);
	}
	
}
