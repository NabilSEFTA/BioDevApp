package RGAlim.model;

import java.util.Comparator;

public class sortById implements Comparator<Rgclassification> {

	@Override
	public int compare(Rgclassification arg0, Rgclassification arg1) {
		// TODO Auto-generated method stub
		return arg0.getParentPath().length() - arg1.getParentPath().length();
	}

}
