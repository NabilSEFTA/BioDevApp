package RGFaune;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import RGAlim.model.Utilisateur;




public class CTAdao {
    private Connection connexion;
   
   
    public List<CTAbean> recupererCTA() {
        List<CTAbean> ctas = new ArrayList<CTAbean>();
        Statement statement = null;
        ResultSet resultat = null;
       // Statement statement2 = null;
       // ResultSet resultat2 = null;

        loadDatabase();
        
        try {
            statement = connexion.createStatement();
           // statement2 = connexion.createStatement();
            // Exécution de la requête
            resultat = statement.executeQuery("SELECT intitule, description, proprietaire, brevet, region, preparation FROM \"RG\".\"CTA\";");
          //  resultat2 = statement.executeQuery("SELECT COUNT(*) as nb FROM \"RG\".\"CTA\";");
          //  generatedId = resultat2.getInt(0) + 1; 
            
            // Récupération des données
            while (resultat.next()) {
                String intitule = resultat.getString("intitule");
                String region = resultat.getString("region");
                String description = resultat.getString("description");
                String proprietaire = resultat.getString("proprietaire");
                String brevet = resultat.getString("brevet");
                String preparation = resultat.getString("preparation");
                
                CTAbean CTA = new CTAbean();
                CTA.setIntitule(intitule);
                CTA.setRegion(region);
                
                ctas.add(CTA);
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
        
        return ctas;
    }
    
    private void loadDatabase() {
        // Chargement du driver
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            connexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/RGTech", "RGUser", "root00");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void ajouterCTA(CTAbean CTA) {
        loadDatabase();
        
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO \"RG\".\"CTA\"(intitule, description, proprietaire, brevet, region, preparation, image, validee) VALUES ( ?, ?, ?, ?, ?, ?, '/', TRUE);");
         //   preparedStatement.setInt(1, generatedId);
            preparedStatement.setString(1, CTA.getIntitule());
            preparedStatement.setString(2, CTA.getDescription());
            preparedStatement.setString(3, CTA.getProprietaire());
            preparedStatement.setString(4, CTA.getBrevet());
            preparedStatement.setString(5, CTA.getRegion());
            preparedStatement.setString(6, CTA.getPreparation());
           

         //   generatedId++; 
            preparedStatement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    
    }
    
}