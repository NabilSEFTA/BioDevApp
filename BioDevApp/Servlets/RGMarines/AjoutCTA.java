package RGMarines;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AjoutCTA")
public class AjoutCTA extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AjoutCTA() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect( request.getContextPath() +"/HomeSpecialiste" );

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CTAMa cta = new CTAMa();
		CtaDaoImpl cdi = new CtaDaoImpl();
		
		String intitule = request.getParameter("intitule");
		cta.setIntitule(intitule);
		String brevet = request.getParameter("brevet");
		cta.setBrevet(brevet);
		String proprietaire = request.getParameter("proprietaire");
		cta.setProprietaire(proprietaire);
		String region = request.getParameter("region");
		cta.setRegion(region);
		String description = request.getParameter("description");
		cta.setDescription(description);
		String preparation = request.getParameter("preparation");
		cta.setPreparation(preparation);
		String ingredients = request.getParameter("ingredients");
		cta.setIngredients(ingredients);
		String val = request.getParameter("validee");
		Boolean validee;
		if(val.equals("on")) validee = true;
		else validee = false;
		cta.setValidee(validee);
		cta.setImage("images/RGMarines/...");

		cdi.ajouterCTA(cta);
		
		doGet(request, response);
	}

}
