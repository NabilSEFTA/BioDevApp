<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Description d'une institution</title>
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

</head>

<body>

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
     
    </div>
  </nav>
  <!--/ Nav End /-->
 
			<!------------------------------------------------------------------->
	<section class="intro-single">
   <div class="container">
   <div> <p style="color:red"><c:out value="${ msgAjout}"/></p></div>
    <h2 id="nomRessource" class="title-single text-center" >${inst.nom_inst}: présentation
    </h2>
    <div class="row">
      <div class="col-md-12 section-t8" style="padding-top: 30px;">
        <div class="row">
          <div class="col-md-6 col-lg-5" >
             <c:if test = "${inst.image_inst != null}">
              <img   src="<%= request.getContextPath() %>/BDImgs/${ inst.acronyme }.jpeg" alt="" class=" img-fluid image_size" >
             </c:if>
             <c:if test = "${inst.image_inst == null}">
               <img  src="<%= request.getContextPath() %>/BDImgs/standard.png" alt="" class=" img-fluid image_size">
             </c:if>
             
          </div>
            
          <div class="col-md-6 col-lg-5 section-md-t3">
            <div class="title-box-d">
              <h4 class="title-d">
                  Description 
              </h4>
            </div>
            <p  style="color:black" class="color-text-a">
                <Strong> Acronyme:</Strong> ${inst.acronyme}
                <br>
                <Strong> Catégorie:</Strong>
                <c:if test = "${inst.id_cat_inst ==1}"> Publique</c:if>
                <c:if test="${inst.id_cat_inst==2 }">Privée</c:if>
                <br>
                <br>
                <br>
              <c:out value= "${inst.description_inst}"/>
            </p>
          </div>
        </div>
      </div>
    </div>
    <div class="title-box-d">
    <br><br>
      <h6 class="title-d">
        Contacts de l'institution:
      </h6>
    </div>
 
      <div style="color:black" class="row">
         <ul>
         <li><p style="color:black"><Strong>Numéro de téléphone :</Strong> ${inst.tel_inst}</p> </li>
         <li><p style="color:black"><Strong>Fax :</Strong> ${inst.fax_inst}</p></li>
         <li><p style="color:black"><Strong>Adresse E-mail:</Strong> ${inst.mail_inst}</p></li>
         <li ><a href="<c:url value="http://${inst.lien_site}"/>" alt="" >
          <div class= "row container">
          <p style="color:black"><Strong>   Lien du site web:</Strong></p>
          <p style="color:blue"> ${inst.lien_site}</p>
           </div> </a></li>
         <li><p style="color:black"><Strong>Adresse:</Strong> ${inst.adresse_inst}</p></li>
         </ul>
      
      </div>
 
  </div>
 </section>
			<!------------------------------------------------------------------->
  
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
  <script src="<%= request.getContextPath() %>/template/js/main.js"></script>



</body>
</html>