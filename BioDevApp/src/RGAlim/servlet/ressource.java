package RGAlim.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RGAlim.ConnexionSimpleUser;
import RGAlim.model.ClassificationDAOImp;
import RGAlim.model.RessoucePhDAOImp;
import RGAlim.model.RessourcePhytogenetique;
import RGAlim.model.Rgclassification;

/**
 * Servlet implementation class ressource
 */
@WebServlet("/ressource")
public class ressource extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManager em;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ressource() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init () {
    	em = ConnexionSimpleUser.getEntityManager(); 
    	//System.out.println(em); 
    }  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String id = session.getId();
		boolean isConnected = session.getAttribute(id)!=null;
		//System.out.println(isConnected);
		RessoucePhDAOImp phDAOImp = new RessoucePhDAOImp(em);
		ClassificationDAOImp daoImp = new ClassificationDAOImp (em);
		//System.out.println(request.getParameter("rg"));
		RessourcePhytogenetique phytogenetique = phDAOImp.trouverRessourcePhytogenetique(request.getParameter("rg"));
	//	System.out.println(phytogenetique.getDescription());
		//System.out.println(phytogenetique.getRgclassification().size());
		List<Rgclassification> list = phytogenetique.getRgclassification();
		List <String> mapPath = new ArrayList< String>();
		List<String> mapClassName = new ArrayList< String>();
		for (int i=0; i< phytogenetique.getRgclassification().size();i++) {
			String levelAncestors = daoImp.getLevelAncestorsName(list.get(i).getParentPath());
			mapClassName.add( list.get(i).getTypeClassification()+" : "+levelAncestors);
			//System.out.println(i);
		}
	//System.out.println(mapPath.size());
	
		request.setAttribute("mapClassName", mapClassName);
		request.setAttribute("ressource", phytogenetique);
		request.setAttribute("isConnected", isConnected); 
		this.getServletContext().getRequestDispatcher( "/WEB-INF/JSP/RGAlim/Ressource.jsp").forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	public void destroy () {
		em.close();
	}

}
