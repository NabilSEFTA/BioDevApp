package RGforest;

import javax.persistence.EntityManager;

import javax.persistence.Query;

public class LocalisationForestDaoImpl {

	public EntityManager em;	
	
	public LocalisationForestDaoImpl() {
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");
		this.em = DaoFactory.getEM();
	}
	
	public LocalisationForestiere RecupererLF(int id_lf){
		LocalisationForestiere lf = new LocalisationForestiere();
		Query requete = em.createNamedQuery("LocalisationForestiere.find", LocalisationForestiere.class);
		requete.setParameter ("id_lf",id_lf);
		lf = (LocalisationForestiere)requete.getSingleResult();
		return lf;
		
	}
	
}
