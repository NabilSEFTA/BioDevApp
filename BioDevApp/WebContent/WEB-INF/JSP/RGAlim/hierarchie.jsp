<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta charset="utf-8">
<meta charset="utf-8">
  <title>Ajout d'une Ressource Phytogenetique</title>      
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
  <link href="dependencies/BizPage/css/style.css" rel="stylesheet">
  <link href="dependencies/css/style.css" rel="stylesheet">
  <style type="text/css">#contenu {
                                    margin-top: 5%;
                                    margin-left:15%;
                                    margin-right: 15%;
                                   
                                    background-color: white;
                                   
                                    
                                      }
                          #body {
                                   padding-top: 5%;
                                   padding-bottom: 5%; 
                                   background-image: url("dependencies/img/canada-2250105_960_720.jpg");
                                   background-repeat: no-repeat;
                                   
                                   background-size: 100%;
                                   background-attachment: fixed;
                                 
                          } 
  </style>
<title>Insert title here</title>
</head>
<body>
<%@include file="/WEB-INF/JSP/RGAlim/Nav.jsp" %>
	<!--<c:if test="${fn:length(list) == 0}">
		<div class="card">
  			<h4 class="card-title">Card title</h4>
		    <p class="card-text">Some example text. Some example text.</p>
		    <a href="#" class="card-link" >Card link</a>
		</div>
		<div class="card">
  			<h4 class="card-title">Card title</h4>
		    <p class="card-text">Some example text. Some example text.</p>
		    <a href="#" class="card-link">Card link</a>
		</div>
	</c:if>-->
  <div id="wrapper" >
    <c:if test="${isConnected}">
      
      <%@include file="/WEB-INF/JSP/RGAlim/NavCnx.jsp" %>
    </c:if>
    <div class="container">
   <div id="content-wrapper" class="d-flex flex-column" >
    <div id="content" >
      <div class="container-fluid">
         <div class="section-header" style="margin-bottom: 5%;">
          <h3 class="section-title">Description de Niveau</h3>
          <span class="section-divider"></span>
        </div>

        <div class="row" style="margin-bottom: 5%;">
          <div class="col-lg-6 about-img wow fadeInLeft">
            <img src="img/about-img.jpg" style="width: 508px;">
          </div>

          <div class="col-lg-6 content wow fadeInRight">
       
            <p>
              ${description}
            </p>

           
          </div>
        </div>
        <section id="portfolio"  class="section-bg" >
	       <div class="container">
         <header class="section-header">
           <h3 id="nomNiveau" class="section-title" style="margin-bottom: 5%;"></h1>
            <p class="text-left " id="path">${levelAncestors}</p>
        </header>

	         <c:forEach items="${list}" var="level" varStatus="boucle">
            <c:if test="${boucle.index == 0}">
              <script type="text/javascript">
                var text = document.getElementById('nomNiveau');
                var path = document.getElementById('path');
                text.innerHTML ="Niveau :" + " ${level.nomNiveau}" ;
                path.innerHTML = path.innerHTML + " ${level.nomNiveau}";
              </script>
            </c:if>
           <c:if test="${boucle.index % 3 == 0}">
            <div class="row portfolio-container">
          </c:if>
		      <c:forTokens items = "${level.parentPath}" delims = "." var = "niv" varStatus="status">
         	 <c:if test="${status.last}">
         	    <div class="col-lg-4 col-md-6 portfolio-item filter-app wow fadeInUp">
                <div class="portfolio-wrap">
                  <figure>
                    <img src="dependencies/BizPage/img/plante.jpg" class="img-fluid" alt="">
                    <a href="img/portfolio/app1.jpg" data-lightbox="portfolio" data-title="App 1" class="link-preview" title="Preview"><i class="ion ion-eye"></i></a>
                    <a href="#" class="link-details" title="More Details"><i class="ion ion-android-open"></i></a>
                  </figure>
                  <div class="portfolio-info">
                    <button id="${niv}" type="button" value="${niv}" class="btn btn-success">${niv}</button>
                  </div>
                </div>
                </div>
	           <script type="text/javascript">
      					var button = document.getElementById ('${niv}');
      					button.onclick = function (){
      						location.href = "/BioDevApp/hierarchie?niveau="+"${niv}";
      					}
	     			 	</script>
      		</c:if>
      </c:forTokens>
          <c:if test="${boucle.index % 3 == 2 }">
            </div>
          </c:if>
	</c:forEach>
	</div>
	</div>
</section>
<script src="dependencies/admin/vendor/jquery/jquery.min.js"></script>
  <script src="dependencies/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="dependencies/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="dependencies/admin/js/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="dependencies/admin/vendor/chart.js/Chart.min.js"></script>

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
</body>
</html>