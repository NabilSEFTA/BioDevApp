package com.annuaire.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.annuaire.beans.Institution;
import com.annuaire.dao.CategorieInstitutionDao;
import com.annuaire.dao.DAOFactory;
import com.annuaire.dao.InstitutionDao;

/**
 * Servlet implementation class ModifierInst
 */
@WebServlet("/ModifierInst")
@MultipartConfig
public class ModifierInst extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/modifierInst.jsp";
	public static final String CONF_DAO_FACTORY = "daofactory";
	public static final String VUE_POST ="/WEB-INF/institution.jsp";
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
    public ModifierInst() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Institution inst = new Institution();
	    int paramIdInst =Integer.parseInt(request.getParameter("id_inst"));
	    String path= getServletContext().getRealPath("/BDImgs");
    	inst = institutionDao.rechInstParId(paramIdInst,path);
        request.setAttribute("inst",inst);
	    this.getServletContext().getRequestDispatcher(VUE).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  Institution inst = new Institution();
		  int paramIdInst =Integer.parseInt(request.getParameter("id_inst"));
		  String path= getServletContext().getRealPath("/BDImgs");
	      inst = institutionDao.rechInstParId(paramIdInst,path);
	    	
		String acronyme = request.getParameter( "acronyme_inst");
		String catInst=request.getParameter("cat_inst");
	 	int idCatInst= Integer.parseInt(catInst);
		String nomInst = request.getParameter( "nom_inst");
		String descInst = request.getParameter( "description_inst");	
		Part filePart = request.getPart( "image_inst"); 
		String telInst = request.getParameter( "tel_inst");
		String faxInst = request.getParameter( "fax_inst");
		String mailInst = request.getParameter( "mail_inst");
		String lienSite = request.getParameter( "lien_site");
		String adresseInst = request.getParameter( "adresse_inst");
		
		Institution ninst = new Institution();
		ninst.setAcronyme(acronyme);
		ninst.setId_cat_inst(idCatInst);
		ninst.setNom_inst(nomInst);
		ninst.setDescription_inst(descInst);
		//inst.setImage_inst(imageInst);
		ninst.setTel_inst(telInst);
		ninst.setFax_inst(faxInst);
		ninst.setMail_inst(mailInst);
		ninst.setLien_site(lienSite);
		ninst.setAdresse_inst(adresseInst);
	
		
		try 
		{
			
			String msgAjout="";
			Boolean added=institutionDao.modifierInst(inst,ninst);
			request.setAttribute("inst",ninst);
			if(added== false)
			{ 
				msgAjout ="Cette institution existe déjà";
			}
			request.setAttribute("msgAjout",msgAjout);
		}
		catch(Exception e)
		{System.out.println("Echec de l'ajout");}
		
	    this.getServletContext().getRequestDispatcher(VUE_POST).forward( request, response );
	}
	
}
