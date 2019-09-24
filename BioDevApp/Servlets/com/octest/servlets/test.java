package com.octest.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.bdd.Noms;
import RGAlim.model.Utilisateur;


/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
       
    public test() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       Noms tableNoms = new Noms();
       request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs());
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(request.getParameter("nom"));
        utilisateur.setPrenom(request.getParameter("prenom"));
        
        Noms tableNoms = new Noms();
        tableNoms.ajouterUtilisateur(utilisateur);
        
        request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs()); 
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request, response);
    }
    
    

}