<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Ajout d'une CTA</title>
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
            <h1 class="title-single">Ajouter une nouvelle CTA faunistique </h1>
            <span class="color-text-a">Dans cette page, vous pouvez ajouter une nouvelle CTA faunistique.
                Une fois toute les informations introduites dans le formulaire d'ajout, cette demande d'ajout de la nouvelle ressource génétique sera traité par des spécialistes sur la biodiversité algérienne afin d'approuver cet ajout ou de le refuser en cas de non conformité.

               </span>
          </div>
        </div>
     
      </div>
    </div>
  </section>
  <!--/ Intro Single End /-->



      <img src="img/fromage.png">

  <!--/ Contact Star /-->
  <section class="contact">
    <div class="container">
      <div class="row">
        <div class="col-sm-12">
       
        <div class="col-sm-12 section-t8">
          <div class="row">
            <div class="col-md-10">
            
            
             <form class="form-a contactForm" method="post" action="AjouterCTAM">
        <p>
            <label for="intitule" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Intitulé : </label>
            <input type="text" name="intitule" id="intitule" class="form-control form-control-lg form-control-a"/>
        </p>
        <p>
            <label for="description" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Description : </label>
            <input type="text" name="description" id="description" class="form-control form-control-lg form-control-a"/>
        </p>
         <p>
            <label for="proprietaire" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Propriétaire : </label>
            <input type="text" name="proprietaire" id="proprietaire" class="form-control form-control-lg form-control-a"/>
        </p>
         <p>
            <label for="brevet" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Brevet : </label>
            <input type="text" name="brevet" id="brevet" class="form-control form-control-lg form-control-a"/>
        </p>
         <p>
            <label for="region" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Région : </label>
            <input type="text" name="region" id="region" class="form-control form-control-lg form-control-a"/>
        </p>
        <p>
            <label for="preparation" class="form-control form-control-lg form-control-a" style="background-color:#4CAF50; color:#FFFFFF;">Préparation : </label>
            <input type="text" name="preparation" id="preparation" class="form-control form-control-lg form-control-a"/>
        </p>
        
        
        <input type="submit" class="btn btn-a"/>
    </form>
    <!-- 
    <ul>
        <c:forEach var="cta" items="${ ctas }">
            <li><c:out value="${ cta.intitule }" /> <c:out value="${ cta.description }" />
               <c:out value="${ cta.proprietaire }" /> <c:out value="${ cta.brevet }" />
               <c:out value="${ cta.region }" /> <c:out value="${ cta.preparation }" />
            
            </li>
        </c:forEach>
    </ul>   
             -->
            
             
       
            </div>
     
          </div>
        </div>
      </div>
    </div>
    </div>
    
  </section>
  <!--/ Contact End /-->

    <%@include file="./Footer.jsp" %>

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

