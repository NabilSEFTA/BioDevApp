package RGFaune;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CTADaoImpl {

	public EntityManager em;
	
	public CTADaoImpl() {
		
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");	
		em=DaoFactory.getEm();
	
	}
	
    public List<CTA> listerCTAFaune(){
		List<CTA> listCTAF = new ArrayList<CTA>();
		Query requete = em.createNamedQuery("CTA.find", CTA.class);
		//requete.setParameter("id_cta", id_cta);
		listCTAF = requete.getResultList();
		if(listCTAF.isEmpty()) return null;
		else return listCTAF;
	}
	
}
