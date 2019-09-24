package com.sdzee.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.sdzee.bean.Article;
import com.sdzee.bean.events;
import com.sdzee.bean.news;

public final class DAOUtilitaire {

    /*
     * Constructeur caché par défaut (car c'est une classe finale utilitaire,
     * contenant uniquement des méthode appelées de manière statique)
     */
    private DAOUtilitaire() {
    }

    /* Fermeture silencieuse du resultset */
    public static void fermetureSilencieuse( ResultSet resultSet ) {
        if ( resultSet != null ) {
            try {
                resultSet.close();
            } catch ( SQLException e ) {
                System.out.println( "Échec de la fermeture du ResultSet : " + e.getMessage() );
            }
        }
    }

    /* Fermeture silencieuse du statement */
    public static void fermetureSilencieuse( Statement statement ) {
        if ( statement != null ) {
            try {
                statement.close();
            } catch ( SQLException e ) {
                System.out.println( "Échec de la fermeture du Statement : " + e.getMessage() );
            }
        }
    }

    /* Fermeture silencieuse de la connexion */
    public static void fermetureSilencieuse( Connection connexion ) {
        if ( connexion != null ) {
            try {
                connexion.close();
            } catch ( SQLException e ) {
                System.out.println( "Échec de la fermeture de la connexion : " + e.getMessage() );
            }
        }
    }

    /* Fermetures silencieuses du statement et de la connexion */
    public static void fermeturesSilencieuses( Statement statement, Connection connexion ) {
        fermetureSilencieuse( statement );
        fermetureSilencieuse( connexion );
    }

    /* Fermetures silencieuses du resultset, du statement et de la connexion */
    public static void fermeturesSilencieuses( ResultSet resultSet, Statement statement, Connection connexion ) {
        fermetureSilencieuse( resultSet );
        fermetureSilencieuse( statement );
        fermetureSilencieuse( connexion );
    }

    /*
     * Initialise la requête préparée basée sur la connexion passée en argument,
     * avec la requête SQL et les objets donnés.
     */
    public static PreparedStatement initialisationRequetePreparee( Connection connexion, String sql, boolean returnGeneratedKeys, Object... objets ) throws SQLException {
        PreparedStatement preparedStatement = connexion.prepareStatement( sql, returnGeneratedKeys ? Statement.RETURN_GENERATED_KEYS : Statement.NO_GENERATED_KEYS );
        if (objets!=null) {
        	 for ( int i = 0; i < objets.length; i++ ) {
                 preparedStatement.setObject( i + 1, objets[i] );
             }
        }
        else {
        	System.out.println("");
        }
        return preparedStatement;
    }
    
    
   public static ArrayList<news>  MapNews(ResultSet resultSet)  {
	   ArrayList<news>liste = new ArrayList<news>();
	   
	   if (resultSet!=null) {
			try {
				while (resultSet.next()) {
					 
					news n= new news(resultSet.getString("titre"),resultSet.getString("description"),resultSet.getString("contenu"), resultSet.getDate(5),resultSet.getString("path"));
					
					//news n= new news(resultSet.getString("titre"),resultSet.getString("description"),resultSet.getString("contenu"));
				    liste.add(n);
				    
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	return liste;
	   
   }
   
   
   public static ArrayList<Article>  MapArticle(ResultSet resultSet)  {
	   ArrayList<Article>liste = new ArrayList<Article>();
	   
	   if (resultSet!=null) {
			try {
				while (resultSet.next()) {
					 
					Article n= new Article(resultSet.getString("titre"),resultSet.getString("description"),resultSet.getString("contenu"), resultSet.getDate(5),resultSet.getString("path"));
				    liste.add(n);
				    
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	return liste;
	   
   }
   
   
   public static ArrayList<events>  MapEvents(ResultSet resultSet)  {
	   ArrayList<events>liste = new ArrayList<events>();
	   
	   if (resultSet!=null) {
			try {
				while (resultSet.next()) {
					 
					events n= new events(resultSet.getString("titre"),resultSet.getString("description"),resultSet.getString("contenu"), resultSet.getDate(5),resultSet.getString("path"));
					
					
				    liste.add(n);
				    
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	return liste;
	   
   }
    
    
    
}