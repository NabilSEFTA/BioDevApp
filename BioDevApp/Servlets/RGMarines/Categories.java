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

@WebServlet("/Categories")
public class Categories extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Categories() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		//int numRGM = (int) session.getAttribute("indice1");
		int parent_id3 = (int) session.getAttribute("id2");
		
		List<Classification> listClassifications3 = new ArrayList<Classification>();
		ClassificationDaoImpl classif3 =new ClassificationDaoImpl();
		listClassifications3 = classif3.listerClassifications(3, parent_id3);
		session.setAttribute("listClassifications3", listClassifications3);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMarines/categories.jsp").forward(request, response);
	}

}
