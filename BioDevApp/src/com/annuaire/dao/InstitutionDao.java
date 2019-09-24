package com.annuaire.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.annuaire.beans.Institution;

public interface InstitutionDao 
{
	List<Institution> listerInst(String path) throws IOException;

	
	List<Institution> rechInstParAcro(String acronymeInst,String path) throws DAOException,IOException ;
	List<Institution> rechInstParNom(String nomInst,String path) throws DAOException, IOException  ;
	List<Institution> rechInstParCat(int idCatInst,String path) throws DAOException, IOException;	
	Institution rechInstParId(int idInst,String path) throws DAOException, IOException  ;
	 
	Boolean ajouterInst( Institution inst ,String path ) throws IllegalArgumentException, DAOException, SQLException, IOException;
	Boolean modifierInst(Institution oldInst,Institution newInst) throws DAOException,FileNotFoundException, IOException ;
	Boolean supprimerInst(Institution inst) throws DAOException,IOException ;
/*	Boolean ComparerInst(Institution inst1, Institution inst2);
	List<Institution> InterListInst(List<Institution> insts1, List<Institution>  insts2,Boolean enter);*/

}
