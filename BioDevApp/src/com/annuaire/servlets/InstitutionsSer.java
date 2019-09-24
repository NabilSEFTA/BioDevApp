package com.annuaire.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.annuaire.beans.*;
import com.annuaire.dao.*;


/**
 * Servlet implementation class InstitutionSer
 */
@WebServlet("/InstitutionsSer")
public class InstitutionsSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CONF_DAO_FACTORY = "daofactory";
	public static final String VUE ="/WEB-INF/institutions.jsp";
	  private CategorieInstitutionDao categorieInstitutionDao;
	    private InstitutionDao institutionDao;
	
       

	  public void init() throws ServletException {
	    	 
	        DAOFactory daoFactory = DAOFactory.getInstance();
	        this.categorieInstitutionDao = daoFactory.getCategorieInstitutionDao();
	        this.institutionDao = daoFactory.getInstitutionDao();
	    }
	  
    public InstitutionsSer() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 List<Institution> insts = new ArrayList<Institution>();
		 String path= getServletContext().getRealPath("/BDImgs");
    	 insts = institutionDao.listerInst(path);
     	 request.setAttribute("insts",insts);

		this.getServletContext().getRequestDispatcher(VUE).forward( request, response );
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
