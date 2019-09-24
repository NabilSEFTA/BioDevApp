package RGMarines;

import java.awt.Point;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name ="LocalisationMarine")
@Table(name="\"RG\".\"LocalisationMarine\"")

@NamedQuery(name="LocalisationMarine.find", query="SELECT u FROM LocalisationMarine u WHERE  u.id_localisation_marine = :id_lm")

public class LocalisationMarine implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id_localisation_marine;
	
	@Column
	private String region;
	
	@Column
	private String ville;
	
	@Column
	private String wilaya;
	
	@Column
	private Point position;
	
	@Column
	private Float altitude;
	
	/*-------------------------------------*/
	public LocalisationMarine() {
		
	}
	/*-------------------------------------*/
	
	public Integer getId_localisation_marine() {
		return id_localisation_marine;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getWilaya() {
		return wilaya;
	}

	public void setWilaya(String wilaya) {
		this.wilaya = wilaya;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Float getAltitude() {
		return altitude;
	}

	public void setAltitude(Float altitude) {
		altitude = altitude;
	}
	
	
	
}
