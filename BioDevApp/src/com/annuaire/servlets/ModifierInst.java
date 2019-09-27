package com.annuaire.servlets;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.annuaire.beans.Institution;
import com.annuaire.dao.CategorieInstitutionDao;
import com.annuaire.dao.DAOFactory;
import com.annuaire.dao.InstitutionDao;
import com.annuaire.dao.Utils;

import RGAlim.ConnexionSimpleUser;
import RGAlim.model.Utilisateur;
import RGAlim.users.UtilisateurDAOImpSimple;
import RGAlim.users.inscriptionFormUser;


import javax.persistence.EntityManager;
/**
 * Servlet implementation class ModifierInst
 */
@WebServlet("/ModifierInst")
@MultipartConfig
public class ModifierInst extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private EntityManager em;
	public static final String VUE = "/WEB-INF/modifierInst.jsp";
	public static final String CONF_DAO_FACTORY = "daofactory";
	public static final String VUE_POST ="/WEB-INF/institution.jsp";
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
    public ModifierInst() {
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
		request.setAttribute("utilisateur",user );
		Institution inst = new Institution();
	    int paramIdInst =Integer.parseInt(request.getParameter("id_inst"));
	    String path= getServletContext().getRealPath("/BDImgs");
    	inst = institutionDao.rechInstParId(paramIdInst,path);
        request.setAttribute("inst",inst);
	    this.getServletContext().getRequestDispatcher(VUE).forward( request, response );
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  Institution inst = new Institution();
		  Institution ninst = new Institution();
		  int paramIdInst =Integer.parseInt(request.getParameter("id_inst"));
		  String path= getServletContext().getRealPath("/BDImgs");
	      inst = institutionDao.rechInstParId(paramIdInst,path);
	    	
		String acronyme = request.getParameter( "acronyme_inst");
		String catInst=request.getParameter("cat_inst");
	 	int idCatInst= Integer.parseInt(catInst);
		String nomInst = request.getParameter( "nom_inst");
		String descInst = request.getParameter( "description_inst");	
		Part filePart = request.getPart( "image_inst"); 
		File newFile = inst.getImage_inst();
		
		if (filePart!= null && filePart.getSize()!=0)
		{
		InputStream fileContent = filePart.getInputStream();
     	File imageInst=Utils.InputStreamToFile (fileContent,acronyme,path);
      	newFile = imageInst;
		} 
		String telInst = request.getParameter( "tel_inst");
		String faxInst = request.getParameter( "fax_inst");
		String mailInst = request.getParameter( "mail_inst");
		String lienSite = request.getParameter( "lien_site");
		String adresseInst = request.getParameter( "adresse_inst");
		
	
		ninst.setAcronyme(acronyme);
		ninst.setId_cat_inst(idCatInst);
		ninst.setNom_inst(nomInst);
		ninst.setDescription_inst(descInst);
		ninst.setImage_inst(newFile);
		ninst.setTel_inst(telInst);
		ninst.setFax_inst(faxInst);
		ninst.setMail_inst(mailInst);
		ninst.setLien_site(lienSite);
		ninst.setAdresse_inst(adresseInst);
	
		
		try 
		{
			
			String msgAjout="";
			Boolean modified=institutionDao.modifierInst(inst,ninst);
			request.setAttribute("inst",ninst);
			if(modified== false)
			{ 
				msgAjout ="Cette institution existe déjà";
			}
			request.setAttribute("msgAjout",msgAjout);
		}
		catch(Exception e)
		{System.out.println("Echec de l'ajout"+e.getMessage());}
		
	    this.getServletContext().getRequestDispatcher(VUE_POST).forward( request, response );
	}
	
}
