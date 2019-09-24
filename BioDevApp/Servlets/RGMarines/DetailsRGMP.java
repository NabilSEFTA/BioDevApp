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
 * Servlet implementation class DetailsRGMP
 */
@WebServlet("/DetailsRGMP")
public class DetailsRGMP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DetailsRGMP() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

HttpSession session = request.getSession();
		
		String nRGMP = request.getParameter("numRGMP");
		int numRGMP = Integer.valueOf(nRGMP)-1;
		//session.setAttribute("numRGMP", numESP);
		
		String iRGMP = request.getParameter("idRGMP");
		int idRGMP = Integer.valueOf(iRGMP);
		//session.setAttribute("idESP", idESP);
		
		/*---------------------Récupération de la ressource marine proposée selectionnée-------------------------*/

		List<RessourceMarine> listRMP = new ArrayList<RessourceMarine>();
		listRMP = (List<RessourceMarine>) session.getAttribute("listRMP");
		RessourceMarine rmp = new RessourceMarine();
		rmp = listRMP.get(numRGMP);
		session.setAttribute("rmp", rmp);
		int idLMP = rmp.getId_localisation_marine();
		int idEMP = rmp.getId_ecosys_marine();
		//System.out.println("hhhhhhhh"+ rm.getImageMale());
		/*---------------------Récupération de la ressource génétique proposée (Détails)-------------------------*/
		
		RessourceGenetiqueMa rgp = new RessourceGenetiqueMa();
		RessourceGenetiqueDaoImpl rgdi = new RessourceGenetiqueDaoImpl(); 
		rgp = rgdi.RecupererRG(idRGMP);
		session.setAttribute("rgp", rgp);
		
		/*------------------------Récupération de la localisation de la RGM ----------------------------*/
		
		LocalisationMarine lmp = new LocalisationMarine();
		LocalisationMarineDaoImpl lmdi = new LocalisationMarineDaoImpl(); 
		lmp = lmdi.RecupererLM(idLMP);
		session.setAttribute("lmp", lmp);
		
		/*--------------------------Récupération de l'écosystème de la RGM -----------------------------*/
		
		EcosystemeMarine emp = new EcosystemeMarine();
		EcosystemeMarineDaoImpl emdi = new EcosystemeMarineDaoImpl(); 
		emp = emdi.RecupererEM(idEMP);
		session.setAttribute("emp", emp);
		System.out.println(emp.getSalinite());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMarines/detailsRGMP.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
