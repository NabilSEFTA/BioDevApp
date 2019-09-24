package RGAlim;

public class ConnexionCompteur {
	private static int compteur = 0; 
	public static void incCpt () {
		compteur++;
	}
	public static void decCpt() {
		compteur--;
	}
	public static int getCpt() {
		return compteur;
	}
}
