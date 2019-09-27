package RGforest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CtaForestDaoImpl {

public EntityManager em;	
	
	public CtaForestDaoImpl() {
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");
		this.em = DaoFactory.getEM();
	}
	
	public CTAForest recupCTA(int id_CTA){
		CTAForest cta = new CTAForest();
		Query requete = em.createNamedQuery("CTAForest.find", CTAForest.class);
		requete.setParameter ("id_CTA",id_CTA);
		cta = (CTAForest)requete.getSingleResult();
		return cta;
		
	}
	
	public List<CTAForest> listerCTAProposes(){
		List<CTAForest> cta = new ArrayList<CTAForest>();
		Query requete = em.createNamedQuery("CTAForestProposes.find", CTAForest.class);
		cta = (List<CTAForest>)requete.getResultList();
		if (cta.isEmpty()) return null;
		else return cta;
		
	}
	
	public void validerCTAP(CTAForest cta) {
		em.getTransaction().begin();
		em.merge(cta);
		em.getTransaction().commit();

	}
	
	
	public void ajouterCTA(CTAForest cta) {
		System.out.println("je v ajouter la cta");
		em.getTransaction().begin();
		em.persist(cta);
		em.getTransaction().commit();
		System.out.println("j'ai ajouteé la cta");

	}
}
