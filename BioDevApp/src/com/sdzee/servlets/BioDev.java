package com.sdzee.servlets;

import java.io.IOException;
import com.sdzee.bean.*;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.sdzee.dao.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static com.sdzee.dao.DAOUtilitaire.*;
/**
 * Servlet implementation class BIODev
 */
@WebServlet("/BIODev")
public class BioDev extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private newsInt newsInt; 
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
	 public void init() throws ServletException {
	        /* Récupération d'une instance de notre DAO Utilisateur */
	        this.newsInt = ( (DAOFactory) getServletContext().getAttribute( "daofactory" ) ).getUtilisateurDao();
	 }

    public BioDev() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		ResultSet res = this.newsInt.recupererEvents();
		ResultSet resultSet = this.newsInt.recupererNews();
		ResultSet articleSet = this.newsInt.recupererArticle();
		request.setAttribute("listeEvents", MapEvents(res));
		request.setAttribute("listeNews", MapNews(resultSet));
		request.setAttribute("listeArticle", MapArticle(articleSet));
		this.getServletContext().getRequestDispatcher("/WEB-INF/lot2/BioDev.jsp").forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
		if (request.getParameter("boolnews").equals("true")  ) {
			request.setAttribute("TitreNews", request.getParameter("titre"));
			request.setAttribute("ContenuNews", request.getParameter("contenu"));
			request.setAttribute("DateNews", request.getParameter("date"));
			request.setAttribute("DescriptionNews", request.getParameter("description"));
			request.setAttribute("PathNews", request.getParameter("path"));
			request.setAttribute("NewsList", MapNews(this.newsInt.recupererListNews()));
			this.getServletContext().getRequestDispatcher("/WEB-INF/lot2/News.jsp").forward( request, response );
		}
		else {
			if (request.getParameter("boolnews").equals("article")  ) {
				request.setAttribute("TitreArticle", request.getParameter("titreArticle"));
				request.setAttribute("ContenuArticle", request.getParameter("contenuArticle"));
				request.setAttribute("DateArticle", request.getParameter("dateArticle"));
				request.setAttribute("DescriptionArticle", request.getParameter("descriptionArticle"));
				request.setAttribute("PathArticle", request.getParameter("pathArticle"));
				request.setAttribute("ArticleList", MapNews(this.newsInt.recupererListArticle()));
				this.getServletContext().getRequestDispatcher("/WEB-INF/lot2/article.jsp").forward( request, response );
			}
			else {
				request.setAttribute("PathEvent", request.getParameter("pathEvent"));
				request.setAttribute("TitreEvent", request.getParameter("titreEvent"));
				request.setAttribute("ContenuEvent", request.getParameter("contenuEvent"));
				request.setAttribute("DateEvent", request.getParameter("dateEvent"));
				request.setAttribute("DescriptionEvent", request.getParameter("descriptionEvent"));
				request.setAttribute("EventsList", MapNews(this.newsInt.recupererListEvents()));
				this.getServletContext().getRequestDispatcher("/WEB-INF/lot2/event.jsp").forward( request, response );
			}
			
		}
	}

}
