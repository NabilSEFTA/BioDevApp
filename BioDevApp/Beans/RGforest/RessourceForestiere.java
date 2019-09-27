package RGforest;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name ="RessourceForestiere")
//@Table(name="RessourceForestiere", schema="\"RG\"")
@Table(name="\"RG\".\"RessourceForestiere\"")

@NamedQuery(name="RessourceForestiere.find", query="SELECT u FROM RessourceForestiere u WHERE  u.id_classification_forest = :id_ClassifForestiere AND u.validee = TRUE")
@NamedQuery(name="RFProposes.find", query="SELECT u FROM RessourceForestiere u WHERE NOT u.validee = TRUE")


public class RessourceForestiere implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id_RGForestiere;
	
	@Column
	private Integer id_classification_forest;
	
	@Column(nullable = true)
	private Integer id_localisation_forestiere;
	
	@Column(nullable = true)
	private Integer id_ecosys_forestiere;
	
	@Column
	private Integer id_rg;
	
	@Column
	private String nom_latin;
	
	@Column
	private String description;

	@Column
	private String nom_arabe;
	
	@Column
	private String image;
	
	@Column
	private String image1;
	
	@Column
	private String autres_noms;
	
	@Column
	private Integer hauteur_min;
	
	@Column
	private Integer hauteur_max;
	
	@Column
	private String type_feuille;
	
	@Column
	private String couleur_feuille;
	
	@Column
	private String type_fleur;
	
	@Column
	private String couleur_fleur;
	
	@Column
	private String type_tige;
	
	@Column
	private String periode_floraison;
	
	@Column
	private Boolean validee;
	
	/*------------------------------------------*/
	public RessourceForestiere() {
		
	}
	/*------------------------------------------*/
	
	public Integer getId_RGForestiere() {
		return id_RGForestiere;
	}

	public Integer getId_classification_forest() {
		return id_classification_forest;
	}

	public void setId_classification_forest(Integer id_classification_forest) {
		this.id_classification_forest = id_classification_forest;
	}

	public Integer getId_localisation_forestiere() {
		return id_localisation_forestiere;
	}

	public void setId_localisation_forestiere(Integer id_localisation_forestiere) {
		this.id_localisation_forestiere = id_localisation_forestiere;
	}

	public Integer getId_ecosys_forestiere() {
		return id_ecosys_forestiere;
	}

	public void setId_ecosys_forestiere(Integer id_ecosys_forestiere) {
		this.id_ecosys_forestiere = id_ecosys_forestiere;
	}

	public Integer getId_rg() {
		return id_rg;
	}

	public void setId_rg(Integer id_rg) {
		this.id_rg = id_rg;
	}

	public String getNom_latin() {
		return nom_latin;
	}

	public void setNom_latin(String nom_latin) {
		this.nom_latin = nom_latin;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNom_arabe() {
		return nom_arabe;
	}

	public void setNom_arabe(String nom_arabe) {
		this.nom_arabe = nom_arabe;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getAutres_noms() {
		return autres_noms;
	}

	public void setAutres_noms(String autres_noms) {
		this.autres_noms = autres_noms;
	}

	public Integer getHauteur_min() {
		return hauteur_min;
	}

	public void setHauteur_min(Integer hauteur_min) {
		this.hauteur_min = hauteur_min;
	}

	public Integer getHauteur_max() {
		return hauteur_max;
	}

	public void setHauteur_max(Integer hauteur_max) {
		this.hauteur_max = hauteur_max;
	}

	public String getType_feuille() {
		return type_feuille;
	}

	public void setType_feuille(String type_feuille) {
		this.type_feuille = type_feuille;
	}

	public String getCouleur_feuille() {
		return couleur_feuille;
	}

	public void setCouleur_feuille(String couleur_feuille) {
		this.couleur_feuille = couleur_feuille;
	}

	public String getType_fleur() {
		return type_fleur;
	}

	public void setType_fleur(String type_fleur) {
		this.type_fleur = type_fleur;
	}

	public String getCouleur_fleur() {
		return couleur_fleur;
	}

	public void setCouleur_fleur(String couleur_fleur) {
		this.couleur_fleur = couleur_fleur;
	}

	public String getType_tige() {
		return type_tige;
	}

	public void setType_tige(String type_tige) {
		this.type_tige = type_tige;
	}

	public String getPeriode_floraison() {
		return periode_floraison;
	}

	public void setPeriode_floraison(String periode_floraison) {
		this.periode_floraison = periode_floraison;
	}

	public Boolean getValidee() {
		return validee;
	}

	public void setValidee(Boolean validee) {
		this.validee = validee;
	}
	
	
}
