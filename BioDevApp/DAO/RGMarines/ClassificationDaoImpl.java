package RGMarines;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


public class ClassificationDaoImpl {

	public EntityManager em;	
	
	public ClassificationDaoImpl() {
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");
		this.em = DaoFactory.getEM();
	}

	
	
	public List<Classification> listerClassifications(int num_niveau, int parent_id) {
		
		List<Classification> classifications= new ArrayList<Classification>();
		Query requete = em.createNamedQuery("Classification.find", Classification.class);
		//Query requete = em.createQuery("SELECT u FROM rgClassificationMarine u WHERE  u.num_niveau = :num_niveau");
		requete.setParameter ("num_niveau",num_niveau);
		requete.setParameter("parent_id", parent_id);
		classifications = requete.getResultList();
		//System.out.println(classifications.get(0).getNom());
		if (classifications.isEmpty())return null; 
		else  return classifications;
	}
	
	

}
