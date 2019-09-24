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


@WebServlet("/Especes")
public class Especes extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Especes() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String numc = request.getParameter("numCATEG");
		int indice3 = Integer.valueOf(numc)-1;
		session.setAttribute("numCATEG", indice3);
		
		String idc = request.getParameter("idCATEG");
		int idCATEG = Integer.valueOf(idc);
		session.setAttribute("idCATEG", idCATEG);
		
		List<RessourceMarine> listRM = new ArrayList<RessourceMarine>();
		RessourceMarineDaoImpl rmdi = new RessourceMarineDaoImpl(); 
		listRM = rmdi.listerRessourcesMarines(idCATEG);
		session.setAttribute("listRM", listRM);
		//System.out.print(listRM);
		
		/*----------------------------------------------------------------------------------------------------------*/
		List<Classification> listClassifications3 = new ArrayList<Classification>();
		listClassifications3 = (List<Classification>)request.getSession().getAttribute("listClassifications3");
		String nom3 = listClassifications3.get(indice3).getNom();
		session.setAttribute("nom3", nom3);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMarines/especes.jsp").forward(request, response);
	}

}
