package RGforest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RessourceGenetiqueFDaoImpl {

	public EntityManager em;	
	
	public RessourceGenetiqueFDaoImpl() {
		super();
		DaoFactory.connexionBDD("RGAdmin", "root00");
		this.em = DaoFactory.getEM();
	}
	
	public RessourceGenetiqueF RecupererRG(int id_rf){
		RessourceGenetiqueF rg = new RessourceGenetiqueF();
		Query requete = em.createNamedQuery("RessourceGenetiqueF.find", RessourceGenetiqueF.class);
		requete.setParameter ("id_RessourceForestiere",id_rf);
		rg = (RessourceGenetiqueF)requete.getSingleResult();
		return rg;
		
	}
	
	public void validerRGP(RessourceGenetiqueF rg) {
		System.out.println("je v valider la ressource génétique");
		em.getTransaction().begin();
		em.merge(rg);
		em.getTransaction().commit();

	}
	
}
