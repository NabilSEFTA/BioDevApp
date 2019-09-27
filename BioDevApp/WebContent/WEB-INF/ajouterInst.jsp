<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Description d'une institution</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Favicons -->
  <link href="<%= request.getContextPath() %>/template/img/favicon.png" rel="icon">
  <link href="<%= request.getContextPath() %>/template/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="<%= request.getContextPath() %>/template/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="<%= request.getContextPath() %>/template/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="<%= request.getContextPath() %>/template/lib/animate/animate.min.css" rel="stylesheet">
  <link href="<%= request.getContextPath() %>/template/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="<%= request.getContextPath() %>/template/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="<%= request.getContextPath() %>/template/css/style.css" rel="stylesheet">
  
  <style type="text/css">#contenu {
                                    margin-top: 5%;
                                    margin-left:15%;
                                    margin-right: 15%;
                                   
                                    background-color: white;
                                   
                                    
                                      }
                          #body {
                                   padding-top: 5%;
                                   padding-bottom: 5%; 
                                   background-image: url("dependencies/img/canada-2250105_960_720.jpg");
                                   background-repeat: no-repeat;
                                   
                                   background-size: 100%;
                                   background-attachment: fixed;
                                 
                          } 
  </style>

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
      <a class="navbar-brand text-brand" href="index.html">BIO<span class="color-b">.DEV</span></a>
      <button type="button" class="btn btn-link nav-search navbar-toggle-box-collapse d-md-none" data-toggle="collapse"
        data-target="#navbarTogglerDemo01" aria-expanded="false">
        <span class="fa fa-search" aria-hidden="true"></span>
      </button>
      <div class="navbar-collapse collapse justify-content-center" id="navbarDefault">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" href="index.html">Accueil</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">
              RG
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="StartRGMarines">Marine</a>
              <a class="nav-link" href="/BioDevApp/rgfaune">Faunistique</a>
              <a class="dropdown-item" href="/BioDevApp/classifications">Phylogénétique</a>
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
              <a class="dropdown-item" href="StartRGMarines">Marine</a>
              <a class="dropdown-item" href="/BioDevApp/ctafaune">Faunistique</a>
              <a class="dropdown-item" href="/BioDevApp/classifications">Phylogénétique</a>
              <a class="dropdown-item" href="CTAMicroM">Micro organismes</a>
              <a class="dropdown-item" href="agent-single.html">Forestière</a>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link active" href="InstitutionsSer">Annuaire</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/BioDevApp/regelementation">Réglementation</a>
          </li>
         
          <li class="nav-item">
            <a class="nav-link" href="contact.html">Contact</a>
          </li>
           </li>
           
        </ul>
        
			<!-- 	<ul >
				<li><a href="/BioDevApp/connexion">Connexion</a></li>
				<li><a href="/BioDevApp/inscription">S'inscrire</a></li>
			</ul> -->
     	
      </div>
 
   
    </div>
    
	
  </nav>
  <!--/ Nav End /-->
 
			<!------------------------------------------------------------------->
  	<div id="contenu" class="text-center border border-light p-5 form">
  
     
	  	<form  class=" form-a" method="post" action="ajoutSer" enctype="multipart/form-data">
  		<p class="h4 mb-4">Ajouter une Institution</p>
  		<div class="form-row mb-4">
        <div class="col-lg 6">
           
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Acronyme" name="acronyme_inst" id="acronyme_inst">
        </div>
           
            <div class="form-group col-lg 6">
            
              <select class="form-control form-control-lg form-control-a" name="cat_inst" id="cat_inst">
                  <option value="1">Publique</option>
                  <option value="2">Privée</option>
              </select>
            </div>
      </div>
      
      <div class="form-row mb-4">
       
      <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Nom de l'institution" name="nom_inst" id="nom_inst">
          
        </div>
      </div>
           
          
            <div class="form-group">
              <textarea  class="form-control" name="description_inst"  id="description_inst" cols="45" rows="8" 
              data-rule="required"  placeholder="Description de l'institution"></textarea>
              <div class="validation"></div>
            </div>
      
      	<div class="form-group">
	          <input type="file" name="image_inst" id="image_inst" class="form-control form-control-lg form-control-a" 
	          placeholder="Uploader l'image de l'institution">
	          <div class="validation"></div>
	    </div>
	    
        <div class="form-row mb-4">
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Numéro de téléphone" name="tel_inst" id="tel_inst">
        </div>
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Fax de l'institution" name="fax_inst" id="fax_inst">
        </div>
      </div>
      <div class="form-row mb-4">
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Adresse E-mail" name="mail_inst" id="mail_inst">
        </div>
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Lien du site Web" name="lien_site" id="lien_site">
        </div>
        </div>
        <div class="form-row mb-4">
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Adresse de l'institution" name="adresse_inst" id="adresse_inst">
        </div>
      </div>
    


        <div id="buttonSubmit" class="col-md-12">
                    <button type="submit" class="btn btn-a" >Valider l'ajout</button>
                   
    </div>
  	</form>
  	</div>
			<!------------------------------------------------------------------->
  
  <!--/ footer Star /-->
 <section class="section-footer">
    <div class="container">
      <div class="row">
        <div class="col-sm-12 ">
          <div style='text-align: center' class="widget-a">
            <div class="w-header-a">
              <h3 class="w-title-a text-brand">RGtech</h3>
            </div>
            <div class="w-body-a">
              <p class="w-text-a color-text-a">
                  RGtech est une équipe travaillant dans <br> le domaine
               de la préservation  des ressources génétiques <br> en Algérie
                conformément au protocole <br> de NAGOYA et la convention APA.
              </p>
            </div>
            <div class="w-footer-a">
              <ul class="list-unstyled">
                <li class="color-a">
                  <span class="color-text-a">Phone .</span> +213 </li>
                <li class="color-a">
                  <span class="color-text-a">Email .</span> rgtech@gmail.org</li>
              </ul>
            </div>
          </div>
        </div>
        </div>
    </div>
  </section>
  <footer>
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <nav class="nav-footer">
            <ul class="list-inline">
              <li class="list-inline-item">
                <a href="#">Accueil</a>
              </li>
              <li class="list-inline-item">
                <a href="#">RG</a>
              </li>
              <li class="list-inline-item">
                <a href="#">CTA</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Annuaire</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Réglementation</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Contact</a>
              </li>
            </ul>
          </nav>
          <div class="socials-a">
            <ul class="list-inline">
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-facebook" aria-hidden="true"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-twitter" aria-hidden="true"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-instagram" aria-hidden="true"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-pinterest-p" aria-hidden="true"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-dribbble" aria-hidden="true"></i>
                </a>
              </li>
            </ul>
          </div>
          <div class="copyright-footer">
            <p class="copyright color-text-a">
              &copy; Copyright
              <span class="color-a">bio.DEV</span> All Rights Reserved.
            </p>
          </div>
          <div class="credits">
          
            Designed by <a href="https://bootstrapmade.com/">RGtech</a>
          </div>
        </div>
      </div>
    </div>
  </footer>
  <!--/ Footer End /-->

  <a href="#" class="back-to-top" style="display: none;"><i class="fa fa-chevron-up"></i></a>
  

  <!-- JavaScript Libraries -->
  <script src="<%= request.getContextPath() %>/template/lib/jquery/jquery.min.js"></script>
  <script src="<%= request.getContextPath() %>/template/lib/jquery/jquery-migrate.min.js"></script>
  <script src="<%= request.getContextPath() %>/template/lib/popper/popper.min.js"></script>
  <script src="<%= request.getContextPath() %>/template/lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="<%= request.getContextPath() %>/template/lib/easing/easing.min.js"></script>
  <script src="<%= request.getContextPath() %>/template/lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="<%= request.getContextPath() %>/template/lib/scrollreveal/scrollreveal.min.js"></script>
  <!-- Contact Form JavaScript File -->
  <script src="<%= request.getContextPath() %>/template/contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="<%= request.getContextPath() %>/template/js/main.js"></script>



</body>
</html>
