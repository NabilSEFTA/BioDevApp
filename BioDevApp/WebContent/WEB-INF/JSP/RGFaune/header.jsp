<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<!--  <div class="click-closed"></div>  -->
 <!--/ Form Search Star /-->
 <!-- <div class="box-collapse">
    <div class="title-box-d">
      <h3 class="title-d">Critère de recherche</h3>
    </div>
    <span class="close-box-collapse right-boxed ion-ios-close"></span>
    <div class="box-collapse-wrap form">
      <form class="form-a">
        <div class="row">
          <div class="col-md-12 mb-2">
            <div class="form-group">
              <label for="Type">Mot clé</label>
              <input type="text" class="form-control form-control-lg form-control-a" placeholder="Mot clé">
            </div>
          </div>
          <div class="col-md-6 mb-2">
            <div class="form-group">
              <label for="Type">Type de RG</label>
              <select class="form-control form-control-lg form-control-a" id="Type">
                <option>Marine</option>
                <option>Faunistique</option>
                <option>Phylogénétique</option>
                <option>Micro organisme</option>
                <option>Forestière</option>
              </select>
            </div>
          </div>
          <div class="col-md-6 mb-2">
            <div class="form-group">
              <label for="Région">Région</label>
              <select class="form-control form-control-lg form-control-a" id="Région">
                <option>Nord</option>
                <option>Sud</option>
                <option>Est</option>
                <option>Ouest</option>
          
              </select>
            </div>
          </div>
          <div class="col-md-6 mb-2">
            <div class="form-group">
              <label for="Car">Caractéristiques morphologiques</label>
              <select class="form-control form-control-lg form-control-a" id="Car">
                <option>Noyau céllulaire</option>
                <option>Vertèbres</option>
                <option>Poils</option>
                <option>Membres</option>
              </select>
            </div>
          </div>
          
         
          
          <div class="col-md-12">
            <button type="submit" class="btn btn-b">Rechercher</button>
          </div>
        </div>
      </form>
    </div>
  </div>  -->
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
      <a class="navbar-brand text-brand" href="/BioDevApp/rgfaune">bio<span class="color-b">.DEV</span></a>
      <button type="button" class="btn btn-link nav-search navbar-toggle-box-collapse d-md-none" data-toggle="collapse"
        data-target="#navbarTogglerDemo01" aria-expanded="false">
        <span class="fa fa-search" aria-hidden="true"></span>
      </button>
      <div class="navbar-collapse collapse justify-content-center" id="navbarDefault">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" href="BioDev">Accueil</a>
          </li>

          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">
              RG
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="#">Marine</a>
              <a class="dropdown-item" href="/BioDevApp/rgfaune">Faunistique</a>
              <a class="dropdown-item" href="classifications">Phytogénétique</a>
              <a class="dropdown-item" href="#">Micro organisme</a>
              <a class="dropdown-item" href="#">Forestière</a>
            </div>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">
            CTA
          </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="#">Marine</a>
              <a class="dropdown-item" href="/BioDevApp/ctafaune">Faunistique</a>
              <a class="dropdown-item" href="#">Phytogénétique</a>
              <a class="dropdown-item" href="#">Micro organisme</a>
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

          <%@ taglib
            prefix="c"
            uri="http://java.sun.com/jsp/jstl/core" 
          %>
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
          </ul>
           
      </div>
   <!-- <button type="button" class="btn btn-b-n navbar-toggle-box-collapse d-none d-md-block" data-toggle="collapse"
        data-target="#navbarTogglerDemo01" aria-expanded="false">
        <span class="fa fa-search" aria-hidden="true"></span>
      </button>   -->   
    </div>
  </nav>
  <!--/ Nav End /-->
</body>
</html>