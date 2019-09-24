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

import RGFaune.CTA;
import RGMicroOrg.RessourceMicroOrg;

/**
 * Servlet implementation class Espece
 */
@WebServlet("/EspeceM")
public class EspeceM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EspeceM() {
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
		String numEsp = request.getParameter("numEsp");
		int indice = Integer.valueOf(numEsp)-1;
		List<RessourceMicroOrg> listEsp=new ArrayList<RessourceMicroOrg>(); 
		listEsp = (List<RessourceMicroOrg>) session.getAttribute("listEsp");		
		/******/
		RessourceMicroOrg rgEsp = new RessourceMicroOrg();
		rgEsp = listEsp.get(indice);	
		session.setAttribute("rgEsp", rgEsp);
		int idEsp = rgEsp.getId();
		session.setAttribute("idEsp", idEsp);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMicroOrg/Espece.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
