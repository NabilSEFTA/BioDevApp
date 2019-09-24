package RGMarines;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RessourceGenetiqueDaoImpl {

	public EntityManager em;	
	
	public RessourceGenetiqueDaoImpl() {
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");
		this.em = DaoFactory.getEM();
	}
	
	public RessourceGenetiqueMa RecupererRG(int id_rm){
		RessourceGenetiqueMa rg = new RessourceGenetiqueMa();
		Query requete = em.createNamedQuery("RessourceGenetiqueMa.find", RessourceGenetiqueMa.class);
		requete.setParameter ("id_RessourceMarine",id_rm);
		rg = (RessourceGenetiqueMa)requete.getSingleResult();
		return rg;
		
	}
	
	public void validerRGP(RessourceGenetiqueMa rg) {
		System.out.println("je v valider la ressource génétique");
		em.getTransaction().begin();
		em.merge(rg);
		em.getTransaction().commit();

	}
	
}
