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

/**
 * Servlet implementation class CTA1
 */
@WebServlet("/CTADetailsM")
public class CTADetailsM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CTADetailsM() {
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
		String numCta = request.getParameter("numCta");
		int indice = Integer.valueOf(numCta)-1;
		List<RGFaune.CTA> listCTAM=new ArrayList<RGFaune.CTA>(); 
		listCTAM = (List<RGFaune.CTA>) session.getAttribute("listCTAM");
		
		CTA rgcta = new CTA();
		rgcta = listCTAM.get(indice);	
		session.setAttribute("rgcta", rgcta);
		int idCta = rgcta.getId();
		session.setAttribute("idCta", idCta);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMicroOrg/CTADetails.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
