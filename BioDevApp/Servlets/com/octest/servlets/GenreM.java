package com.octest.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RGMicroOrg.RessourceGenetique;
import RGMicroOrg.RessourceGenetiqueDaoImpl;
import RGMicroOrg.RessourceMicroOrg;
import RGMicroOrg.RessourceMicroOrgDaoImpl;
import RGMicroOrg.RgClassificationMicro;
import RGMicroOrg.RgClassificationMicroDaoImpl;

/**
 * Servlet implementation class Genre
 */
@WebServlet("/GenreM")
public class GenreM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenreM() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		  HttpSession session = request.getSession();
		  String id = session.getId();
		  boolean isConnected = session.getAttribute(id) !=null;
		  request.setAttribute("isConnected", isConnected);
		  request.setAttribute("utilisateur", session.getAttribute(id));
		
		/********* recuperation de lelement********/
		
		String numGenre = request.getParameter("numGenre");
		int indice = Integer.valueOf(numGenre)-1;
		List<RgClassificationMicro> listRGCM5=new ArrayList<RgClassificationMicro>();
		listRGCM5 = (List<RgClassificationMicro>) session.getAttribute("listRGCM5");
		RgClassificationMicro rgcm = new RgClassificationMicro();
		rgcm = listRGCM5.get(indice);	
		int id_classification = rgcm.getId();
		session.setAttribute("id_classification", id_classification);
		
		/******la selection selon id classification*****/
		

		RessourceMicroOrgDaoImpl rgmdi = new RessourceMicroOrgDaoImpl();
		List<RessourceMicroOrg> listRGM=new ArrayList<RessourceMicroOrg>();
		listRGM= rgmdi.listerRessourceMicro(id_classification);
		session.setAttribute("listRGM", listRGM);
		RessourceMicroOrg rgm= new RessourceMicroOrg();
		rgm=listRGM.get(indice); //faux
		session.setAttribute("rgm", rgm);
		int idGenre= rgm.getId();
		session.setAttribute("idGenre", idGenre);

		
			
		 this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMicroOrg/Genre.jsp").forward(request, response);
	}

	/**0
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
