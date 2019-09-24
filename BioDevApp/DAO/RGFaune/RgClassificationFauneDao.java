package RGFaune;
import java.util.ArrayList;
import java.util.List;
 
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RgClassificationFauneDao {
	


		public EntityManager em;
		
		public RgClassificationFauneDao() {
			
			super();
			DaoFactory.connexionBDD("RGUser", "root00");	
			em=DaoFactory.getEm();
		
		}
		
		public List<RgClassificationFaune> listerRGFaune(int num_niveau, int parent_id){
			List<RgClassificationFaune>listRGCF = new ArrayList<RgClassificationFaune>();
			Query requete = em.createNamedQuery("RgClassificationFaune.find", RgClassificationFaune.class);
			requete.setParameter("num_niveau", num_niveau);
			requete.setParameter("parent_id", parent_id);
			listRGCF = requete.getResultList();
			if(listRGCF.isEmpty()) return null;
			else return listRGCF;
		}
		
		
		
	

}
