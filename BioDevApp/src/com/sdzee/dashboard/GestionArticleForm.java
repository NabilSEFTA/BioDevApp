package com.sdzee.dashboard;



import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import com.sdzee.bean.Article;
import com.sdzee.bean.events;
import com.sdzee.bean.news;

public final class GestionArticleForm {
    private static final String CHAMP_DESCRIPTION = "description";
    private static final String CHAMP_TITRE = "titre";
    private static final String CHAMP_CONTENU = "contenu";
    ///private static final String CHAMP_DESCRIPTION = "description";
    private static final String CHAMP_FICHIER     = "image";
    private static final int    TAILLE_TAMPON     = 10240;                        // 10 ko
    
    private String              resultat;
    private Map<String, String> erreurs           = new HashMap<String, String>();

    private Article article =null;
    private news news=null;
    private events events=null;
    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }
    
    
    
    public news enregistrerFichierNews( HttpServletRequest request, String chemin ) {
        /* Initialisation du bean repr�sentant un fichier */
       
        /* R�cup�ration du champ de description du formulaire */
        String description = getValeurChamp( request, "descriptionNews" );
        String titre= getValeurChamp( request,"titreNews" );
        String contenu = getValeurChamp( request, "contenuNews" );
        
        
        /*
         * R�cup�ration du contenu du champ fichier du formulaire. Il faut ici
         * utiliser la m�thode getPart(), comme nous l'avions fait dans notre
         * servlet auparavant.
         */
        String nomFichier = null;
        InputStream contenuFichier = null;
        try {
            Part part = request.getPart( "imageNews" );
            /*
             * Il faut d�terminer s'il s'agit bien d'un champ de type fichier :
             * on d�l�gue cette op�ration � la m�thode utilitaire
             * getNomFichier().
             */
            nomFichier = getNomFichier( part );

            /*
             * Si la m�thode a renvoy� quelque chose, il s'agit donc d'un
             * champ de type fichier (input type="file").
             */
            if ( nomFichier != null && !nomFichier.isEmpty() ) {
                /*
                 * Antibug pour Internet Explorer, qui transmet pour une
                 * raison mystique le chemin du fichier local � la machine
                 * du client...
                 * 
                 * Ex : C:/dossier/sous-dossier/fichier.ext
                 * 
                 * On doit donc faire en sorte de ne s�lectionner que le nom
                 * et l'extension du fichier, et de se d�barrasser du
                 * superflu.
                 */
                nomFichier = nomFichier.substring( nomFichier.lastIndexOf( '/' ) + 1 )
                        .substring( nomFichier.lastIndexOf( '\\' ) + 1 );

                /* R�cup�ration du contenu du fichier */
                contenuFichier = part.getInputStream();

            }
        } catch ( IllegalStateException e ) {
            /*
             * Exception retourn�e si la taille des donn�es d�passe les limites
             * d�finies dans la section <multipart-config> de la d�claration de
             * notre servlet d'upload dans le fichier web.xml
             */
            e.printStackTrace();
            setErreur( CHAMP_FICHIER, "Les donn�es envoy�es sont trop volumineuses." );
        } catch ( IOException e ) {
            /*
             * Exception retourn�e si une erreur au niveau des r�pertoires de
             * stockage survient (r�pertoire inexistant, droits d'acc�s
             * insuffisants, etc.)
             */
            e.printStackTrace();
            setErreur( CHAMP_FICHIER, "Erreur de configuration du serveur." );
        } catch ( ServletException e ) {
            /*
             * Exception retourn�e si la requ�te n'est pas de type
             * multipart/form-data. Cela ne peut arriver que si l'utilisateur
             * essaie de contacter la servlet d'upload par un formulaire
             * diff�rent de celui qu'on lui propose... pirate ! :|
             */
            e.printStackTrace();
            setErreur( "imageNews",
                    "Ce type de requ�te n'est pas support�, merci d'utiliser le formulaire pr�vu pour envoyer votre fichier." );
        }

        /* Si aucune erreur n'est survenue jusqu'� pr�sent */
        if ( erreurs.isEmpty() ) {
            /* Validation du champ de description. */
            try {
                validationDescription( description );
            } catch ( Exception e ) {
                setErreur( "descriptionNews", e.getMessage() );
            }
            /* Validation du champ de titre. */
            try {
                validationTitre( titre );
            } catch ( Exception e ) {
                setErreur( "titreNews", e.getMessage() );
            }
            
            /* Validation du champ de contenu. */
            try {
                validationContenu( contenu );
            } catch ( Exception e ) {
                setErreur( "contenuNews", e.getMessage() );
            }
           

            /* Validation du champ fichier. */
            try {
                validationFichier( nomFichier, contenuFichier );
            } catch ( Exception e ) {
                setErreur( "imageNews", e.getMessage() );
            }
          
        }

        /* Si aucune erreur n'est survenue jusqu'� pr�sent */
        if ( erreurs.isEmpty() ) {
            /* �criture du fichier sur le disque */
            try {
            	
                news = new news();
                news.setContenu(contenu);
                news.setDescription(description);
                news.setTitre(titre);
                java.util.Date utilDate = new java.util.Date();
         	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
         	    final String stringDate= dateFormat.format(utilDate);
         	    final java.sql.Date sqlDate=  java.sql.Date.valueOf(stringDate);
         	    news.setDate(sqlDate);
         	    news.setPath("articleIMG/"+nomFichier);

         	    
                ecrireFichier( contenuFichier, nomFichier, chemin );
            } catch ( Exception e ) {
                setErreur( CHAMP_FICHIER, "Erreur lors de l'�criture du fichier sur le disque." );
            }
        }

        /* Initialisation du r�sultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succ�s de l'envoi du fichier.";
        } else {
            resultat = "�chec de l'envoi du fichier.";
        }

        return news;
    }

    public Article enregistrerFichier( HttpServletRequest request, String chemin ) {
        /* Initialisation du bean repr�sentant un fichier */
       System.out.println("le chemin envoy�:"+chemin);
        /* R�cup�ration du champ de description du formulaire */
        String description = getValeurChamp( request, CHAMP_DESCRIPTION );
        String titre= getValeurChamp( request, CHAMP_TITRE );
        String contenu = getValeurChamp( request, CHAMP_CONTENU );
        
        
        /*
         * R�cup�ration du contenu du champ fichier du formulaire. Il faut ici
         * utiliser la m�thode getPart(), comme nous l'avions fait dans notre
         * servlet auparavant.
         */
        String nomFichier = null;
        InputStream contenuFichier = null;
        try {
            Part part = request.getPart( CHAMP_FICHIER );
            /*
             * Il faut d�terminer s'il s'agit bien d'un champ de type fichier :
             * on d�l�gue cette op�ration � la m�thode utilitaire
             * getNomFichier().
             */
            nomFichier = getNomFichier( part );

            /*
             * Si la m�thode a renvoy� quelque chose, il s'agit donc d'un
             * champ de type fichier (input type="file").
             */
            if ( nomFichier != null && !nomFichier.isEmpty() ) {
                /*
                 * Antibug pour Internet Explorer, qui transmet pour une
                 * raison mystique le chemin du fichier local � la machine
                 * du client...
                 * 
                 * Ex : C:/dossier/sous-dossier/fichier.ext
                 * 
                 * On doit donc faire en sorte de ne s�lectionner que le nom
                 * et l'extension du fichier, et de se d�barrasser du
                 * superflu.
                 */
                nomFichier = nomFichier.substring( nomFichier.lastIndexOf( '/' ) + 1 )
                        .substring( nomFichier.lastIndexOf( '\\' ) + 1 );

                /* R�cup�ration du contenu du fichier */
                contenuFichier = part.getInputStream();

            }
        } catch ( IllegalStateException e ) {
            /*
             * Exception retourn�e si la taille des donn�es d�passe les limites
             * d�finies dans la section <multipart-config> de la d�claration de
             * notre servlet d'upload dans le fichier web.xml
             */
            e.printStackTrace();
            setErreur( CHAMP_FICHIER, "Les donn�es envoy�es sont trop volumineuses." );
        } catch ( IOException e ) {
            /*
             * Exception retourn�e si une erreur au niveau des r�pertoires de
             * stockage survient (r�pertoire inexistant, droits d'acc�s
             * insuffisants, etc.)
             */
            e.printStackTrace();
            setErreur( CHAMP_FICHIER, "Erreur de configuration du serveur." );
        } catch ( ServletException e ) {
            /*
             * Exception retourn�e si la requ�te n'est pas de type
             * multipart/form-data. Cela ne peut arriver que si l'utilisateur
             * essaie de contacter la servlet d'upload par un formulaire
             * diff�rent de celui qu'on lui propose... pirate ! :|
             */
            e.printStackTrace();
            setErreur( CHAMP_FICHIER,
                    "Ce type de requ�te n'est pas support�, merci d'utiliser le formulaire pr�vu pour envoyer votre fichier." );
        }

        /* Si aucune erreur n'est survenue jusqu'� pr�sent */
        if ( erreurs.isEmpty() ) {
            /* Validation du champ de description. */
            try {
                validationDescription( description );
            } catch ( Exception e ) {
                setErreur( CHAMP_DESCRIPTION, e.getMessage() );
            }
            /* Validation du champ de titre. */
            try {
                validationTitre( titre );
            } catch ( Exception e ) {
                setErreur( CHAMP_TITRE, e.getMessage() );
            }
            
            /* Validation du champ de contenu. */
            try {
                validationContenu( contenu );
            } catch ( Exception e ) {
                setErreur( CHAMP_CONTENU, e.getMessage() );
            }
           

            /* Validation du champ fichier. */
            try {
                validationFichier( nomFichier, contenuFichier );
            } catch ( Exception e ) {
                setErreur( CHAMP_FICHIER, e.getMessage() );
            }
          
        }

        /* Si aucune erreur n'est survenue jusqu'� pr�sent */
        if ( erreurs.isEmpty() ) {
            /* �criture du fichier sur le disque */
            try {
                article = new Article();
                article.setContenu(contenu);
                article.setDescription(description);
                article.setTitre(titre);
                java.util.Date utilDate = new java.util.Date();
         	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
         	    final String stringDate= dateFormat.format(utilDate);
         	    final java.sql.Date sqlDate=  java.sql.Date.valueOf(stringDate);
         	    article.setDate(sqlDate);
         	    article.setPath("articleIMG/"+nomFichier);

         	    
                ecrireFichier( contenuFichier, nomFichier, chemin );
                
            } catch ( Exception e ) {
                setErreur( CHAMP_FICHIER, "Erreur lors de l'�criture du fichier sur le disque." );
            }
        }

        /* Initialisation du r�sultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succ�s de l'envoi du fichier.";
        } else {
            resultat = "�chec de l'envoi du fichier.";
        }

        return article;
    }
    
    
    
    
    public events enregistrerFichierEvent( HttpServletRequest request, String chemin ) {
        /* Initialisation du bean repr�sentant un fichier */
       
        /* R�cup�ration du champ de description du formulaire */
        String description = getValeurChamp( request, "descriptionEvent" );
        String titre= getValeurChamp( request, "titreEvent"  );
        String contenu = getValeurChamp( request, "contenuEvent"  );
        
        
        /*
         * R�cup�ration du contenu du champ fichier du formulaire. Il faut ici
         * utiliser la m�thode getPart(), comme nous l'avions fait dans notre
         * servlet auparavant.
         */
        String nomFichier = null;
        InputStream contenuFichier = null;
        try {
            Part part = request.getPart( "imageEvent" );
            /*
             * Il faut d�terminer s'il s'agit bien d'un champ de type fichier :
             * on d�l�gue cette op�ration � la m�thode utilitaire
             * getNomFichier().
             */
            nomFichier = getNomFichier( part );

            /*
             * Si la m�thode a renvoy� quelque chose, il s'agit donc d'un
             * champ de type fichier (input type="file").
             */
            if ( nomFichier != null && !nomFichier.isEmpty() ) {
                /*
                 * Antibug pour Internet Explorer, qui transmet pour une
                 * raison mystique le chemin du fichier local � la machine
                 * du client...
                 * 
                 * Ex : C:/dossier/sous-dossier/fichier.ext
                 * 
                 * On doit donc faire en sorte de ne s�lectionner que le nom
                 * et l'extension du fichier, et de se d�barrasser du
                 * superflu.
                 */
                nomFichier = nomFichier.substring( nomFichier.lastIndexOf( '/' ) + 1 )
                        .substring( nomFichier.lastIndexOf( '\\' ) + 1 );

                /* R�cup�ration du contenu du fichier */
                contenuFichier = part.getInputStream();

            }
        } catch ( IllegalStateException e ) {
            /*
             * Exception retourn�e si la taille des donn�es d�passe les limites
             * d�finies dans la section <multipart-config> de la d�claration de
             * notre servlet d'upload dans le fichier web.xml
             */
            e.printStackTrace();
            setErreur( "imageEvent" , "Les donn�es envoy�es sont trop volumineuses." );
        } catch ( IOException e ) {
            /*
             * Exception retourn�e si une erreur au niveau des r�pertoires de
             * stockage survient (r�pertoire inexistant, droits d'acc�s
             * insuffisants, etc.)
             */
            e.printStackTrace();
            setErreur( "imageEvent", "Erreur de configuration du serveur." );
        } catch ( ServletException e ) {
            /*
             * Exception retourn�e si la requ�te n'est pas de type
             * multipart/form-data. Cela ne peut arriver que si l'utilisateur
             * essaie de contacter la servlet d'upload par un formulaire
             * diff�rent de celui qu'on lui propose... pirate ! :|
             */
            e.printStackTrace();
            setErreur( "imageEvent",
                    "Ce type de requ�te n'est pas support�, merci d'utiliser le formulaire pr�vu pour envoyer votre fichier." );
        }

        /* Si aucune erreur n'est survenue jusqu'� pr�sent */
        if ( erreurs.isEmpty() ) {
            /* Validation du champ de description. */
            try {
                validationDescription( description );
            } catch ( Exception e ) {
                setErreur( "descriptionEvent", e.getMessage() );
            }
            /* Validation du champ de titre. */
            try {
                validationTitre( titre );
            } catch ( Exception e ) {
                setErreur( "titreEvent", e.getMessage() );
            }
            
            /* Validation du champ de contenu. */
            try {
                validationContenu(contenu);
            } catch ( Exception e ) {
                setErreur( "contenuEvent", e.getMessage() );
            }
           

            /* Validation du champ fichier. */
            try {
                validationFichier( nomFichier, contenuFichier );
            } catch ( Exception e ) {
                setErreur( CHAMP_FICHIER, e.getMessage() );
            }
          
        }

        /* Si aucune erreur n'est survenue jusqu'� pr�sent */
        if ( erreurs.isEmpty() ) {
            /* �criture du fichier sur le disque */
            try {
                events = new events();
                events.setContenu(contenu);
                events.setDescription(description);
                events.setTitre(titre);
                java.util.Date utilDate = new java.util.Date();
         	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
         	    final String stringDate= dateFormat.format(utilDate);
         	    final java.sql.Date sqlDate=  java.sql.Date.valueOf(stringDate);
         	    events.setDate(sqlDate);
         	    events.setPath("articleIMG/"+nomFichier);

         	    
                ecrireFichier( contenuFichier, nomFichier, chemin );
            } catch ( Exception e ) {
                setErreur( "imageEvent", "Erreur lors de l'�criture du fichier sur le disque." );
            }
        }

        /* Initialisation du r�sultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succ�s de l'envoi du fichier.";
        } else {
            resultat = "�chec de l'envoi du fichier.";
        }

        return events;
    }

    /*
     * Valide la description saisie.
     */
    private void validationDescription( String description ) throws Exception {
        if ( description != null ) {
            if ( description.length() < 15 ) {
                throw new Exception( "La phrase de description  doit contenir au moins 15 caract�res." );
            }
        } else {
            throw new Exception( "Merci d'entrer une phrase une description valide  " );
        }
    }
    
    private void validationTitre( String titre ) throws Exception {
        if ( titre != null ) {
            if ( titre.length() < 4 ) {
                throw new Exception( "le titre doit contenir au moins un mot" );
            }
        } else {
            throw new Exception( "Merci d'entrer un titre valide " );
        }
    }
    
    
    private void validationContenu( String contenu ) throws Exception {
        if ( contenu != null ) {
            if ( contenu.length() < 50 ) {
                throw new Exception( "l'article doit contenir au moins 50 caract�res" );
            }
        } else {
        	throw new Exception( "Merci d'entrer du contenu valide " );
        }
    }
    
    
    
    /*
     * Valide le fichier envoy�.
     */
    private void validationFichier( String nomFichier, InputStream contenuFichier ) throws Exception {
        if ( nomFichier == null || contenuFichier == null ) {
            throw new Exception( "Merci de s�lectionner un fichier � envoyer." );
        }
    }

    /*
     * Ajoute un message correspondant au champ sp�cifi� � la map des erreurs.
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }

    /*
     * M�thode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValeurChamp( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter( nomChamp );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur;
        }
    }

    /*
     * M�thode utilitaire qui a pour unique but d'analyser l'en-t�te
     * "content-disposition", et de v�rifier si le param�tre "filename" y est
     * pr�sent. Si oui, alors le champ trait� est de type File et la m�thode
     * retourne son nom, sinon il s'agit d'un champ de formulaire classique et
     * la m�thode retourne null.
     */
    private static String getNomFichier( Part part ) {
        /* Boucle sur chacun des param�tres de l'en-t�te "content-disposition". */
        for ( String contentDisposition : part.getHeader( "content-disposition" ).split( ";" ) ) {
            /* Recherche de l'�ventuelle pr�sence du param�tre "filename". */
            if ( contentDisposition.trim().startsWith( "filename" ) ) {
                /*
                 * Si "filename" est pr�sent, alors renvoi de sa valeur,
                 * c'est-�-dire du nom de fichier sans guillemets.
                 */
                return contentDisposition.substring( contentDisposition.indexOf( '=' ) + 1 ).trim().replace( "\"", "" );
            }
        }
        /* Et pour terminer, si rien n'a �t� trouv�... */
        return null;
    }

    /*
     * M�thode utilitaire qui a pour but d'�crire le fichier pass� en param�tre
     * sur le disque, dans le r�pertoire donn� et avec le nom donn�.
     */
    private void ecrireFichier( InputStream contenu, String nomFichier, String chemin ) throws Exception {
        /* Pr�pare les flux. */
        BufferedInputStream entree = null;
        BufferedOutputStream sortie = null;
        
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  je suis la ecrire fichier  " + chemin + nomFichier);
        try {
            /* Ouvre les flux. */
            entree = new BufferedInputStream( contenu, TAILLE_TAMPON );
            sortie = new BufferedOutputStream( new FileOutputStream( new File( chemin + nomFichier ) ),
                    TAILLE_TAMPON );
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  "+chemin + nomFichier );

            /*
             * Lit le fichier re�u et �crit son contenu dans un fichier sur le
             * disque.
             */
            byte[] tampon = new byte[TAILLE_TAMPON];
            int longueur = 0;
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  Avant la boucle" );
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