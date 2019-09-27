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
 * Servlet implementation class RGF
 */
@WebServlet("/RGF")
public class RGF extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RGF() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numRGF = request.getParameter("numRGF");
		int indice1 = Integer.valueOf(numRGF)-1;
		request.getSession().setAttribute("indice1", indice1);
		
		List<ClassificationForest> listClassifications1 = new ArrayList<ClassificationForest>();
		listClassifications1 = (List<ClassificationForest>)request.getSession().getAttribute("listClassifications1");
		
		String description1 = listClassifications1.get(indice1).getDescription();
		request.getSession().setAttribute("description1", description1);
		String nom1 = listClassifications1.get(indice1).getNom();
		request.getSession().setAttribute("nom1", nom1);
		String image1 = listClassifications1.get(indice1).getImage();
		request.getSession().setAttribute("image1", image1);
		int id1 = listClassifications1.get(indice1).getId();
		request.getSession().setAttribute("id1", id1);
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGForest/rgf.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
