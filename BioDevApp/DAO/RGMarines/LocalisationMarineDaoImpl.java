package RGMarines;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class LocalisationMarineDaoImpl {

	public EntityManager em;	
	
	public LocalisationMarineDaoImpl() {
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");
		this.em = DaoFactory.getEM();
	}
	
	public LocalisationMarine RecupererLM(int id_lm){
		LocalisationMarine lm = new LocalisationMarine();
		Query requete = em.createNamedQuery("LocalisationMarine.find", LocalisationMarine.class);
		requete.setParameter ("id_lm",id_lm);
		lm = (LocalisationMarine)requete.getSingleResult();
		return lm;
		
	}
	
}
