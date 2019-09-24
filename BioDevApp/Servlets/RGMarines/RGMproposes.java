package RGMarines;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RGMproposes
 */
@WebServlet("/RGMproposes")
public class RGMproposes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RGMproposes() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<RessourceMarine> listRMP = new ArrayList<RessourceMarine>();
		RessourceMarineDaoImpl rmdi = new RessourceMarineDaoImpl(); 
		listRMP = rmdi.listerRMProposes();
		request.getSession().setAttribute("listRMP", listRMP);
		/*if(listRMP==null) System.out.println(0);
		else System.out.println(listRMP.size());*/
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMarines/rgmProposes.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
