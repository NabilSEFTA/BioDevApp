package RGforest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


public class ClassificationForestDaoImpl {

	public EntityManager em;	
	
	public ClassificationForestDaoImpl() {
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");
		this.em = DaoFactory.getEM();
	}

	
	
	public List<ClassificationForest> listerClassificationsForest(int num_niveau, int parent_id) {
		
		List<ClassificationForest> classifications= new ArrayList<ClassificationForest>();
		Query requete = em.createNamedQuery("ClassificationForest.find", ClassificationForest.class);
		//Query requete = em.createQuery("SELECT u FROM rgClassificationMarine u WHERE  u.num_niveau = :num_niveau");
		requete.setParameter ("num_niveau",num_niveau);
		requete.setParameter("parent_id", parent_id);
		classifications = requete.getResultList();
		//System.out.println(classifications.get(0).getNom());
		if (classifications.isEmpty())return null; 
		else  return classifications;
	}
	
	

}
