package com.annuaire.beans;

public class CategorieInstitution {
	private int id_cat_inst;
	private String nom_cat_inst;
	
	public CategorieInstitution()
	{super();}
	
	public CategorieInstitution(int id_cat_inst,String nom_cat_inst)
	{
		this.id_cat_inst=id_cat_inst;
		this.nom_cat_inst=nom_cat_inst;	
	}

	public int getId_cat_inst() {
		return id_cat_inst;
	}

	public void setId_cat_inst(int id_cat_inst) {
		this.id_cat_inst = id_cat_inst;
	}

	public String getNom_cat_inst() {
		return nom_cat_inst;
	}

	public void setNom_cat_inst(String nom_cat_inst) {
		this.nom_cat_inst = nom_cat_inst;
	}
	
	
}
