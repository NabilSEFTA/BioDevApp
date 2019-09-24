package RGFaune;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AjouterRG
 */
@WebServlet("/AjouterRG")
public class AjouterRG extends HttpServlet {
	private static final long serialVersionUID = 1L; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterRG() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  RGFdao listeRGF = new RGFdao();
		  
		  
		  HttpSession session = request.getSession();
		  String id = session.getId();
		  boolean isConnected = session.getAttribute(id) !=null;
		  request.setAttribute("isConnected", isConnected);
		  request.setAttribute("utilisateur", session.getAttribute(id));
	      
		  
		  request.setAttribute("rgfs", listeRGF.recupererRGF());
	        
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGFaune/AjouterRG.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   RGFbean rgf = new RGFbean();
	        rgf.setNom_latin(request.getParameter("nom_latin"));
	        rgf.setNom_arabe(request.getParameter("nom_arabe"));
	        rgf.setNom_amazigh(request.getParameter("nom_amazigh"));
	        rgf.setDescription(request.getParameter("description"));
	        rgf.setUtilisateur(request.getParameter("utilisateur"));
	        rgf.setWilaya(request.getParameter("wilaya"));
	        rgf.setRegion(request.getParameter("region"));
	        int nb = Integer.valueOf(request.getParameter("nombre"));
	        rgf.setNombre(nb);
	        boolean n = Boolean.valueOf(request.getParameter("noyau_cellulaire"));
	        rgf.setNoyau_cellulaire(n);
	        boolean p = Boolean.valueOf(request.getParameter("poils"));
	        rgf.setPoils(p);
	        boolean v = Boolean.valueOf(request.getParameter("vertèbres"));
	        rgf.setVertèbres(v);
	        boolean m = Boolean.valueOf(request.getParameter("membres"));
	        rgf.setMembres(m);
	
	        
	        RGFdao listeRGF= new RGFdao();
	        listeRGF.ajouterRGF(rgf);
	        
	        request.setAttribute("rgfs", listeRGF.recupererRGF());
	        
	        this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGFaune/AjouterRG.jsp").forward(request, response);
	}

}
