package dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import Connexion.ConnexionSimpleUser;
import business.Permis;
import business.PermisAcces;
import business.PermisCirculation;
import business.PermisTransfert;
import business.PermisValorisation;

public class PermisDAO extends DAOContext{
	
	

	public static boolean addDemandePermis(HttpServletRequest request) {
		
		EntityManager em = null;
		boolean sortie = false;
		if ("Premis d'acces".equals(request.getParameter("type"))) {
			PermisAcces p = new PermisAcces();
			p.setNature((String) request.getParameter("nature"));
			p.setDuree((String)request.getParameter("Duree"));
			p.setType(request.getParameter("type"));
			p.setDemandeur((String)request.getAttribute("UserID")); // @TODO ADD USER ID + ADD REFERENCES  
			
			try {
				p.setDateOperation(stringToDate((String)request.getParameter("dateOperation")));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			p.setOperateur((String)request.getParameter("Operateur"));
			p.setQuant((String)request.getParameter("Quant"));
			p.setEtat("damande");
			p.setAccFormaliteSanitaire((String)request.getParameter("AccFormaliteSanitaire"));
			p.setAccPrecautions((String)request.getParameter("AccPrecautions"));
			p.setAccPrescription((String)request.getParameter("AccPrescription"));

			
			em = ConnexionSimpleUser.getEntityManager();
			EntityTransaction trans = em.getTransaction();
			
			//System.out.println("Im");
			
			trans.begin();
			em.persist(p);		
			trans.commit();
			
			
			sortie = true;
			
		}
		else if ("Permis de circulation".equals(request.getParameter("type"))) {
			PermisCirculation p = new PermisCirculation();
			p.setNature((String) request.getParameter("nature"));
			p.setDuree((String)request.getParameter("Duree"));
			p.setType(request.getParameter("type"));
			p.setDemandeur((String)request.getAttribute("UserID")); // @TODO ADD USER ID + ADD REFERENCES 
			
			try {
				p.setDateOperation(stringToDate((String)request.getParameter("dateOperation")));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			p.setOperateur((String)request.getParameter("Operateur"));
			p.setQuant((String)request.getParameter("Quant"));
			p.setEtat("damande");
			p.setCirMoyTransport((String)request.getParameter("CirMoyTransport"));
			p.setCirItineraire((String)request.getParameter("CirItineraire"));

			em = ConnexionSimpleUser.getEntityManager();
			EntityTransaction trans = em.getTransaction();
			
			//System.out.println("Im");
			
			trans.begin();
			em.persist(p);		
			trans.commit();
			sortie = true;

			
			
		}
		else if ("Permis de transfert".equals(request.getParameter("type"))) {
			PermisTransfert p = new PermisTransfert();
			p.setNature((String) request.getParameter("nature"));
			p.setDuree((String)request.getParameter("Duree"));
			p.setType(request.getParameter("type"));
			p.setDemandeur((String)request.getAttribute("UserID")); // @TODO ADD USER ID + ADD REFERENCES 
			
			try {
				p.setDateOperation(stringToDate((String)request.getParameter("dateOperation")));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			p.setOperateur((String)request.getParameter("Operateur"));
			p.setQuant((String)request.getParameter("Quant"));
			p.setEtat("damande");
			p.setTranType((String)request.getParameter("TranType"));
			p.setTranPoint((String)request.getParameter("TranPoint"));
			

			
			em = ConnexionSimpleUser.getEntityManager();
			EntityTransaction trans = em.getTransaction();
			
			//System.out.println("Im");
			
			trans.begin();
			em.persist(p);		
			trans.commit();
			sortie = true;

			
			
			
		}else if ("Permis de valorisation".equals(request.getParameter("type"))) {
			
			PermisValorisation p = new PermisValorisation();
			p.setNature((String) request.getParameter("nature"));
			p.setDuree((String)request.getParameter("Duree"));
			p.setType(request.getParameter("type"));
			p.setDemandeur((String)request.getAttribute("UserID")); // @TODO ADD USER ID + ADD REFERENCES 
			
			try {
				p.setDateOperation(stringToDate((String)request.getParameter("dateOperation")));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			p.setOperateur((String)request.getParameter("Operateur"));
			p.setQuant((String)request.getParameter("Quant"));
			p.setEtat("damande");
			p.setValDestProduit((String)request.getParameter("ValdestProduit"));
			p.setValMarche((String)request.getParameter("Valmarche"));
					
			em = ConnexionSimpleUser.getEntityManager();
			EntityTransaction trans = em.getTransaction();
			
			//System.out.println("Im");
			
			trans.begin();
			em.persist(p);		
			trans.commit();
			sortie = true;

			
		}
		
		return sortie;
	}
	
	
	public static List<Permis> getListeDemandesAdmin() {

			EntityManager em = ConnexionSimpleUser.getEntityManager();
			
		    //return session.createQuery("SELECT a FROM Permis a", Permis.class).getResultList(); 
		    
		    List <?> l = em.createQuery("SELECT a FROM Permis a").getResultList();
		    return (List<Permis>) l;
	}
	
	public static void validePermis(int id) {
		EntityManager em = ConnexionSimpleUser.getEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		//System.out.println("hereeeee");
		List<?> list = (List<?>) em.createQuery(
			    "select p from Permis as p where  p.id = ?1")
			    .setParameter(1, id)
			    .getResultList();
		Permis p = (Permis) list.get(0);
		em.find(Permis.class, p.getId());
		
		p.setEtat("valide");
		
		trans.begin();
		em.flush();
		//em.persist(p);		
		//System.out.println("ETAT"+p.getEtat());
		trans.commit();
		
	}
	
	public static void suspendrePermis(int id) {
		EntityManager em = ConnexionSimpleUser.getEntityManager();
		
		EntityTransaction trans = em.getTransaction();
		System.out.println("hereeeee");
		List<?> list = (List<?>) em.createQuery(
			    "select p from Permis as p where  p.id = ?1")
			    .setParameter(1, id)
			    .getResultList();
		Permis p = (Permis) list.get(0);
		em.find(Permis.class, p.getId());
		
		p.setEtat("suspendu");
		
		trans.begin();
		em.flush();
		//em.persist(p);		
		//System.out.println("ETAT"+p.getEtat());
		trans.commit();
		
	}
	
	public static List<Permis> getListeDemandesUser(String userId) {
		
		EntityManager em = ConnexionSimpleUser.getEntityManager();
		
		List<?> list = (List<?>) em.createQuery(
			    "select p from Permis as p where  p.demandeur = ?1")
			    .setParameter(1, userId)
			    .getResultList();
		return (List<Permis>) list;
} 
	
	public static PermisCirculation getPermisCir(int id) {
		EntityManager em = ConnexionSimpleUser.getEntityManager();
		
		List<?> list = (List<?>) em.createQuery(
			    "select p from Permis as p where  p.id = ?1")
			    .setParameter(1, id)
			    .getResultList();
		PermisCirculation p = (PermisCirculation) list.get(0);
		return p;
		
	}
	
	/////
	public static PermisAcces getPermisAcc(int id) {
		EntityManager em = ConnexionSimpleUser.getEntityManager();
		
		List<?> list = (List<?>) em.createQuery(
			    "select p from Permis as p where  p.id = ?1")
			    .setParameter(1, id)
			    .getResultList();
		PermisAcces p = (PermisAcces) list.get(0);
		return p;
		
	}
	////
	public static PermisTransfert getPermisTran(int id) {
		EntityManager em = ConnexionSimpleUser.getEntityManager();
		
		List<?> list = (List<?>) em.createQuery(
			    "select p from Permis as p where  p.id = ?1")
			    .setParameter(1, id)
			    .getResultList();
		PermisTransfert p = (PermisTransfert) list.get(0);
		return p;
		
	}
	/////
	public static PermisValorisation getPermisVal(int id) {
		EntityManager em = ConnexionSimpleUser.getEntityManager();
		
		List<?> list = (List<?>) em.createQuery(
			    "select p from Permis as p where  p.id = ?1")
			    .setParameter(1, id)
			    .getResultList();
		PermisValorisation p = (PermisValorisation) list.get(0);
		return p;
		
	}
	
	
	private static String  dateToString (Date d){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
		String s = dateFormat.format(d);
		return s;  
	}
	
	private static Date  stringToDate (String s) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");  
        return dateFormat.parse(s);
	}

}
