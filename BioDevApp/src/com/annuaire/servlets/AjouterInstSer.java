package com.annuaire.servlets;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

//import org.apache.tomcat.util.http.fileupload.FileUploadException;

import com.annuaire.beans.Institution;
import com.annuaire.dao.CategorieInstitutionDao;
import com.annuaire.dao.DAOFactory;
import com.annuaire.dao.InstitutionDao;
import com.annuaire.dao.Utils;

/**
 * Servlet implementation class AjouterInstSer
 */
@WebServlet("/ajoutSer")
@MultipartConfig
public class AjouterInstSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	//public static final String SESSION_CLIENTS = "cs";
	public static final String VUE = "/WEB-INF/ajouterInst.jsp";
	public static final String CONF_DAO_FACTORY = "daofactory";
	public static final String VUE_POST ="/WEB-INF/institution.jsp";
    private CategorieInstitutionDao categorieInstitutionDao;
	private InstitutionDao institutionDao;
	
       

	  public void init() throws ServletException {
	    	 
	        DAOFactory daoFactory = DAOFactory.getInstance();
	        this.categorieInstitutionDao = daoFactory.getCategorieInstitutionDao();
	        this.institutionDao = daoFactory.getInstitutionDao();
	    }
	  
	
       
 
    public AjouterInstSer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* À la réception d'une requête GET, simple affichage du formulaire */
		this.getServletContext().getRequestDispatcher( VUE).forward( request, response );

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acronyme = request.getParameter( "acronyme_inst");
		String catInst=request.getParameter("cat_inst");
	 	int idCatInst= Integer.parseInt(catInst);
		String nomInst = request.getParameter( "nom_inst");
		String descInst = request.getParameter( "description_inst");
		
		Part filePart = request.getPart( "image_inst"); 
		InputStream fileContent = filePart.getInputStream();
	/*	File imageInst=new File("");
	     Utils.copyInputStreamToFile(fileContent,imageInst);*/
        
		String telInst = request.getParameter( "tel_inst");
		String faxInst = request.getParameter( "fax_inst");
		String mailInst = request.getParameter( "mail_inst");
		String lienSite = request.getParameter( "lien_site");
		String adresseInst = request.getParameter( "adresse_inst");
		
		Institution inst = new Institution();
		inst.setAcronyme(acronyme);
		inst.setId_cat_inst(idCatInst);
		inst.setNom_inst(nomInst);
		inst.setDescription_inst(descInst);
		//inst.setImage_inst(imageInst);
		inst.setTel_inst(telInst);
		inst.setFax_inst(faxInst);
		inst.setMail_inst(mailInst);
		inst.setLien_site(lienSite);
		inst.setAdresse_inst(adresseInst);
	
		
		try 
		{
			
			String path= getServletContext().getRealPath("/BDImgs");
			String msgAjout="";
			Boolean added=institutionDao.ajouterInst(inst,path);
			request.setAttribute("inst",inst);
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


