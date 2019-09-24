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
          </div>
        </div>
       <!-- --> <div class="col-md-12 col-lg-4">
          <nav aria-label="breadcrumb" class="breadcrumb-box d-flex justify-content-lg-end">
            <ol class="breadcrumb">
              <li class="breadcrumb-item">
                <a href="MicroOrganismes">RG</a>
              </li>
              <li class="breadcrumb-item active" aria-current="page">
                CTA
              </li>
            </ol>
          </nav>
        </div> 
      </div>
    </div>
  </section>
  <!--/ Intro Single End /-->

  <!--/ Property Grid Star / -->
  <section class="property-grid grid">
    <div class="container">
      <div class="row">
	     <c:forEach var="i" begin="1" end="${sessionScope.listCTAM.size()}" step="1">
	        <div class="col-md-4">
	          <div class="card-box-a card-shadow">
	          <c:if test="${sessionScope.listCTAM.get(i-1).isValidee()}" >  
	            <div class="img-box-a">
	              <img src="${sessionScope.listCTAM.get(i-1).getImage()}" alt="" height="350" width="400" >
	            </div>
	            <div class="card-overlay">
	              <div class="card-overlay-a-content">
	                <div class="card-header-a">
	                  <h2 class="card-title-a">
	                   <a href="CTADetailsM?numCta=${i}">${sessionScope.listCTAM.get(i-1).getIntitule()}</a>
	                  </h2>
	                </div>
	                <div class="card-body-a">       
	                  <a href='CTADetails?numCta=${i}' class="link-a">En savoir plus > 
	                  </a>
	                </div>         
	              </div>
	            </div>
	            </c:if>
	          </div>
	        </div>
	      </c:forEach>
       </div>
    </div>
  </section>
  <!--/ Property Grid End /-->
	 <div class="col-md-10 offset-md-1">
	          <ul class="nav nav-pills-a nav-pills mb-3 section-t3" id="pills-tab" role="tablist">
	            <li class="nav-item">
	              <a class="nav-link active" id="pills-video-tab" data-toggle="pill" href="img/Micro.mp4" role="tab"
	                aria-controls="pills-video" aria-selected="true">Vid&eacuteo</a>
	            </li>
	          </ul>
	          <div class="tab-content" id="pills-tabContent">
	            <div class="tab-pane fade show active" id="pills-video" role="tabpanel" aria-labelledby="pills-video-tab">
	              <iframe src="img/CTA.mp4" width="100%" height="460" frameborder="0"
	                webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
	            </div>
	          
	          </div>
	    </div>
	    
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
