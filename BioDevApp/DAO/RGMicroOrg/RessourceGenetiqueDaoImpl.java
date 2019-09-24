package RGMicroOrg;

import javax.persistence.EntityManager;
import javax.persistence.Query;


public class RessourceGenetiqueDaoImpl {

	public EntityManager em;
	
	public RessourceGenetiqueDaoImpl() {
		
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");	
		em=DaoFactory.getEm();
	
	}	
	
	
	public RessourceGenetique Rg_recuperer(Integer id) {
		
		RessourceGenetique rg= new RessourceGenetique();
		Query requete = em.createNamedQuery("RessourceGenetique.find", RessourceGenetique.class);
		requete.setParameter("id", id);
		rg = (RessourceGenetique) requete.getSingleResult();
		
		return rg;
		
		
		
		
		
		
		
	}
	
}
