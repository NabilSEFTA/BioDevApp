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
 * Servlet implementation class EubactCat
 */
@WebServlet("/CategoriesM")
public class CategoriesM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoriesM() {
        super();
       
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
		int parent_id= (int) session.getAttribute("idClasse");
		List<RgClassificationMicro> listRGCM3=new ArrayList<RgClassificationMicro>(); 
		RgClassificationMicroDaoImpl rgcdi = new RgClassificationMicroDaoImpl();
		listRGCM3 = rgcdi.listerRGMicro(3, parent_id);
		session.setAttribute("listRGCM3", listRGCM3);
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMicroOrg/Categories.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
