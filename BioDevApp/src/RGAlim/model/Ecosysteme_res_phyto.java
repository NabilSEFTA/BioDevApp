package RGAlim.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the "Ecosysteme_res_phyto" database table.
 * 
 */
@Entity
@Table(name="\"RG\".\"Ecosysteme_res_phyto\"")
@NamedQuery(name="Ecosysteme_res_phyto.findAll", query="SELECT e FROM Ecosysteme_res_phyto e")
public class Ecosysteme_res_phyto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ecosysteme")
	private Integer idEcosysteme;

	@Column(name="d_ph")
	private String dPh;

	@Column(name="degr�_gravit�")
	private String degr�Gravit�;

	@Column(name="degr�_radiation")
	private String degr�Radiation;

	@Column(name="ions_miniraux")
	private String ionsMiniraux;

	@Column(name="q_co2")
	private String qCo2;

	@Column(name="q_eau")
	private String qEau;

	@Column(name="q_oxygene")
	private String qOxygene;

	@Column(name="\"Temp�rature\"")
	private String temp�rature;



	public Ecosysteme_res_phyto() {
	}

	public Integer getIdEcosysteme() {
		return this.idEcosysteme;
	}

	public void setIdEcosysteme(Integer idEcosysteme) {
		this.idEcosysteme = idEcosysteme;
	}

	public String getdPh() {
		return dPh;
	}

	public void setdPh(String dPh) {
		this.dPh = dPh;
	}

	public String getDegr�Gravit�() {
		return degr�Gravit�;
	}

	public void setDegr�Gravit�(String degr�Gravit�) {
		this.degr�Gravit� = degr�Gravit�;
	}

	public String getDegr�Radiation() {
		return degr�Radiation;
	}

	public void setDegr�Radiation(String degr�Radiation) {
		this.degr�Radiation = degr�Radiation;
	}

	public String getIonsMiniraux() {
		return ionsMiniraux;
	}

	public void setIonsMiniraux(String ionsMiniraux) {
		this.ionsMiniraux = ionsMiniraux;
	}

	public String getqCo2() {
		return qCo2;
	}

	public void setqCo2(String qCo2) {
		this.qCo2 = qCo2;
	}

	public String getqEau() {
		return qEau;
	}

	public void setqEau(String qEau) {
		this.qEau = qEau;
	}

	public String getqOxygene() {
		return qOxygene;
	}

	public void setqOxygene(String qOxygene) {
		this.qOxygene = qOxygene;
	}

	public String getTemp�rature() {
		return temp�rature;
	}

	public void setTemp�rature(String temp�rature) {
		this.temp�rature = temp�rature;
	}

	


}