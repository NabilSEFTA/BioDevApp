package RGAlim.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the carac_anatomique database table.
 * 
 */
@Entity
@Table(name="\"RG\"."+"carac_anatomique")
@NamedQuery(name="CaracAnatomique.findAll", query="SELECT c FROM CaracAnatomique c")
public class CaracAnatomique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_carac_anatomique")
	private Integer idCaracAnatomique;

	private String feuille;

	private String fleur;

	private String fruit;

	private String graine;

	private String tige;

	@Column(name="type_racine")
	private String typeRacine;

	//bi-directional many-to-one association to RessourcePhytogenetique
	@OneToMany(mappedBy="caracAnatomique",cascade = CascadeType.PERSIST)
	private List<RessourcePhytogenetique> ressourcePhytogenetiques;

	public CaracAnatomique() {
	}

	public Integer getIdCaracAnatomique() {
		return this.idCaracAnatomique; 
	}

	public void setIdCaracAnatomique(Integer idCaracAnatomique) {
		this.idCaracAnatomique = idCaracAnatomique;
	}

	public String getFeuille() {
		return this.feuille;
	}

	public void setFeuille(String feuille) {
		this.feuille = feuille;
	}

	public String getFleur() {
		return this.fleur;
	}

	public void setFleur(String fleur) {
		this.fleur = fleur;
	}

	public String getFruit() {
		return this.fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public String getGraine() {
		return this.graine;
	}

	public void setGraine(String graine) {
		this.graine = graine;
	}

	public String getTige() {
		return this.tige;
	}

	public void setTige(String tige) {
		this.tige = tige;
	}

	public String getTypeRacine() {
		return this.typeRacine;
	}

	public void setTypeRacine(String typeRacine) {
		this.typeRacine = typeRacine;
	}

	public List<RessourcePhytogenetique> getRessourcePhytogenetiques() {
		return this.ressourcePhytogenetiques;
	}

	public void setRessourcePhytogenetiques(List<RessourcePhytogenetique> ressourcePhytogenetiques) {
		this.ressourcePhytogenetiques = ressourcePhytogenetiques;
	}

	public RessourcePhytogenetique addRessourcePhytogenetique(RessourcePhytogenetique ressourcePhytogenetique) {
		getRessourcePhytogenetiques().add(ressourcePhytogenetique);
		ressourcePhytogenetique.setCaracAnatomique(this);

		return ressourcePhytogenetique;
	}

	public RessourcePhytogenetique removeRessourcePhytogenetique(RessourcePhytogenetique ressourcePhytogenetique) {
		getRessourcePhytogenetiques().remove(ressourcePhytogenetique);
		ressourcePhytogenetique.setCaracAnatomique(null);

		return ressourcePhytogenetique;
	}

}