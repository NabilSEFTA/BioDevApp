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
 * Servlet implementation class OrdresForest
 */
@WebServlet("/OrdresForest")
public class OrdresForest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdresForest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//int numRGM = (int) session.getAttribute("indice1");
		int parent_id2 = (int) session.getAttribute("id1");
		
		List<ClassificationForest> listClassifications2 = new ArrayList<ClassificationForest>();
		ClassificationForestDaoImpl classif2 =new ClassificationForestDaoImpl();
		listClassifications2 = classif2.listerClassificationsForest(2, parent_id2);
		session.setAttribute("listClassifications2", listClassifications2);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGForest/ordresForest.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
