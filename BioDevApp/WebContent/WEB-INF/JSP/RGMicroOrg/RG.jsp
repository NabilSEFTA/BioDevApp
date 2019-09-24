<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Les Micro organismes</title>
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
       <!-- --> <div class="col-md-12 col-lg-4">
          <nav aria-label="breadcrumb" class="breadcrumb-box d-flex justify-content-lg-end">
            <ol class="breadcrumb">
              <li class="breadcrumb-item">
                <a href="RG">RG</a>
              </li>
              <li class="breadcrumb-item active" aria-current="page">
                MicroOrganismes
              </li>
            </ol>
          </nav>
        </div> 
      </div>
    </div>
  </section>
  <!--/ Intro Single End /-->

  <!--/ Property Grid Star /-->
  <section class="property-grid grid">
    <div class="container">
      <div class="row">  
      <c:forEach var="i" begin="1" end="${sessionScope.listRGCM.size()}" step="1">  
	        <div class="col-md-4">
		          <div class="card-box-a card-shadow">
		            <div class="img-box-a">
		              <img src="${sessionScope.listRGCM.get(i-1).getImage()}" alt="" height="350" width="350" >
		            </div>
		            <div class="card-overlay">
		              <div class="card-overlay-a-content"> 
		                <div class="card-header-a">
		                  <h2 class="card-title-a">
		                   <a href='EmbranchementM?numEmbr=${i}'>${sessionScope.listRGCM.get(i-1).getNom()}</a>
		                  </h2>
		                </div>
		                <div class="card-body-a">
		                  <a href='EmbranchementM?numEmbr=${i}' class="link-a">En savoir plus
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
  <!--/ Property Grid End /-->
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
