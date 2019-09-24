package RGMicroOrg;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RessourceMicroOrgDaoImpl {

	public EntityManager em;
	
	public RessourceMicroOrgDaoImpl() {
		
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");	
		em=DaoFactory.getEm();
	
	}
	
    public List<RessourceMicroOrg> listerRessourceMicro(int id_classification){
		List<RessourceMicroOrg>listRGM = new ArrayList<RessourceMicroOrg>();
		Query requete = em.createNamedQuery("RessourceMicroOrg.find", RessourceMicroOrg.class);
		requete.setParameter("id_classification", id_classification);
		listRGM = requete.getResultList();
		if(listRGM.isEmpty()) return null;
		else return listRGM;
	}
    
    public List<RessourceMicroOrg> listerEsp(){
  		List<RessourceMicroOrg> listEsp = new ArrayList<RessourceMicroOrg>();
  		Query requete = em.createNamedQuery("RessourceMicroOrg.findAll", RessourceMicroOrg.class);
  		listEsp = requete.getResultList();
  		if(listEsp.isEmpty()) return null;
  		else return listEsp;
  	}
	
}
