package com.sdzee.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Redirection
 */
@WebServlet("/Redirection")
public class Redirection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Redirection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 if(request.getParameter("Connexion")!= null ) {
		 response.sendRedirect("/BioDevApp/connexion");
	 }
	 if(request.getParameter("Inscription")!= null ) {
		 response.sendRedirect("/BioDevApp/inscription");
	 }else {
			
			if (request.getParameter("Accueil")!= null ) {
				this.getServletContext().getRequestDispatcher("").forward( request, response );
			}
			else {
				if (request.getParameter("Reglementation")!= null) {
					
					this.getServletContext().getRequestDispatcher("").forward( request, response );
				} else {
					if (request.getParameter("Annuaire")!= null) {
						this.getServletContext().getRequestDispatcher("").forward( request, response );
					} else {
						if (request.getParameter("CTA-microorganismes")!= null ) {
							this.getServletContext().getRequestDispatcher("").forward( request, response );
						}
						if (request.getParameter("CTA-faune")!= null ) {
							this.getServletContext().getRequestDispatcher("").forward( request, response );
						}
						if (request.getParameter("CTA-marine")!= null ) {
							this.getServletContext().getRequestDispatcher("").forward( request, response );
						}
						if (request.getParameter("CTA-foret")!= null ) {
							this.getServletContext().getRequestDispatcher("").forward( request, response );
						}
						if (request.getParameter("CTA-agriculture")!= null ) {
							this.getServletContext().getRequestDispatcher("").forward( request, response );
						}
						
						
						if (request.getParameter("RG-microorganismes")!= null ) {
							this.getServletContext().getRequestDispatcher("").forward( request, response );
						if (request.getParameter("RG-faune")!= null ) {
							this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGFaune/rgfaune.jsp").forward( request, response );
						}
						if (request.getParameter("RG-marine")!= null ) {
							this.getServletContext().getRequestDispatcher("").forward( request, response );
						}
						if (request.getParameter("RG-foret")!= null ) {
							this.getServletContext().getRequestDispatcher("").forward( request, response );
						}
						if (request.getParameter("RG-agriculture")!= null ) {
							System.out.println("Test");
							response.sendRedirect("/BioDevApp/classifications");
						}
						
					}

				}
			}
			
			
			
		}
	 }

    }
	

}
	
