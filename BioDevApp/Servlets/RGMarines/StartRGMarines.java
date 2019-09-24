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



@WebServlet("/StartRGMarines")
public class StartRGMarines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StartRGMarines() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int parent_id1 = 0;
		session.setAttribute("parent_id1", parent_id1);
		List<Classification> listClassifications = new ArrayList<Classification>();
		ClassificationDaoImpl classif =new ClassificationDaoImpl();
		listClassifications = classif.listerClassifications(1,parent_id1);
		session.setAttribute("listClassifications1", listClassifications);	
	
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMarines/homeMarine.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
