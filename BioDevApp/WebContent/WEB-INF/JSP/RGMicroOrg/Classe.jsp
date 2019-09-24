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
                ${sessionScope.rgcmc.getNom() }
              </li>
            </ol>
          </nav>
        </div>
      </div>
    </div>
  </section>
  <!--/ Intro Single End /-->

  <!--/ Property Single Star /-->
  <section class="property-single nav-arrow-b">
    <div class="container">
      <div class="row">    
	        <div class="card-box-a">
	          <div class="col-md-4 col-lg-3">
	            <div class="img-box-a">   
	              <img src=" ${sessionScope.rgcmc.getImage() }" alt="" height="350" width="350">
	            </div>
	           </div>
	         </div>   
            <div class="col-md-7 col-lg-7 section-md-t3">
	              <div class="row">
	                <div class="col-sm-12">
	                  <div class="title-box-d">
	                    <h3 class="title-d">                
	                    ${sessionScope.rgcmc.getNom() }
						</h3>
	                  </div>
	                 </div>
	               </div>           
	              <div class="Classe">
	                <p  class="description color-text-a no-margin">
	                 	${sessionScope.rgcmc.getDescription()}
	                </p> 
	              </div>
	              <div class="col-md-12" >
		              <a href="CategoriesM">
		                 <button type="reset"  class="btn btn-a" >Catégories</button>
		              </a>
	              </div>
            </div>
          </div>
        </div>
  </section>
  <!--/ Property Single End /-->

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
