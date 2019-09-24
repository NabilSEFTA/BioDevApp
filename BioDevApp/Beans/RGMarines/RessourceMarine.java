package RGMarines;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name ="RessourceMarine")
@Table(name="\"RG\".\"RessourceMarine\"")

@NamedQuery(name="RessourceMarine.find", query="SELECT u FROM RessourceMarine u WHERE  u.id_classification_marine = :id_ClassifMarine AND u.validee = TRUE")
@NamedQuery(name="RMProposes.find", query="SELECT u FROM RessourceMarine u WHERE NOT u.validee = TRUE")


public class RessourceMarine implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private Integer id_classification_marine;
	
	@Column(nullable = true)
	private Integer id_localisation_marine;
	
	@Column(nullable = true)
	private Integer id_ecosys_marine;
	
	@Column
	private Integer id_rg;
	
	@Column
	private String nom_latin;
	
	@Column
	private String image;
	
	@Column
	private String image1;
	
	@Column
	private String image_male;
	
	@Column
	private String image_female;
	
	@Column
	private String alimentation;
	
	@Column
	private String reproduction;
	
	@Column
	private String cle_identif;
	
	@Column
	private String autres_noms;
	
	@Column
	private Boolean validee;
	
	/*------------------------------------------*/
	public RessourceMarine() {
		
	}
	/*------------------------------------------*/

	public int getId() {
		return id;
	}

	public int getId_classificationMarine() {
		return id_classification_marine;
	}

	public void setId_classificationMarine(int id_classificationMarine) {
		this.id_classification_marine = id_classificationMarine;
	}

	public int getId_localisation_marine() {
		return id_localisation_marine;
	}

	public void setId_localisation_marine(int id_localisation_marine) {
		this.id_localisation_marine = id_localisation_marine;
	}

	public int getId_ecosys_marine() {
		return id_ecosys_marine;
	}

	public void setId_ecosys_marine(int id_ecosys_marine) {
		this.id_ecosys_marine = id_ecosys_marine;
	}

	public int getId_rg() {
		return id_rg;
	}

	public void setId_rg(int id_rg) {
		this.id_rg = id_rg;
	}
	
	public String getNom_latin() {
		return nom_latin;
	}
	
	public void setNom_latin(String nom_latin) {
		this.nom_latin = nom_latin;
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

	public String getImageMale() {
		return image_male;
	}

	public void setImageMale(String imageMale) {
		this.image_male = imageMale;
	}

	public String getImageFemale() {
		return image_female;
	}

	public void setImageFemale(String imageFemale) {
		this.image_female = imageFemale;
	}

	public String getAlimentation() {
		return alimentation;
	}

	public void setAlimentation(String alimentation) {
		this.alimentation = alimentation;
	}

	public String getReproduction() {
		return reproduction;
	}

	public void setReproduction(String reproduction) {
		this.reproduction = reproduction;
	}

	public String getCleIdentif() {
		return cle_identif;
	}

	public void setCleIdentif(String cleIdentif) {
		this.cle_identif = cleIdentif;
	}

	public String getAutres_noms() {
		return autres_noms;
	}

	public void setAutres_noms(String autres_noms) {
		this.autres_noms = autres_noms;
	}

	public Boolean getValidee() {
		return validee;
	}

	public void setValidee(Boolean validee) {
		this.validee = validee;
	}
	
	
	
}
