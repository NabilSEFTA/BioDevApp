<%@ page language="java"
    pageEncoding="UTF-8"%>
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
        <h1 id="nomRessource" class="title-single text-center" >${ressource.nomFrancais} :Présentations et Caractéristiques 
        </h1>
        <div class="row">
          <div class="col-md-12 section-t8" style="padding-top: 30px;">
           <div class="row">
              <div class="col-md-6 col-lg-5" >
                <img src="\BioDevApp\images\RGAlim\pecher.jpg" alt="" class="img-fluid">
              </div>
              <div class="col-md-6 col-lg-5 section-md-t3">
                <div class="title-box-d">
                  <h3 class="title-d">
                   Description 
                  </h3>
                </div>
                <p class="color-text-a">
                  ${ressource.description}
                </p>
              </div>
             </div>
            </div>
          </div>
          <c:if test="${isConnected}">
        <div class="title-box-d">
          <h3 class="title-d">
            Caractéristiques de la Ressource
          </h3>
        </div>
       
          <div class="row">
            <div class="col-md-6">
              <div class="mainflip">     
                <div class="frontside">
                  <div class="card shadow-sm p-3 mb-5 bg-white rounded" >   
                    <div class="card-header">
                      <h3 class="title-d">Caractéristique Anatomique</h3>
                    </div>
                    <div class="card-body">
                          <p>Feuille : ${ressource.caracAnatomique.feuille}</p>
                          <p>Fleure : ${ressource.caracAnatomique.fleur}</p>
                          <p>Fruit : ${ressource.caracAnatomique.fruit}</p>
                          <p>Graine : ${ressource.caracAnatomique.graine}</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <div class="mainflip">     
                <div class="frontside">
                  <div class="card  shadow-sm p-3 mb-5 bg-white rounded" >  
                    <div class="card-header">
                      <h3 class="title-d">Caractéristique Morphologique</h3>
                    </div> 
                    <div class="card-body">
                      <p>Couleur fleure : ${ressource.caracMorphologique.couleurFleur}</p>
                      <p>Germe : ${ressource.caracMorphologique.germe}</p>
                      <p>Maturité : ${ressource.caracMorphologique.maturité}</p>
                      <p>Graine : ${ressource.caracAnatomique.graine}</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-md-6">
              <div class="mainflip">     
                <div class="frontside">
                  <div class="card shadow-sm p-3 mb-5 bg-white rounded" >   
                    <div class="card-header">
                      <h3 class="title-d">Ecosystème de la Ressource</h3>
                    </div>
                    <div class="card-body">
                          <p>PH : ${ressource.ecosystemeResPhytos[0].dPh}</p>
                          <p>Ions Minéreaux: ${ressource.ecosystemeResPhytos[0].ionsMiniraux}</p>
                          <p>Quantité Eau : ${ressource.ecosystemeResPhytos[0].qEau}</p>
                          <p>Température : ${ressource.ecosystemeResPhytos[0].température}</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <div class="mainflip">     
                <div class="frontside">
                  <div class="card text-center shadow-sm p-3 mb-5 bg-white rounded" >   
                    <div class="card-header">
                      <h3 class="title-d">Ecosystème de la Ressource</h3>
                    </div>
                    <div class="card-body">
                      <p>Couleur fleure : ${ressource.caracMorphologique.couleurFleur}</p>
                      <p>Germe : ${ressource.caracMorphologique.germe}</p>
                      <p>Maturité : ${ressource.caracMorphologique.maturité}</p>
                      <p>Graine : ${ressource.caracAnatomique.graine}</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
       </c:if>
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