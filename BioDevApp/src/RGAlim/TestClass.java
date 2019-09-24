package RGAlim;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.w3c.dom.css.RGBColor;

import RGAlim.model.ClassificationDAOImp;
import RGAlim.model.RessoucePhDAOImp;
import RGAlim.model.RessourcePhytogenetique;
import RGAlim.model.Rgclassification;

public class TestClass {

	public static void main(String[] args) {
		//if (cnx.getEntityManager() == null)System.out.println("probleme");
		try{EntityManager em =ConnexionSimpleUser.getEntityManager(); 
		ClassificationDAOImp classificationDAOImp =  new ClassificationDAOImp(em);
		RessourcePhytogenetique phytogenetique;
		Rgclassification rgclassification;
		em.getTransaction().begin();  
		
		//Rgclassification list = classificationDAOImp.trouverRgclassification("Prunus");
		Query requete = em.createQuery("select r from RessourcePhytogenetique r where r.nomLatin = :nom or r.nomArabe = :nom or r.nomAmazigh = :nom ");
		requete.setParameter("nom", "Prunus persica");
		List<RessourcePhytogenetique> phytogenetique2= requete.getResultList();
		for (int i = 0 ;i<phytogenetique2.size();i++)System.out.println(phytogenetique2.get(i).getArrosage() + " " + i);
		em.getTransaction().commit();
		}
		
		catch (Exception e) {e.getStackTrace();}


	}

}
