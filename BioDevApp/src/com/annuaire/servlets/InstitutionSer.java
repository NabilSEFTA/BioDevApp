package com.annuaire.servlets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.annuaire.beans.Institution;
import com.annuaire.dao.CategorieInstitutionDao;
import com.annuaire.dao.DAOFactory;
import com.annuaire.dao.InstitutionDao;

/**
 * Servlet implementation class InstitutionSer
 */
@WebServlet("/InstSer")
public class InstitutionSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CONF_DAO_FACTORY = "daofactory";
	public static final String VUE ="/WEB-INF/institution.jsp";
	  private CategorieInstitutionDao categorieInstitutionDao;
	    private InstitutionDao institutionDao;
	
       

	  public void init() throws ServletException {
	    	 
	        DAOFactory daoFactory = DAOFactory.getInstance();
	        this.categorieInstitutionDao = daoFactory.getCategorieInstitutionDao();
	        this.institutionDao = daoFactory.getInstitutionDao();
	    }
	  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InstitutionSer() {
        super();
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Institution inst = new Institution();
	    int paramIdInst =Integer.parseInt(request.getParameter("id_inst"));
	
		//paramIdInst = request.getParameter( "idInst" );
	    String path= getServletContext().getRealPath("/BDImgs");
    	inst = institutionDao.rechInstParId(paramIdInst,path);
        request.setAttribute("inst",inst);
	    this.getServletContext().getRequestDispatcher(VUE).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
