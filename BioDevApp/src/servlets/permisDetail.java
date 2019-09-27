package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.PermisAcces;
import business.PermisCirculation;
import business.PermisTransfert;
import business.PermisValorisation;
import dao.PermisDAO;

/**
 * Servlet implementation class permisDetail
 */
@WebServlet("/permisdetail")
public class permisDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		int permisId = Integer.parseInt(request.getParameter("id")); 
		String type = request.getParameter("type"); 
		
		if ("Premis d'acces".equals(type)) {
			PermisAcces p;
			p =(PermisAcces)PermisDAO.getPermisAcc(permisId);
			request.setAttribute("permis",p);
			request.getRequestDispatcher( "/WEB-INF/Permis/permisDetailsAcc.jsp" ).forward( request, response );
		}
		else if ("Permis de transfert".equals(type)) {
			PermisTransfert p;
			p = PermisDAO.getPermisTran(permisId);
			request.setAttribute("permis",p);
			request.getRequestDispatcher( "/WEB-INF/Permis/permisDetailsTran.jsp" ).forward( request, response );
			
				
		}else if ("Permis de valorisation".equals(type)) {
			PermisValorisation p;
			p = PermisDAO.getPermisVal(permisId);
			request.setAttribute("permis",p);
			request.getRequestDispatcher( "/WEB-INF/Permis/permisDetailsVal.jsp" ).forward( request, response );
			
				
		}
		else if ("Permis de circulation".equals(type)) {
			PermisCirculation p;
			p = (PermisCirculation) PermisDAO.getPermisCir(permisId);
			request.setAttribute("permis",p);
			request.getRequestDispatcher( "/WEB-INF/Permis/permisDetailsCir.jsp" ).forward( request, response );
							
		}
		
		
		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("type"));

		
		   
		
		
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
