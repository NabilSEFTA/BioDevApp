package RGAlim;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.plaf.synth.SynthSliderUI;

import org.jasypt.util.password.ConfigurablePasswordEncryptor;



public class ConnexionSuperUser {
	
	private static final String Pseudo_db = "pseudo_db";
	private static final String motDePasse_db = "motdepasse_db";
	private static  EntityManagerFactory emf ;
	private static  EntityManager entityManager;
	private static  Map<String, String> properties;
	private  Map<String,String> erreurs = new HashMap<String,String>();;
	private static void connexionBaseDeDonnee (String admin, String motDePasse) {
		  properties  = new HashMap<String , String>();
		  properties.put("javax.persistence.jdbc.user", admin);
		  properties.put("javax.persistence.jdbc.password", motDePasse);
		  properties.put("javax.persistence.jdbc.url", "jdbc:postgresql://localhost:5432/RGTech");
		//  System.out.println("je suis");
		  emf = Persistence.createEntityManagerFactory("BioDevApp",properties);
		  entityManager = emf.createEntityManager();
	
	}
	public void loginSuperUser (String pseudo, String MotDePasse) {
		verifIdentifiant(pseudo, MotDePasse);
		if (erreurs.isEmpty())
		connexionBaseDeDonnee(pseudo, MotDePasse);
	}
	
	public static EntityManagerFactory getEmf() {
		return emf;
	}
	private void verifIdentifiant(String identifiant,String motDePasse) {
		final Properties prop = new Properties();
		InputStream input = null;
		String user = "";
		String password = "" ;
		boolean isOK = false;

		try {

			input =  this.getClass().getClassLoader()
                    .getResourceAsStream("RGAlim/config.properties");
			System.out.println(input==null); 
			prop.load(input);
			user = prop.getProperty("db.user");
			password = prop.getProperty("db.password");

		} catch (final IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (final IOException e) {
					e.printStackTrace();
				}
			}
		}
		try {
			verifPseudo(user, identifiant);
		} catch (Exception e) {
			erreurs.put(Pseudo_db, e.getMessage());
		}
		try {
			verifPassword(password, motDePasse);
		} catch (Exception e) {
			erreurs.put(motDePasse_db, e.getMessage());
		}
	}
	public Map<String, String> getErreurs() {
		return erreurs;
	}
	public static EntityManager createEntityManager () {
		return entityManager;
	} 
	private void verifPassword (String passwd, String InputPasswd) throws Exception {
		ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();
		passwordEncryptor.setPlainDigest( false );
		boolean isOK = passwordEncryptor.checkPassword( InputPasswd,passwd );
		if (!isOK) throw new Exception ("Mot de passe invalide");
		
	}
	private void verifPseudo (String Pseudo, String InputPseudo) throws Exception {
		System.out.println(Pseudo+","+ InputPseudo);
		System.out.println(Pseudo.equals(InputPseudo));
		if (!Pseudo.equals(InputPseudo))throw new Exception("Identifiant Invalide") ; 
	}

	
}
