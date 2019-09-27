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
 * Servlet implementation class EspecesPlante
 */
@WebServlet("/EspecesPlante")
public class EspecesPlante extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EspecesPlante() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
HttpSession session = request.getSession();
		
		String numc = request.getParameter("numFam");
		int indice3 = Integer.valueOf(numc)-1;
		session.setAttribute("numFam", indice3);
		
		String idc = request.getParameter("idFam");
		int idFam = Integer.valueOf(idc);
		session.setAttribute("idFam", idFam);
		
		List<RessourceForestiere> listRF = new ArrayList<RessourceForestiere>();
		RessourceForestDaoImpl rfdi = new RessourceForestDaoImpl(); 
		listRF = rfdi.listerRessourcesForestieres(idFam);
		session.setAttribute("listRF", listRF);
		//System.out.print(listRF);
		
		/*----------------------------------------------------------------------------------------------------------*/
		List<ClassificationForest> listClassifications3 = new ArrayList<ClassificationForest>();
		listClassifications3 = (List<ClassificationForest>)request.getSession().getAttribute("listClassifications3");
		String nom3 = listClassifications3.get(indice3).getNom();
		session.setAttribute("nom3", nom3);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGForest/especesPlante.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
