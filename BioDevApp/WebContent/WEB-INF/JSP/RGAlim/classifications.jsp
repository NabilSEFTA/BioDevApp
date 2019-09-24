<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="utf-8">
<meta charset="utf-8">
  <title>Classifications</title>      
  <meta content="width=device-width, initial-scale=1.0" name="viewport">    
  <meta content="" name="keywords">    
  <meta content="" name="description">           
  <!-- Favicons -->             
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
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <!-- Custom styles for this template-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="dependencies/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="dependencies/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="dependencies/lib/animate/animate.min.css" rel="stylesheet">
  <link href="dependencies/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="dependencies/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
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

  <!-- Main Stylesheet File -->
  <link href="dependencies/Avilon/css/style.css" rel="stylesheet">
 
<title>Classifications</title>
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
                <div class="container-fluid">
        <div class="section-header" style="margin-bottom: 5%;">
          <h3 class="section-title">Ressources Phytogénétiques</h3>
  
        </div>

        <div class="row" style="margin-bottom: 5%;">
          <div class="col-lg-6 about-img wow fadeInLeft">
            <img src="img/about-img.jpg" style="width: 508px;">
          </div>

          <div class="col-lg-6 content wow fadeInRight">
       
            <p>
              Les ressources phytogénétiques jouent un rôle de plus en plus important dans la sécurité alimentaire et le développement économique au niveau mondial. Elles permettent à l’agriculture de faire face aux changements, qu’ils soient environnementaux ou socio-économiques. Elles font partie intégrante de la biodiversité agricole dans la mesure où elles sont cruciales pour intensifier une production agricole durable et pour assurer la subsistance d’une grande partie des femmes et des hommes qui dépendent de l’agriculture. 
            </p>

           
          </div>
        </div>

      </div>
         <div class="section-header" style="margin-bottom: 5%;">
          <h3 class="section-title">Classification</h3>
        </div>
           <div class="row">
            <div class="col-md-6 col-lg-5">
              <img src="/BioDevApp/images/RGAlim/classification4.jpg" alt="" class="img-fluid">
            </div>
             <div class="col-md-6 col-lg-5 section-md-t3">
              <div class="title-box-d">
                <h3 class="title-d"> Classifications Botaniques</h3>
              </div>
              <p class="color-text-a">
                Les anciens classaient les plantes selon des critères qui leurs semblaient efficaces pour prédire des actions bénéfiques sur l'homme. On retient de cette époque quelques distinctions générales comme les médicinales et les aromatiques qui ont encore du sens aujourd'hui. Les jardins de simples étaient alors à l'honneur.
              </p>
            </div>
          </div>
      <section id="about">
      <div class="container">
        <div class="row about-cols">
          <div class="col-md-6 wow fadeInUp">
            <div class="about-col">
              <div class="img">
                <img src="dependencies/BizPage/img/classification_classique.jpg" alt="" class="img-fluid">
                <div class="icon"><i class="ion-ios-speedometer-outline"></i></div>
              </div>
              <h2 class="title"><a href="/BioDevApp/hierarchie?niveau=Embryophyta">Classification Classique</a></h2>
              <p>
                En sciences naturelles, la classification classique (ou linnéenne) est un paradigme de classement des espèces vivantes dans lequel celles-ci sont classées assez subjectivement sur les ressemblances les plus visibles entre elles
              </p>
            </div>
          </div>

          <div class="col-md-6 wow fadeInUp" data-wow-delay="0.1s">
            <div class="about-col">
              <div class="img">
                <img src="dependencies/BizPage/img/classification_phylogenetique.jpg" alt="" class="img-fluid" style="height: 321px;">
                <div class="icon"><i class="ion-ios-list-outline"></i></div>
              </div>
              <h2 class="title"><a href="/BioDevApp/hierarchie?niveau=Angiospermes">Classification Phylogénétique</a></h2>
              <p>
                La classification APG III, ou classification phylogénétique, est la troisième version de classification botanique des angiospermes établie par l'Angiosperm Phylogeny Group. C'est la classification botanique la plus importante aujourd'hui.
              </p>
            </div>
          </div>
        </div>

      </div>
    </section><!-- #about -->
    <section id="more-features" class="section-bg">
      <div class="container">

        <div class="section-header">
          <h3 class="section-title">Quelques Ressources</h3>
        </div>

        <div class="row" style="margin-top: 5%;">

          <div class="col-lg-6">
            <div class="box wow fadeInLeft">
              <img src="\BioDevApp\images\RGAlim\fraisier.jpg" alt="" class="img-fluid">
              <h4 class="title"> <a href="/BioDevApp/ressource?rg=Fragaria x">Fraisier</a></h4>
              <p class="description">Fragaria est un genre de plantes de la famille des Rosaceae. C'est le nom générique des fraisiers. Ce sont des herbacées, tendant à se lignifier, non épineuses, à calice doublé d'un calicule, ayant un faux-fruit charnu, qu'on appelle fraise</p>
            </div>
          </div>

          <div class="col-lg-6">
            <div class="box wow fadeInRight">
              <img src="\BioDevApp\images\RGAlim\pecher.jpg" alt="" class="img-fluid">
              <h4 class="title" style="margin-top: 1%;"><a href="">Pêcher</a></h4>
              <p class="description">Son fruit (la pêche), est une drupe généralement sphérique même s'il existe aussi des pêchers à fruits aplatis. Selon les variétés, la peau peut être veloutée ou lisse, la chair blanche ou jaune, et le noyau adhérent à la chair ou se détachant librement.</p>
            </div>
          </div>

          <div class="col-lg-6">
            <div class="box wow fadeInLeft">
               <img src="\BioDevApp\images\RGAlim\citronnier.jpg" alt="" class="img-fluid">
              <h4 class="title"><a href="">Citronier</a></h4>
              <p class="description">Le citronnier, Citrus ×limon, cultivée dans les régions méditerranéennes et subtropicales pour son fruit le citron, dont le jus est utilisé principalement comme condiment. L'origine de l'espèce est un hybride entre le cédratier et l'orange amère</p>
            </div>
          </div>

          <div class="col-lg-6">
            <div class="box wow fadeInRight">
              <img src="\BioDevApp\images\RGAlim\abricotier.jpg" alt="" class="img-fluid">
              <h4 class="title"><a href="">Abricotier</a></h4>
              <p class="description">L’Abricotier, parfois appelé Abricotier commun, cultivé pour son fruit, l'abricot. Dans les Grandes Antilles, le terme abricot désigne le fruit d'un arbre appelé Abricotier des Antilles Mammea americana L. de la famille des Clusiacées</p>
            </div>
          </div>

        </div>
      </div>
      <section id="intro" style="background: none; height: 50px;">

    <div class="intro-text">
      <a href="#about" class="btn-get-started scrollto" style="margin: 0px;">Voir plus</a>
    </div>

  </section><!-- #intro -->
    </section>
  </div>
</div>
</div>
</div>
</div>
  <%@include file="/WEB-INF/JSP/RGFaune/footer.jsp" %>
 <script src="dependencies/admin/vendor/jquery/jquery.min.js"></script>
  <script src="dependencies/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="dependencies/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="dependencies/admin/js/sb-admin-2.min.js"></script>

  <!-- Page level custom scripts -->
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

  <!-- Template Main Javascript File -->
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

</body>
</html>