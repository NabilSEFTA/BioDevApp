package RGMicroOrg;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class RGbean {

	@Id
	@GeneratedValue 
	private int Id;
	
	@Column
	private String nom_latin;  
	private String nom_arabe;  
	private String nom_amazigh;
	private String description;
	private boolean presence_noyau;  
	private boolean validee;
	private String utilisateur;
	private String emplacement_adn; 
	private Integer id_rg; 
	private Integer id_classification; 
	private String image;
	private String ecosys;
	private String pathogenie;
	private String respiration;
	private String forme;
	private String reproduction;
	
	public RGbean() {
		
	}

	public int getId() {
		return Id;
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

	public boolean isPresence_noyau() {
		return presence_noyau;
	}

	public void setPresence_noyau(boolean presence_noyau) {
		this.presence_noyau = presence_noyau;
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

	public String getEmplacement_adn() {
		return emplacement_adn;
	}

	public void setEmplacement_adn(String emplacement_adn) {
		this.emplacement_adn = emplacement_adn;
	}

	public Integer getId_rg() {
		return id_rg;
	}

	public void setId_rg(Integer id_rg) {
		this.id_rg = id_rg;
	}

	public Integer getId_classification() {
		return id_classification;
	}

	public void setId_classification(Integer id_classification) {
		this.id_classification = id_classification;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getEcosys() {
		return ecosys;
	}

	public void setEcosys(String ecosys) {
		this.ecosys = ecosys;
	}

	public String getPathogenie() {
		return pathogenie;
	}

	public void setPathogenie(String pathogenie) {
		this.pathogenie = pathogenie;
	}

	public String getRespiration() {
		return respiration;
	}

	public void setRespiration(String respiration) {
		this.respiration = respiration;
	}

	public String getForme() {
		return forme;
	}

	public void setForme(String forme) {
		this.forme = forme;
	}

	public String getReproduction() {
		return reproduction;
	}

	public void setReproduction(String reproduction) {
		this.reproduction = reproduction;
	}
	
	
}
