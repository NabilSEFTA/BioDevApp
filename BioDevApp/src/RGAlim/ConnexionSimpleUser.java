package RGAlim;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnexionSimpleUser {
	private static final EntityManagerFactory emf ;
	static {
		emf = Persistence.createEntityManagerFactory("readOnly");
	}
	public static EntityManager getEntityManager () {
		return emf.createEntityManager();
	}
	public static void close () {
		emf.close();
	}
}
