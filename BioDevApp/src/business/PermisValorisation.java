package business;

import javax.persistence.Entity;

@Entity
public class PermisValorisation extends Permis {
	
	private String ValDestProduit;
	private String ValMarche;
	
	
	public PermisValorisation() {
		super();
	}
	public String getValDestProduit() {
		return ValDestProduit;
	}
	public void setValDestProduit(String valDestProduit) {
		ValDestProduit = valDestProduit;
	}
	public String getValMarche() {
		return ValMarche;
	}
	public void setValMarche(String valMarche) {
		ValMarche = valMarche;
	}
	

	
}
