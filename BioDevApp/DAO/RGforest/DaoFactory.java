package RGforest;

import java.util.HashMap;

import java.util.Map;

import javax.persistence.Persistence;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class DaoFactory {
	private static  Map<String, String> properties;
	private static  EntityManagerFactory emf ;
	private static  EntityManager em;
	
	public static void connexionBDD (String user, String pwd) {
		  properties  = new HashMap<String , String>();
		  properties.put("javax.persistence.jdbc.user", user);
		  properties.put("javax.persistence.jdbc.password", pwd);
		  properties.put("javax.persistence.jdbc.url", "jdbc:postgresql://localhost:5432/RGTech");
		  emf = Persistence.createEntityManagerFactory("BioDevApp",properties);
		  em =  emf.createEntityManager();
	}
	
	public static EntityManagerFactory getEMF() {
		return emf;
	}
	
	public static EntityManager getEM() {
		return em;
	} 
	
}
