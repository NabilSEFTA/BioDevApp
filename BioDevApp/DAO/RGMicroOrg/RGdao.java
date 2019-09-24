package RGMicroOrg;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import RGAlim.model.Utilisateur;




public class RGdao {
    private Connection connexion;
   
 
    public List<RGbean> recupererRG() {
        List<RGbean> rgml = new ArrayList<RGbean>();
        Statement statement = null;
        ResultSet resultat = null;
  
        loadDatabase();
        
        try {
            statement = connexion.createStatement();
          
            // Exécution de la requête
            resultat = statement.executeQuery("SELECT nom_latin, nom_arabe, nom_amazigh, description, presence_noyau, validee, utilisateur, emplacement_adn, image, ecosys, pathogenie, respiration, forme, reproduction FROM \"RG\".\"RessourceMicroOrg\";"); 
        
            // Récupération des données
            while (resultat.next()) {
                String nom_latin = resultat.getString("nom_latin");
                String nom_arabe = resultat.getString("nom_arabe");
                String nom_amazigh = resultat.getString("nom_amazigh");
                String description = resultat.getString("description");
                boolean presence_noyau = resultat.getBoolean("presence_noyau");
                String utilisateur = resultat.getString("utilisateur");
                String emplacement_adn = resultat.getString("emplacement_adn");
                String image = resultat.getString("image");
                String ecosys = resultat.getString("ecosys");
                String pathogenie = resultat.getString("pathogenie");
                String respiration = resultat.getString("respiration");
                String forme = resultat.getString("forme");
                String reproduction = resultat.getString("reproduction");
        
                
                
                
                RGbean RGM = new RGbean();
                RGM.setNom_latin(nom_latin);
                RGM.setNom_arabe(nom_arabe);
                RGM.setNom_amazigh(nom_amazigh);
                RGM.setDescription(description);
                RGM.setPresence_noyau(presence_noyau);
                RGM.setUtilisateur(utilisateur);
                RGM.setEmplacement_adn(emplacement_adn);                
                RGM.setImage(image);
                RGM.setEcosys(ecosys);
                RGM.setPathogenie(pathogenie);
                RGM.setRespiration(respiration);
                RGM.setForme(forme);
                RGM.setReproduction(reproduction);
                rgml.add(RGM);
            }
        } catch (SQLException e) {
        } finally {
            // Fermeture de la connexion
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (connexion != null)
                    connexion.close();
            } catch (SQLException ignore) {
            }
        }
        
        return rgml;
    }
    
    private void loadDatabase() {
        // Chargement du driver
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            connexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RGTech", "postgres", "postgres");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void ajouterRGM(RGbean RGM) {
        loadDatabase();
        
        try {
        	//SELECT nom_latin, nom_arabe, nom_amazigh, description, presence_noyau, validee, utilisateur, emplacement_adn, id_rg, id_classification, image, ecosys, pathogenie, respiration, forme, reproduction FROM \"RG\".\"RessourceMicroOrg\";"); 
            
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO \"RG\".\"RessourceMicroOrg\"(nom_latin, nom_arabe, nom_amazigh, description, presence_noyau, validee, utilisateur, emplacement_adn, image, ecosys, pathogenie, respiration, forme, reproduction)  VALUES ( ?, ?, ?, ?, ?, FALSE, ?, ?, ?, ?, ?, ?, ?, ?);");

            preparedStatement.setString(1, RGM.getNom_latin());
            preparedStatement.setString(2, RGM.getNom_arabe());
            preparedStatement.setString(3, RGM.getNom_amazigh());
            preparedStatement.setString(4, RGM.getDescription());
            preparedStatement.setBoolean(5, RGM.isPresence_noyau());
            preparedStatement.setString(6, RGM.getUtilisateur());
            preparedStatement.setString(7, RGM.getEmplacement_adn()); 
            preparedStatement.setString(8, RGM.getImage());
            preparedStatement.setString(9, RGM.getEcosys());
            preparedStatement.setString(10, RGM.getPathogenie());
            preparedStatement.setString(11, RGM.getRespiration());
            preparedStatement.setString(12, RGM.getForme());
            preparedStatement.setString(13, RGM.getReproduction());   

            preparedStatement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    
    }
    
}