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
              <section id="portfolio"  class=" section-bg" >
                <div class="section-header">
                 <h3 class="section-title" style="margin-bottom: 5%;">Toutes les Ressources Phytogenetiques </h3>
                </div>
                <div class="container">       
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
                          <img src="images/RGAlim/${rg.nomFrancais}.jpg" class="img-fluid" alt="">
                          <a href="" data-lightbox="portfolio" data-title="App 1" class="link-preview" title="Preview"><i class="ion ion-eye"></i></a>
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
  </div>
</div>
 <%@include file="/WEB-INF/JSP/RGAlim/footer.jsp" %>
</body>
</html>
