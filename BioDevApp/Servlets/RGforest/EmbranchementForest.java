package RGforest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import RGforest.ClassificationForest;

/**
 * Servlet implementation class EmbranchementForest
 */
@WebServlet("/EmbranchementForest")
public class EmbranchementForest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmbranchementForest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numEMBR = request.getParameter("numEMBR");
		int indice2 = Integer.valueOf(numEMBR)-1;
		request.getSession().setAttribute("numEMBR", indice2);
		
		List<ClassificationForest> listClassifications2 = new ArrayList<ClassificationForest>();
		listClassifications2 = (List<ClassificationForest>)request.getSession().getAttribute("listClassifications2");
		
		String description2 = listClassifications2.get(indice2).getDescription();
		request.getSession().setAttribute("description2", description2);
		String nom2 = listClassifications2.get(indice2).getNom();
		request.getSession().setAttribute("nom2", nom2);
		String image2 = listClassifications2.get(indice2).getImage();
		request.getSession().setAttribute("image2", image2);
		int id2 = listClassifications2.get(indice2).getId();
		request.getSession().setAttribute("id2", id2);
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGForest/embranchementForest.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
