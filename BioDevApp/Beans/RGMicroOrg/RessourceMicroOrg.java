package RGMicroOrg;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity (name= "RessourceMicroOrg")
@Table (name="\"RG\".\"RessourceMicroOrg\"")

@NamedQueries({
@NamedQuery(name="RessourceMicroOrg.find", query="SELECT u FROM  RessourceMicroOrg u WHERE  u.id_classification = :id_classification"),
@NamedQuery(name="RessourceMicroOrg.findAll", query="SELECT l FROM  RessourceMicroOrg l")
})
public class RessourceMicroOrg implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private boolean presence_noyau; 
	
	@Column
	private String emplacement_adn; 
	
	@Column
	private String coloration_gram;
	
	@Column
	private Integer id_rg; 
	
	@Column
	private Integer id_classification;
	
	@Column
	private String image; 
	
	@Column
	private String ecosys; 
	
	@Column
	private String  pathogenie; 
	
	@Column
	private String  respiration;
	
	@Column
	private String  forme;
	
	@Column
	private String  reproduction;
	
	@Column
	private String  nom_latin;
	
	@Column
	private String  nom_arabe;

	@Column
	private String  nom_amazigh;
	
	@Column
	private String  description;
	@Column
	private boolean  validee;
	
	
	
	public boolean isValidee() {
		return validee;
	}



	public void setValidee(boolean validee) {
		this.validee = validee;
	}



	public Integer getId() {
		return id;
	}



	public boolean isPresence_noyau() {
		return presence_noyau;
	}



	public void setPresence_noyau(boolean presence_noyau) {
		this.presence_noyau = presence_noyau;
	}



	public String getEmplacement_adn() {
		return emplacement_adn;
	}



	public void setEmplacement_adn(String emplacement_adn) {
		this.emplacement_adn = emplacement_adn;
	}



	public String getColoration_gram() {
		return coloration_gram;
	}



	public void setColoration_gram(String coloration_gram) {
		this.coloration_gram = coloration_gram;
	}



	public Integer getId_rg() {
		return id_rg;
	}



	public Integer getId_classification() {
		return id_classification;
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



	public RessourceMicroOrg() {
		
	}

	
	
	
}
	
	



