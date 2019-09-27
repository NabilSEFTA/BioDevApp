package RGforest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RGFproposes")
public class RGFproposes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RGFproposes() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<RessourceForestiere> listRFP = new ArrayList<RessourceForestiere>();
		RessourceForestDaoImpl rfdi = new RessourceForestDaoImpl(); 
		listRFP = rfdi.listerRFProposes();
		request.getSession().setAttribute("listRFP", listRFP);
		/*if(listRMP==null) System.out.println(0);
		else System.out.println(listRMP.size());*/
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGForest/rgfProposes.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
