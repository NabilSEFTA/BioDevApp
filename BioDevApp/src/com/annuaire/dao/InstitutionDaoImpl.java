package com.annuaire.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.postgresql.largeobject.LargeObject;
import org.postgresql.largeobject.LargeObjectManager;

import com.annuaire.beans.CategorieInstitution;
import com.annuaire.beans.Institution;

public class InstitutionDaoImpl implements  InstitutionDao

{
	private static final String SQL_INSERT_INST = "INSERT INTO \"RG\".institution"
									+ " ( id_cat_inst, acronyme,"
								    + "nom_inst,description_inst,mail_inst,"
								    + "tel_inst, fax_inst, adresse_inst,lien_site, image_inst) VALUES (?,?,?,?,?,?,?,?,?,?)";
	private static final String SQL_SELECT_PAR_NOM = "SELECT * FROM \"RG\".institution where UPPER(nom_inst)=UPPER(?);";
	private static final String SQL_SELECT_PAR_ACRO = "SELECT * FROM \"RG\".institution where UPPER(acronyme)=UPPER(?);";
	private static final String SQL_SELECT_PAR_CAT = "SELECT * FROM \"RG\".institution where id_cat_inst=?";
	
	private static final String SQL_SELECT_PAR_ID = "SELECT * FROM \"RG\".institution where id_inst=?;";
	private static final String SQL_MODIFY_INST =" UPDATE \"RG\".institution set  "
										+ " id_cat_inst=?, acronyme=?," 
			                            + "nom_inst=?,description_inst=?,mail_inst=?,"  
			                            + "tel_inst=?, fax_inst=?, adresse_inst=?,lien_site=?," 
			                            + "image_inst=?  where nom_inst=?;";
	private static final String SQL_DELETE_INST ="DELETE FROM \"RG\".institution where id_inst=(?);";
	
	private DAOFactory daoFactory;
	InstitutionDaoImpl( DAOFactory daoFactory ) 
	{this.daoFactory = daoFactory;}
	
	/* Simple méthode utilitaire permettant de faire la correspondance(le
	* mapping) entre une ligne issue de la table des cat institutions (un
	* ResultSet) et un bean Utilisateur*/
	private static Institution map( ResultSet resultSet, String path ) throws SQLException, IOException 
	{
		Institution inst = new Institution();
		inst.setId_inst( resultSet.getInt( "id_inst" ) );
		inst.setId_cat_inst( resultSet.getInt( "id_cat_inst" ) );
		inst.setAcronyme( resultSet.getString( "acronyme" ) );
		inst.setNom_inst( resultSet.getString( "nom_inst" ) );
		inst.setDescription_inst( resultSet.getString( "description_inst" ) );
		inst.setMail_inst( resultSet.getString( "mail_inst" ) );
		inst.setTel_inst( resultSet.getString( "tel_inst" ) );
		inst.setFax_inst( resultSet.getString( "fax_inst" ) );
		inst.setAdresse_inst( resultSet.getString( "adresse_inst" ) );
		inst.setLien_site( resultSet.getString( "lien_site" ) );
		if (resultSet.getBytes("image_inst") instanceof byte[]) 
		{
		File file= new File(path+"/"+inst.getAcronyme()+".jpeg");
	    Utils.ByteToImage(resultSet.getBytes("image_inst"),file);
	    inst.setImage_inst(file);
		}
		
	    return inst;
	}
	/***********************METHODES*******************************/

	
			/**************ListerInsts ****************/
	@Override
	public List<Institution> listerInst(String path) throws IOException
	{
		List<Institution> insts = new ArrayList<Institution>();
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;
      
        try {
            connexion = daoFactory.getConnection();
            statement = connexion.createStatement();
           
            resultat = statement.executeQuery("SELECT * FROM  \"RG\".institution;");
           
            while (resultat.next() ) 
            {          	
                Institution inst=  map(resultat,path);
 
                insts.add(inst);               
            }
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
			DAOUtilitaire.fermeturesSilencieuses( statement,connexion );
		}

        return insts;
	}
	


	/*******************************RechParAcro * @throws IOException **************************/
	@Override
	public List<Institution>rechInstParAcro(String acronymeInst,String path) throws IllegalArgumentException, DAOException, IOException 
		{
		List<Institution> insts = new ArrayList<Institution>();
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_SELECT_PAR_ACRO, false, acronymeInst);
            resultat = preparedStatement.executeQuery();
           
            while (resultat.next()) {          	
                Institution inst=  map(resultat,path);
                insts.add(inst);               
            }
            
   
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
			DAOUtilitaire.fermeturesSilencieuses( preparedStatement,connexion );
		}
        return insts;
		
		}
				/***************RechNom*************************/
	@Override
	public List<Institution> rechInstParNom(String nomInst,String path) throws IllegalArgumentException, DAOException, IOException 
	{
		List<Institution> insts = new ArrayList<Institution>();
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_SELECT_PAR_NOM, false,  nomInst);
            resultat = preparedStatement.executeQuery();
           
            while (resultat.next()) {          	
                Institution inst=  map(resultat,path);
                insts.add(inst);               
            }
            
   
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
			DAOUtilitaire.fermeturesSilencieuses( preparedStatement,connexion );
		}
        return insts;
	}
	/********************RechCatégorie**********************/

	@Override
	public List<Institution> rechInstParCat(int idCatInst,String path) throws DAOException, IOException 
	{
		
		List<Institution> insts = new ArrayList<Institution>();
		if (idCatInst==0) { insts=listerInst(path); }
		else
		{
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultat = null;

        try {
            connexion = daoFactory.getConnection();
            preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_SELECT_PAR_CAT, false,  idCatInst);
            resultat = preparedStatement.executeQuery();
           
            while (resultat.next()) {          	
                Institution inst=  map(resultat,path);
                insts.add(inst);               
            }
            
   
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
			DAOUtilitaire.fermeturesSilencieuses( preparedStatement,connexion );
		}
		}
        return insts;
	}
			/**********************RechParId*************************************/
	public Institution rechInstParId(int idInst,String path) throws DAOException, IOException 
	{
		Institution inst = new Institution();
        Connection connexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultat = null;

        try 
        {
            connexion = daoFactory.getConnection();
            preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_SELECT_PAR_ID, false,  idInst);
            resultat = preparedStatement.executeQuery(); 
            while (resultat.next())
            { inst=  map(resultat,path);
           
            	 System.out.println( inst.getDescription_inst());
            	
            } 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
			DAOUtilitaire.fermeturesSilencieuses( preparedStatement,connexion );
		}
        return inst;
	}
	
	/************************AjouterInst**********************/
	
	@Override
	public 	Boolean ajouterInst( Institution inst,String path) throws IllegalArgumentException, DAOException, SQLException, IOException
	{
		Boolean insered =false;
		if ( rechInstParNom(inst.getNom_inst(),path).isEmpty())
		{
	  
		Connection connexion = null;
		PreparedStatement preparedStatement = null;
		ResultSet valeursAutoGenerees = null;
		try {
			/* Récupération d'une connexion depuis la Factory */
			connexion = daoFactory.getConnection();
			if (inst.getImage_inst()!= null)
			{
			preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_INSERT_INST, true, inst.getId_cat_inst(), 
			inst.getAcronyme(),inst.getNom_inst(),inst.getDescription_inst(),inst.getMail_inst(),
				    inst.getTel_inst(),inst.getFax_inst(), inst.getAdresse_inst(),
				    inst.getLien_site(),Utils.ImageToByte(inst.getImage_inst()));
			}
			else
			{
				preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_INSERT_INST, true, inst.getId_cat_inst(), 
						inst.getAcronyme(),inst.getNom_inst(),inst.getDescription_inst(),inst.getMail_inst(),
					    inst.getTel_inst(),inst.getFax_inst(), inst.getAdresse_inst(),
					    inst.getLien_site(),null);
			}
			
			int statut = preparedStatement.executeUpdate();
			/* Analyse du statut retourné par la requête d'insertion */
			if ( statut == 0 ) {
				throw new DAOException( "Échec de la création de l'inst, aucune ligne ajoutée dans la table." );
			}
			/* Récupération de l'id auto-généré par la requête d'insertion */
			valeursAutoGenerees = preparedStatement.getGeneratedKeys();
			if ( valeursAutoGenerees.next() ) {
				/* Puis initialisation de la propriété id du bean Utilisateur avec sa valeur */
				  insered =true;
			
			} else {
				throw new DAOException( "Échec de la création de l'inst, aucun ID auto-généré retourné." );
			}
		} catch ( SQLException e ) {throw new DAOException( e );}
		finally {
			DAOUtilitaire.fermeturesSilencieuses( valeursAutoGenerees, preparedStatement,connexion );
		}
		}
		return insered;
	}
	
	
	/**************************MODIFICATION********************/
	@Override
	public Boolean modifierInst(Institution oldInst,Institution newInst) throws IllegalArgumentException, DAOException, FileNotFoundException, IOException  
	{

    		 
		 Boolean modified= false;
    	 List<Institution> insts = new ArrayList<Institution>();
    	 
    /*	 insts= rechInstParNom(oldInst.getNom_inst());
    	 if (!insts.isEmpty())
    	 {*/
    		modified= true;
    	    Connection connexion = null;
 			PreparedStatement preparedStatement = null;
 			//ResultSet valeursAutoGenerees = null;
 			try {
 				/* Récupération d'une connexion depuis la Factory */
 				connexion = daoFactory.getConnection();
 				if (newInst.getImage_inst()!= null)
 				{
 				preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_MODIFY_INST, false,newInst.getId_cat_inst(), 
 						newInst.getAcronyme(),newInst.getNom_inst(),newInst.getDescription_inst(),newInst.getMail_inst(),
 						newInst.getTel_inst(),newInst.getFax_inst(), newInst.getAdresse_inst(),
 						newInst.getLien_site(),Utils.ImageToByte(newInst.getImage_inst()),oldInst.getNom_inst());
 				}
 				
 				else
 				{
 					preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_MODIFY_INST, false,newInst.getId_cat_inst(), 
 	 						newInst.getAcronyme(),newInst.getNom_inst(),newInst.getDescription_inst(),newInst.getMail_inst(),
 	 						newInst.getTel_inst(),newInst.getFax_inst(), newInst.getAdresse_inst(),
 	 						newInst.getLien_site(),null,oldInst.getNom_inst()); 					
 				}
 				int statut = preparedStatement.executeUpdate();
 				/* Analyse du statut retourné par la requête d'insertion */
 				if ( statut == 0 ) {
 					throw new DAOException( "Échec de la modification des inst" );
 				}
 			}
 			 catch ( SQLException e ) {throw new DAOException( e );}
 			finally {
 				DAOUtilitaire.fermeturesSilencieuses(  preparedStatement,connexion );
 			}
    	// }
    	return modified;
	}
				/***************************Supprimer Institution*********************/
	@Override
	public Boolean supprimerInst(Institution institution) throws IllegalArgumentException, DAOException, IOException 
	{
		 Boolean deleted= false;
		 List<Institution> insts = new ArrayList<Institution>();
    	 
    	// insts= rechInstParNom(institution.getNom_inst());
    /*	 if (!insts.isEmpty())
	   	 {*/
	   		deleted= true;
	   	    Connection connexion = null;
				PreparedStatement preparedStatement = null;
				//ResultSet valeursAutoGenerees = null;
				try {
					/* Récupération d'une connexion depuis la Factory */
					connexion = daoFactory.getConnection();
					preparedStatement = DAOUtilitaire.initialisationRequetePreparee( connexion,SQL_DELETE_INST, false,institution.getId_inst());
					int statut = preparedStatement.executeUpdate();
					/* Analyse du statut retourné par la requête d'insertion */
					if ( statut == 0 ) {
						throw new DAOException( "Échec de la suppression de l'inst" );
					}
				}
				 catch ( SQLException e ) {throw new DAOException( e );}
				finally {
					DAOUtilitaire.fermeturesSilencieuses(  preparedStatement,connexion );
				}
	 //  	 }
	   	return deleted;
	}

			

		/***********************************************/

	
}
