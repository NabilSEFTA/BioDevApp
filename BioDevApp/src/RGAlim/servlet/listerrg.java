package RGAlim.servlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import RGAlim.ConnexionSimpleUser;
import RGAlim.model.RessoucePhDAOImp;
import RGAlim.model.RessourceGenetique;
import RGAlim.model.RessourcePhytogenetique;

/**
 * Servlet implementation class listerrg 
 */
@WebServlet("/listerrg")
public class listerrg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static  EntityManager em;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init () {
		em = ConnexionSimpleUser.getEntityManager();
	}
    public listerrg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RessoucePhDAOImp phDAOImp =  new RessoucePhDAOImp(em);
		List<RessourcePhytogenetique> listeRg = phDAOImp.listerRessourceAf();
		System.out.println(listeRg.size());
		request.setAttribute("ressource",listeRg);
		this.getServletContext().getRequestDispatcher( "/WEB-INF/JSP/RGAlim/listrg.jsp"
				).forward( request, response ); 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
	public void destroy (){
		em.close();
	}
	}
