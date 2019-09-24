package RGAlim.users;

import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import RGAlim.ConnexionSimpleUser;
import RGAlim.model.Utilisateur;


public class UtilisateurDAOImpSimple  {
	
	private EntityManager em1;
	public UtilisateurDAOImpSimple() {
		super();
		//System.out.println("je vais initialiser");
		this.em1 = ConnexionSimpleUser.getEntityManager();
	}

	
	
	
	public Utilisateur trouverUtilisateur(String courriel) throws IOException, ClassNotFoundException{
		//System.out.println("trouverutilsiateur");
		Query requete = em1.createNamedQuery("Utilisateur.find");
		requete.setParameter ("courriel",courriel);
		List <Utilisateur> list = requete.getResultList();
		//System.out.println(list.get(0).getCourriel());
		if (list.isEmpty())return null; 
		else  return list.get(0);
	}

	
	public void ajouterUtilisateur(Utilisateur utilisateur) throws IOException, ClassNotFoundException{
		//System.out.println("je vais ajouter");
		em1.persist(utilisateur);
		//System.out.println("j'ai ajouté");
	}

	public EntityManager getEm1() {
		return em1;
	}
	

}
