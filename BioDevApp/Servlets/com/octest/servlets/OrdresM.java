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
import RGMicroOrg.RgClassificationMicroDaoImpl;

/**
 * Servlet implementation class Acaryotes
 */
@WebServlet("/OrdresM")
public class OrdresM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdresM() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		  HttpSession session = request.getSession();
		  String id = session.getId();
		  boolean isConnected = session.getAttribute(id) !=null;
		  request.setAttribute("isConnected", isConnected);
		  request.setAttribute("utilisateur", session.getAttribute(id));
		String numCategorie = request.getParameter("numCategorie");
		int indice3=Integer.valueOf(numCategorie)-1;
		RgClassificationMicroDaoImpl rgcdi = new RgClassificationMicroDaoImpl();
		List<RgClassificationMicro> listRGCM3=new ArrayList<RgClassificationMicro>();
		listRGCM3 = rgcdi.listerRGMicro(3, 2); //
		RgClassificationMicro rgcmct = new RgClassificationMicro();
		rgcmct = listRGCM3.get(indice3);		
		session.setAttribute("rgcmct", rgcmct);
		int idCategorie = rgcmct.getId();
		session.setAttribute("idCategorie", idCategorie);
		
	/*******************************************************************/	
		int parent_id= (int) session.getAttribute("idCategorie");
		List<RgClassificationMicro> listRGCM4=new ArrayList<RgClassificationMicro>(); 
		//RgClassificationMicroDaoImpl rgcdi = new RgClassificationMicroDaoImpl();
		listRGCM4 = rgcdi.listerRGMicro(4, parent_id);
		session.setAttribute("listRGCM4", listRGCM4);	

		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMicroOrg/Ordres.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
