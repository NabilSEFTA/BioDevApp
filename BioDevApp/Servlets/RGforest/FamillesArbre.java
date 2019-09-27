package RGforest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RGforest.ClassificationForest;
import RGforest.RessourceForestiere;
import RGforest.RessourceForestDaoImpl;

/**
 * Servlet implementation class FamillesArbre
 */
@WebServlet("/FamillesArbre")
public class FamillesArbre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FamillesArbre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
HttpSession session = request.getSession();
		
		String numc = request.getParameter("numEspArb");
		int indice3 = Integer.valueOf(numc)-1;
		session.setAttribute("numEspArb", indice3);
		
		String idc = request.getParameter("idEspArb");
		int idEspArb = Integer.valueOf(idc);
		session.setAttribute("idEspArb", idEspArb);
		
		List<RessourceForestiere> listRF = new ArrayList<RessourceForestiere>();
		RessourceForestDaoImpl rfdi = new RessourceForestDaoImpl(); 
		listRF = rfdi.listerRessourcesForestieres(idEspArb);
		session.setAttribute("listRF", listRF);
		//System.out.print(listRM);
		
		/*----------------------------------------------------------------------------------------------------------*/
		List<ClassificationForest> listClassifications3 = new ArrayList<ClassificationForest>();
		listClassifications3 = (List<ClassificationForest>)request.getSession().getAttribute("listClassifications3");
		String nom3 = listClassifications3.get(indice3).getNom();
		session.setAttribute("nom3", nom3);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGForest/famillesArbre.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
