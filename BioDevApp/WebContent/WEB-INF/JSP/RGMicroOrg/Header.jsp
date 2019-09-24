<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib
	          prefix="c"
	          uri="http://java.sun.com/jsp/jstl/core" 
	        %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<link href='http://fonts.googleapis.com/css?family=Cookie' rel='stylesheet' type='text/css'>
<link type="text/css" rel="stylesheet" href="header.css" />
<title>Header</title>
</head>
<body>

  <!--/ Form Search End /-->

 <!--/ Nav Star /-->

  <nav class="navbar navbar-default navbar-trans navbar-expand-lg fixed-top">
    <div class="container">
     <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbarDefault"
        aria-controls="navbarDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span></span>
        <span></span>
        <span></span>
      </button>
      <a class="navbar-brand text-brand" href="MicroOrganimes">BIO<span class="color-b">.DEV</span></a>
      <button type="button" class="btn btn-link nav-search navbar-toggle-box-collapse d-md-none" data-toggle="collapse"
        data-target="#navbarTogglerDemo01" aria-expanded="false">
        <span class="fa fa-search" aria-hidden="true"></span>
      </button>
      <div class="navbar-collapse collapse justify-content-center" id="navbarDefault">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" href="MicroOrganismes">Accueil</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle active" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">
              RG
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="#">Marine</a>
              <a class="nav-link active" href="#">Faunistique</a>
              <a class="dropdown-item" href="#">Phylogénétique</a>
              <a class="dropdown-item" href="MicroOrganismes">Micro organismes</a>
              <a class="dropdown-item" href="agent-single.html">Forestière</a>
            </div>
          </li>
           <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">
            CTA
          </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="#">Marine</a>
              <a class="dropdown-item" href="#">Faunistique</a>
              <a class="dropdown-item" href="#">Phylogénétique</a>
              <a class="dropdown-item" href="CTAMicroM">Micro organismes</a>
              <a class="dropdown-item" href="#">Forestière</a>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Annuaire</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Réglementation</a>
          </li>
         
          <li class="nav-item">
            <a class="nav-link" href="#">Contact</a>
          </li>          
          <c:if test="${!empty sessionScope.prenomNom}">  
          <li class="nav-item dropdown">
			            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
			              aria-haspopup="true" aria-expanded="false" >Ajouter</a>
			             <div class="dropdown-menu" aria-labelledby="navbarDropdown">
			              <a class="dropdown-item" href="/BioDevApp/AjouterRGM">RG </a>
			              <a class="dropdown-item" href="/BioDevApp/AjouterCTAM">CTA</a>
		              </div>
		          </li>
				</c:if>	
        </ul>
      </div> 
       <c:if test="${isConnected}">  
           <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false" >Ajouter</a>
             <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="/BioDevApp/AjouterRG">RG </a>
              <a class="dropdown-item" href="/BioDevApp/AjouterCTA">CTA</a>
              </div>
          </li>  
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="index.html">
                <i class="fas fa-laugh-wink"></i>
                 ${utilisateur.nom}
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="deconnexion">Déconnexion</a>      
              </div>
            </li>
          </c:if>
          <c:if test="${!isConnected}">
            <li class="nav-item">
             <a href="/BioDevApp/inscription" class="nav-link" >Inscription</a>
            </li>
            <li class="nav-item">
              <a  class="btn-a nav-link" href="/BioDevApp/connexion" >Connexion</a>
            </li>
          </c:if> 
    </div>	
    
  </nav>
  
</body>
</html>