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

@WebServlet("/DetailsForest")
public class DetailsForest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DetailsForest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String nesp = request.getParameter("numEspfor");
		int numESP = Integer.valueOf(nesp)-1;
		session.setAttribute("numEspfor", numESP);
		
		String iesp = request.getParameter("idEspfor");
		int idESP = Integer.valueOf(iesp);
		session.setAttribute("idEspfor", idESP);
		
		/*---------------------Récupération de la ressource marine selectionnée-------------------------*/

		List<RessourceForestiere> listRF = new ArrayList<RessourceForestiere>();
		listRF = (List<RessourceForestiere>) session.getAttribute("listRF");
		RessourceForestiere rf = new RessourceForestiere();
		rf = listRF.get(numESP);
		session.setAttribute("rf", rf);
		int idLF = rf.getId_localisation_forestiere();
		int idEF = rf.getId_ecosys_forestiere();
		/*---------------------Récupération de la ressource génétique (Détails)-------------------------*/
		
		RessourceGenetiqueF rg = new RessourceGenetiqueF();
		RessourceGenetiqueFDaoImpl rgdi = new RessourceGenetiqueFDaoImpl(); 
		rg = rgdi.RecupererRG(idESP);
		session.setAttribute("rg", rg);
		
		/*------------------------Récupération de la localisation de la RGM ----------------------------*/
		
		LocalisationForestiere lf = new LocalisationForestiere();
		LocalisationForestDaoImpl lmdi = new LocalisationForestDaoImpl(); 
		lf = lmdi.RecupererLF(idLF);
		session.setAttribute("lf", lf);
		
		/*--------------------------Récupération de l'écosystème de la RGM -----------------------------*/
		
		EcosystemeForestiere em = new EcosystemeForestiere();
		EcosystemeForestDaoImpl emdi = new EcosystemeForestDaoImpl(); 
		em = emdi.RecupererEF(idEF);
		session.setAttribute("em", em);
		
		/*-----------------------------Vérifie privillège et recupérer CTA ----------------------------*/
		//boolean autorise = false;
		boolean autoriseCTA = false;
		System.out.println("categUser = "+session.getAttribute("categUser"));
		if(session.getAttribute("categUser")!=null && (int)session.getAttribute("categUser")==2) {
			autoriseCTA = true;
			CTAForest cta = new CTAForest();
			CtaForestDaoImpl cdi = new CtaForestDaoImpl();
			cta = cdi.recupCTA(rg.getId_cta());
			session.setAttribute("cta", cta);
			
		}
		session.setAttribute("autoriseCTA", autoriseCTA);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGForest/detailsForest.jsp").forward(request, response);
	}
	
	/*private CTA recupererCTA(int id_CTA) {
		CTA cta = new CTA();
		CtaDaoImpl cdi = new CtaDaoImpl();
		cta = cdi.recupCTA(id_CTA);
		return cta;
	}*/

}
