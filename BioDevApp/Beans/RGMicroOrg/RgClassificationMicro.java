package RGMicroOrg;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity (name= "RgClassificationMicro")
@Table (name="\"RG\".\"RgClassificationMicro\"")

@NamedQuery(name="RgClassificationMicro.find", query="SELECT u FROM  RgClassificationMicro u WHERE  u.num_niveau = :num_niveau AND u.parent_id = :parent_id")
public class RgClassificationMicro implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String nom; 
	
	@Column
	private String nom_niveau; 
	
	@Column
	private String description;
	
	@Column
	private String image; 
	
	@Column
	private Integer num_niveau; 
	
	@Column
	private Integer parent_id; 
	
	@Column
	private Integer nb_especes; 
	
	public RgClassificationMicro() {
		
	}

	public Integer getId() {
		return id;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNom_niveau() {
		return nom_niveau;
	}

	public void setNom_niveau(String nom_niveau) {
		this.nom_niveau = nom_niveau;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getNum_niveau() {
		return num_niveau;
	}

	public void setNum_niveau(Integer num_niveau) {
		this.num_niveau = num_niveau;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public Integer getNb_especes() {
		return nb_especes;
	}

	public void setNb_especes(Integer nb_especes) {
		this.nb_especes = nb_especes;
	}
	
	
}
	
	



