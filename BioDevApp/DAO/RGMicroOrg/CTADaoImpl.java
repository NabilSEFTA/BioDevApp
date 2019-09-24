package RGMicroOrg;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import RGFaune.CTA;

public class CTADaoImpl {

	public EntityManager em;
	
	public CTADaoImpl() {
		
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");	
		em=DaoFactory.getEm();
	
	}
	
    public List<CTA> listerCTAMicro(){
		List<CTA> listCTAM = new ArrayList<CTA>();
		Query requete = em.createNamedQuery("CTA.find", CTA.class);
		//requete.setParameter("id_cta", id_cta);
		listCTAM = requete.getResultList();
		if(listCTAM.isEmpty()) return null;
		else return listCTAM;
	}
	
}
