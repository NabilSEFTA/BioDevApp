package RGAlim.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import RGAlim.model.Utilisateur;
import RGAlim.users.UtilisateurDAOImpSimple;
import RGAlim.users.inscriptionFormUser;

/**
 * Servlet implementation class ajouterUtilisateur
 */
@WebServlet("/ajouterUtilisateur")
public class ajouterUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouterUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGAlim/AjouterUtilisateur.jsp").forward( request, response ); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//System.out.println("date de naissance :" + request.getParameter("email"));
			inscriptionFormUser form = new inscriptionFormUser();  
			Utilisateur user= form.creerUtilisateur(request);
			user.setValidee(true);
			UtilisateurDAOImpSimple dao = new UtilisateurDAOImpSimple();
			boolean isAdded = false;
			if (!form.getErreurs().isEmpty()) {    
				for (Map.Entry mapentry : form.getErreurs().entrySet()) {
		           System.out.println("clé: "+mapentry.getKey() 
                   + " | valeur: " + mapentry.getValue());
					}
				request.setAttribute("form", form);
				doGet(request, response);
				}
			
			//request.setAttribute(ATT_USER, user);
			else {
					dao.getEm1().getTransaction().begin();
					dao.ajouterUtilisateur(user);
					System.err.println("jai rajouté l'utilisateur");
					dao.getEm1().getTransaction().commit();
					dao.getEm1().close(); 
					isAdded = true;
					request.setAttribute("isAdded", isAdded); 
					doGet(request, response);
					}
		} catch (Exception e) {
			e.getStackTrace(); 
		}
		
	}

}
