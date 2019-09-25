package RGAlim.servlet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RGAlim.ConnexionSimpleUser;
import RGAlim.model.AjoutRph;
import RGAlim.model.ClassificationDAOImp;
import RGAlim.model.Ecosysteme_res_phyto;
import RGAlim.model.RessoucePhDAOImp;
import RGAlim.model.RessourcePhytogenetique;
import RGAlim.model.Rgclassification;
import RGAlim.model.Utilisateur;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


/** 
 * Servlet implementation class AjouterRessourcePhytogenetique
 */
@WebServlet("/AjouterRessourcePhytogenetique")
public class AjouterRessourcePhytogenetique extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String VUE = "/WEB-INF/JSP/RGAlim/AjouterRessourcePhytogenetique.jsp";
    private EntityManager em;
    /**
     * @see HttpServlet#HttpServlet() 
     */
    public void init () {
    	em = ConnexionSimpleUser.getEntityManager(); 
    	System.out.println(em); 
    }
    public AjouterRessourcePhytogenetique() {
    	
        
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
		
		else{
			Utilisateur user = (Utilisateur) session.getAttribute(id);
			request.setAttribute("utilisateur",user );
			ClassificationDAOImp classificationDAOImp = new ClassificationDAOImp(em);
		List<String> listGenre = classificationDAOImp.findLevelByName("Genre");
		List<String> listFamille = classificationDAOImp.findLevelByName("Famille_ph");
		request.setAttribute("listGenre", listGenre);
		request.setAttribute("listFamille", listFamille);
		isConnected = true;
		request.setAttribute("isConnected", isConnected);
		this.getServletContext().getRequestDispatcher( VUE).forward( request, response );}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AjoutRph ajoutRph =  new AjoutRph();
		RessoucePhDAOImp phDAOImp;
		ClassificationDAOImp classificationDAOImp;
		boolean isAdded = false;
		try { 
			
			if(ServletFileUpload.isMultipartContent(request)){
	            try {
	            	System.out.println("there's an image");
	                List <FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
	                for(FileItem item : multiparts){
	                    if(!item.isFormField()){
	                        String name = new File(item.getName()).getName();
	                        System.out.println(name);
	                        String path = getServletContext().getContextPath();
	                        item.write( new File(getServletContext().getRealPath("../../../../../../../BioDevApp/images/RGAlim") + File.separator + name));
	                        //System.out.println(getServletContext().getContextPath());
	                    }
	                }
	               //File uploaded successfully
	                System.out.println("success");
	               request.setAttribute("gurumessage", "File Uploaded Successfully");
	            } catch (Exception ex) {
	               request.setAttribute("gurumessage", "File Upload Failed due to " + ex);
	            }         		
	        }else{
	
	            request.setAttribute("gurumessage","No File found");
}
	       // request.getRequestDispatcher("/result.jsp").forward(request, response);
			
			System.out.println("j'ysusi");
			em.getTransaction().begin();
			phDAOImp = new RessoucePhDAOImp(em);
			classificationDAOImp = new ClassificationDAOImp(em);
			String genre = request.getParameter("genre");
			String famille = request.getParameter("famille");
			//String nomAr = request.getParameter("nomArabe");
			System.out.println("genre"+genre); 
			System.out.println("famille"+famille);
			Rgclassification rgclassificationGenre = classificationDAOImp.trouverRgclassification(genre);
			System.out.println(rgclassificationGenre.getParentPath());
			Rgclassification rgclassificationFamille = classificationDAOImp.trouverRgclassification(famille);
			System.out.println(rgclassificationFamille.getParentPath());
			List<Rgclassification> rgclassifications = new ArrayList<Rgclassification>();
			rgclassifications.add(rgclassificationFamille); 
			rgclassifications.add(rgclassificationGenre);
			RessourcePhytogenetique phytogenetique = ajoutRph.getResouPhytogenetique(request, rgclassifications);
			phDAOImp.ajouterResssourcePhytogenetique(phytogenetique);
			em.getTransaction().commit();
			isAdded = true;
			request.setAttribute("isAdded", isAdded);
			//em.close(); 
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		doGet(request, response);
	}
	public void destroy () {
		em.close();
	}

}
