package RGAlim.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the localisation_utilisateur database table.
 * 
 */
@Entity
@Table(name="\"RG\".localisation_utilisateur")
@NamedQuery(name="LocalisationUtilisateur.findAll", query="SELECT l FROM LocalisationUtilisateur l")
public class LocalisationUtilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_localisation_client")
	private Integer idLocalisationClient;

	private String adresse;

	private String codepostal;

	private String pays;

	private String ville;

	//bi-directional many-to-many association to Utilisateur
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
		name="\"RG\".utilisateur_region"
		, joinColumns={
			@JoinColumn(name="id_localisation_client")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_utilisateur")
			}
		)
	private List<Utilisateur> utilisateurs;

	public LocalisationUtilisateur() {
	}

	public Integer getIdLocalisationClient() {
		return this.idLocalisationClient;
	}

	public void setIdLocalisationClient(Integer idLocalisationClient) {
		this.idLocalisationClient = idLocalisationClient;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodepostal() {
		return this.codepostal;
	}

	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}

	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}