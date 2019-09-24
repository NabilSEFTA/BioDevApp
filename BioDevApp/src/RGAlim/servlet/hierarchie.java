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
import javax.servlet.http.HttpSession;

import RGAlim.ConnexionSimpleUser;
import RGAlim.model.ClassificationDAOImp;
import RGAlim.model.RessoucePhDAOImp;
import RGAlim.model.RessourcePhytogenetique;
import RGAlim.model.Rgclassification;

/**
 * Servlet implementation class testInput
 */
@WebServlet("/hierarchie")
public class hierarchie extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hierarchie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("niveau"));
		List<Rgclassification> list = null;
		String levelAncestors = "";
		HttpSession session = request.getSession();
		String id = session.getId();
		boolean isConnected = true;
		ClassificationDAOImp classificationDAOImp = null ;
		try {
			if (session.getAttribute(id)!=null)
			request.setAttribute("isConnected", isConnected);
			EntityManager em =ConnexionSimpleUser.getEntityManager(); 
			classificationDAOImp =  new ClassificationDAOImp(em);
			RessoucePhDAOImp phDAOImp =  new RessoucePhDAOImp(em);
			em.getTransaction().begin(); 
			List <RessourcePhytogenetique> listph = new ArrayList<RessourcePhytogenetique>();
			list = classificationDAOImp.trouverArbreRgclassifications(request.getParameter("niveau"));
			Rgclassification rgclassification2 = classificationDAOImp.trouverRgclassification(request.getParameter("niveau"));
			levelAncestors = classificationDAOImp.getLevelAncestorsName(request.getParameter("niveau"));
			request.setAttribute("levelAncestors", levelAncestors);
			request.setAttribute("description", rgclassification2.getDescription());
			request.setAttribute("list", list);
			if (list == null) {
				Rgclassification rgclassification = classificationDAOImp.trouverRgclassification(request.getParameter("niveau"));
				System.out.println(rgclassification.getParentPath());
				System.out.println(rgclassification.getGenetiques()==null);
				for (int i=0;i<rgclassification.getGenetiques().size();i++) {
					RessourcePhytogenetique phytogenetique = phDAOImp.getRePhytogenetiqueById(rgclassification.getGenetiques().get(i).getId());
					if (phytogenetique.isValidee())
					listph.add(phytogenetique);
				}
				request.setAttribute("description", rgclassification.getDescription()); 
				request.setAttribute("niveau", rgclassification.getNomNiveau());
				request.setAttribute("ressource", listph);
				
				this.getServletContext().getRequestDispatcher( "/WEB-INF/JSP/RGAlim/RessourcePhyto.jsp"
						).forward( request, response );
			}
			levelAncestors = classificationDAOImp.getLevelAncestorsName(request.getParameter("niveau")); 
			//System.out.println(levelAncestors);
			//for (int i=0;i<list.size();i++)System.out.println(list.get(i).getParentPath());
			em.close (); 
			
				request.setAttribute("levelAncestors", levelAncestors);
				request.setAttribute("list", list);
				this.getServletContext().getRequestDispatcher( "/WEB-INF/JSP/RGAlim/hierarchie.jsp"
						).forward( request, response ); 
			
		} catch (Exception e) {
			
			e.getStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
