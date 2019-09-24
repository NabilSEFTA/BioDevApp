package RGAlim.servlet;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RGAlim.ConnexionSimpleUser;
import RGAlim.model.Utilisateur;
import RGAlim.users.UtilisateurDAOImpSimple;
import RGAlim.users.connexionForm;
import RGAlim.users.inscriptionFormUser;
import RGAlim.users.readFromFile;
import RGAlim.users.writeInFile;

/**
 * Servlet implementation class connexion
 */
@WebServlet("/inscription")
public class inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String ATT_USER = "utilisateur";
	public static final String ATT_FORM = "form";
	public static final String ATT_SESSION_USER ="sessionUtilisateur";
	public static final String VUE = "/WEB-INF/JSP/RGAlim/InscirptionUtilsateur.jsp"; 
    public inscription() {
        super(); 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("dakhel get");
		//UtilisateurDAOImpSimple dao = new UtilisateurDAOImpSimple();
		//if (dao.getEm1()==null) {System.out.println("hya lkalba !");}
		//System.out.println("jazzzzzzzzz!!!!!!!!!! oueeeeeeeey");
		this.getServletContext().getRequestDispatcher( VUE).forward( request, response );   

       
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		try {
				System.out.println("date de naissance :" + request.getParameter("email"));
				inscriptionFormUser form = new inscriptionFormUser();  
				Utilisateur user= form.creerUtilisateur(request);
				UtilisateurDAOImpSimple dao = new UtilisateurDAOImpSimple();
				if (!form.getErreurs().isEmpty()) {    
					for (Map.Entry mapentry : form.getErreurs().entrySet()) {
			           System.out.println("clé: "+mapentry.getKey() 
                       + " | valeur: " + mapentry.getValue());
						}
					request.setAttribute(ATT_FORM, form);
					doGet(request, response);
					}
				
				//request.setAttribute(ATT_USER, user);
				else {
						dao.getEm1().getTransaction().begin();
						dao.ajouterUtilisateur(user);
						System.err.println("jai rajouté l'utilisateur");
						dao.getEm1().getTransaction().commit();
						dao.getEm1().close(); 
						response.sendRedirect("/BioDevApp/connexion");
						}
			} catch (Exception e) {
				e.getStackTrace(); 
			}
			
				
		//doGet(request, response);;;
	}

}
