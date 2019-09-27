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
 * Servlet implementation class DetailsRGMP
 */
@WebServlet("/DetailsRGFP")
public class DetailsRGFP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DetailsRGFP() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

HttpSession session = request.getSession();
		
		String nRGMP = request.getParameter("numRGFP");
		int numRGMP = Integer.valueOf(nRGMP)-1;
		//session.setAttribute("numRGMP", numESP);
		
		String iRGMP = request.getParameter("idRGFP");
		int idRGMP = Integer.valueOf(iRGMP);
		//session.setAttribute("idESP", idESP);
		
		/*---------------------Récupération de la ressource marine proposée selectionnée-------------------------*/

		List<RessourceForestiere> listRFP = new ArrayList<RessourceForestiere>();
		listRFP = (List<RessourceForestiere>) session.getAttribute("listRFP");
		RessourceForestiere rfp = new RessourceForestiere();
		rfp = listRFP.get(numRGMP);
		session.setAttribute("rfp", rfp);
		int idLMP = rfp.getId_localisation_forestiere();
		int idEMP = rfp.getId_ecosys_forestiere();
		//System.out.println("hhhhhhhh"+ rm.getImageMale());
		/*---------------------Récupération de la ressource génétique proposée (Détails)-------------------------*/
		
		RessourceGenetiqueF rgfp = new RessourceGenetiqueF();
		RessourceGenetiqueFDaoImpl rgdi = new RessourceGenetiqueFDaoImpl(); 
		rgfp = rgdi.RecupererRG(idRGMP);
		session.setAttribute("rgfp", rgfp);
		
		/*------------------------Récupération de la localisation de la RGM ----------------------------*/
		
		LocalisationForestiere lmp = new LocalisationForestiere();
		LocalisationForestDaoImpl lmdi = new LocalisationForestDaoImpl(); 
		lmp = lmdi.RecupererLF(idLMP);
		session.setAttribute("lfp", lmp);
		
		/*--------------------------Récupération de l'écosystème de la RGM -----------------------------*/
		
		EcosystemeForestiere emp = new EcosystemeForestiere();
		EcosystemeForestDaoImpl emdi = new EcosystemeForestDaoImpl(); 
		emp = emdi.RecupererEF(idEMP);
		session.setAttribute("efp", emp);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGForest/detailsRGFP.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
