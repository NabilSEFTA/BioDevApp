<%@ page pageEncoding="UTF-8" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Rgfaune-embranchement</title>
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
            <h1 class="title-single">Ressource faunistique</h1>
            <span class="color-text-a">Classification classique</span>
          </div>
        </div>
        <div class="col-md-12 col-lg-4">
 
        </div>
      </div>
    </div>
  </section>
  <!--/ Intro Single End /-->

  <!--/ Agent Single Star /-->
  <section class="agent-single">
    <div class="container">  
   <div class="col-md-6">
              <div class="agent-avatar-box">
                <img src="image/class_classique.PNG" alt="" class="agent-avatar img-fluid">
              </div>
    </div>
                       
            <div class="col-md-5 section-md-t3">
              <div class="agent-info-box">
                <div class="agent-title">
                  <div class="title-box-d">
                    <h3 class="title-d">La classification classique</h3>
                  </div>
                </div>
                <div class="agent-content mb-3">
                  <p class="content-d color-text-a">
                  En sciences naturelles, la classification classique (ou linnéenne) est un paradigme de classement des espèces vivantes dans lequel celles-ci sont classées assez subjectivement sur les ressemblances les plus visibles entre elles. Elle s'est développée en intégrant le système de nomenclature proposé à  partir de 1735 par Linné. Les espèces reà§oivent un nom latinisé, constitué de deux termes (nomenclature binominale) et sont hiérarchisées en genres, familles, ordres, classes, embranchements et règnes. Cette classification est appelée Â« classique Â» par opposition à  la classification phylogénétique, formalisée en 1950 et principalement fondée sur la cladistique, une méthode de reconstruction phylogénétique qui a remplacé en grande partie la classification traditionnelle dans la plupart des milieux scientifiques et universitaires.
                  Concernant le règne animal, nous observons la classification qui suit.
                  </p>
            
                </div>
             
              </div>
            </div>
        <div class="col-md-12 section-t8">
          <div class="title-box-d">
            <h3 class="title-d">Embranchement</h3>
          </div>
        </div>
        
     <div class="row">
     <c:forEach var="i" begin="1" end="${sessionScope.listRGCF.size()}" step="1"> 
         <div class="col-md-4">
            <div class="card-box-a card-shadow">
              <div class="img-box-a">
                <img src="${sessionScope.listRGCF.get(i-1).getImage()}" alt=""  class="img-a img-fluid" >
              </div>
              <div class="card-overlay">
                <div class="card-overlay-a-content">
                  <div class="card-header-a">
                    <h2 class="card-title-a">
                      <a href="cvert?numClasse=${i}">${sessionScope.listRGCF.get(i-1).getNom() } </a>                
                    </h2>
                  </div>
                  <div class="card-body-a">
                    <a href="cvert?numClasse=${i}" class="link-a">en savoir plus
                      <span class="ion-ios-arrow-forward"></span>
                    </a>
                  </div>
                </div>
              </div>
            </div>
          </div>
          </c:forEach>
     
      
      
    </div>
    
   </div> 
    
    
    
    
    
    
  </section>
 
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
