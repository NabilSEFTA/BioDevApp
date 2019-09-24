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

import RGMicroOrg.RgClassificationMicro;

/**
 * Servlet implementation class EubactClasse
 */
@WebServlet("/ClasseM")
public class ClasseM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClasseM() {
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
		String numClasse = request.getParameter("numClasse");
		int indice2 = Integer.valueOf(numClasse)-1;
		List<RgClassificationMicro> listRGCM2=new ArrayList<RgClassificationMicro>(); 
		listRGCM2 = (List<RgClassificationMicro>) session.getAttribute("listRGCM2");
		RgClassificationMicro rgcmc = new RgClassificationMicro();
		rgcmc = listRGCM2.get(indice2);	
		session.setAttribute("rgcmc", rgcmc);
		int idClasse = rgcmc.getId();
		session.setAttribute("idClasse", idClasse);
		
		
		 this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMicroOrg/Classe.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
