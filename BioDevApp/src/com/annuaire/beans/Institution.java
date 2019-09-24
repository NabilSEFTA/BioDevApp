package com.annuaire.beans;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.postgresql.largeobject.LargeObject;

public class Institution {
	
	private int id_inst;
	private int id_cat_inst;
	private String acronyme;
	private String nom_inst;
	private String description_inst;
	private String mail_inst;
	private String tel_inst;
	private String fax_inst;
	private String adresse_inst;
	private String lien_site;
	private File image_inst;
	
	public Institution()
	{super();}
	
	public Institution(int id_inst, int id_cat_inst,String acronyme,String nom_inst,String description_inst,
		String mail_inst,String tel_inst,String fax_inst,String adresse_inst,String lien_site,File image_inst)
	{
		this.id_inst=id_inst;
		this.id_cat_inst=id_cat_inst;
		this.acronyme=acronyme;
		this.nom_inst= nom_inst;
		this.description_inst = description_inst;
		this.mail_inst=mail_inst;
		this.tel_inst= tel_inst;
		this.fax_inst= fax_inst;
		this.lien_site= lien_site;
		this.adresse_inst= adresse_inst;
		this.image_inst= image_inst;
		
	}

	public int getId_inst() {
		return id_inst;
	}

	public void setId_inst(int id_inst) {
		this.id_inst = id_inst;
	}

	public int getId_cat_inst() {
		return id_cat_inst;
	}

	public void setId_cat_inst(int id_cat_inst) {
		this.id_cat_inst = id_cat_inst;
	}

	public String getAcronyme() {
		return acronyme;
	}

	public void setAcronyme(String acronyme) {
		this.acronyme = acronyme;
	}

	public String getNom_inst() {
		return nom_inst;
	}

	public void setNom_inst(String nom_inst) {
		this.nom_inst = nom_inst;
	}

	public String getDescription_inst() {
		return description_inst;
	}

	public void setDescription_inst(String description_inst) {
		this.description_inst = description_inst;
	}

	public String getMail_inst() {
		return mail_inst;
	}

	public void setMail_inst(String mail_inst) {
		this.mail_inst = mail_inst;
	}

	public String getTel_inst() {
		return tel_inst;
	}

	public void setTel_inst(String tel_inst) {
		this.tel_inst = tel_inst;
	}

	public String getFax_inst() {
		return fax_inst;
	}

	public void setFax_inst(String fax_inst) {
		this.fax_inst = fax_inst;
	}

	public String getAdresse_inst() {
		return adresse_inst;
	}

	public void setAdresse_inst(String adresse_inst) {
		this.adresse_inst = adresse_inst;
	}

	public String getLien_site() {
		return lien_site;
	}

	public void setLien_site(String lien_site) {
		this.lien_site = lien_site;
	}

	public File getImage_inst() {
		return image_inst;
	}

	public void setImage_inst(File image_inst) {
		this.image_inst = image_inst;
	}

	
	
	

}
