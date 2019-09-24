<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>${sessionScope.rgcmc.getNom_niveau()}</title>
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
  <!--/ Nav End /-->

  <!--/ Intro Single star /-->
  <section class="intro-single">
    <div class="container">
      <div class="row">
        <div class="col-md-12 col-lg-8">
          <div class="title-single-box">
            <h1 class="title-single">Micro organismes</h1>
            <span class="color-text-a">Classification classique</span>
          </div>
        </div>
        <div class="col-md-12 col-lg-4">
          <nav aria-label="breadcrumb" class="breadcrumb-box d-flex justify-content-lg-end">
            <ol class="breadcrumb">
              <li class="breadcrumb-item">
                <a href="MicroOrganismes">RG</a>
              </li>
              <li class="breadcrumb-item">
                <a href="RG">MicroOrganismes</a>
              </li>
              
              <li class="breadcrumb-item active" aria-current="page">
               Genre
              </li>
            </ol>
          </nav>
        </div>
      </div>
    </div>
  </section>
  <!--/ Intro Single End /-->

  
  <!--/ Property Single End /-->
   <section class="property-single nav-arrow-b">
    <div class="container">
      <div class="row">
  <div class="col-sm-12">
        <div id="carouselExampleFade" class="carousel slide carousel-fade" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="${sessionScope.rgm.getImage()}" class="d-block w-100" alt="...">
    </div>

  </div>
  <a class="carousel-control-prev" href="#carouselExampleFade" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleFade" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<div>
</div>
</div>

          <div class="row justify-content-between">
            <div class="col-md-5 col-lg-4">
              <div class="property-price d-flex justify-content-center foo">
                <div class="card-header-c d-flex">
                  <div class="card-box-ico">
                    <span class="ion-money"></span>
                  </div>
                  <div class="card-title-c align-self-center">
                    <h5 class="title-c">Information</h5>
                  </div>
                </div>
              </div>
                <div class="summary-list">
                  <ul class="list">
                    <li class="d-flex justify-content-between">
                      <strong>Nom latin:</strong>
                      <span> ${sessionScope.rgm.getNom_latin()} </span>
                    </li>
                    <li class="d-flex justify-content-between">
                      <strong>Nom arabe:</strong>
                      <span>${sessionScope.rgm.getNom_arabe()}</span>
                    </li>      
                  </ul>
                </div>  
              <div class="property-summary">
                <div class="row">
                  <div class="col-sm-12">
                    <div class="title-box-d section-t4">
                      <h3 class="title-d">Caractéristiques morphologiques</h3>
                    </div>
                  </div>
                </div>
                <div class="summary-list">
                  <ul class="list">
                    <li class="d-flex justify-content-between">
                      <strong>Forme:</strong>
                      <span> ${sessionScope.rgm.getForme()} </span>
                    </li>
                    <li class="d-flex justify-content-between">
                      <strong>Respiration: </strong>
                      <span>${sessionScope.rgm.getRespiration()}</span>
                    </li>   
                     <li class="d-flex justify-content-between">
                      <strong>Pathogenie: </strong>
                      <span>${sessionScope.rgm.getPathogenie()}</span>
                    </li> 
                     <li class="d-flex justify-content-between">
                      <strong>Emplacement de l'ADN: </strong>
                      <span>${sessionScope.rgm.getEmplacement_adn()}</span>
                    </li>  
                    <li class="d-flex justify-content-between">
                      <strong>Coloration de gram: </strong>
                      <span>${sessionScope.rgm.getColoration_gram()}</span>
                    </li> 
                    <li class="d-flex justify-content-between">
                      <strong>Eco-système: </strong>
                      <span>${sessionScope.rgm.getEcosys()}</span>
                    </li>  
                  </ul>
                </div>
              </div>
            </div>
            
      <div class="col-md-7 col-lg-7 section-md-t3">
              <div class="row">
                <div class="col-sm-12">
                  <div class="title-box-d">
                    <h3 class="title-d">Description</h3>
                  </div>
                </div>
              </div>
              <div class="property-description">
                <p class="description color-text-a">
                   ${sessionScope.rgm.getDescription()}
               </p>
 
              </div>
            </div>
          </div>
          </div>
          </div>
    </section>


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
