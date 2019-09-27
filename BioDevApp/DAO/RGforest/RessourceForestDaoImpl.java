package RGforest;

import java.util.ArrayList;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RessourceForestDaoImpl {

	public EntityManager em;	
	
	public RessourceForestDaoImpl() {
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");
		this.em = DaoFactory.getEM();
	}
	
	public List<RessourceForestiere> listerRessourcesForestieres(int id_CF){
		List<RessourceForestiere> listRF = new ArrayList<RessourceForestiere>();
		Query requete = em.createNamedQuery("RessourceForestiere.find", RessourceForestiere.class);
		requete.setParameter ("id_ClassifForestiere",id_CF);
		listRF = requete.getResultList();
		if (listRF.isEmpty())return null; 
		else  return listRF;
	}
	
	public List<RessourceForestiere> listerRFProposes(){
		List<RessourceForestiere> listRF = new ArrayList<RessourceForestiere>();
		Query requete = em.createNamedQuery("RFProposes.find", RessourceForestiere.class);
		listRF = requete.getResultList();
		if (listRF.isEmpty())return null; 
		else  return listRF;
	}
	
	public void validerRGFP(RessourceForestiere rf) {
		System.out.println("je v valider la ressource forestiere");
		em.getTransaction().begin();
		em.merge(rf);
		em.getTransaction().commit();

	}
	
	
}
