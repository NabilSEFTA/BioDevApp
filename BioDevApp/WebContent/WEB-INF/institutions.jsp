<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html >
<head>
  <meta charset="utf-8">
  <title>Liste des institutions</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Favicons -->
  <link href="<%= request.getContextPath() %>/template/img/favicon.png" rel="icon">
  <link href="<%= request.getContextPath() %>/template/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="<%= request.getContextPath() %>/template/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="<%= request.getContextPath() %>/template/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="<%= request.getContextPath() %>/template/lib/animate/animate.min.css" rel="stylesheet">
  <link href="<%= request.getContextPath() %>/template/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="<%= request.getContextPath() %>/template/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="<%= request.getContextPath() %>/template/css/style.css" rel="stylesheet">
  





</head>

<body class="box-collapse-closed">

  <div class="click-closed"></div>
  <!--/ Form Search Star /-->
  <div class="box-collapse">
    <div class="title-box-d">
      <h3 class="title-d"> Recherche des institutions </h3>
    </div>
    <span class="close-box-collapse right-boxed ion-ios-close"></span>
    <div class="box-collapse-wrap form">
      <form class="form-a" method="post" action="rechSer">
        <div class="row">
          <div class="col-md-12 mb-2">
            <div class="form-group">
              <label for="acronyme_inst">Acronyme de l'institution:</label>
              <input type="text" class="form-control form-control-lg form-control-a" placeholder="Acronyme" id="acronyme_inst" name="acronyme_inst">
            </div>
          </div>
          <div class="col-md-12 mb-2">
            <div class="form-group">
              <label for="nom_inst">Nom de l'institution:</label>
              <input type="text" class="form-control form-control-lg form-control-a" placeholder="Nom" id="nom_inst" name="nom_inst">
            </div>
          </div>
          <div class="col-md-12 mb-2">
            <div class="form-group">
              <label for="cat_inst">Catégorie:</label>
              <select class="form-control form-control-lg form-control-a" id="cat_inst" name="cat_inst">
                <option value="0">Toutes les catégories</option>
                <option value="1">Publique</option>
                <option value="2">Privée</option>
              </select>
            </div>
          </div>
                    <div class="col-md-12">
            <button type="submit" class="btn btn-b">Chercher</button>
          </div>
        </div>
      </form>
    </div>
  </div>
  <!--/ Form Search End /-->

  <!--/ Nav Star /-->
  <nav class="navbar navbar-default navbar-expand-lg fixed-top navbar-trans">
    <div class="container">
      <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbarDefault" aria-controls="navbarDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span></span>
        <span></span>
        <span></span>
      </button>
      <a class="navbar-brand text-brand" href="index.jsp"><span class="color-b">BIO.</span>dev</a>
      <button type="button" class="btn btn-link nav-search navbar-toggle-box-collapse d-md-none" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-expanded="false">
        <span class="fa fa-search" aria-hidden="true"></span>
      </button>
      <div class="navbar-collapse collapse justify-content-center" id="navbarDefault">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" href="index.jsp">RG</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="institutions.jsp">CTA</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="InstitutionsSer">Annuaire</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" href="institutions.jspl">Réglementation</a>
          </li>
          
          <li class="nav-item">
            <a class="nav-link" href="contact.jsp">Contact</a>
          </li>
        </ul>
      </div>
      <button type="button" class="btn btn-b-n navbar-toggle-box-collapse d-none d-md-block" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-expanded="false">
        <span class="fa fa-search" aria-hidden="true"></span>
      </button>
    </div>
  </nav>
  <!--/ Nav End /-->

  <!--/ Intro Single star /-->
  <p id="demo"></p>
  <section class="intro-single">
    <div class="container">
    
      <div class="row">
        <div class="col-md-12 col-lg-8">
          <div class="title-single-box">
            <h1 class="title-single">Institutions</h1>
            <span class="color-text-a">nationales</span>
          </div>
        </div>
        
        <div style="right:-900px"   class="col-sm-12 ">
       <a href="ajoutSer" 
       class="btn btn-success btn-lg  " role="button" aria-disabled="true">Ajouter Institution</a>
      </div>
      
     </div>
      
    </div>
  </section>
  <!--/ Intro Single End /-->

  <!--/ News Grid Star /-->
  
  <section class="news-grid grid">
  <div class="container"> 
     <div class="row">  
     <div> <p style="color:red"><c:out value="${ message }"/></p></div>
     <c:forEach var="inst" items="${ insts }">
     
        <div class="col-md-4">
          <div class="card-box-b card-shadow news-box">
            <div class="img-box-b">
           
           
            <c:if test = "${inst.image_inst != null}">
              <img   src="<%= request.getContextPath() %>/BDImgs/${ inst.acronyme }.jpeg" alt="" class="img-b img-fluid image_size" >
             </c:if>
             <c:if test = "${inst.image_inst == null}">
               <img  src="<%= request.getContextPath() %>/BDImgs/standard.png" alt="" class="img-b img-fluid image_size">
             </c:if>
             
            </div>
            <div class="card-overlay">
              <div class="card-header-b">
                <div class="card-category-b ">
                   <span class="category-b btn-outline-success "><c:out value="${ inst.acronyme }"/></span>
                  
                </div>
                <div class="card-title-b">
                  <h2 class="title-2">
                    <a href="InstSer?id_inst=${inst.id_inst }" ><c:out value="${ inst.nom_inst}"/></a>
                  </h2>
                </div>
               <div >
               <a href="ModifierInst?id_inst=${inst.id_inst }" 
               class="btn btn-outline-success" role="button" aria-disabled="true">Modifier</a>
               
            
              <a href="SupprimerInst?id_inst=${inst.id_inst}"  class="btn btn-outline-success"  role="button" 
               onclick="return confirm('Etes vous sùr de vouloir supprimer cette institution?');">Supprimer</a>  
                
            
            </div>
            </div>
              </div>
               
          </div>
        </div>
        </c:forEach>
        
   </div>
   <c:if test="${ insts.size() >9}">
         <div class="row">
        <div class="col-sm-12">
          <nav class="pagination-a">
            <ul class="pagination justify-content-end">
              <li class="page-item disabled">
                <a class="page-link" href="#" tabindex="-1">
                  <span class="ion-ios-arrow-back"></span>
                </a>
              </li>
              <li class="page-item">
                <a class="page-link" href="#">1</a>
              </li>
              <li class="page-item active">
                <a class="page-link" href="#">2</a>
              </li>
              <li class="page-item">
                <a class="page-link" href="#">3</a>
              </li>
              <li class="page-item next">
                <a class="page-link" href="#">
                  <span class="ion-ios-arrow-forward"></span>
                </a>
              </li>
            </ul>
          </nav>
        </div>
      </div>
      </c:if>
  
    </div> 
    
  </section>
  
   <!--/ footer Star /-->
  <section class="section-footer">
    <div class="container">
      <div class="row">
        <div class="col-sm-12 col-md-4">
          <div class="widget-a">
            <div class="w-header-a">
              <h3 class="w-title-a text-brand">EstateAgency</h3>
            </div>
            <div class="w-body-a">
              <p class="w-text-a color-text-a">
                Enim minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip exea commodo consequat duis
                sed aute irure.
              </p>
            </div>
            <div class="w-footer-a">
              <ul class="list-unstyled">
                <li class="color-a">
                  <span class="color-text-a">Phone .</span> contact@example.com</li>
                <li class="color-a">
                  <span class="color-text-a">Email .</span> +54 356 945234</li>
              </ul>
            </div>
          </div>
        </div>
        <div class="col-sm-12 col-md-4 section-md-t3">
          <div class="widget-a">
            <div class="w-header-a">
              <h3 class="w-title-a text-brand">The Company</h3>
            </div>
            <div class="w-body-a">
              <div class="w-body-a">
                <ul class="list-unstyled">
                  <li class="item-list-a">
                    <i class="fa fa-angle-right"></i> <a href="#">Site Map</a>
                  </li>
                  <li class="item-list-a">
                    <i class="fa fa-angle-right"></i> <a href="#">Legal</a>
                  </li>
                  <li class="item-list-a">
                    <i class="fa fa-angle-right"></i> <a href="#">Agent Admin</a>
                  </li>
                  <li class="item-list-a">
                    <i class="fa fa-angle-right"></i> <a href="#">Careers</a>
                  </li>
                  <li class="item-list-a">
                    <i class="fa fa-angle-right"></i> <a href="#">Affiliate</a>
                  </li>
                  <li class="item-list-a">
                    <i class="fa fa-angle-right"></i> <a href="#">Privacy Policy</a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
        <div class="col-sm-12 col-md-4 section-md-t3">
          <div class="widget-a">
            <div class="w-header-a">
              <h3 class="w-title-a text-brand">International sites</h3>
            </div>
            <div class="w-body-a">
              <ul class="list-unstyled">
                <li class="item-list-a">
                  <i class="fa fa-angle-right"></i> <a href="#">Venezuela</a>
                </li>
                <li class="item-list-a">
                  <i class="fa fa-angle-right"></i> <a href="#">China</a>
                </li>
                <li class="item-list-a">
                  <i class="fa fa-angle-right"></i> <a href="#">Hong Kong</a>
                </li>
                <li class="item-list-a">
                  <i class="fa fa-angle-right"></i> <a href="#">Argentina</a>
                </li>
                <li class="item-list-a">
                  <i class="fa fa-angle-right"></i> <a href="#">Singapore</a>
                </li>
                <li class="item-list-a">
                  <i class="fa fa-angle-right"></i> <a href="#">Philippines</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <footer>
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <nav class="nav-footer">
            <ul class="list-inline">
              <li class="list-inline-item">
                <a href="#">Home</a>
              </li>
              <li class="list-inline-item">
                <a href="#">About</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Property</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Blog</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Contact</a>
              </li>
            </ul>
          </nav>
          <div class="socials-a">
            <ul class="list-inline">
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-facebook" aria-hidden="true"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-twitter" aria-hidden="true"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-instagram" aria-hidden="true"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-pinterest-p" aria-hidden="true"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a href="#">
                  <i class="fa fa-dribbble" aria-hidden="true"></i>
                </a>
              </li>
            </ul>
          </div>
          <div class="copyright-footer">
            <p class="copyright color-text-a">
              © Copyright
              <span class="color-a">EstateAgency</span> All Rights Reserved.
            </p>
          </div>
          <div class="credits">
            <!--
              All the links in the footer should remain intact.
              You can delete the links only if you purchased the pro version.
              Licensing information: https://bootstrapmade.com/license/
              Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=EstateAgency
            -->
            Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
          </div>
        </div>
      </div>
    </div>
  </footer>
  <!--/ Footer End /-->

  <a href="#" class="back-to-top" style="display: none;"><i class="fa fa-chevron-up"></i></a>
  

  <!-- JavaScript Libraries -->
  <script src="<%= request.getContextPath() %>/template/lib/jquery/jquery.min.js"></script>
  <script src="<%= request.getContextPath() %>/template/lib/jquery/jquery-migrate.min.js"></script>
  <script src="<%= request.getContextPath() %>/template/lib/popper/popper.min.js"></script>
  <script src="<%= request.getContextPath() %>/template/lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="<%= request.getContextPath() %>/template/lib/easing/easing.min.js"></script>
  <script src="<%= request.getContextPath() %>/template/lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="<%= request.getContextPath() %>/template/lib/scrollreveal/scrollreveal.min.js"></script>
  <!-- Contact Form JavaScript File -->
  <script src="<%= request.getContextPath() %>/template/contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="<%= request.getContextPath() %>/template/js/main.js">
 
  </script>

<script>

  function myFunction() {
	  var val = confirm("Etes vous sùr de vouloir supprimer cette institution?");
	  
	  if( val == true ) {
		  document.getElementById("del").href ="SupprimerInst?id_inst=${inst.id_inst}";
 		 } else {
 			 document.getElementById("del").href ="#";
 }
	 
	}
  </script>


</body>
</html>
