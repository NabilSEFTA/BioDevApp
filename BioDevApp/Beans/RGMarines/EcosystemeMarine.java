package RGMarines;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name ="EcosystemeMarine")
@Table(name="\"RG\".\"EcosystemeMarine\"")

@NamedQuery(name="EcosystemeMarine.find", query="SELECT u FROM EcosystemeMarine u WHERE  u.id_ecosys_marine = :id_em")

public class EcosystemeMarine implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id_ecosys_marine;
	
	@Column
	private Float qt_co2;
	
	@Column
	private Float qt_o2;
	
	@Column
	private Float temperature_mer;
	
	@Column
	private String salinite;

	public Integer getId_ecosys_marine() {
		return id_ecosys_marine;
	}

	public Float getQt_co2() {
		return qt_co2;
	}

	public void setQt_co2(Float qt_co2) {
		this.qt_co2 = qt_co2;
	}

	public Float getTemperature_mer() {
		return temperature_mer;
	}

	public void setTemperature_mer(Float temperature_mer) {
		this.temperature_mer = temperature_mer;
	}

	public String getSalinite() {
		return salinite;
	}

	public void setSalinite(String salinite) {
		this.salinite = salinite;
	}

	public Float getQt_o2() {
		return qt_o2;
	}

	public void setQt_o2(Float qt_o2) {
		this.qt_o2 = qt_o2;
	}
	
	
}
