<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Les classes</title>
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

 <%@include file="./header.jsp" %>
 
  <!--/ Intro Single star /-->
  <section class="intro-single">
    <div class="container">
      <div class="row">
        <div class="col-md-12 col-lg-8">
          <div class="title-single-box">
            <h1 class="title-single">Les classes </h1>
            <span class="color-text-a">Classification classique</span>
          </div>
        </div>
     
      </div>
    </div>
  </section>
  <!--/ Intro Single End /-->

  <!--/ Property Grid Star /-->
  <section class="property-grid grid">
    <div class="container">
      <div class="row">
      <c:forEach var="i" begin="1" end="${sessionScope.listRGCF2.size()}" step="1">
        <div class="col-md-4">
          <div class="card-box-a card-shadow">
            <div class="img-box-a">
              <img src="${sessionScope.listRGCF2.get(i-1).getImage()}" alt="" class="img-a img-fluid">
            </div>
            <div class="card-overlay">
              <div class="card-overlay-a-content">
                <div class="card-header-a">
                  <h2 class="card-title-a">
                    <a href="${sessionScope.listRGCF2.get(i-1).getNom_niveau()}">${sessionScope.listRGCF2.get(i-1).getNom()}</a>
                  </h2>
                </div>
                <div class="card-body-a">
              
                  <a href="${sessionScope.listRGCF2.get(i-1).getNom_niveau()}" class="link-a">En savoir plus
                    <span class="ion-ios-arrow-forward"></span>
                  </a>
                </div>
               <div class="card-footer-a">
                  <ul class="card-info d-flex justify-content-around">
                    <li>
                      <h4 class="card-info-title">Nombre</h4>
                      <span> 
                    
                      </span>
                    </li>
               
                  </ul>
                </div>  
              </div>
            </div>
          </div>
        </div>
       </c:forEach>
       </div>
       </div>
       
       
       
      <div class="row">
    


       <div class="container">
              <div class="row">
                <div class="col-lg-8">
                  <div class="intro-body">
                    <p class="intro-title-top">
                      <br> </p>
                    <h1 class="intro-title mb-4">
                      <span class="color-b"> </span> 
                      <br> </h1>
                    <p class="intro-subtitle intro-price">
                     <a href="/BioDevApp/OrdreMammifères"><span class="price-a"  style="color:#000000; margin-left: 500px;">Voir la suite</span></a>
                    </p>
                  </div>
                </div>
              </div>
          </div>
    </div>
  </section>
  <!--/ Property Grid End /-->

  <!--/ footer Star /-->
     <%@ include file="./footer.jsp" %>
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
