<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BIODev</title>
<!-- Bootstrap CSS File -->
<link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
 
 
 
  <!-- Favicons -->
  <link href="img/favicon.png" rel="icon">
  <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,700|Open+Sans:300,300i,400,400i,700,700i" rel="stylesheet">
  
<!-- Libraries CSS Files -->
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="lib/magnific-popup/magnific-popup.css" rel="stylesheet">
 
 <!-- Main Stylesheet File -->
 <link href="inc/article.css" rel="stylesheet">
</head>
<body>
<!--==========================
    Header
  ============================-->
  <header id="header">
    <div class="container">

      <div id="logo" class="pull-left">
        <h1><a href="#intro" class="scrollto">Bio.DEV</a></h1>
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <a href="#intro"><img src="img/logo.png" alt="" title=""></a> -->
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li class="menu-active"><a href="BioDev"  style ="font-weight: bold; font-size: 20px;">Accueil</a></li>
          <li class="menu-has-children"><a href="#" style ="font-weight: bold;font-size: 20px;">RG</a>
            <ul>
                <li><a href="#" >Ressources forestières</a></li>
	            <li><a href="/BioDevApp/classifications">Alimentation et l’agriculture</a></li>
	            <li><a href="StartRGMarines"  >Ressources marines</a></li>
	            <li><a href="/BioDevApp/rgfaune" >la faune sauvage et domestique</a></li>
	            <li><a href="MicroOrganismes" >Microorganismes</a></li>
          	</ul>
          </li>
          <li><a href="#about" style ="font-weight: bold; font-size: 20px;">CTA</a>
	        <ul>
	        	<li><a href="#" >Ressources forestières</a></li>
	            <li><a href="#">Alimentation et l’agriculture</a></li>
	            <li><a href="#" >Ressources marines</a></li>
	            <li><a href="#" >la faune sauvage et domestique</a></li>
	            <li><a href="#">Microorganismes</a></li>
          	</ul>
          </li>
          <li><a href="InstitutionsSer" onclick="" style ="font-weight: bold;font-size: 20px;">Annuaire</a></li>
          <li><a href="/BioDevApp/ged/viewFiles.jsp"  style ="font-weight: bold;font-size: 20px;">Réglementation</a></li>
          
          
           
                 
         <!--  <li><a href="#team">Team</a></li>
          <li><a href="#gallery">Gallery</a></li>
          <li class="menu-has-children"><a href="">Drop Down</a>
            <ul>
              <li><a href="#">Drop Down 1</a></li>
              <li class="menu-has-children"><a href="#">Drop Down 2</a>
                <ul>
                  <li><a href="#">Deep Drop Down 1</a></li>
                  <li><a href="#">Deep Drop Down 2</a></li>
                  <li><a href="#">Deep Drop Down 3</a></li>
                  <li><a href="#">Deep Drop Down 4</a></li>
                  <li><a href="#">Deep Drop Down 5</a></li>
                </ul>
              </li>
              <li><a href="#">Drop Down 3</a></li>
              <li><a href="#">Drop Down 4</a></li>
              <li><a href="#">Drop Down 5</a></li>
            </ul>
          </li>--> 
          <li><a href="#" onclick="document.getElementsByName('Connexion')[0].click();" style ="font-weight: bold;font-size: 20px;">Connexion</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- #header -->


  <div class="container1">
	<img alt="" src="${requestScope.PathArticle}" class="img-article" >
	<h1 class="title-article"><c:out value="${requestScope.TitreArticle}" /> </h1>
	<blockquote class="ludwig">
	    <c:out value="${requestScope.DescriptionArticle}" />
    </blockquote>
    <p class="texte-article">   
    	<c:out value="${requestScope.ContenuArticle}" />																	
    </p>
    <div class="a2a_kit a2a_kit_size_32 a2a_default_style "  style="position:absolute;right:150px; margin-bottom: 100px;">
		<a class="a2a_dd" href="https://www.addtoany.com/share" style="margin-left:5px;" ></a>
		<a class="a2a_button_facebook" style="margin-left:5px;"></a>
		<a class="a2a_button_twitter" style="margin-left:5px;"></a>
		<a class="a2a_button_google_gmail" style="margin-left:5px;"></a>
		<a class="a2a_button_linkedin" style="margin-left:5px;" ></a>
		<a class="a2a_button_pinterest" style="margin-left:5px;"></a>
	</div>
    
  </div>

  <div class="container" style="margin-bottom: 50px; margin-top: 100px;">  
    <h3 class="text-center section-title" style="margin-bottom: 80px;" >VOIR AUSSI</h3>
	<span class="section-divider-news"></span>
	
	
	<div class="col-lg-12">


        <div class="row">
			<c:forEach items="${requestScope.ArticleList}" var="article"  >
	          <div class="col-lg-4 col-md-6 mb-4">
	            <div class="card h-100">
	              <a href="#"><img class="card-img-top" src="<c:out value="${article.getPath()}" />" alt=""></a>
	              <div class="card-body">
	                <h4 class="card-title">
	                  <a href="#" onclick="document.getElementsByName('<c:out value="${article.getTitre()}" />')[0].click();"><c:out value="${article.getTitre() }" /></a>
	                  <form action="BioDev" method="post" >
                 			<input type="hidden"  name="boolnews"  value="article"  >
                            <input type="hidden"  name="titreArticle"  value="<c:out value="${article.getTitre()}" />"  >
                            <input type="hidden"  name="dateArticle"  value="<c:out value="${article.getDate() }" />"  >
                            <input type="hidden"  name="contenuArticle"  value="<c:out value="${article.getContenu()}" />"  >
                            <input type="hidden"  name="descriptionArticle"  value="<c:out value="${article.getDescription()}" />"  >
				       		<input type="hidden"  name="pathArticle"  value="<c:out value="${article.getPath()}" />"  >
				       		<input type="submit"  name="<c:out value="${article.getTitre()}" />" value="Redirection" style="display: none;" >
				     </form> 
	                </h4>
	                <h5>
		                <div class="meta-data">
	                		<span class="longDate"> <c:out value="${article.getmois()}" />  <c:out value="${article.getjour()}" />,  <c:out value="${article.getannee()}" /></span> 
	                	</div>
	                </h5>
	                <p class="card-text"><c:out value="${article.getDescription()}" /> </p>
	              </div>
	              <div class="card-footer">
	                <small class="text-muted"></small>
	              </div>
	            </div>
	          </div>
	         </c:forEach>
          

        </div>
        <!-- /.row -->

      </div>
</div>
	<!-- AddToAny Social Media -->
	






<!-- AddToAny Social Media-->
<script>
	var a2a_config = a2a_config || {};
	a2a_config.locale = "fr";
	a2a_config.num_services = 10;
</script>
<script async src="https://static.addtoany.com/menu/page.js"></script>



  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>

  <!-- JavaScript Libraries -->
  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/jquery/jquery-migrate.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="lib/easing/easing.min.js"></script>
  <script src="lib/wow/wow.min.js"></script>
  <script src="lib/superfish/hoverIntent.js"></script>
  <script src="lib/superfish/superfish.min.js"></script>
  <script src="lib/magnific-popup/magnific-popup.min.js"></script>

  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>
  
  
  
  
  
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  </body>
</html>
