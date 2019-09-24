package RGMarines;

import java.io.Serializable;
import javax.persistence.*;

@Entity(name ="rgClassificationMarine")
@Table(name="\"RG\".\"rgClassificationMarine\"")

@NamedQuery(name="Classification.find", query="SELECT u FROM rgClassificationMarine u WHERE  u.num_niveau = :num_niveau AND u.parent_id = :parent_id")

public class Classification implements Serializable{
	
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
	private String pre_description;
	
	@Column
	private String description;
	
	@Column
	private int nb_especes;
	
	@Column
	private String image;
	
	@Column
	private String image1;
	
	/*-----------------------------------------*/
	public Classification() {
		
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


	public String getPre_description() {
		return pre_description;
	}


	public void setPre_description(String pre_description) {
		this.pre_description = pre_description;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getNb_especes() {
		return nb_especes;
	}


	public void setNb_especes(int nb_especes) {
		this.nb_especes = nb_especes;
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
	
}
