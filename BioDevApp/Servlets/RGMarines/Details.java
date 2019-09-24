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

@WebServlet("/Details")
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Details() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String nesp = request.getParameter("numESP");
		int numESP = Integer.valueOf(nesp)-1;
		session.setAttribute("numESP", numESP);
		
		String iesp = request.getParameter("idESP");
		int idESP = Integer.valueOf(iesp);
		session.setAttribute("idESP", idESP);
		
		/*---------------------Récupération de la ressource marine selectionnée-------------------------*/

		List<RessourceMarine> listRM = new ArrayList<RessourceMarine>();
		listRM = (List<RessourceMarine>) session.getAttribute("listRM");
		RessourceMarine rm = new RessourceMarine();
		rm = listRM.get(numESP);
		session.setAttribute("rm", rm);
		int idLM = rm.getId_localisation_marine();
		int idEM = rm.getId_ecosys_marine();
		//System.out.println("hhhhhhhh"+ rm.getImageMale());
		/*---------------------Récupération de la ressource génétique (Détails)-------------------------*/
		
		RessourceGenetiqueMa rg = new RessourceGenetiqueMa();
		RessourceGenetiqueDaoImpl rgdi = new RessourceGenetiqueDaoImpl(); 
		rg = rgdi.RecupererRG(idESP);
		session.setAttribute("rg", rg);
		
		/*------------------------Récupération de la localisation de la RGM ----------------------------*/
		
		LocalisationMarine lm = new LocalisationMarine();
		LocalisationMarineDaoImpl lmdi = new LocalisationMarineDaoImpl(); 
		lm = lmdi.RecupererLM(idLM);
		session.setAttribute("lm", lm);
		
		/*--------------------------Récupération de l'écosystème de la RGM -----------------------------*/
		
		EcosystemeMarine em = new EcosystemeMarine();
		EcosystemeMarineDaoImpl emdi = new EcosystemeMarineDaoImpl(); 
		em = emdi.RecupererEM(idEM);
		session.setAttribute("em", em);
		System.out.println(em.getSalinite());
		
		/*-----------------------------Vérifie privillège et recupérer CTA ----------------------------*/
		//boolean autorise = false;
		boolean autoriseCTA = false;
		System.out.println("categUser = "+session.getAttribute("categUser"));
		if(session.getAttribute("categUser")!=null && (int)session.getAttribute("categUser")==2) {
			System.out.println("ani hna");
			autoriseCTA = true;
			CTAMa cta = new CTAMa();
			CtaDaoImpl cdi = new CtaDaoImpl();
			cta = cdi.recupCTA(rg.getId_cta());
			session.setAttribute("cta", cta);
			
		}
		session.setAttribute("autoriseCTA", autoriseCTA);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMarines/details.jsp").forward(request, response);
	}
	
	/*private CTA recupererCTA(int id_CTA) {
		CTA cta = new CTA();
		CtaDaoImpl cdi = new CtaDaoImpl();
		cta = cdi.recupCTA(id_CTA);
		return cta;
	}*/

}
