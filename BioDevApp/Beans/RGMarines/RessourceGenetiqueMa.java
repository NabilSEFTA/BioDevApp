package RGMarines;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name ="RessourceGenetiqueMa")
@Table(name="\"RG\".\"RessourceGenetique\"")

@NamedQuery(name="RessourceGenetiqueMa.find", query="SELECT u FROM RessourceGenetiqueMa u WHERE  u.id = :id_RessourceMarine")

public class RessourceGenetiqueMa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="\"ID\"")
	private int id;
	
	@Column
	private String nom_latin;
	
	@Column
	private String nom_arabe;
	
	@Column
	private String nom_amazigh;
	
	@Column
	private String nom_francais;
	
	@Column
	private String description;
	
	@Column
	private Integer nombre;
	
	@Column
	private String image;
	
	@Column
	private String categorie;
	
	@Column
	private Boolean validee;
	
	@Column
	private String utilisateur;
	
	@Column
	private Integer id_cta;
	
	/*-------------------------------------------------*/
	public RessourceGenetiqueMa() {
		
	}
	/*-------------------------------------------------*/

	public int getId() {
		return id;
	}

	public String getNom_latin() {
		return nom_latin;
	}

	public void setNom_latin(String nom_latin) {
		this.nom_latin = nom_latin;
	}

	public String getNom_arabe() {
		return nom_arabe;
	}

	public void setNom_arabe(String nom_arabe) {
		this.nom_arabe = nom_arabe;
	}

	public String getNom_amazigh() {
		return nom_amazigh;
	}

	public void setNom_amazigh(String nom_amazigh) {
		this.nom_amazigh = nom_amazigh;
	}

	public String getNom_francais() {
		return nom_francais;
	}

	public void setNom_francais(String nom_francais) {
		this.nom_francais = nom_francais;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public boolean isValidee() {
		return validee;
	}

	public void setValidee(boolean validee) {
		this.validee = validee;
	}

	public String getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

	public int getId_cta() {
		return id_cta;
	}

	public void setId_cta(int id_cta) {
		this.id_cta = id_cta;
	}
	
	
	
	
	
}
