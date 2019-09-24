package com.sdzee.servlets;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.sdzee.bean.Article;
import com.sdzee.bean.events;
import com.sdzee.bean.news;
import com.sdzee.dao.DAOFactory;
import com.sdzee.dao.newsInt;
import com.sdzee.dashboard.GestionArticleForm;

/**
 * Servlet implementation class Dashboard
 */
@WebServlet(name = "dashboard", urlPatterns = { "/dashboard" })
public class dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private newsInt newsInt; 
   
	
	
	 public void init() throws ServletException {
	        /* R�cup�ration d'une instance de notre DAO Utilisateur */
	        this.newsInt = ( (DAOFactory) getServletContext().getAttribute( "daofactory" ) ).getUtilisateurDao();
	 }
    public dashboard() {
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
		this.getServletContext().getRequestDispatcher("/WEB-INF/lot2/Dashboard.jsp").forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		    
	/**	try {
			String path = getServletContext().getRealPath("/");
				System.out.println("le chemin: "+path);
			File f = new File(path+"img/"+"TestCreation.txt");
			FileWriter fw= new FileWriter(f);
				System.out.println("Le contenu de l'article est: "+request.getParameter("ContenuArticle"));
			fw.write(request.getParameter("ContenuArticle"));
			fw.close();
			
		    FileReader fr = new FileReader(f);
		    int c;
		    while ((c=fr.read())!=-1) {
		    	System.out.print((char)c);
		    }
			this.getServletContext().getRequestDispatcher("/WEB-INF/lot2/Dashboard.jsp").forward( request, response );
		} catch (Exception e) {
			System.out.println(e);
		}*/
		GestionArticleForm form = new GestionArticleForm();
		
		String bool =request.getParameter("bool");
        
        if (bool.equals("article")) {
        	
        
			
			 /* Pr�paration de l'objet formulaire */
	        
	
	        /* Traitement de la requ�te et r�cup�ration du bean en r�sultant */
        	 String path = getServletContext().getRealPath("/articleIMG");
        	 //File f = new File(path);
        	 //String fullPathToYourWebappRoot = f.getCanonicalPath();
        	 //System.out.println(" Merdeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee   "+fullPathToYourWebappRoot);
	        
	        Article article = form.enregistrerFichier( request,path+"/" ); 
	        System.out.println(path);
        
	        if (article!=null) {
	        	
	        	newsInt.AjouterArticle(article);
	        }
	        else {
				System.out.println("Empty");
			}
        
        /* Stockage du formulaire et du bean dans l'objet request */
        //request.setAttribute( ATT_FORM, form );
        //request.setAttribute( ATT_FICHIER, fichier );
        }
        else {
        	
			if (bool.equals("news")) {
				  
				   String path = getServletContext().getRealPath("/articleIMG");
			        news news = form.enregistrerFichierNews( request, path+"/");
			        
			        if (news!=null) {
			        	newsInt.AjouterNews(news);
			        }
			        else {
						System.out.println("Empty");
					}
			}
			else if (bool.equals("event")) {
				
				   String path = getServletContext().getRealPath("/articleIMG");
			       events event= form.enregistrerFichierEvent( request, path+"/" );
			        
			        if (event!=null) {
			        
			        	newsInt.AjouterEvents(event);
			        }
			        else {
						System.out.println("Empty");
					}
			}
		}
        

	
        
        
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/lot2/Dashboard.jsp").forward( request, response );
		
	}
	
	
	
	
	private static String getNomFichier( Part part ) {
	    /* Boucle sur chacun des param�tres de l'en-t�te "content-disposition". */
	    for ( String contentDisposition : part.getHeader( "content-disposition" ).split( ";" ) ) {
	    	/* Recherche de l'�ventuelle pr�sence du param�tre "filename". */
	        if ( contentDisposition.trim().startsWith("filename") ) {
	            /* Si "filename" est pr�sent, alors renvoi de sa valeur, c'est-�-dire du nom de fichier. */
	        	return contentDisposition.substring( contentDisposition.indexOf( '=' ) + 1 ).trim().replace( "\"", "" );
	        }
	    }
	    /* Et pour terminer, si rien n'a �t� trouv�... */
	    return null;
	}
	
	
	
	private void ecrireFichier( Part part, String nomFichier, String chemin ) throws IOException {
	    /* Pr�pare les flux. */
	    BufferedInputStream entree = null;
	    BufferedOutputStream sortie = null;
	    try {
	        /* Ouvre les flux. */
	        entree = new BufferedInputStream( part.getInputStream(), 1024 );
	        sortie = new BufferedOutputStream( new FileOutputStream( new File( chemin + nomFichier ) ),
	               1024 );
	        /* ... */
	        byte[] tampon = new byte[1024];
	        int longueur;
	        while ( ( longueur = entree.read( tampon ) ) > 0 ) {
	            sortie.write( tampon, 0, longueur );
	        }
	        
	    } finally {
	        try {
	            sortie.close();
	        } catch ( IOException ignore ) {
	        }
	        try {
	            entree.close();
	        } catch ( IOException ignore ) {
	        }
	    }
	}

}
