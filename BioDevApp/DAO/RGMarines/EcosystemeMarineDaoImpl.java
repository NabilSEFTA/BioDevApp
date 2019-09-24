package RGMarines;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class EcosystemeMarineDaoImpl {

	public EntityManager em;	
	
	public EcosystemeMarineDaoImpl() {
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");
		this.em = DaoFactory.getEM();
	}
	
	public EcosystemeMarine RecupererEM(int id_em){
		EcosystemeMarine ecom = new EcosystemeMarine();
		Query requete = em.createNamedQuery("EcosystemeMarine.find", EcosystemeMarine.class);
		requete.setParameter ("id_em",id_em);
		ecom = (EcosystemeMarine)requete.getSingleResult();
		return ecom;
		
	}
}
