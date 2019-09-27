package RGforest;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name ="RgClassificationForest")
@Table(name="\"RG\".\"RgClassificationForest\"")

@NamedQuery(name="ClassificationForest.find", query="SELECT u FROM RgClassificationForest u WHERE  u.num_niveau = :num_niveau AND u.parent_id = :parent_id")

public class ClassificationForest implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String nom;
	
	@Column
	private String nom_niveau;
	
	@Column
	private int num_niveau;
	
	@Column
	private int parent_id;
	
	
	@Column
	private String description;
	
	
	@Column
	private String image;
	

	
	/*-----------------------------------------*/
	public ClassificationForest() {
		
	}
	/*-----------------------------------------*/


	public int getId() {
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


	public int getNum_niveau() {
		return num_niveau;
	}


	public void setNum_niveau(int num_niveau) {
		this.num_niveau = num_niveau;
	}


	public int getParent_id() {
		return parent_id;
	}


	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
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
	
	
}
