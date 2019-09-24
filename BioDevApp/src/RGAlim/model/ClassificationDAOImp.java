package RGAlim.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ClassificationDAOImp {
	private EntityManager em ;

	public ClassificationDAOImp(EntityManager em) {
		super();
		this.em = em;
	}

	public EntityManager getEm() {
		return em;
	}
	public void ajouterRgclassification (Rgclassification rgclassification) {
		em.persist(rgclassification);
	}
	public Rgclassification trouverRgclassification (String level) {

		Query requete = em.createNativeQuery ("select * from \"RG\".rgclassification where parent_path ~ "+"'*."+level+"'",Rgclassification.class);
		List <Rgclassification> list = (List<Rgclassification>)requete.getResultList();
		if (!list.isEmpty())return list.get(0);else return null;
	}
	public List<Rgclassification> trouverArbreRgclassifications (String level){
		Query requete = em.createNativeQuery ("select * from \"RG\".rgclassification where parent_path ~ "+"'*."+level+".*{1}'",Rgclassification.class);
		List <Rgclassification> list = (List<Rgclassification>)requete.getResultList();
		if (!list.isEmpty())return list;else return null;
	}
	public List<Rgclassification> getAncetre (String level){
		Query requete = em.createNativeQuery ("select * from \"RG\".rgclassification where parent_path @>"+"'"+level+"'",Rgclassification.class);
		List <Rgclassification> list = (List<Rgclassification>)requete.getResultList();
		if (!list.isEmpty())return list;else return null;
	}
	public String getLevelAncestorsName (String level){
		Map<Integer,Rgclassification> tmp = new HashMap<Integer,Rgclassification>();
		Rgclassification level1 = trouverRgclassification(level);
		//if (level1 == null)System.out.println("null");
		//System.out.println(level1.getParentPath());
		List <Rgclassification> list = getAncetre(level1.getParentPath());
		Collections.sort(list,new sortById());
		String levelAncestors = "";
		for (int i=0;i<list.size();i++) {
			levelAncestors = levelAncestors + list.get(i).getNomNiveau() + "/";
			System.out.println(list.get(i).getParentPath());
			}
		System.out.println(levelAncestors);
		return levelAncestors; 
	}
	public List<String> findLevelByName (String level){
		//System.out.println(level);
		Query requete = em.createNativeQuery ("select * from \"RG\".rgclassification where nom_niveau like "+"'"+level+"'",Rgclassification.class);
		List <Rgclassification> list = (List<Rgclassification>)requete.getResultList();
		
		List<String> listName = new ArrayList<String>();
		for (int i=0;i<list.size();i++)listName.add(list.get(i).getParentPath());
		if (!list.isEmpty())return listName;else return null;
	}
}
