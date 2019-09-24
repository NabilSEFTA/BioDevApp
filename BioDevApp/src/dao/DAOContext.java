package dao;

import javax.servlet.ServletContext;

public class DAOContext {

	protected static String dbURL;
	protected static String dbLogin;
	protected static String dbPassword;
	

	public static void init(ServletContext context) {
		try {
			System.out.println(" ----- DAEO CONTEXT--------------");
			Class.forName("jdbc:postgresql://localhost/RGTech");
			dbURL = "jdbc:postgresql://localhost/RGTech";
			dbLogin = "RGAdmin";
			dbPassword = "root00";

		} catch (Exception exception) {

			exception.printStackTrace();

		}
	}

}
