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



@WebServlet("/StartRGForest")
public class StartRGForest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StartRGForest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int parent_id1 = 0;
		session.setAttribute("parent_id1", parent_id1);
		List<ClassificationForest> listClassifications = new ArrayList<ClassificationForest>();
		ClassificationForestDaoImpl classif =new ClassificationForestDaoImpl();
		listClassifications = classif.listerClassificationsForest(1,parent_id1);
		session.setAttribute("listClassifications1", listClassifications);		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGForest/homeForest.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
