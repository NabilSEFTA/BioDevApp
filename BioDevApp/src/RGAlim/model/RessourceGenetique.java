package RGAlim.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import RGAlim.model.Utilisateur;



/**
 * The persistent class for the "RessourceGenetique" database table.
 * 
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="categorie")
@Table(name="\"RG\".\"RessourceGenetique\"")

public  class RessourceGenetique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="\"ID\"")
	private Integer id;

	private String description;

	@Column(name="id_cta")
	private Integer idCta;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="\"RG\"."+"\"RessourceGenetique_rgclassification\"",
		joinColumns={@JoinColumn(name="\"id_RG\"",referencedColumnName="\"ID\"")},
			inverseJoinColumns={
					@JoinColumn(name="id_rgclassification",referencedColumnName="id")})
	private List<Rgclassification> rgclassification;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="utilisateur")
	private Utilisateur utilisateur;
	
	private String image;

	@Column(name="nom_amazigh")
	private String nomAmazigh;
	
	@Column (name ="\"nom_francais\"")
	private String nomFrancais;

	@Column(name="nom_arabe")
	private String nomArabe;

	@Column(name="nom_latin")
	private String nomLatin;

	private Integer nombre;
	
	@Column(name="categorie")
	private String categorie;

	private boolean validee ;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="\"RG\"."+"concerner",
		joinColumns={@JoinColumn(name="id_ressource",referencedColumnName="\"ID\"")},
			inverseJoinColumns={
					@JoinColumn(name="id_ecosysteme",referencedColumnName="id_ecosysteme")})
	private List<Ecosysteme_res_phyto> ecosystemeResPhytos;

	//bi-directional many-to-many association to Geolocalisation
	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable(
		name="\"RG\"."+"localisation"
		, joinColumns={@JoinColumn(name="id_ressource",referencedColumnName="\"ID\"")

			}
		, inverseJoinColumns={
			@JoinColumn(name="\"id_geoLocalisation\"",referencedColumnName="id_geolocalisation")
			}
		)
	private List<Geolocalisation> geolocalisations;
	
	public RessourceGenetique() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getNomFrancais() {
		return nomFrancais;
	}

	public void setNomFrancais(String nomFrançais) {
		this.nomFrancais = nomFrançais;
	}

	public boolean isValidee() {
		return validee;
	}

	public void setValidee(boolean validee) {
		this.validee = validee;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIdCta() {
		return this.idCta;
	}

	public void setIdCta(Integer idCta) {
		this.idCta = idCta;
	}

	public List<Rgclassification> getRgclassification() {
		return this.rgclassification;
	}

	public void setRgclassification(List<Rgclassification> idRgclassification) {
		this.rgclassification = idRgclassification;
	}

	/*public Utilisateur getIdUtilisateur() {
		return this.utilisateur;
	}

	public void setIdUtilisateur(Utilisateur idUtilisateur) {
		this.utilisateur = idUtilisateur;
	}*/

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNomAmazigh() {
		return this.nomAmazigh;
	}

	public void setNomAmazigh(String nomAmazigh) {
		this.nomAmazigh = nomAmazigh;
	}

	public String getNomArabe() {
		return this.nomArabe;
	}

	public void setNomArabe(String nomArabe) {
		this.nomArabe = nomArabe;
	}

	public String getNomLatin() {
		return this.nomLatin;
	}

	public void setNomLatin(String nomLatin) {
		this.nomLatin = nomLatin;
	}

	public Integer getNombre() {
		return this.nombre;
	}

	public void setNombre(Integer nombre) {
		this.nombre = nombre;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public List<Ecosysteme_res_phyto> getEcosystemeResPhytos() {
		return this.ecosystemeResPhytos;
	}
	
	public void setEcosystemeResPhytos(List<Ecosysteme_res_phyto> ecosystemeResPhytos) {
		this.ecosystemeResPhytos = ecosystemeResPhytos;
	}
	
	public List<Geolocalisation> getGeolocalisations() {
		return this.geolocalisations;
	}
	
	public void setGeolocalisations(List<Geolocalisation> geolocalisations) {
		this.geolocalisations = geolocalisations;
	}



}