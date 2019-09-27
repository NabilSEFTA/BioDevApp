package RGforest;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name ="ecosysteme_forest")
@Table(name="\"RG\".\"ecosysteme_forest\"")

@NamedQuery(name="EcosystemeForestiere.find", query="SELECT u FROM ecosysteme_forest u WHERE  u.id_ecosys_forest = :id_ef")

public class EcosystemeForestiere implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id_ecosys_forest;
	
	@Column
	private Float q_co2;
	
	@Column
	private Float q_o2;
	
	@Column
	private Float q_eau;
	
	@Column
	private String ph;
	
	@Column
	private String temperature;
	
	@Column
	private String lumiere;
	
	@Column
	private String gravite;
	
	

	public Integer getId_ecosys_forest() {
		return id_ecosys_forest;
	}

	public Float getQ_co2() {
		return q_co2;
	}

	public void setq_co2(Float q_co2) {
		this.q_co2 = q_co2;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	
	public String getLumiere() {
		return lumiere;
	}

	public void setLumiere(String lumiere) {
		this.lumiere = lumiere;
	}

	public String getGravite() {
		return gravite;
	}

	public void setGravite(String gravite) {
		this.gravite = gravite;
	}

	public Float getQ_o2() {
		return q_o2;
	}

	public void setQ_o2(Float q_o2) {
		this.q_o2 = q_o2;
	}
	
	public Float getQ_eau() {
		return q_eau;
	}

	public void setQ_eau(Float q_eau) {
		this.q_eau = q_eau;
	}
	
	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}
	
	
}
