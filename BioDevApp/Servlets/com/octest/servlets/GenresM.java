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
 * Servlet implementation class EubactOrdre
 */
@WebServlet("/GenresM")
public class GenresM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenresM() {
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
		String numOrdre = request.getParameter("numOrdre");
		int indice4=Integer.valueOf(numOrdre)-1;
		RgClassificationMicroDaoImpl rgcdi = new RgClassificationMicroDaoImpl();
		List<RgClassificationMicro> listRGCM4=new ArrayList<RgClassificationMicro>();
		listRGCM4 = rgcdi.listerRGMicro(4, 3);
		RgClassificationMicro rgcmo = new RgClassificationMicro();
		rgcmo = listRGCM4.get(indice4);		
		session.setAttribute("rgcmo", rgcmo);
		int idOrdre = rgcmo.getId();
		session.setAttribute("idOrdre", idOrdre);
		
	/*******************************************************************/	
		int parent_id= (int) session.getAttribute("idOrdre");
		List<RgClassificationMicro> listRGCM5=new ArrayList<RgClassificationMicro>(); 
		listRGCM5 = rgcdi.listerRGMicro(5, parent_id);
		session.setAttribute("listRGCM5", listRGCM5);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMicroOrg/Genres.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
