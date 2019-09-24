<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">      
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
  <link href="dependencies/BizPage/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Main Stylesheet File -->
  <link href="dependencies/css/style.css" rel="stylesheet">
  <link href="dependencies/BizPage/css/style.css" rel="stylesheet">
  <!-- Datepicker style -->
  <link href="dependencies\lib\gijgo\css\gijgo.min.css" rel="stylesheet" type="text/css" />
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
	   <section id="portfolio"  class=" section-bg" >
    	<div class="container">
         <header class="section-header">
           <h3 id="nomNiveau" class="section-title" style="margin-bottom: 5%;"></h1>
           <p class="text-left" id="path">${levelAncestors}</h1>
        </header>
		<c:forEach items="${ressource}" var="rg" varStatus="boucle">
    <c:if test="${boucle.index == 0}">
              <script type="text/javascript">
                var text = document.getElementById('nomNiveau');
                text.innerHTML ="Niveau :" + " ${niveau}" ;
              </script>
            </c:if>
			<c:if test="${boucle.index % 3 == 0}">
     			<div class="row portfolio-container">
   			 </c:if>
   			 <div class="col-lg-4 col-md-6 portfolio-item filter-app wow fadeInUp">
          <div class="portfolio-wrap">
            <figure>
              <img src="dependencies/BizPage/img/plante.jpg" class="img-fluid" alt="">
                <a href="img/portfolio/app1.jpg" data-lightbox="portfolio" data-title="App 1" class="link-preview" title="Preview"><i class="ion ion-eye"></i></a>
                <a href="#" class="link-details" title="More Details"><i class="ion ion-android-open"></i></a>
            </figure>
              <div class="portfolio-info">
                 <button id="${rg.nomLatin}" type="button" value="${rg.nomFrancais}" class="btn btn-success">${rg.nomFrancais}</button>
              </div>
          </div>
        </div>
	          		 <script type="text/javascript">
      					var button = document.getElementById ('${rg.nomLatin}');
      					button.onclick = function (){
      						location.href = "/BioDevApp/ressource?rg="+"${rg.nomLatin}";
      					}
	     			 </script>
	     		<c:if test="${boucle.index % 3 == 2}">
            		</div>
          		</c:if>
		</c:forEach>
	</div>
	</div>

</section>
</div>
</div>
</div>
</div>
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
   <%@include file="/WEB-INF/JSP/RGAlim/footer.jsp" %>
</body>
</html>