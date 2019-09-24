package RGFaune;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class AjouterCTA
 */
@WebServlet("/AjouterCTA")
public class AjouterCTA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterCTA() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  HttpSession session = request.getSession();
		  String id = session.getId();
		  boolean isConnected = session.getAttribute(id) !=null;
		  request.setAttribute("isConnected", isConnected);
		  request.setAttribute("utilisateur", session.getAttribute(id));
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGFaune/AjouterCTA.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    CTAbean cta = new CTAbean();
	        cta.setIntitule(request.getParameter("intitule"));
	        cta.setDescription(request.getParameter("description"));
	        cta.setProprietaire(request.getParameter("proprietaire"));
	        cta.setBrevet(request.getParameter("brevet"));
	        cta.setRegion(request.getParameter("region"));
	        cta.setPreparation(request.getParameter("preparation"));
	        
	        CTAdao listeCTA= new CTAdao();
	        listeCTA.ajouterCTA(cta);
	        
	        request.setAttribute("ctas", listeCTA.recupererCTA()); 
	        
	        this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGFaune/AjouterCTA.jsp").forward(request, response);
	
	
	}

}
