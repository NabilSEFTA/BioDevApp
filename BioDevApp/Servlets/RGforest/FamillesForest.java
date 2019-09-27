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

/**
 * Servlet implementation class FamillesForest
 */
@WebServlet("/FamillesForest")
public class FamillesForest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FamillesForest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//int numRGM = (int) session.getAttribute("indice1");
		int parent_id3 = (int) session.getAttribute("id2");
		
		List<ClassificationForest> listClassifications3 = new ArrayList<ClassificationForest>();
		ClassificationForestDaoImpl classif3 =new ClassificationForestDaoImpl();
		listClassifications3 = classif3.listerClassificationsForest(3, parent_id3);
		session.setAttribute("listClassifications3", listClassifications3);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGForest/famillesForest.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
