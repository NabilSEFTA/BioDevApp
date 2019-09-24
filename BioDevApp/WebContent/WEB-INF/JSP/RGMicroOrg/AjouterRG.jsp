<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Ajout d'une RG Micro-organisme</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Favicons -->
  <link href="img/favicon.png" rel="icon">
  <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="css/style.css" rel="stylesheet">

  <!-- =======================================================
    Theme Name: EstateAgency
    Theme URL: https://bootstrapmade.com/real-estate-agency-bootstrap-template/
    Author: BootstrapMade.com
    License: https://bootstrapmade.com/license/
  ======================================================= -->
</head>

<body>

<%@include file="./Header.jsp" %>

  <!--/ Intro Single star /-->
  <section class="intro-single">
    <div class="container">
      <div class="row">
        <div class="col-md-12 col-lg-8">
          <div class="title-single-box">
            <h1 class="title-single">Ajouter une nouvelle ressource génétique micro-organisme </h1>
            <span class="color-text-a">Dans cette page, vous pouvez ajouter une nouvelle ressource génétique micro-organisme.
                Une fois toute les informations introduites dans le formulaire d'ajout, cette demande d'ajout de la nouvelle ressource génétique sera traités par des spécialistes sur la biodiversité algérienne afin d'approuver cet ajout ou de le refuser en cas de non conformité.

               </span>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!--/ Intro Single End /-->



      <img src="img/Procaryotes.png">

  <!--/ Contact Star /-->
  <section class="contact">
    <div class="container">
      <div class="row">
        <div class="col-sm-12">
              
                   
             <form class="form-a contactForm" method="post" action="AjouterRGM">
        
        <p>
            <label for="nom_latin" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Nom latin : </label>
            <input type="text" name="nom_latin" id="nom_latin" class="form-control form-control-lg form-control-a"/>
   
        </p>
       
        <p>
            <label for="nom_arabe" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Nom arabe : </label>
            <input type="text" name="nom_arabe" id="nom_arabe" class="form-control form-control-lg form-control-a"/>
        </p>
        <p>
            <label for="nom_amazigh" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Nom amazigh : </label>
            <input type="text" name="nom_amazigh" id="nom_amazigh" class="form-control form-control-lg form-control-a"/>
        </p>
        <p>
            <label for="description" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Description : </label>
            <input type="text" name="description" id="description" class="form-control form-control-lg form-control-a"/>
        </p>
         <p>
            <label for="image" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Image : </label>
            <input type="text" name="image" id="image" class="form-control form-control-lg form-control-a"/>
        </p>
         <p>
            <label for="presence_noyau" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Presence d'un noyau?  </label>
           <select class="form-control form-control-lg form-control-a"  name="presence_noyau" id="presence_noyau">
               <option value="true">oui</option>
                <option value="false">non</option>
             </select>
        </p>
        
         <p>
            <label for="utilisateur" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Utilisateur : </label>
            <input type="text" name="utilisateur" id="utilisateur" class="form-control form-control-lg form-control-a"/>
        </p>
        <p>
            <label for="emplacement_adn" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Emplacement de l'ADN : </label>
            <input type="text" name="emplacement_adn" id="emplacement_adn" class="form-control form-control-lg form-control-a"/>
        </p>
                
<p>
            <label for="ecosys" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Eco-système</label>
            <input type="text" name="ecosys" id="ecosys" class="form-control form-control-lg form-control-a"/>
        </p>    
<p> 
            <label for="pathogenie" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Pathogenie: </label>
            <input type="text" name="pathogenie" id="pathogenie" class="form-control form-control-lg form-control-a"/>
        </p>  
        
        <p>
            <label for="respiration" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Respiration : </label>
            <input type="text" name="respiration" id="respiration" class="form-control form-control-lg form-control-a"/>
        </p>
        
        <p>
            <label for="forme" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;"> Forme: </label>
            <input type="text" name="forme" id="utilisateur" class="form-control form-control-lg form-control-a"/>
        </p>
        <p>
            <label for="reproduction" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Reproduction: </label>
            <input type="text" name="reproduction" id="reproduction" class="form-control form-control-lg form-control-a"/>
        </p>    
        
        <input type="submit" class="btn btn-a"/>
    </form>
 
            
            <!-- ************************************* -->
        
          </div>
        </div>
      </div>
    </div>
  </section>
  <!--/ Contact End /-->

   <!--/ footer Star /-->
  <%@include file="./Footer.jsp" %>
  <!--/ Footer End /-->

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>
  <div id="preloader"></div>

  <!-- JavaScript Libraries -->
  <script src="lib/jqueryFaune/jquery.min.js"></script>
  <script src="lib/jqueryFaune/jquery-migrate.min.js"></script>
  <script src="lib/popper/popper.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="lib/easing/easing.min.js"></script>
  <script src="lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="lib/scrollreveal/scrollreveal.min.js"></script>
  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="jsFaune/main.js"></script>

</body>
</html>
