package business;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table (name = "permis", schema = "\"RG\"")
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Permis implements Comparable< Permis > {
	
	@Id @GeneratedValue( strategy=GenerationType.IDENTITY )
	private int id;
	private String nature;
	private String duree;
	@Temporal(TemporalType.DATE)
	private Date dateOperation;
	private String operateur;
	private String Quant;
	private String etat;
	private String type;
	
	//@ManyToOne 
    //@JoinColumn
    private String demandeur;
	
	public String getDemandeur() {
		return demandeur;
	}
	public void setDemandeur(String demandeur) {
		this.demandeur = demandeur;
	}
	public int getId() {
		return id;
	}
	public Permis () {
		this( "", "",new Date(), "" , "","","");
	}
	public Permis(String nature, String duree, Date dateOperation, String operateur, String quant,String etat,String demandeur) {
		super();
		this.nature = nature;
		this.duree = duree;
		this.dateOperation = dateOperation;
		this.operateur = operateur;
		this.Quant = quant;
		this.etat=etat;
		this.demandeur = demandeur;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getOperateur() {
		return operateur;
	}
	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
	public String getQuant() {
		return Quant;
	}
	public void setQuant(String quant) {
		Quant = quant;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
    public int compareTo(Permis o) {
        return Integer.compare(this.getId(), o.getId());
    } 	 	
	

}
