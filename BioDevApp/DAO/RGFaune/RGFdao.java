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




public class RGFdao {
    private Connection connexion;
   
 
    public List<RGFbean> recupererRGF() {
        List<RGFbean> rgfs = new ArrayList<RGFbean>();
        Statement statement = null;
        ResultSet resultat = null;
  
        loadDatabase();
        
        try {
            statement = connexion.createStatement();
          
            // Exécution de la requête
            resultat = statement.executeQuery("SELECT nom_latin, nom_arabe, nom_amazigh, description, nombre, validee, utilisateur, noyau_cellulaire, membres, poils, \"vertèbres\", region, wilaya FROM \"RG\".\"RessourceFaunistique\";"); 
        
            // Récupération des données
            while (resultat.next()) {
                String nom_latin = resultat.getString("nom_latin");
                String nom_arabe = resultat.getString("nom_arabe");
                String nom_amazigh = resultat.getString("nom_amazigh");
                String description = resultat.getString("description");
                int nombre = resultat.getInt("nombre");
                String utilisateur = resultat.getString("utilisateur");
                boolean noyau_cellulaire = resultat.getBoolean("noyau_cellulaire");
                boolean membres = resultat.getBoolean("membres");
                boolean poils = resultat.getBoolean("poils");
                boolean vertèbres = resultat.getBoolean("vertèbres");
                String region = resultat.getString("region");
                String wilaya = resultat.getString("wilaya");
        
                
                
                
                RGFbean RGF = new RGFbean();
                RGF.setNom_latin(nom_latin);
                RGF.setNom_arabe(nom_arabe);
                RGF.setNom_amazigh(nom_amazigh);
                RGF.setDescription(description);
                RGF.setNombre(nombre);
                RGF.setUtilisateur(utilisateur);
                RGF.setMembres(membres);                
                RGF.setNoyau_cellulaire(noyau_cellulaire);
                RGF.setPoils(poils);
                RGF.setVertèbres(vertèbres);
                RGF.setRegion(region);
                RGF.setWilaya(wilaya);
                rgfs.add(RGF);
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
        
        return rgfs;
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
    
    public void ajouterRGF(RGFbean RGF) {
        loadDatabase();
        
        try {
            PreparedStatement preparedStatement = connexion.prepareStatement("INSERT INTO \"RG\".\"RessourceFaunistique\"(nom_latin, nom_arabe, nom_amazigh, description, nombre, validee, utilisateur, noyau_cellulaire, membres, poils, \"vertèbres\", region, wilaya)  VALUES ( ?, ?, ?, ?, ?, FALSE, ?, ?, ?, ?, ?, ?, ?);");

            preparedStatement.setString(1, RGF.getNom_latin());
            preparedStatement.setString(2, RGF.getNom_arabe());
            preparedStatement.setString(3, RGF.getNom_amazigh());
            preparedStatement.setString(4, RGF.getDescription());
            preparedStatement.setInt(5, RGF.getNombre());
            preparedStatement.setString(6, RGF.getUtilisateur());
            preparedStatement.setBoolean(7, RGF.isNoyau_cellulaire());
            preparedStatement.setBoolean(8, RGF.isMembres());
            preparedStatement.setBoolean(9, RGF.isPoils());
            preparedStatement.setBoolean(10, RGF.isVertèbres());
            preparedStatement.setString(11, RGF.getRegion());
            preparedStatement.setString(12, RGF.getWilaya());

            preparedStatement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    
    }
    
}