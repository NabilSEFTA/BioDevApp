package com.sdzee.dao;
import static com.sdzee.dao.DAOUtilitaire.initialisationRequetePreparee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sdzee.bean.Article;
import com.sdzee.bean.events;
import com.sdzee.bean.news;

public class newsImpl implements newsInt {

	private DAOFactory   daoFactory;
	private static final String SQL_SELECT_NEWS_4 = "SELECT id, titre, description, contenu, date, path from \"RG\".news ORDER BY date DESC FETCH FIRST 4 ROWS ONLY" ;
	private static final String SQL_SELECT_NEWS = "SELECT id, titre, description, contenu, date, path FROM \"RG\".news  ORDER BY date DESC ";
	private static final String SQL_SELECT_Events= "SELECT id, titre, description, contenu, date, path FROM \"RG\".evenement ORDER BY date DESC ";
	private static final String SQL_SELECT_Events_4 = "SELECT id, titre, description, contenu, date, path from \"RG\".evenement ORDER BY date DESC FETCH FIRST 4 ROWS ONLY" ;
	private static final String SQL_SELECT_ARTICLE= "SELECT id, titre, description, contenu, date, path FROM \"RG\".article ORDER BY date DESC ";
	private static final String SQL_SELECT_ARTICLE_6 = "SELECT id, titre, description, contenu, date, path from \"RG\".article ORDER BY date DESC FETCH FIRST 6 ROWS ONLY" ;
	private static final String SQL_INSERT_ARTICLE = "INSERT INTO \"RG\".article (titre, description, contenu, path, date) VALUES (?, ?, ?, ?, ?)";
	private static final String SQL_INSERT_NEWS = "INSERT INTO \"RG\".news (titre, description, contenu, path, date) VALUES (?, ?, ?, ?, ?)";
	private static final String SQL_INSERT_EVENT = "INSERT INTO \"RG\".evenement (titre, description, contenu, path, date) VALUES (?, ?, ?, ?, ?)";
	

	
	public newsImpl(DAOFactory daoFactory) {
		super();
		this.daoFactory = daoFactory;
	}
	public void AjouterArticle(Article article)  {
		// TODO Auto-generated method stub
		Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    try {
	    	try {
				connexion = daoFactory.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			preparedStatement = initialisationRequetePreparee( connexion, SQL_INSERT_ARTICLE, true, article.getTitre(),article.getDescription() , article.getContenu(),article.getPath(),article.getDate() );
			int statut = preparedStatement.executeUpdate();
			if ( statut == 0 ) {
	            System.out.println("L'objet n'est pas ajouter");
	        }
	    } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      
			
		
	    
	} 
	
	@Override
	public ResultSet recupererEvents() {
		Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;		
	    
	    
	    
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        try {
				connexion = daoFactory.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        preparedStatement = initialisationRequetePreparee( connexion, SQL_SELECT_Events_4, false,null );
	        resultSet = preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        /*if ( resultSet.next() ) {
	            //utilisateur = map( resultSet );
	        }*/
	    } catch ( SQLException e ) {
	    	System.out.println(e);
	        //throw new DAOException( e );
	    } finally {
	       /// fermeturesSilencieuses( resultSet, preparedStatement, connexion ); je dois le réxecuter
	    }
	    
	    
	    
		return resultSet;
												
	}
	
	
	
	@Override
	public ResultSet recupererArticle() {
		Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;		
	    
	    
	    
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        try {
				connexion = daoFactory.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        preparedStatement = initialisationRequetePreparee( connexion, SQL_SELECT_ARTICLE_6, false,null );
	        resultSet = preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        /*if ( resultSet.next() ) {
	            //utilisateur = map( resultSet );
	        }*/
	    } catch ( SQLException e ) {
	    	System.out.println(e);
	        //throw new DAOException( e );
	    } finally {
	       /// fermeturesSilencieuses( resultSet, preparedStatement, connexion ); je dois le réxecuter
	    }
	    
	    
		return resultSet;
												
	}
	
	
	
	
	@Override
	public ResultSet recupererNews() {
		Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;		
	    
	    
	    
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        try {
				connexion = daoFactory.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        preparedStatement = initialisationRequetePreparee( connexion, SQL_SELECT_NEWS_4, false,null );
	        resultSet = preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        /*if ( resultSet.next() ) {
	            //utilisateur = map( resultSet );
	        }*/
	    } catch ( SQLException e ) {
	    	System.out.println(e);
	        //throw new DAOException( e );
	    } finally {
	       /// fermeturesSilencieuses( resultSet, preparedStatement, connexion ); je dois le réxecuter
	    }
	    
	    
	    
		return resultSet;
												
	}
	@Override
	public void AjouterNews(news news) {
		// TODO Auto-generated method stub
		Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    try {
	    	try {
				connexion = daoFactory.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			preparedStatement = initialisationRequetePreparee( connexion, SQL_INSERT_NEWS, true, news.getTitre(),news.getDescription() , news.getContenu(),news.getPath(),news.getDate() );
			int statut = preparedStatement.executeUpdate();
			if ( statut == 0 ) {
	            System.out.println("L'objet n'est pas ajouter");
	        }
	    } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      
		
	}
	
	@Override
	public void AjouterEvents(events event) {
		// TODO Auto-generated method stub
		Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    try {
	    	try {
				connexion = daoFactory.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			preparedStatement = initialisationRequetePreparee( connexion, SQL_INSERT_EVENT, true, event.getTitre(),event.getDescription() , event.getContenu(),event.getPath(),event.getDate() );
			int statut = preparedStatement.executeUpdate();
			if ( statut == 0 ) {
	            System.out.println("L'objet n'est pas ajouter");
	        }
	    } catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
      
		
	}
	@Override
	public ResultSet recupererListNews() {
		// TODO Auto-generated method stub
		Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;		
	    
	    
	    
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        try {
				connexion = daoFactory.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        preparedStatement = initialisationRequetePreparee( connexion, SQL_SELECT_NEWS, false,null );
	        resultSet = preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        /*if ( resultSet.next() ) {
	            //utilisateur = map( resultSet );
	        }*/
	    } catch ( SQLException e ) {
	    	System.out.println(e);
	        //throw new DAOException( e );
	    } finally {
	       /// fermeturesSilencieuses( resultSet, preparedStatement, connexion ); je dois le réxecuter
	    }
	    
	    
	    
		return resultSet;
	}
	@Override
	public ResultSet recupererListEvents() {
		Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;		
	    
	    
	    
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        try {
				connexion = daoFactory.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        preparedStatement = initialisationRequetePreparee( connexion, SQL_SELECT_Events, false,null );
	        resultSet = preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        /*if ( resultSet.next() ) {
	            //utilisateur = map( resultSet );
	        }*/
	    } catch ( SQLException e ) {
	    	System.out.println(e);
	        //throw new DAOException( e );
	    } finally {
	       /// fermeturesSilencieuses( resultSet, preparedStatement, connexion ); je dois le réxecuter
	    }
	    
	    
	    
		return resultSet;
	}
	
	@Override
	public ResultSet recupererListArticle() {
		Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;		
	    
	    
	    
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        try {
				connexion = daoFactory.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	        preparedStatement = initialisationRequetePreparee( connexion, SQL_SELECT_ARTICLE, false,null );
	        resultSet = preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        /*if ( resultSet.next() ) {
	            //utilisateur = map( resultSet );
	        }*/
	    } catch ( SQLException e ) {
	    	System.out.println(e);
	        //throw new DAOException( e );
	    } finally {
	       /// fermeturesSilencieuses( resultSet, preparedStatement, connexion ); je dois le réxecuter
	    }
	    
	    
		return resultSet;
		
	}

	
	

}
