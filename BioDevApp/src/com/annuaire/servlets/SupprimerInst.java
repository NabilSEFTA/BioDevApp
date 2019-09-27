package com.annuaire.servlets;

import java.io.IOException;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.annuaire.beans.Institution;
import com.annuaire.dao.CategorieInstitutionDao;
import com.annuaire.dao.DAOException;
import com.annuaire.dao.DAOFactory;
import com.annuaire.dao.InstitutionDao;

import RGAlim.ConnexionSimpleUser;
import RGAlim.model.Utilisateur;
import RGAlim.users.UtilisateurDAOImpSimple;
import RGAlim.users.inscriptionFormUser;
/**
 * Servlet implementation class SupprimerInst
 */
@WebServlet("/SupprimerInst")
public class SupprimerInst extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private EntityManager em;
	public static final String CONF_DAO_FACTORY = "daofactory";
	public static final String VUE="/WEB-INF/institutions.jsp";
    private CategorieInstitutionDao categorieInstitutionDao;
	private InstitutionDao institutionDao;
	
       

	  public void init() throws ServletException {
		    em = ConnexionSimpleUser.getEntityManager(); 
	    	System.out.println(em); 
	        DAOFactory daoFactory = DAOFactory.getInstance();
	        this.categorieInstitutionDao = daoFactory.getCategorieInstitutionDao();
	        this.institutionDao = daoFactory.getInstitutionDao();
	    }
       
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerInst() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		HttpSession session = request.getSession();
		String id = session.getId();
		boolean isConnected = false;
		if (session.getAttribute(id)==null) {response.sendRedirect("/BioDevApp/connexion");}
		else
		{
		Utilisateur user = (Utilisateur) session.getAttribute(id);

		Institution inst = new Institution();
	    int paramIdInst =Integer.parseInt(request.getParameter("id_inst"));
		try 
		{
		 String path= getServletContext().getRealPath("/BDImgs");
	     inst = institutionDao.rechInstParId(paramIdInst,path);
		 Boolean deleted=institutionDao.supprimerInst(inst);
		
		}
        catch(Exception e) {
        	
        }
		 response.sendRedirect("InstitutionsSer");
		 
		}
	
		
    	
     	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}

