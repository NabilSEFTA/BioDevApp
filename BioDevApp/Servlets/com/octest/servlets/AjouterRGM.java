package com.octest.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RGMicroOrg.RGbean;
import RGMicroOrg.RGdao;

/**
 * Servlet implementation class AjouterRG
 */
@WebServlet("/AjouterRGM")
public class AjouterRGM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterRGM() {
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
		 RGdao listeRGM = new RGdao();
	      request.setAttribute("rgml", listeRGM.recupererRG());
	        
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMicroOrg/AjouterRG.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    RGbean rgm = new RGbean();
	       
		  // pathogenie, respiration, forme, reproduction FROM \"RG\".\"RessourceMicroOrg\";"); 
            
		    rgm.setNom_latin(request.getParameter("nom_latin"));
	        rgm.setNom_arabe(request.getParameter("nom_arabe"));
	        rgm.setNom_amazigh(request.getParameter("nom_amazigh"));
	        rgm.setDescription(request.getParameter("description"));
	        boolean n = Boolean.valueOf(request.getParameter("presence_noyau"));
	        rgm.setPresence_noyau(n);
	        rgm.setUtilisateur(request.getParameter("utilisateur"));  
	        rgm.setEmplacement_adn(request.getParameter("emplacement_adn"));
	        rgm.setImage(request.getParameter("image"));
	        //ecosys, pathogenie, respiration, forme, reproduction
	        rgm.setEcosys(request.getParameter("ecosys"));
	        rgm.setPathogenie(request.getParameter("pathogenie"));
	        rgm.setRespiration(request.getParameter("respiration"));
	        rgm.setForme(request.getParameter("forme"));
	        rgm.setReproduction(request.getParameter("reproduction"));
	        
	        RGdao listeRGM= new RGdao();
	        listeRGM.ajouterRGM(rgm);
	        
	        request.setAttribute("rgml", listeRGM.recupererRG());
	        
	        this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMicroOrg/AjouterRG.jsp").forward(request, response);
	}

}
