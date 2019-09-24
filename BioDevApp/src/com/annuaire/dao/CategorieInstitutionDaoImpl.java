package com.annuaire.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.annuaire.beans.CategorieInstitution;


public class CategorieInstitutionDaoImpl implements CategorieInstitutionDao
{
	private static final String SQL_INSERT = "INSERT INTO \"RG\".CategorieInstitution(nom_cat_inst) VALUES (?)";
	private static final String SQL_SELECT_PAR_NOM = "SELECT * FROM \"RG\".CategorieInstitution where nom_cat_inst=?;";
	private static final String SQL_MODIFY =" UPDATE \"RG\".CategorieInstitution set nom_cat_inst =(?) where nom_cat_inst=(?);";
	private static final String SQL_DELETE ="DELETE FROM \"RG\".CategorieInstitution where nom_cat_inst=(?);";
	private DAOFactory daoFactory;
	CategorieInstitutionDaoImpl( DAOFactory daoFactory ) 
		{this.daoFactory = daoFactory;}
	
	/* Simple méthode utilitaire permettant de faire la correspondance(le
	* mapping) entre une ligne issue de la table des cat institutions (un
	* ResultSet) et un bean Utilisateur*/
	private static CategorieInstitution map( ResultSet resultSet ) throws SQLException 
	{
		CategorieInstitution catInst = new CategorieInstitution();
		catInst.setId_cat_inst( resultSet.getInt( "id_cat_inst" ) );
		catInst.setNom_cat_inst( resultSet.getString( "nom_cat_inst" ) );
	     return catInst;
	}
	/***********************METHODES*******************************/
	 /*****************AJouter**************************/
	@Override
	public void ajouter(String nomCatInst ) throws IllegalArgumentException, DAOException 
	{
		
			Connection connexion = null;
			PreparedStatement preparedStatement = null;
			ResultSet valeursAutoGenerees = null;
			try {
				/* Récupération d'une connexion depuis la Factory */
				connexion = daoFactory.getConnection();
				preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_INSERT, true,nomCatInst);
				int statut = preparedStatement.executeUpdate();
				/* Analyse du statut retourné par la requête d'insertion */
				if ( statut == 0 ) {
					throw new DAOException( "Échec de la création de la cat inst, aucune ligne ajoutée dans la table." );
				}
				/* Récupération de l'id auto-généré par la requête d'insertion */
				valeursAutoGenerees = preparedStatement.getGeneratedKeys();
				if ( valeursAutoGenerees.next() ) {
					/* Puis initialisation de la propriété id du bean Utilisateur avec sa valeur */
					CategorieInstitution  newCatInst = new CategorieInstitution();
					newCatInst.setNom_cat_inst(nomCatInst);
					newCatInst.setId_cat_inst( valeursAutoGenerees.getInt( 1 ) );
				} else {
					throw new DAOException( "Échec de la création de la cat inst, aucun ID auto-généré retourné." );
				}
			} catch ( SQLException e ) {throw new DAOException( e );}
			finally {
				DAOUtilitaire.fermeturesSilencieuses( valeursAutoGenerees, preparedStatement,connexion );
			}
	}
 
	   @Override
	    public List<CategorieInstitution> lister() {
	        List<CategorieInstitution> catInsts = new ArrayList<CategorieInstitution>();
	        Connection connexion = null;
	        Statement statement = null;
	        ResultSet resultat = null;

	        try {
	            connexion = daoFactory.getConnection();
	            statement = connexion.createStatement();
	            resultat = statement.executeQuery("SELECT * FROM \"RG\".CategorieInstitution;");

	            while (resultat.next()) {          	
	                CategorieInstitution catInst=  map(resultat);
	                catInsts.add(catInst);               
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        finally {
				DAOUtilitaire.fermeturesSilencieuses( statement,connexion );
			}

	        return catInsts;
	    }
	   
	   /****************Recherche********************/
	@Override
    public List<CategorieInstitution> rechercher(String nomCatInst) throws IllegalArgumentException,DAOException 
    {
		 List<CategorieInstitution> catInsts = new ArrayList<CategorieInstitution>();
	        Connection connexion = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet resultat = null;

	        try {
	            connexion = daoFactory.getConnection();
	            preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_SELECT_PAR_NOM, false, nomCatInst );
	            resultat = preparedStatement.executeQuery();
	           
                while (resultat.next()) {          	
	                CategorieInstitution catInst=  map(resultat);
	                catInsts.add(catInst);               
	            }
                
       
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        finally {
				DAOUtilitaire.fermeturesSilencieuses( preparedStatement,connexion );
			}
	        return catInsts;
    }
	
	           /****************MODIFIER********************/
    @Override
	public Boolean modifier(String oldNomCatInst,String newNomCatInst) throws IllegalArgumentException,DAOException
	{
    	 Boolean modified= false;
    	 List<CategorieInstitution> catInsts = new ArrayList<CategorieInstitution>();
    	 
    	 catInsts= rechercher(oldNomCatInst);
    	 if (!catInsts.isEmpty())
    	 {
    		modified= true;
    	    Connection connexion = null;
 			PreparedStatement preparedStatement = null;
 			//ResultSet valeursAutoGenerees = null;
 			try {
 				/* Récupération d'une connexion depuis la Factory */
 				connexion = daoFactory.getConnection();
 				preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_MODIFY, false,newNomCatInst,oldNomCatInst);
 				int statut = preparedStatement.executeUpdate();
 				/* Analyse du statut retourné par la requête d'insertion */
 				if ( statut == 0 ) {
 					throw new DAOException( "Échec de la modification des cat inst" );
 				}
 			}
 			 catch ( SQLException e ) {throw new DAOException( e );}
 			finally {
 				DAOUtilitaire.fermeturesSilencieuses(  preparedStatement,connexion );
 			}
    	 }
    	return modified;
	}

	@Override
	public Boolean supprimer(String nomCatInst) throws IllegalArgumentException,DAOException 
	{
   Boolean deleted= false;
   	 List<CategorieInstitution> catInsts = new ArrayList<CategorieInstitution>();
   	 
   	 catInsts= rechercher(nomCatInst);
   	 if (!catInsts.isEmpty())
   	 {
   		deleted= true;
   	    Connection connexion = null;
			PreparedStatement preparedStatement = null;
			//ResultSet valeursAutoGenerees = null;
			try {
				/* Récupération d'une connexion depuis la Factory */
				connexion = daoFactory.getConnection();
				preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_DELETE, false,nomCatInst);
				int statut = preparedStatement.executeUpdate();
				/* Analyse du statut retourné par la requête d'insertion */
				if ( statut == 0 ) {
					throw new DAOException( "Échec de la modification des cat inst" );
				}
			}
			 catch ( SQLException e ) {throw new DAOException( e );}
			finally {
				DAOUtilitaire.fermeturesSilencieuses(  preparedStatement,connexion );
			}
   	 }
   	return deleted;
	}
}
