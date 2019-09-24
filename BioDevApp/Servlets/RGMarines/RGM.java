package RGMarines;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RGM")
public class RGM extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RGM() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String numRGM = request.getParameter("numRGM");
		int indice1 = Integer.valueOf(numRGM)-1;
		request.getSession().setAttribute("indice1", indice1);
		//System.out.println("à RGM : "+request.getSession().getAttribute("numRGM"));
		
		List<Classification> listClassifications1 = new ArrayList<Classification>();
		listClassifications1 = (List<Classification>)request.getSession().getAttribute("listClassifications1");
		
		String pre_description1 = listClassifications1.get(indice1).getPre_description();
		request.getSession().setAttribute("pre_description1", pre_description1);
		String description1 = listClassifications1.get(indice1).getDescription();
		request.getSession().setAttribute("description1", description1);
		int nb_especes1 = listClassifications1.get(indice1).getNb_especes();
		request.getSession().setAttribute("nb_especes1", nb_especes1);
		String nom1 = listClassifications1.get(indice1).getNom();
		request.getSession().setAttribute("nom1", nom1);
		String image1 = listClassifications1.get(indice1).getImage1();
		request.getSession().setAttribute("image1", image1);
		int id1 = listClassifications1.get(indice1).getId();
		request.getSession().setAttribute("id1", id1);
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMarines/rgm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
