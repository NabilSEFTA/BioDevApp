package RGAlim.users;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import RGAlim.model.Utilisateur;

public interface utilisateurDAO {
		public Utilisateur trouverUtilisateur ( String pseudo) throws IOException,ClassNotFoundException;
		public void ajouterUtilisateur (Utilisateur utilisateur)throws IOException,ClassNotFoundException;
		public void supprimerUtilisateur (String courriel)throws IOException,ClassNotFoundException;
		public Map<String,Utilisateur> listerUtilisateur ()throws IOException,ClassNotFoundException;
}
