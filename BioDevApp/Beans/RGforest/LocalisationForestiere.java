package RGforest;

import java.awt.Point;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name ="localisation_forestiere")
@Table(name="\"RG\".\"localisation_forestiere\"")

@NamedQuery(name="LocalisationForestiere.find", query="SELECT u FROM localisation_forestiere u WHERE  u.id_localisation_forestiere = :id_lf")

public class LocalisationForestiere implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id_localisation_forestiere;
	
	@Column
	private String region;
	
	@Column
	private String ville;
	
	@Column
	private String wilaya;
	
	@Column
	private Point position;
	
	/*-------------------------------------*/
	public LocalisationForestiere() {
		
	}
	/*-------------------------------------*/
	
	public Integer getId_localisation_forestiere() {
		return id_localisation_forestiere;
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
	
}
