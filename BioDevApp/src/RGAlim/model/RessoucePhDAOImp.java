package RGAlim.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RessoucePhDAOImp {
	EntityManager entityManager ;

	public RessoucePhDAOImp(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void ajouterResssourcePhytogenetique(RessourcePhytogenetique phytogenetique) {
		entityManager.persist(phytogenetique);
	}
	public RessourcePhytogenetique trouverRessourcePhytogenetique (String nom) {
		Query requete = entityManager.createQuery("select r from RessourcePhytogenetique r where r.nomFrancais= :nom or"
				+ " r.nomArabe= :nom or r.nomAmazigh = :nom or r.nomLatin = :nom");
		requete.setParameter("nom", nom);
		List <RessourcePhytogenetique> list = requete.getResultList();
		System.out.println(list==null);
		if (!list.isEmpty())return list.get(0);
		else return null;
		//System.out.println(list.get(0).getCourriel());
	}
	public RessourcePhytogenetique modifierRessroucePhytogenetique (RessourcePhytogenetique phytogenetique) {
		return entityManager.merge(phytogenetique);
	}
	public void supprimerRessroucePhytogenetique (String nom) {
		RessourcePhytogenetique rg = trouverRessourcePhytogenetique(nom);
		entityManager.remove(rg);
	}
	public RessourcePhytogenetique getRePhytogenetiqueById (int id) {
		Query requet = entityManager.createQuery("select p from RessourcePhytogenetique p where p.idRg = :idrg");
		requet.setParameter("idrg", id);
		List<RessourcePhytogenetique> phytogenetique2= requet.getResultList();
		if (phytogenetique2 != null) return phytogenetique2.get(0);else return null;
	}
	public List<RessourcePhytogenetique> listerRessourcePhytogenetique () {
		Query requete = entityManager.createQuery("select r from RessourcePhytogenetique r where r.validee = false");
		List <RessourcePhytogenetique> list = requete.getResultList();
		//System.out.println(list==null);
		if (!list.isEmpty())return list;
		else return null;
		//System.out.println(list.get(0).getCourriel());
	}

}
