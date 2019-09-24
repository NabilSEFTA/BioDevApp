package RGAlim.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the phane database table.
 * 
 */
@Entity
@Table(name="\"RG\".phane")
@NamedQuery(name="Phane.findAll", query="SELECT p FROM Phane p")
public class Phane implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_phan")
	private Integer idPhan;

	@Column(name="carac_feuille")
	private String caracFeuille;

	@Column(name="carac_tige")
	private String caracTige;

	@Column(name="descrip_port")
	private String descripPort;



	public Phane() {
	}

	public Integer getIdPhan() {
		return this.idPhan;
	}

	public void setIdPhan(Integer idPhan) {
		this.idPhan = idPhan;
	}

	public String getCaracFeuille() {
		return this.caracFeuille;
	}

	public void setCaracFeuille(String caracFeuille) {
		this.caracFeuille = caracFeuille;
	}

	public String getCaracTige() {
		return this.caracTige;
	}

	public void setCaracTige(String caracTige) {
		this.caracTige = caracTige;
	}

	public String getDescripPort() {
		return this.descripPort;
	}

	public void setDescripPort(String descripPort) {
		this.descripPort = descripPort;
	}





}