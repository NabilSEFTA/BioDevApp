package RGAlim.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import RGAlim.ConnexionSuperUser;
import RGAlim.model.RessoucePhDAOImp;
import RGAlim.model.RessourcePhytogenetique;
import RGAlim.model.Utilisateur;
import RGAlim.users.UtilisateurDAOImpSuperUser;

/**
 * Servlet implementation class listRg
 */
@WebServlet("/listRg")
public class listRg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listRg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<RessourcePhytogenetique> listRg = new ArrayList<RessourcePhytogenetique>();
		EntityManager em = ConnexionSuperUser.getEmf().createEntityManager();
		System.out.println(em == null);
		RessoucePhDAOImp daoImp = new RessoucePhDAOImp (em);
		try {
			listRg = daoImp.listerRessourcePhytogenetique(); 
			//System.out.println(listRg.get(0).isValidee()+"efe"); 
			System.out.println(listRg.size());
		} catch (Exception e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("listRg", listRg);
		this.getServletContext().getRequestDispatcher( "/WEB-INF/JSP/RGAlim/listerRg.jsp"
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
