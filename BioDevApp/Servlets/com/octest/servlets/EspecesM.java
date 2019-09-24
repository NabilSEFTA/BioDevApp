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
import RGMicroOrg.CTADaoImpl;
import RGMicroOrg.RessourceMicroOrg;
import RGMicroOrg.RessourceMicroOrgDaoImpl;
import RGMicroOrg.RgClassificationMicro;
import RGMicroOrg.RgClassificationMicroDaoImpl;

/**
 * Servlet implementation class Especes
 */
@WebServlet("/EspecesM")
public class EspecesM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EspecesM() {
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
		List<RessourceMicroOrg> listEsp=new ArrayList<RessourceMicroOrg>();
		RessourceMicroOrgDaoImpl rgcdi = new RessourceMicroOrgDaoImpl();
		listEsp = rgcdi.listerEsp();
		session.setAttribute("listEsp", listEsp);
		
		
	     this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMicroOrg/Especes.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
