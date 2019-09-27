package RGforest;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name ="CTA")
@Table(name="\"RG\".\"CTA\"")

@NamedQuery(name="CTA.find", query="SELECT u FROM CTA u WHERE  u.id = :id_CTA AND u.validee = true")
@NamedQuery(name="CTAProposes.find", query="SELECT u FROM CTA u WHERE  u.validee = false")

public class CTAForest implements Serializable{
private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="\"ID\"")
	private Integer id;
	
	@Column
	private String intitule;
	
	@Column
	private String description;
	
	@Column
	private String proprietaire;
	
	@Column
	private String brevet;
	
	@Column
	private String region;
	
	@Column
	private String preparation;
	
	@Column
	private String image;
	
	@Column
	private Boolean validee;
	
	@Column
	private String ingredients;
	
	/*-------------------------------------*/
	public CTAForest() {
		
	}
	/*-------------------------------------*/

	public Integer getId() {
		return id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public String getBrevet() {
		return brevet;
	}

	public void setBrevet(String brevet) {
		this.brevet = brevet;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPreparation() {
		return preparation;
	}

	public void setPreparation(String preparation) {
		this.preparation = preparation;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Boolean getValidee() {
		return validee;
	}

	public void setValidee(Boolean validee) {
		this.validee = validee;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
}
