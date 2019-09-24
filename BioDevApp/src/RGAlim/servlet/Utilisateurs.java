package RGAlim.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.w3c.dom.Entity;

import RGAlim.ConnexionSuperUser;
import RGAlim.model.Utilisateur;
import RGAlim.users.UtilisateurDAOImpSuperUser;

/**
 * Servlet implementation class Utilisateurs
 */
@WebServlet("/Utilisateurs")
public class Utilisateurs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Utilisateurs() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		List<Utilisateur> listUsers = new ArrayList<Utilisateur>();
		EntityManager em = ConnexionSuperUser.getEmf().createEntityManager();
		//System.out.println(em == null);
		UtilisateurDAOImpSuperUser user =new UtilisateurDAOImpSuperUser(em);
		try {
			listUsers = user.listerUtilisateur();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("users", listUsers);
		this.getServletContext().getRequestDispatcher( "/WEB-INF/JSP/RGAlim/users.jsp"
				).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
