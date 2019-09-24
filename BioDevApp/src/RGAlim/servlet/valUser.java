package RGAlim.servlet;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import RGAlim.ConnexionSuperUser;
import RGAlim.model.Utilisateur;
import RGAlim.users.UtilisateurDAOImpSuperUser;

/**
 * Servlet implementation class valUser
 */
@WebServlet("/valUser")
public class valUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public valUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = ConnexionSuperUser.createEntityManager();
		em.getTransaction().begin();
		UtilisateurDAOImpSuperUser user =new UtilisateurDAOImpSuperUser(em);
		Utilisateur util = user.trouverUtilisateur(request.getParameter("cour"));
		util.setValidee(true);
		em.merge(util);
		em.getTransaction().commit();
		response.sendRedirect("/BioDevApp/Utilisateurs");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
