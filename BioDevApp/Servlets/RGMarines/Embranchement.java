package RGMarines;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Embranchement")
public class Embranchement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Embranchement() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String numEMBR = request.getParameter("numEMBR");
		int indice2 = Integer.valueOf(numEMBR)-1;
		request.getSession().setAttribute("numEMBR", indice2);
		
		List<Classification> listClassifications2 = new ArrayList<Classification>();
		listClassifications2 = (List<Classification>)request.getSession().getAttribute("listClassifications2");
		
		String pre_description2 = listClassifications2.get(indice2).getPre_description();
		request.getSession().setAttribute("pre_description2", pre_description2);
		String description2 = listClassifications2.get(indice2).getDescription();
		request.getSession().setAttribute("description2", description2);
		int nb_especes2 = listClassifications2.get(indice2).getNb_especes();
		request.getSession().setAttribute("nb_especes2", nb_especes2);
		String nom2 = listClassifications2.get(indice2).getNom();
		request.getSession().setAttribute("nom2", nom2);
		String image2 = listClassifications2.get(indice2).getImage();
		request.getSession().setAttribute("image2", image2);
		int id2 = listClassifications2.get(indice2).getId();
		request.getSession().setAttribute("id2", id2);
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMarines/embranchement.jsp").forward(request, response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMarines/embranchement.jsp").forward(request, response);
	}
}
