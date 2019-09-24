package RGAlim.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "Utilisateur" database table.
 * 
 */
@Entity
@Table(name="\"RG\".\"Utilisateur\"")

@NamedQuery(name="Utilisateur.find", query="SELECT u FROM Utilisateur u where  u.courriel = :courriel")
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String courriel;

	private String categorie;

	@Temporal(TemporalType.DATE)
	@Column(name="\"dateInscription\"")
	private Date dateInscription;

	@Temporal(TemporalType.DATE)
	@Column(name="\"dateNaissance\"")
	private Date dateNaissance;

	@Column(name="\"Id_client\"")
	private Long id_client;

	@Column(name="\"motDePasse\"")
	private String motDePasse;

	private String nom;

	private Boolean permis;

	@Column(name="\"phoneNumber\"")
	private String phoneNumber;

	private String prenom;

	private String pseudo;

	private Boolean validee;

	//bi-directional many-to-one association to RessourceGenetique
	
	
	//bi-directional many-to-many association to LocalisationUtilisateur
	@ManyToMany(mappedBy="utilisateurs",cascade = CascadeType.ALL)
	private List<LocalisationUtilisateur> localisationUtilisateurs;

	public Utilisateur() {
	}

	public String getCourriel() {
		return this.courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public Date getDateInscription() {
		return this.dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Long getId_client() {
		return this.id_client;
	}

	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}

	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Boolean getPermis() {
		return this.permis;
	}

	public void setPermis(Boolean permis) {
		this.permis = permis;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPseudo() {
		return this.pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Boolean getValidee() {
		return this.validee;
	}

	public void setValidee(Boolean validee) {
		this.validee = validee;
	}

	

	public List<LocalisationUtilisateur> getLocalisationUtilisateurs() {
		return this.localisationUtilisateurs;
	}

	public void setLocalisationUtilisateurs(List<LocalisationUtilisateur> localisationUtilisateurs) {
		this.localisationUtilisateurs = localisationUtilisateurs;
	}

}