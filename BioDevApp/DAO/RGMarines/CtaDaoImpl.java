package RGMarines;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CtaDaoImpl {

public EntityManager em;	
	
	public CtaDaoImpl() {
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");
		this.em = DaoFactory.getEM();
	}
	
	public CTAMa recupCTA(int id_CTA){
		CTAMa cta = new CTAMa();
		Query requete = em.createNamedQuery("CTAMa.find", CTAMa.class);
		requete.setParameter ("id_CTA",id_CTA);
		cta = (CTAMa)requete.getSingleResult();
		return cta;
		
	}
	
	public List<CTAMa> listerCTAProposes(){
		List<CTAMa> cta = new ArrayList<CTAMa>();
		Query requete = em.createNamedQuery("CTAProposes.find", CTAMa.class);
		cta = (List<CTAMa>)requete.getResultList();
		if (cta.isEmpty()) return null;
		else return cta;
		
	}
	
	public void validerCTAP(CTAMa cta) {
		em.getTransaction().begin();
		em.merge(cta);
		em.getTransaction().commit();

	}
	
	
	public void ajouterCTA(CTAMa cta) {
		System.out.println("je v ajouter la cta");
		em.getTransaction().begin();
		em.persist(cta);
		em.getTransaction().commit();
		System.out.println("j'ai ajouteé la cta");

	}
}
