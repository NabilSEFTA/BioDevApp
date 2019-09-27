package business;

import javax.persistence.Entity;

@Entity
public class PermisTransfert extends Permis {
	private String TranType;
	private String TranPoint;
	
	
	public PermisTransfert() {
		super();
	}


	public String getTranType() {
		return TranType;
	}


	public void setTranType(String tranType) {
		TranType = tranType;
	}


	public String getTranPoint() {
		return TranPoint;
	}


	public void setTranPoint(String tranPoint) {
		TranPoint = tranPoint;
	}
	
	
	
	
	

}
