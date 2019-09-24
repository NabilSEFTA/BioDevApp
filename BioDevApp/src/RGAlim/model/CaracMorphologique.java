package RGAlim.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the carac_morphologique database table.
 * 
 */
@Entity
@Table(name="\"RG\"."+"carac_morphologique")
@NamedQuery(name="CaracMorphologique.findAll", query="SELECT c FROM CaracMorphologique c")
public class CaracMorphologique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_carac_morphologique")
	private Integer idCaracMorphologique;

	@Column(name="couleur_fleur")
	private String couleurFleur;

	private String germe;
	@Column (name="maturité")
	private String maturité;

	private String tubercule;

	//bi-directional many-to-one association to RessourcePhytogenetique
	@OneToMany(mappedBy="caracMorphologique",cascade = CascadeType.PERSIST)
	private List<RessourcePhytogenetique> ressourcePhytogenetiques;

	//bi-directional many-to-one association to Phane
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_phane")
	private Phane phane;

	public CaracMorphologique() {
	}

	public Integer getIdCaracMorphologique() {
		return this.idCaracMorphologique;
	}

	public void setIdCaracMorphologique(Integer idCaracMorphologique) {
		this.idCaracMorphologique = idCaracMorphologique;
	}

	public String getCouleurFleur() {
		return this.couleurFleur;
	}

	public void setCouleurFleur(String couleurFleur) {
		this.couleurFleur = couleurFleur;
	}

	public String getGerme() {
		return this.germe;
	}

	public void setGerme(String germe) {
		this.germe = germe;
	}

	public String getMaturité() {
		return this.maturité;
	}

	public void setMaturité(String maturité) {
		this.maturité = maturité;
	}

	public String getTubercule() {
		return this.tubercule;
	}

	public void setTubercule(String tubercule) {
		this.tubercule = tubercule;
	}

	public List<RessourcePhytogenetique> getRessourcePhytogenetiques() {
		return this.ressourcePhytogenetiques;
	}

	public void setRessourcePhytogenetiques(List<RessourcePhytogenetique> ressourcePhytogenetiques) {
		this.ressourcePhytogenetiques = ressourcePhytogenetiques;
	}

	public RessourcePhytogenetique addRessourcePhytogenetique(RessourcePhytogenetique ressourcePhytogenetique) {
		getRessourcePhytogenetiques().add(ressourcePhytogenetique);
		ressourcePhytogenetique.setCaracMorphologique(this);

		return ressourcePhytogenetique;
	}

	public RessourcePhytogenetique removeRessourcePhytogenetique(RessourcePhytogenetique ressourcePhytogenetique) {
		getRessourcePhytogenetiques().remove(ressourcePhytogenetique);
		ressourcePhytogenetique.setCaracMorphologique(null);

		return ressourcePhytogenetique;
	}

	public Phane getPhane() {
		return this.phane;
	}

	public void setPhane(Phane phane) {
		this.phane = phane;
	}

}