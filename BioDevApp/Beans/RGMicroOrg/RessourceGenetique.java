package RGMicroOrg;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity (name= "RessourceGenetique")
@Table (name="\"RG\".\"RessourceGenetique\"")

@NamedQuery(name="RessourceGenetique.find", query="SELECT u FROM  RessourceGenetique u WHERE  u.id = :id")
public class RessourceGenetique implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String nom_latin;
	
	@Column
	private String nom_français;
	
	@Column
	private String nom_amazigh;
	
	@Column
	private String nom_arabe;
	
	@Column
	private String description;
	
	@Column
	private Integer nombre;
	
	@Column
	private String image;
	
	@Column
	private Integer id_cta;
	
	@Column
	private String categorie;

	@Column
	private boolean validee;
	
	@Column
	private String utilisateur;
	
	
	public RessourceGenetique() {
		
		}


	public Integer getId() {
		return id;
	}



	public String getNom_latin() {
		return nom_latin;
	}


	public void setNom_latin(String nom_latin) {
		this.nom_latin = nom_latin;
	}


	public String getNom_français() {
		return nom_français;
	}


	public void setNom_français(String nom_français) {
		this.nom_français = nom_français;
	}


	public String getNom_amazigh() {
		return nom_amazigh;
	}


	public void setNom_amazigh(String nom_amazigh) {
		this.nom_amazigh = nom_amazigh;
	}


	public String getNom_arabe() {
		return nom_arabe;
	}


	public void setNom_arabe(String nom_arabe) {
		this.nom_arabe = nom_arabe;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getNombre() {
		return nombre;
	}


	public void setNombre(Integer nombre) {
		this.nombre = nombre;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Integer getId_cta() {
		return id_cta;
	}


	public void setId_cta(Integer id_cta) {
		this.id_cta = id_cta;
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
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
	
	

	
	
	
	
	
}