package RGMarines;

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
 * Servlet implementation class Embranchements
 */
@WebServlet("/Embranchements")
public class Embranchements extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Embranchements() {
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
		
		List<Classification> listClassifications2 = new ArrayList<Classification>();
		ClassificationDaoImpl classif2 =new ClassificationDaoImpl();
		listClassifications2 = classif2.listerClassifications(2, parent_id2);
		session.setAttribute("listClassifications2", listClassifications2);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMarines/embranchements.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
