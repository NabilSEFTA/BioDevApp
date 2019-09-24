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

import RGAlim.ConnexionSimpleUser;
import RGAlim.ConnexionSuperUser;
import RGAlim.model.AjoutRph;
import RGAlim.model.ClassificationDAOImp;
import RGAlim.model.RessoucePhDAOImp;
import RGAlim.model.RessourcePhytogenetique;
import RGAlim.model.Rgclassification;

/**
 * Servlet implementation class ajouterRessource
 */
@WebServlet("/ajouterRessource")
public class ajouterRessource extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManager em;
    /**
     * @see HttpServlet#HttpServlet() 
     */
    public void init () {
    	em = ConnexionSuperUser.createEntityManager();
    	System.out.println(em); 
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ajouterRessource() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher( "/WEB-INF/JSP/RGAlim/ajouterRessource.jsp").forward( request, response ); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				AjoutRph ajoutRph =  new AjoutRph();
				RessoucePhDAOImp phDAOImp;
				ClassificationDAOImp classificationDAOImp;
				boolean isAdded = false;
				try { 
					System.out.println("j'ysusi");
					em.getTransaction().begin();
					phDAOImp = new RessoucePhDAOImp(em);
					classificationDAOImp = new ClassificationDAOImp(em);
					String genre = request.getParameter("genre");
					String famille = request.getParameter("famille");
					//String nomAr = request.getParameter("nomArabe");
					System.out.println(genre); 
					Rgclassification rgclassificationGenre = classificationDAOImp.trouverRgclassification(genre);
					System.out.println(rgclassificationGenre.getParentPath());
					Rgclassification rgclassificationFamille = classificationDAOImp.trouverRgclassification(famille);
					System.out.println(rgclassificationFamille.getParentPath());
					List<Rgclassification> rgclassifications = new ArrayList<Rgclassification>();
					rgclassifications.add(rgclassificationFamille); 
					rgclassifications.add(rgclassificationGenre);
					RessourcePhytogenetique phytogenetique = ajoutRph.getResouPhytogenetique(request, rgclassifications);
					phDAOImp.ajouterResssourcePhytogenetique(phytogenetique);
					em.getTransaction().commit();
					isAdded = true;
					request.setAttribute("isAdded", isAdded);
					//em.close(); 
					
				} catch (Exception e) {
					e.getStackTrace();
				}
				doGet(request, response);
	}

}
