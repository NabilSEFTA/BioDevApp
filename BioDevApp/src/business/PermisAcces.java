package business;

import javax.persistence.Entity;

@Entity
public class PermisAcces extends Permis {
	private String AccFormaliteSanitaire;
	private String AccPrecautions;
	private String AccPrescription;
	
	
	public PermisAcces() {
		super();
	}
	public String getAccFormaliteSanitaire() {
		return AccFormaliteSanitaire;
	}
	public void setAccFormaliteSanitaire(String accFormaliteSanitaire) {
		AccFormaliteSanitaire = accFormaliteSanitaire;
	}
	public String getAccPrecautions() {
		return AccPrecautions;
	}
	public void setAccPrecautions(String accPrecautions) {
		AccPrecautions = accPrecautions;
	}
	public String getAccPrescription() {
		return AccPrescription;
	}
	public void setAccPrescription(String accPrescription) {
		AccPrescription = accPrescription;
	}

}
