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


@WebServlet("/RG")
public class RG extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public RG() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		  HttpSession session = request.getSession();
		  String id = session.getId();
		  boolean isConnected = session.getAttribute(id) !=null;
		  request.setAttribute("isConnected", isConnected);
		  request.setAttribute("utilisateur", session.getAttribute(id));
		List<RgClassificationMicro> listRGCM=new ArrayList<RgClassificationMicro>(); 
		RgClassificationMicroDaoImpl rgcdi = new RgClassificationMicroDaoImpl();
		listRGCM = rgcdi.listerRGMicro(1, 0);
		session.setAttribute("listRGCM", listRGCM);
		
		
	     this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMicroOrg/RG.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
