package servlets;

import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RGAlim.model.Utilisateur;
import business.Permis;
import dao.PermisDAO;

/**
 * Servlet implementation class DemandesAdmin
 */
@WebServlet("/gestiondemandes")
public class DemandesAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		 HttpSession session = request.getSession();
		 String id = session.getId();
		 String admin = (String) session.getAttribute(id);
		 if (admin.equals("admin")) {
		//int param2=0;
        //if (request.getParameter("param2") !=null ) {param2 = Integer.parseInt( request.getParameter("param2"));}
        if ("valide".equals((String)request.getParameter("param1"))) {
        	System.out.println("*********");
    	   PermisDAO.validePermis(Integer.parseInt( request.getParameter("param2")));
        		
        } else if ("suspendre".equals((String)request.getParameter("param1"))) {
        	PermisDAO.suspendrePermis(Integer.parseInt( request.getParameter("param2")));
        		
        }
        	
        
        
        
		request.getRequestDispatcher( "/WEB-INF/Permis/listesDemandesAdmin.jsp" ).forward( request, response );}
		 else {
			 response.sendRedirect("/BioDevApp/connexionAdmin");
		 } 
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
