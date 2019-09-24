<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Favicons -->
  <link href="Styles/RGMarines/estate/img/favicon.png" rel="icon">
  <link href="Styles/RGMarines/estate/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="Styles/RGMarines/estate/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="Styles/RGMarines/estate/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="Styles/RGMarines/estate/lib/animate/animate.min.css" rel="stylesheet">
  <link href="Styles/RGMarines/estate/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="Styles/RGMarines/estate/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="Styles/RGMarines/estate/css/style.css" rel="stylesheet">
    
  

  <!-- =======================================================
    Theme Name: EstateAgency
    Theme URL: https://bootstrapmade.com/real-estate-agency-bootstrap-template/
    Author: BootstrapMade.com
    License: https://bootstrapmade.com/license/
  ======================================================= -->
</head>
<body>

  <!--/ Nav Star /-->
  <nav class="navbar navbar-default navbar-trans navbar-expand-lg fixed-top">
    <div class="container">
      <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbarDefault"
        aria-controls="navbarDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span></span>
        <span></span>
        <span></span>
      </button>
      <a class="navbar-brand text-brand" href="BioDev">bio<span class="color-b">.DEV</span></a>
      <button type="button" class="btn btn-link nav-search navbar-toggle-box-collapse d-md-none" data-toggle="collapse"
        data-target="#navbarTogglerDemo01" aria-expanded="false">
        <span class="fa fa-search" aria-hidden="true"></span>
      </button>
      <div class="navbar-collapse collapse justify-content-center" id="navbarDefault">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" href="">Accueil</a>
          </li>

          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">
              RG
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="StartRGMarines">Marine</a>
              <a class="dropdown-item" href="/BioDevApp/rgfaune">Faunistique</a>
              <a class="dropdown-item" href="#">Phytogénétique</a>
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
              <a class="dropdown-item" href="StartRGMarines">Marine</a>
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
          <!--<li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false" >Ajouter</a>
             <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="/BioDevApp/AjouterRG">RG </a>
              <a class="dropdown-item" href="/BioDevApp/AjouterCTA">CTA</a>
              </div>
          </li>-->
          
	        <c:if test="${!empty sessionScope.prenomNom}">  	
	        	<li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="index.html">
                <i class="fas fa-laugh-wink"></i>
                 ${sessionScope.prenomNom}
            </a>
           <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                  <a class="dropdown-item" href="deconnexion">Déconnexion</a>      
           </div>
          </li>
	        </c:if>
	        <c:if test="${empty sessionScope.prenomNom}">
				  <li class="nav-item">
		             <a href="inscription" class="nav-link" >Inscription</a>
		          </li>
		          <li class="nav-item">
		            <a  class="btn-a nav-link" href="connexion?from=rgMarine" >Connexion</a>
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
  
  <br><br><br><br><br><br>
  <!--/ Nav End /-->
</body>
</html>