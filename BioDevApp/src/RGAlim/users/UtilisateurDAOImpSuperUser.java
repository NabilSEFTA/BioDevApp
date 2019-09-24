package RGAlim.users;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import RGAlim.model.Utilisateur;

public class UtilisateurDAOImpSuperUser{
	
	EntityManager em ;
	public  UtilisateurDAOImpSuperUser(EntityManager em ) {
		this.em = em;
	}
	
	public Utilisateur trouverUtilisateur(String courriel) {
		try {
			return em.find(Utilisateur.class, courriel );
			} catch ( Exception e ) {
				throw new DAOException( e );
			}
	}

	
	public void ajouterUtilisateur(Utilisateur utilisateur) {
		try {
			em.persist( utilisateur );
			} catch ( Exception e ) {
			throw new DAOException( e );
			}
		
	}

	
	public void supprimerUtilisateur(String courriel) {
		try {
			Utilisateur utilisateur = em.find(Utilisateur.class, courriel);
			if (utilisateur != null) {
				em.remove(utilisateur);
			}
			} catch ( Exception e ) {
			throw new DAOException( e );
			}
		
	}

	
	public List< Utilisateur> listerUtilisateur() throws IOException, ClassNotFoundException {
		try {
			TypedQuery<Utilisateur> query = em.createQuery( "SELECT u FROM Utilisateur u where u.validee = false", Utilisateur.class );			
			return (List<Utilisateur>) query.getResultList();
			}
			 catch ( Exception e ) {throw new DAOException( e );}
	}



	
}
