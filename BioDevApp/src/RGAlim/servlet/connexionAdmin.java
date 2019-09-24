package RGAlim.servlet;

import java.io.IOException;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RGAlim.ConnexionCompteur;
import RGAlim.ConnexionSuperUser;

/**
 * Servlet implementation class connexionAdmin
 */
@WebServlet("/connexionAdmin")
public class connexionAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManager em;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public connexionAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher( "/WEB-INF/JSP/RGAlim/adminConnexion.jsp"
				).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
			String identifiant = request.getParameter("identifiant");   
			String motdepasse = request.getParameter("motdepasse");
			ConnexionSuperUser superUser = new ConnexionSuperUser();
			HttpSession session;
			String sessionId ;
			try {
				superUser.loginSuperUser(identifiant, motdepasse);
				request.setAttribute("erreurs",	superUser.getErreurs());
				for(Entry<String, String> entry : superUser.getErreurs().entrySet()) {
				    String cle = entry.getKey();
				    String valeur = entry.getValue();
				    System.out.println(cle + " : " + valeur); 
				}
				if (superUser.getErreurs().isEmpty()) {
					session = request.getSession();
					sessionId = session.getId();
					session.setAttribute(sessionId, "admin");
					ConnexionCompteur.incCpt();
					response.sendRedirect("/BioDevApp/dashboard");;}
				else {
					this.getServletContext().getRequestDispatcher( "/WEB-INF/JSP/RGAlim/adminConnexion.jsp"
							).forward( request, response );
				}
			} catch (Exception e) {
				e.getStackTrace();
			}
			
	}

}
