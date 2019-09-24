package RGMicroOrg;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RgClassificationMicroDaoImpl {

	public EntityManager em;
	
	public RgClassificationMicroDaoImpl() {
		
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");	
		em=DaoFactory.getEm();
	
	}
	
	public List<RgClassificationMicro> listerRGMicro(int num_niveau, int parent_id){
		List<RgClassificationMicro>listRGCM = new ArrayList<RgClassificationMicro>();
		Query requete = em.createNamedQuery("RgClassificationMicro.find", RgClassificationMicro.class);
		requete.setParameter("num_niveau", num_niveau);
		requete.setParameter("parent_id", parent_id);
		listRGCM = requete.getResultList();
		if(listRGCM.isEmpty()) return null;
		else return listRGCM;
	}
	
	
	
}
