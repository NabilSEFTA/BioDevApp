package RGforest;

import javax.persistence.EntityManager;


import javax.persistence.Query;

public class EcosystemeForestDaoImpl {

	public EntityManager em;	
	
	public EcosystemeForestDaoImpl() {
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");
		this.em = DaoFactory.getEM();
	}
	
	public EcosystemeForestiere RecupererEF(int id_ef){
		EcosystemeForestiere ecof = new EcosystemeForestiere();
		Query requete = em.createNamedQuery("EcosystemeForestiere.find", EcosystemeForestiere.class);
		requete.setParameter ("id_ef",id_ef);
		ecof = (EcosystemeForestiere)requete.getSingleResult();
		return ecof;
		
	}
}
