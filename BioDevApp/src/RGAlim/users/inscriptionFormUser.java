package RGAlim.users;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.jasypt.util.password.ConfigurablePasswordEncryptor;

import RGAlim.model.LocalisationUtilisateur;
import RGAlim.model.Utilisateur;

public final class inscriptionFormUser extends connexionForm{
	private static final String CHAMP_CODEUTILISATEUR = "codeutilisateur";
	private static final String CHAMP_NOM ="nom";
	private static final String CHAMP_PRENOM = "prenom";
	private static final String CHAMP_EMAIL = "email";
	private static final String CHAMP_PASS = "motdepasse";
	private static final String CHAMP_PSEUDO = "pseudo";
	private static final String CHAMP_PHONE = "phone"; 
	private static final String CHAMP_DATEDENAISSANECE = "datedenaissance";
	private static final String CHAMP_VILLE = "ville";
	private static final String CHAMP_CODEPOSTAL = "codepostal";
	private static final String CHAMP_PAYS = "pays";
	private static final String CHAMP_ADRESSE = "adresse";
	
	
	public Utilisateur creerUtilisateur (HttpServletRequest request) throws ParseException {
		String nom = getValeurChamp( request, CHAMP_NOM );
		String prenom = getValeurChamp(request, CHAMP_PRENOM);
		String pseudo = getValeurChamp(request, CHAMP_PSEUDO);
		String email = getValeurChamp( request, CHAMP_EMAIL );
		String MotdePasse = getValeurChamp(request, CHAMP_PASS);
		String phone = getValeurChamp(request,	 CHAMP_PHONE);
		String datedenaissance = getValeurChamp(request, CHAMP_DATEDENAISSANECE);
		String ville = getValeurChamp(request, CHAMP_VILLE);
		String codepostal = getValeurChamp(request, CHAMP_CODEPOSTAL);
		String pays = getValeurChamp(request, CHAMP_PAYS);
		String adresse = getValeurChamp(request, CHAMP_ADRESSE);
		Utilisateur user = new Utilisateur();
		
		try {
			verifNom(nom);
			//System.out.println("nom validé");
		} catch (Exception e) {
			getErreurs().put(CHAMP_NOM, e.getMessage());
		}
		user.setNom (nom);
		user.setPrenom(prenom);
		try {
			verifPseudo(pseudo);
			//System.out.println(pseudo);
			//System.err.println("pseudo validé");
			
			//System.out.println("pseudo validé 2");
		} catch (Exception e) {
			
			getErreurs().put(CHAMP_PSEUDO, e.getMessage());
			
			}
		user.setPseudo(pseudo);
		try {
			
			validationEmail(email);
			System.out.println("mail validé");
			verifExistUserFile(email);
			
		} catch (Exception e) {
			getErreurs().put(CHAMP_EMAIL, e.getMessage());
		}
		user.setCourriel(email);
		System.out.println(user.getCourriel());
		try {
			validationMotDePasse(MotdePasse);
			
			//System.out.println("mot de passe valdié");
		} catch (Exception e) {
			getErreurs().put(CHAMP_PASS, e.getMessage());
		}
		try{ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();
		user.setMotDePasse(passwordEncryptor.encryptPassword(MotdePasse));}
		catch (Exception e) {e.getStackTrace();}
		//user.setMotDePasse(MotdePasse);
		try {
			//verifPhoneNumber(phone);
		} catch (Exception e) {
			getErreurs().put(CHAMP_PHONE, e.getMessage());
		}
		try {
			user.setValidee(false);
			user.setPhoneNumber(phone);
			user.setCategorie("1");
			//date d'inscription
			long millis = System.currentTimeMillis();  
			java.sql.Date date=new java.sql.Date(millis);  
			user.setDateInscription(date);
			//System.out.println("j'ai rajouté la date d'inscription");
			//date de naissance
			//System.out.println(datedenaissance);
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			//System.out.println(sdf1);
			java.util.Date date2 = sdf1.parse(datedenaissance);
			//System.out.println(date2);
			java.sql.Date sqlStartDate = new java.sql.Date(date2.getTime()); 
			//System.out.println(sqlStartDate);
			user.setDateNaissance(sqlStartDate);
			//System.out.println("j'ai rajouté la date de naissance");
			//localisation utilisateur;
			LocalisationUtilisateur localisation = new LocalisationUtilisateur();
			System.out.println("jai initialisé localisation");
			localisation.setAdresse(adresse);
			localisation.setCodepostal(codepostal);
			localisation.setPays(pays);
			localisation.setVille(ville);
			System.out.println("jai 'initialisé les parametres");
			//ajouter l'utilisateur
			List <Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
			utilisateurs.add(user);
			System.out.println("jai rajouté lutilisateur dans localisation");
			localisation.setUtilisateurs(utilisateurs);
			List <LocalisationUtilisateur> localisationUtilisateurs = new ArrayList<LocalisationUtilisateur>();
			localisationUtilisateurs.add(localisation);
			user.setLocalisationUtilisateurs(localisationUtilisateurs);
			System.out.println("jai rajouté localisation dans utilisateur");	
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		return user;
	}
	private void verifNom (String Nom) throws Exception {
	    if ( Nom == null || Nom.trim().length() < 3 ) {
	        throw new Exception( "Le nom d'utilisateur doit contenir au moins 3 caractères." );
	    }
	} 
	private void verifPseudo (String Pseudo) throws Exception {
		if (Pseudo == null || Pseudo.trim().length() < 5){
	        throw new Exception( "Le pseudo utilisateur doit contenir au moins 5 caractères." );
	    }
	}
	private void verifPhoneNumber (String phone) throws Exception{
		if (!phone.matches("((\\+*)((0[ -]+)*|(91 )*)(\\d{12}+|\\d{10}+))|\\d{5}([- ]*)\\d{6}")) {
			throw new Exception("Saisissez un numero de téléphone valide !");
		}
	}
	private void verifIdClient (int Idclinet) throws Exception  {
		if (Idclinet < 100000000)throw new Exception ("le numero de la carte d'identité doit comporter au moins 5 chiffres !");
	}
	private void verifExistUserFile (String courriel) throws Exception {
		System.out.println("je teste est ce que ça existe");
		UtilisateurDAOImpSimple dao = new UtilisateurDAOImpSimple();
		//if (dao.getEm1() == null) {System.out.println("hya");}
		dao.getEm1().getTransaction().begin(); 
		//System.out.println("j'ai crée le dao");
		Utilisateur utilisateur = dao.trouverUtilisateur(courriel);
		//System.out.println(utilisateur.getMotDePasse()); 
		dao.getEm1().close();
		if (utilisateur != null) {throw new Exception ("Utilisateur existe déja !");}
		
	}

	
}
