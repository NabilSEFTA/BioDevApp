package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connexion.ConnexionSimpleUser;
import RGAlim.model.Utilisateur;
import business.Permis;

import dao.PermisDAO;


/**
 * Servlet implementation class DemandePermis
 */
@WebServlet("/demandePermis")
public class DemandePermis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 HttpSession session = request.getSession();
		 String id = session.getId();
		 Utilisateur user = (Utilisateur) session.getAttribute(id);
		if (user==null) {response.sendRedirect("/BioDevApp/connexion");}
		else { String type = request.getParameter("type"); 
		  if (type == null)
		  {request.getRequestDispatcher( "/WEB-INF/Permis/Permis.jsp" ).forward( request, response );}
		  else {
		 
			request.setAttribute("type",type);
			
			//request.setAttribute("Operateur","");
			System.out.println(type);
			request.setAttribute("errorMessage","");
			request.getRequestDispatcher( "/WEB-INF/Permis/demandePermis.jsp" ).forward( request, response );}
	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
		//HttpSession session =  request.getSession(true);
		
		// Il faut un utilisateur authentifie
		// Pour avoir son ID
		EntityManagerFactory entityManagerFactory = null;
        EntityManager em = null;
        
		
		try {
			HttpSession session = request.getSession();
			String id = session.getId();
			Utilisateur user = (Utilisateur) session.getAttribute(id);
			request.setAttribute("UserID",user.getCourriel()); // set it to sessios.userid
			
			//System.out.println((String) request.getParameter("Duree") + "HERE");
			if (PermisDAO.addDemandePermis(request)){
				request.setAttribute("errorMessage","Demande bien envoye");
				request.setAttribute("type",(String)request.getParameter("type"));
            	request.getRequestDispatcher( "/WEB-INF/Permis/demandePermis.jsp" ).forward( request, response );
				
			}
			else {
				request.setAttribute("errorMessage","Demande n'a pas ete transmit");
				request.setAttribute("type",(String)request.getParameter("type"));
            	request.getRequestDispatcher( "/WEB-INF/Permis/demandePermis.jsp" ).forward( request, response );
				
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
