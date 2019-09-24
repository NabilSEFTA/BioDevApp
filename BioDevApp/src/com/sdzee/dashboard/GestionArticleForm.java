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
        /* Initialisation du bean représentant un fichier */
       
        /* Récupération du champ de description du formulaire */
        String description = getValeurChamp( request, "descriptionNews" );
        String titre= getValeurChamp( request,"titreNews" );
        String contenu = getValeurChamp( request, "contenuNews" );
        
        
        /*
         * Récupération du contenu du champ fichier du formulaire. Il faut ici
         * utiliser la méthode getPart(), comme nous l'avions fait dans notre
         * servlet auparavant.
         */
        String nomFichier = null;
        InputStream contenuFichier = null;
        try {
            Part part = request.getPart( "imageNews" );
            /*
             * Il faut déterminer s'il s'agit bien d'un champ de type fichier :
             * on délègue cette opération à la méthode utilitaire
             * getNomFichier().
             */
            nomFichier = getNomFichier( part );

            /*
             * Si la méthode a renvoyé quelque chose, il s'agit donc d'un
             * champ de type fichier (input type="file").
             */
            if ( nomFichier != null && !nomFichier.isEmpty() ) {
                /*
                 * Antibug pour Internet Explorer, qui transmet pour une
                 * raison mystique le chemin du fichier local à la machine
                 * du client...
                 * 
                 * Ex : C:/dossier/sous-dossier/fichier.ext
                 * 
                 * On doit donc faire en sorte de ne sélectionner que le nom
                 * et l'extension du fichier, et de se débarrasser du
                 * superflu.
                 */
                nomFichier = nomFichier.substring( nomFichier.lastIndexOf( '/' ) + 1 )
                        .substring( nomFichier.lastIndexOf( '\\' ) + 1 );

                /* Récupération du contenu du fichier */
                contenuFichier = part.getInputStream();

            }
        } catch ( IllegalStateException e ) {
            /*
             * Exception retournée si la taille des données dépasse les limites
             * définies dans la section <multipart-config> de la déclaration de
             * notre servlet d'upload dans le fichier web.xml
             */
            e.printStackTrace();
            setErreur( CHAMP_FICHIER, "Les données envoyées sont trop volumineuses." );
        } catch ( IOException e ) {
            /*
             * Exception retournée si une erreur au niveau des répertoires de
             * stockage survient (répertoire inexistant, droits d'accès
             * insuffisants, etc.)
             */
            e.printStackTrace();
            setErreur( CHAMP_FICHIER, "Erreur de configuration du serveur." );
        } catch ( ServletException e ) {
            /*
             * Exception retournée si la requête n'est pas de type
             * multipart/form-data. Cela ne peut arriver que si l'utilisateur
             * essaie de contacter la servlet d'upload par un formulaire
             * différent de celui qu'on lui propose... pirate ! :|
             */
            e.printStackTrace();
            setErreur( "imageNews",
                    "Ce type de requête n'est pas supporté, merci d'utiliser le formulaire prévu pour envoyer votre fichier." );
        }

        /* Si aucune erreur n'est survenue jusqu'à présent */
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

        /* Si aucune erreur n'est survenue jusqu'à présent */
        if ( erreurs.isEmpty() ) {
            /* Écriture du fichier sur le disque */
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
                setErreur( CHAMP_FICHIER, "Erreur lors de l'écriture du fichier sur le disque." );
            }
        }

        /* Initialisation du résultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succès de l'envoi du fichier.";
        } else {
            resultat = "Échec de l'envoi du fichier.";
        }

        return news;
    }

    public Article enregistrerFichier( HttpServletRequest request, String chemin ) {
        /* Initialisation du bean représentant un fichier */
       System.out.println("le chemin envoyé:"+chemin);
        /* Récupération du champ de description du formulaire */
        String description = getValeurChamp( request, CHAMP_DESCRIPTION );
        String titre= getValeurChamp( request, CHAMP_TITRE );
        String contenu = getValeurChamp( request, CHAMP_CONTENU );
        
        
        /*
         * Récupération du contenu du champ fichier du formulaire. Il faut ici
         * utiliser la méthode getPart(), comme nous l'avions fait dans notre
         * servlet auparavant.
         */
        String nomFichier = null;
        InputStream contenuFichier = null;
        try {
            Part part = request.getPart( CHAMP_FICHIER );
            /*
             * Il faut déterminer s'il s'agit bien d'un champ de type fichier :
             * on délègue cette opération à la méthode utilitaire
             * getNomFichier().
             */
            nomFichier = getNomFichier( part );

            /*
             * Si la méthode a renvoyé quelque chose, il s'agit donc d'un
             * champ de type fichier (input type="file").
             */
            if ( nomFichier != null && !nomFichier.isEmpty() ) {
                /*
                 * Antibug pour Internet Explorer, qui transmet pour une
                 * raison mystique le chemin du fichier local à la machine
                 * du client...
                 * 
                 * Ex : C:/dossier/sous-dossier/fichier.ext
                 * 
                 * On doit donc faire en sorte de ne sélectionner que le nom
                 * et l'extension du fichier, et de se débarrasser du
                 * superflu.
                 */
                nomFichier = nomFichier.substring( nomFichier.lastIndexOf( '/' ) + 1 )
                        .substring( nomFichier.lastIndexOf( '\\' ) + 1 );

                /* Récupération du contenu du fichier */
                contenuFichier = part.getInputStream();

            }
        } catch ( IllegalStateException e ) {
            /*
             * Exception retournée si la taille des données dépasse les limites
             * définies dans la section <multipart-config> de la déclaration de
             * notre servlet d'upload dans le fichier web.xml
             */
            e.printStackTrace();
            setErreur( CHAMP_FICHIER, "Les données envoyées sont trop volumineuses." );
        } catch ( IOException e ) {
            /*
             * Exception retournée si une erreur au niveau des répertoires de
             * stockage survient (répertoire inexistant, droits d'accès
             * insuffisants, etc.)
             */
            e.printStackTrace();
            setErreur( CHAMP_FICHIER, "Erreur de configuration du serveur." );
        } catch ( ServletException e ) {
            /*
             * Exception retournée si la requête n'est pas de type
             * multipart/form-data. Cela ne peut arriver que si l'utilisateur
             * essaie de contacter la servlet d'upload par un formulaire
             * différent de celui qu'on lui propose... pirate ! :|
             */
            e.printStackTrace();
            setErreur( CHAMP_FICHIER,
                    "Ce type de requête n'est pas supporté, merci d'utiliser le formulaire prévu pour envoyer votre fichier." );
        }

        /* Si aucune erreur n'est survenue jusqu'à présent */
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

        /* Si aucune erreur n'est survenue jusqu'à présent */
        if ( erreurs.isEmpty() ) {
            /* Écriture du fichier sur le disque */
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
                setErreur( CHAMP_FICHIER, "Erreur lors de l'écriture du fichier sur le disque." );
            }
        }

        /* Initialisation du résultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succès de l'envoi du fichier.";
        } else {
            resultat = "Échec de l'envoi du fichier.";
        }

        return article;
    }
    
    
    
    
    public events enregistrerFichierEvent( HttpServletRequest request, String chemin ) {
        /* Initialisation du bean représentant un fichier */
       
        /* Récupération du champ de description du formulaire */
        String description = getValeurChamp( request, "descriptionEvent" );
        String titre= getValeurChamp( request, "titreEvent"  );
        String contenu = getValeurChamp( request, "contenuEvent"  );
        
        
        /*
         * Récupération du contenu du champ fichier du formulaire. Il faut ici
         * utiliser la méthode getPart(), comme nous l'avions fait dans notre
         * servlet auparavant.
         */
        String nomFichier = null;
        InputStream contenuFichier = null;
        try {
            Part part = request.getPart( "imageEvent" );
            /*
             * Il faut déterminer s'il s'agit bien d'un champ de type fichier :
             * on délègue cette opération à la méthode utilitaire
             * getNomFichier().
             */
            nomFichier = getNomFichier( part );

            /*
             * Si la méthode a renvoyé quelque chose, il s'agit donc d'un
             * champ de type fichier (input type="file").
             */
            if ( nomFichier != null && !nomFichier.isEmpty() ) {
                /*
                 * Antibug pour Internet Explorer, qui transmet pour une
                 * raison mystique le chemin du fichier local à la machine
                 * du client...
                 * 
                 * Ex : C:/dossier/sous-dossier/fichier.ext
                 * 
                 * On doit donc faire en sorte de ne sélectionner que le nom
                 * et l'extension du fichier, et de se débarrasser du
                 * superflu.
                 */
                nomFichier = nomFichier.substring( nomFichier.lastIndexOf( '/' ) + 1 )
                        .substring( nomFichier.lastIndexOf( '\\' ) + 1 );

                /* Récupération du contenu du fichier */
                contenuFichier = part.getInputStream();

            }
        } catch ( IllegalStateException e ) {
            /*
             * Exception retournée si la taille des données dépasse les limites
             * définies dans la section <multipart-config> de la déclaration de
             * notre servlet d'upload dans le fichier web.xml
             */
            e.printStackTrace();
            setErreur( "imageEvent" , "Les données envoyées sont trop volumineuses." );
        } catch ( IOException e ) {
            /*
             * Exception retournée si une erreur au niveau des répertoires de
             * stockage survient (répertoire inexistant, droits d'accès
             * insuffisants, etc.)
             */
            e.printStackTrace();
            setErreur( "imageEvent", "Erreur de configuration du serveur." );
        } catch ( ServletException e ) {
            /*
             * Exception retournée si la requête n'est pas de type
             * multipart/form-data. Cela ne peut arriver que si l'utilisateur
             * essaie de contacter la servlet d'upload par un formulaire
             * différent de celui qu'on lui propose... pirate ! :|
             */
            e.printStackTrace();
            setErreur( "imageEvent",
                    "Ce type de requête n'est pas supporté, merci d'utiliser le formulaire prévu pour envoyer votre fichier." );
        }

        /* Si aucune erreur n'est survenue jusqu'à présent */
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

        /* Si aucune erreur n'est survenue jusqu'à présent */
        if ( erreurs.isEmpty() ) {
            /* Écriture du fichier sur le disque */
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
                setErreur( "imageEvent", "Erreur lors de l'écriture du fichier sur le disque." );
            }
        }

        /* Initialisation du résultat global de la validation. */
        if ( erreurs.isEmpty() ) {
            resultat = "Succès de l'envoi du fichier.";
        } else {
            resultat = "Échec de l'envoi du fichier.";
        }

        return events;
    }

    /*
     * Valide la description saisie.
     */
    private void validationDescription( String description ) throws Exception {
        if ( description != null ) {
            if ( description.length() < 15 ) {
                throw new Exception( "La phrase de description  doit contenir au moins 15 caractères." );
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
                throw new Exception( "l'article doit contenir au moins 50 caractères" );
            }
        } else {
        	throw new Exception( "Merci d'entrer du contenu valide " );
        }
    }
    
    
    
    /*
     * Valide le fichier envoyé.
     */
    private void validationFichier( String nomFichier, InputStream contenuFichier ) throws Exception {
        if ( nomFichier == null || contenuFichier == null ) {
            throw new Exception( "Merci de sélectionner un fichier à envoyer." );
        }
    }

    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setErreur( String champ, String message ) {
        erreurs.put( champ, message );
    }

    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
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
     * Méthode utilitaire qui a pour unique but d'analyser l'en-tête
     * "content-disposition", et de vérifier si le paramètre "filename" y est
     * présent. Si oui, alors le champ traité est de type File et la méthode
     * retourne son nom, sinon il s'agit d'un champ de formulaire classique et
     * la méthode retourne null.
     */
    private static String getNomFichier( Part part ) {
        /* Boucle sur chacun des paramètres de l'en-tête "content-disposition". */
        for ( String contentDisposition : part.getHeader( "content-disposition" ).split( ";" ) ) {
            /* Recherche de l'éventuelle présence du paramètre "filename". */
            if ( contentDisposition.trim().startsWith( "filename" ) ) {
                /*
                 * Si "filename" est présent, alors renvoi de sa valeur,
                 * c'est-à-dire du nom de fichier sans guillemets.
                 */
                return contentDisposition.substring( contentDisposition.indexOf( '=' ) + 1 ).trim().replace( "\"", "" );
            }
        }
        /* Et pour terminer, si rien n'a été trouvé... */
        return null;
    }

    /*
     * Méthode utilitaire qui a pour but d'écrire le fichier passé en paramètre
     * sur le disque, dans le répertoire donné et avec le nom donné.
     */
    private void ecrireFichier( InputStream contenu, String nomFichier, String chemin ) throws Exception {
        /* Prépare les flux. */
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
             * Lit le fichier reçu et écrit son contenu dans un fichier sur le
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