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
 * Servlet implementation class Procaryotes
 */
@WebServlet("/EmbranchementM")
public class EmbranchementM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmbranchementM() {
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
		String numEmbr = request.getParameter("numEmbr");
		int indice1 = Integer.valueOf(numEmbr)-1;
		List<RgClassificationMicro> listRGCM=new ArrayList<RgClassificationMicro>(); 
		listRGCM = (List<RgClassificationMicro>) session.getAttribute("listRGCM");
		RgClassificationMicro rgcm = new RgClassificationMicro();
		rgcm = listRGCM.get(indice1);	
		session.setAttribute("rgcm", rgcm);
		int idEmbr = rgcm.getId();
		session.setAttribute("idEmbr", idEmbr);
		
        this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMicroOrg/Embranchement.jsp").forward(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
