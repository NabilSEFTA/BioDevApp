package RGAlim.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the "RessourcePhytogenetique" database table.
 * 
 */
@Entity
@PrimaryKeyJoinColumn(name="id_rg")
@Table(name="\"RG\"."+"\"RessourcePhytogenetique\"")
@NamedQuery(name="RessourcePhytogenetique.findAll", query="SELECT r FROM RessourcePhytogenetique r")
public class RessourcePhytogenetique extends RessourceGenetique implements Serializable {
	private static final long serialVersionUID = 1L;

	private String arrosage;

	@Column(name="hauteur_maturit�")
	private String hauteurMaturit�;

	@Column(name="id_rg")
	private Integer idRg;

	@Column(name="largeur_maturit�")
	private String largeurMaturit�;

	@Column(name="niveau_soin")
	private String niveauSoin;

	@Column(name="periode_floraison")
	private String periodeFloraison;

	private String rusticite;

	@Column(name="saison_interet")
	private String saisonInteret;

	@Column(name="utilisation_en_jardin")
	private String utilisationEnJardin;

	//bi-directional many-to-one association to CaracAnatomique
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="id_anatomique")
	private CaracAnatomique caracAnatomique;

	//bi-directional many-to-one association to CaracMorphologique
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="id_morphologique")
	private CaracMorphologique caracMorphologique;

	public RessourcePhytogenetique() {
	}



	public String getArrosage() {
		return this.arrosage;
	}

	public void setArrosage(String arrosage) {
		this.arrosage = arrosage;
	}

	public String getHauteurMaturit�() {
		return this.hauteurMaturit�;
	}

	public void setHauteurMaturit�(String hauteurMaturit�) {
		this.hauteurMaturit� = hauteurMaturit�;
	}

	public Integer getIdRg() {
		return this.idRg;
	}

	public void setIdRg(Integer idRg) {
		this.idRg = idRg;
	}

	public String getLargeurMaturit�() {
		return this.largeurMaturit�;
	}

	public void setLargeurMaturit�(String largeurMaturit�) {
		this.largeurMaturit� = largeurMaturit�;
	}

	public String getNiveauSoin() {
		return this.niveauSoin;
	}

	public void setNiveauSoin(String niveauSoin) {
		this.niveauSoin = niveauSoin;
	}

	public String getPeriodeFloraison() {
		return this.periodeFloraison;
	}

	public void setPeriodeFloraison(String periodeFloraison) {
		this.periodeFloraison = periodeFloraison;
	}

	public String getRusticite() {
		return this.rusticite;
	}

	public void setRusticite(String rusticite) {
		this.rusticite = rusticite;
	}

	public String getSaisonInteret() {
		return this.saisonInteret;
	}

	public void setSaisonInteret(String saisonInteret) {
		this.saisonInteret = saisonInteret;
	}

	public String getUtilisationEnJardin() {
		return this.utilisationEnJardin;
	}

	public void setUtilisationEnJardin(String utilisationEnJardin) {
		this.utilisationEnJardin = utilisationEnJardin;
	}

	public CaracAnatomique getCaracAnatomique() {
		return this.caracAnatomique;
	}

	public void setCaracAnatomique(CaracAnatomique caracAnatomique) {
		this.caracAnatomique = caracAnatomique;
	}

	public CaracMorphologique getCaracMorphologique() {
		return this.caracMorphologique;
	}

	public void setCaracMorphologique(CaracMorphologique caracMorphologique) {
		this.caracMorphologique = caracMorphologique;
	}

}