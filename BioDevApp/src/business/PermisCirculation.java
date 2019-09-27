package business;

import java.util.Date;

import javax.persistence.Entity;


@Entity
public class PermisCirculation extends Permis{
	
	
	private String CirMoyTransport;
	private String CirItineraire;
	
	public PermisCirculation() {
		super();
	}
	

	public PermisCirculation(String moyTransport, String itineraire) {
		super();
		this.CirMoyTransport = moyTransport;
		this.CirItineraire = itineraire;
	}


	public String getCirMoyTransport() {
		return CirMoyTransport;
	}


	public void setCirMoyTransport(String cirMoyTransport) {
		CirMoyTransport = cirMoyTransport;
	}


	public String getCirItineraire() {
		return CirItineraire;
	}


	public void setCirItineraire(String cirItineraire) {
		CirItineraire = cirItineraire;
	}
	
}
