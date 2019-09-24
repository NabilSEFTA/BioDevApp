package RGAlim.model;

import java.io.Serializable;
import javax.persistence.*;

import org.postgresql.geometric.PGpoint;

import java.util.List;


/**
 * The persistent class for the geolocalisation database table.
 * 
 */
@Entity
@Table (name ="\"RG\"."+"geolocalisation")
@NamedQuery(name="Geolocalisation.findAll", query="SELECT g FROM Geolocalisation g")
public class Geolocalisation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_geolocalisation")
	private Integer idGeolocalisation;
	private double longitude;
	private double latitude;
	private String region;

	private String ville;

	private String wilaya;

	//bi-directional many-to-many association to RessourcePhytogenetique
	@ManyToMany(mappedBy="geolocalisations",cascade = CascadeType.ALL)
	private List<RessourcePhytogenetique> ressourcePhytogenetiques;

	public Geolocalisation() {
	}

	public Integer getIdGeolocalisation() {
		return this.idGeolocalisation;
	}

	public void setIdGeolocalisation(Integer idGeolocalisation) {
		this.idGeolocalisation = idGeolocalisation;
	}

	

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getWilaya() {
		return this.wilaya;
	}

	public void setWilaya(String wilaya) {
		this.wilaya = wilaya;
	}

	public List<RessourcePhytogenetique> getRessourcePhytogenetiques() {
		return this.ressourcePhytogenetiques;
	}

	public void setRessourcePhytogenetiques(List<RessourcePhytogenetique> ressourcePhytogenetiques) {
		this.ressourcePhytogenetiques = ressourcePhytogenetiques;
	}

}