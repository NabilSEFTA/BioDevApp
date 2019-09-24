package com.sdzee.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.sdzee.bean.news;

public class DAOFactory {

 
	private static final String FICHIER_PROPERTIES       = "/com/sdzee/config/properties";
	private static final String PROPERTY_URL             = "url";
	private static final String PROPERTY_DRIVER          = "driver";
	private static final String PROPERTY_NOM_UTILISATEUR = "nomUtilisateur";
	private static final String PROPERTY_MOT_DE_PASSE    = "motdepasse";
    private String  url;
    private String  username;
    private String  password;
    private String driver;

    DAOFactory( String url, String username, String password ,String driver) {
        this.url = url;
        this.driver=driver;
        this.username = username;
        this.password = password;
    }

    /*
     * Méthode chargée de récupérer les informations de connexion à la base de
     * données, charger le driver JDBC et retourner une instance de la Factory
     */
    public static DAOFactory getInstance()  {
    	String url=null;
        String driver=null;
        String nomUtilisateur =null;
        String motDePasse =null;
    	 Properties properties = new Properties();
		 ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
	        InputStream fichierProperties = classLoader.getResourceAsStream( FICHIER_PROPERTIES );

	        if ( fichierProperties == null ) {
	           System.out.println("c'est null");
	        }

	        try {
	            properties.load( fichierProperties );
	            url = properties.getProperty( PROPERTY_URL );
	            driver = properties.getProperty( PROPERTY_DRIVER );
	            nomUtilisateur = properties.getProperty( PROPERTY_NOM_UTILISATEUR );
	            motDePasse = properties.getProperty( PROPERTY_MOT_DE_PASSE );
	            System.out.println(url+"\n"+driver+"\n"+nomUtilisateur+"\n"+motDePasse);
	        } catch ( IOException e ) {
	            
	        }
    	 

        DAOFactory instance = new DAOFactory( url, nomUtilisateur, motDePasse,driver );
        return instance;
    }

    /* Méthode chargée de fournir une connexion à la base de données */
     /* package */ Connection getConnection() throws SQLException, ClassNotFoundException {
    	 Class.forName(this.driver);
        return DriverManager.getConnection( this.url, this.username, this.password );
    }

    /*
     * Méthodes de récupération de l'implémentation des différents DAO (un seul
     * pour le moment)
     */
    public newsInt getUtilisateurDao() {
        return new newsImpl( this );
    }
}