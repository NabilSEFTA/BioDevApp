package com.annuaire.dao;

import java.util.List;

import com.annuaire.beans.CategorieInstitution;

public interface CategorieInstitutionDao 
{
	
	void ajouter( String nomCatInst ) throws DAOException;
	//CategorieInstitution trouver() throws DAOException;
	List<CategorieInstitution> lister();
	List<CategorieInstitution> rechercher(String nomCatInst) throws DAOException ;
	Boolean modifier(String oldNomCatInst,String newNomCatInst) throws DAOException;
	Boolean supprimer(String nomCatInst) throws DAOException;
	

}
