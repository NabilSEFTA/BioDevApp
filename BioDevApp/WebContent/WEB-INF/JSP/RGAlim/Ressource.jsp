<%@ page language="java"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="charset=utf-8">
<meta charset="utf-8">      
  <meta content="width=device-width, initial-scale=1.0" name="viewport">    
  <meta content="" name="keywords">    
  <meta content="" name="description">           
  <!-- Favicons -->             
  <link href="dependencies/img/favicon.png" rel="icon">
  <link href="dependencies/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts --> 
  <link href="dependencies/img/favicon.png" rel="icon">
  <link href="dependencies/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts --> 
  <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="dependencies/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="dependencies/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="dependencies/lib/animate/animate.min.css" rel="stylesheet">
  <link href="dependencies/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="dependencies/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="dependencies/css/style.css" rel="stylesheet">

  <!-- Datepicker style -->
  <link href="dependencies\lib\gijgo\css\gijgo.min.css" rel="stylesheet" type="text/css" />
  <link href="dependencies/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <!-- Custom styles for this template-->
    <link href="dependencies/admin/css/sb-admin-2.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="dependencies/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="dependencies/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="dependencies/lib/animate/animate.min.css" rel="stylesheet">
  <link href="dependencies/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="dependencies/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="dependencies/css/style.css" rel="stylesheet">
   <link href="dependencies/BizPage/lib/lightbox/css/lightbox.min.css" rel="stylesheet">
  <!-- Main Stylesheet File -->
  <link href="dependencies/css/style.css" rel="stylesheet">
  <link href="dependencies/BizPage/css/style.css" rel="stylesheet">
  <link href="dependencies/Avilon/css/style.css" rel="stylesheet">

  <link href="dependencies/Avilon/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="dependencies/Avilon/lib/animate/animate.min.css" rel="stylesheet">
  <link href="dependencies/Avilon/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="dependencies/Avilon/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="dependencies/Avilon/lib/magnific-popup/magnific-popup.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/WEB-INF/JSP/RGAlim/Nav.jsp" %>
  <div id="wrapper" >
    <c:if test="${isConnected}">
      <%@include file="/WEB-INF/JSP/RGAlim/NavCnx.jsp" %>
    </c:if>
    <div class="container">
   <div id="content-wrapper" class="d-flex flex-column" >
    <div id="content" >
      <div class="container-fluid">
        <div class="section-header" style="margin-bottom: 5%;">
          <h3 class="section-title">${ressource.nomFrancais} <br> Présentations et Caractéristiques </h3>
        </div>
          <section class="intro-single" style="padding: 0px;margin-bottom: 5%; ">
    <div class="container">
      <div class="row">
        <div class="col-md-12 ">
          <div class="title-single-box">
            <h1 class="title-single">Classifications</h1>
             <c:forEach var="i" begin = "0" end = "${fn:length(mapClassName)-1}">
              <span class="color-text-a " id="path2">${mapClassName.get(i)}</span>
              <br>
      		</c:forEach>
          </div>
        </div> 
      </div>
    </div>
  </section>
        <div class="row" style="margin-bottom: 5%;">
           
          <div class="col-lg-6 about-img wow fadeInLeft">
            <img src="/BioDevApp/images/RGAlim/fraisier.jpg" style="width: 508px;">
          </div>
          <div class="col-lg-6 content wow fadeInRight">
            <p>
               ${ressource.description}
            </p>
          </div>
        </div>
      </div>
        <section id="features">
      <div class="container">

        <div class="row">

          <div class="col-lg-8 offset-lg-4" style="margin-bottom: 5%;">
            <div class="section-header wow fadeIn" data-wow-duration="1s">
              <h3 class="section-title">Caractéristiques de la ressource</h3>
              
            </div>
          </div>

          <div class="col-lg-4 col-md-5 features-img" >
            <img src="/BioDevApp/images/RGAlim/caracteristiques.png" alt="" class="wow fadeInLeft">
          </div>

          <div class="col-lg-8 col-md-7 " >

            <div class="row">

              <div class="col-lg-6 col-md-6 box wow fadeInRight">
                
                <h4 class="title">Caractéristique Anatomique</h4>
                 <p>Feuille : ${ressource.caracAnatomique.feuille}</p>
                <p>Fleure : ${ressource.caracAnatomique.fleur}</p>
                <p>Fruit : ${ressource.caracAnatomique.fruit}</p>
                <p>Graine : ${ressource.caracAnatomique.graine}</p>
              </div>
              <div class="col-lg-6 col-md-6 box wow fadeInRight" data-wow-delay="0.1s">
               
                <h4 class="title">Caractéristique Morphologique</h4>
                <p>Couleur fleure : ${ressource.caracMorphologique.couleurFleur}</p>
                <p>Germe : ${ressource.caracMorphologique.germe}</p>
                <p>Maturité : ${ressource.caracMorphologique.maturité}</p>
                <p>Graine : ${ressource.caracAnatomique.graine}</p>
              </div>
              <div class="col-lg-6 col-md-6 box wow fadeInRight" data-wow-delay="0.2s">
                <h4 class="title">Ecosystème de la Ressource</h4>
                 <p>PH : ${ressource.ecosystemeResPhytos[0].dPh}</p>
                  <p>Ions Minéreaux: ${ressource.ecosystemeResPhytos[0].ionsMiniraux}</p>
                  <p>Quantité Eau : ${ressource.ecosystemeResPhytos[0].qEau}</p>
                  <p>Température : ${ressource.ecosystemeResPhytos[0].température}</p>
              </div>
              <div class="col-lg-6 col-md-6 box wow fadeInRight" data-wow-delay="0.3s">
                
                <h4 class="title">Localisation de la ressource</h4>
                  <p>Region : ${ressource.geolocalisations[0].region}</p>
                  <p>Wilaya: ${ressource.geolocalisations[0].wilaya}</p>
                  <p>Ville : ${ressource.geolocalisations[0].ville}</p>
              </div>
            </div>

          </div>

        </div>

      </div>

    </section><!-- #features --> 
      </div>
    </div>
  </div>
</div>
</div>



<script src="dependencies/admin/vendor/jquery/jquery.min.js"></script>
  <script src="dependencies/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="dependencies/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="dependencies/admin/js/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="dependencies/admin/vendor/chart.js/Chart.min.js"></script>

  <script src="dependencies/BizPage/lib/jquery/jquery.min.js"></script>
  <script src="dependencies/BizPage/lib/jquery/jquery-migrate.min.js"></script>
  <script src="dependencies/BizPage/lib/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="dependencies/BizPage/lib/easing/easing.min.js"></script>
  <script src="dependencies/BizPage/lib/superfish/hoverIntent.js"></script>
  <script src="dependencies/BizPage/lib/superfish/superfish.min.js"></script>
  <script src="dependencies/BizPage/lib/wow/wow.min.js"></script>
  <script src="dependencies/BizPage/lib/waypoints/waypoints.min.js"></script>
  <script src="dependencies/BizPage/lib/counterup/counterup.min.js"></script>
  <script src="dependencies/BizPage/lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="dependencies/BizPage/lib/isotope/isotope.pkgd.min.js"></script>
  <script src="dependencies/BizPage/lib/lightbox/js/lightbox.min.js"></script>
  <script src="dependencies/BizPage/lib/touchSwipe/jquery.touchSwipe.min.js"></script>
  <script src="dependencies/BizPage/js/main.js"></script>
  <script src="dependencies/Avilon/lib/jquery/jquery.min.js"></script>
  <script src="dependencies/Avilon/lib/jquery/jquery-migrate.min.js"></script>
  <script src="dependencies/Avilon/lib/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="dependencies/Avilon/lib/easing/easing.min.js"></script>
  <script src="dependencies/Avilon/lib/wow/wow.min.js"></script>
  <script src="dependencies/Avilon/lib/superfish/hoverIntent.js"></script>
  <script src="dependencies/Avilon/lib/superfish/superfish.min.js"></script>
  <script src="dependencies/Avilon/lib/magnific-popup/magnific-popup.min.js"></script>

  <!-- Contact Form JavaScript File -->
  <script src="dependencies/Avilon/contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="dependencies/Avilon/js/main.js"></script>
  <!-- Page level custom scripts -->
  <script src="dependencies/admin/js/demo/chart-area-demo.js"></script>
  <script src="dependencies/admin/js/demo/chart-pie-demo.js"></script>
  <script src="dependencies/lib/jquery/jquery.min.js"></script>
  <script src="dependencies/lib/jquery/jquery-migrate.min.js"></script>
  <script src="dependencies/lib/popper/popper.min.js"></script>
  <script src="dependencies/lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="dependencies/lib/easing/easing.min.js"></script>
  <script src="dependencies/lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="dependencies/lib/scrollreveal/scrollreveal.min.js"></script>
  <!-- Contact Form JavaScript File -->
  <script src="dependencies/contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="dependencies/js/main.js"></script>
   <%@include file="/WEB-INF/JSP/RGAlim/footer.jsp" %>
</body>
</html>