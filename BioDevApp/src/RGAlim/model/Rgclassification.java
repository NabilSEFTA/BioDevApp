package RGAlim.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the rgclassification database table.
 * 
 */
@Entity
@Table (name="\"RG\".rgclassification")
@NamedQuery(name="Rgclassification.findAll", query="SELECT r FROM Rgclassification r where r.parentPath< cast( 'niveau1.niveau22' as ltree) ")
public class Rgclassification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="nom_niveau")
	private String nomNiveau;

	@Column(name="parent_path",columnDefinition="ltree")
	private String parentPath;

	@Column(name="type_classification")
	private String typeClassification;

	//bi-directional many-to-one association to Rgclassification
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="parent_id")
	private Rgclassification rgclassification;

	//bi-directional many-to-one association to Rgclassification
	@OneToMany(mappedBy="rgclassification",cascade = CascadeType.ALL)
	private List<Rgclassification> rgclassifications;
	
	@ManyToMany (mappedBy = "rgclassification")
	private List<RessourceGenetique> genetiques;
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Rgclassification() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomNiveau() {
		return this.nomNiveau;
	}

	public void setNomNiveau(String nomNiveau) {
		this.nomNiveau = nomNiveau;
	}

	public String getParentPath() {
		return this.parentPath;
	}

	public void setParentPath(String parentPath) {
		this.parentPath = parentPath;
	}

	public String getTypeClassification() {
		return this.typeClassification;
	}

	public void setTypeClassification(String typeClassification) {
		this.typeClassification = typeClassification;
	}

	public Rgclassification getRgclassification() {
		return this.rgclassification;
	}

	public List<RessourceGenetique> getGenetiques() {
		return genetiques;
	}

	public void setGenetiques(List<RessourceGenetique> genetiques) {
		this.genetiques = genetiques;
	}

	public void setRgclassification(Rgclassification rgclassification) {
		this.rgclassification = rgclassification;
	}

	public List<Rgclassification> getRgclassifications() {
		return this.rgclassifications;
	}

	public void setRgclassifications(List<Rgclassification> rgclassifications) {
		this.rgclassifications = rgclassifications;
	}

	public Rgclassification addRgclassification(Rgclassification rgclassification) {
		getRgclassifications().add(rgclassification);
		rgclassification.setRgclassification(this);

		return rgclassification;
	}

	public Rgclassification removeRgclassification(Rgclassification rgclassification) {
		getRgclassifications().remove(rgclassification);
		rgclassification.setRgclassification(null);

		return rgclassification;
	}

}