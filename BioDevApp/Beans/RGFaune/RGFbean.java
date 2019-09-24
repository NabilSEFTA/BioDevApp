package RGFaune;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class RGFbean {

	@Id
	@GeneratedValue 
	private int ID_RGFAUNE;
	
	@Column
	private String nom_latin;  
	private String nom_arabe;  
	private String nom_amazigh;
	private String description;
	private int nombre;  
	private boolean validee;
	private String utilisateur;
	private boolean noyau_cellulaire; 
	private boolean poils; 
	private boolean vertèbres; 
	private boolean membres;
	private String region;
	private String wilaya;
	
	
	
	
	public int getID_RGFAUNE() {
		return ID_RGFAUNE;
	}
	public void setID_RGFAUNE(int iD_RGFAUNE) {
		ID_RGFAUNE = iD_RGFAUNE;
	}
	public String getNom_latin() {
		return nom_latin;
	}
	public void setNom_latin(String nom_latin) {
		this.nom_latin = nom_latin;
	}
	public String getNom_arabe() {
		return nom_arabe;
	}
	public void setNom_arabe(String nom_arabe) {
		this.nom_arabe = nom_arabe;
	}
	public String getNom_amazigh() {
		return nom_amazigh;
	}
	public void setNom_amazigh(String nom_amazigh) {
		this.nom_amazigh = nom_amazigh;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	public boolean isValidee() {
		return validee;
	}
	public void setValidee(boolean validee) {
		this.validee = validee;
	}
	public String getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}
	public boolean isNoyau_cellulaire() {
		return noyau_cellulaire;
	}
	public void setNoyau_cellulaire(boolean noyau_cellulaire) {
		this.noyau_cellulaire = noyau_cellulaire;
	}
	public boolean isPoils() {
		return poils;
	}
	public void setPoils(boolean poils) {
		this.poils = poils;
	}
	public boolean isVertèbres() {
		return vertèbres;
	}
	public void setVertèbres(boolean vertèbres) {
		this.vertèbres = vertèbres;
	}
	public boolean isMembres() {
		return membres;
	}
	public void setMembres(boolean membres) {
		this.membres = membres;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getWilaya() {
		return wilaya;
	}
	public void setWilaya(String wilaya) {
		this.wilaya = wilaya;
	} 
	
	
	
	
}
