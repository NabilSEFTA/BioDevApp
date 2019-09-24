<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <title>BIODev</title>
  <meta content="width=device-width, initial-scale=1.0" name="viewport">
  <meta content="" name="keywords">
  <meta content="" name="description">

  <!-- Favicons -->
  <link href="img/favicon.png" rel="icon">
  <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,700|Open+Sans:300,300i,400,400i,700,700i" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="lib/animate/animate.min.css" rel="stylesheet">
  <link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="lib/magnific-popup/magnific-popup.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="inc/style.css" rel="stylesheet">
  <link href="inc/news-events-tabs.css" rel="stylesheet">

  
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

 
 
 				<form action="Redirection" method="post" >
          <input type="submit" name="Accueil" value="Accueil" style="display: none;" >
          <input type="submit" name="Connexion" value="Connexion" style="display: none;" >
                 	<!-- ----------------------------------- RG----------------------------------- -->
          <input type="submit" name="RG-agriculture" value="RG-agriculture" style="display: none;" >		
				 	<input type="submit" name="RG-foret" value="RG-foret" style="display: none;" >
				 	<input type="submit" name="RG-marine" value="RG-marine" style="display: none;" >
				 	<input type="submit" name="RG-faune" value="RG-faune" style="display: none;" >
				 	<input type="submit" name="RG-microorganismes" value="RG-microorganismes" style="display: none;" >
				 	
                 	<!-- ----------------------------------- CTA ----------------------------------- -->
                 	<input type="submit" name="CTA-agriculture" value="CTA-agriculture" style="display: none;" >		
				 	<input type="submit" name="CTA-foret" value="CTA-foret" style="display: none;" >
				 	<input type="submit" name="CTA-marine" value="CTA-marine" style="display: none;" >
				 	<input type="submit" name="CTA-faune" value="CTA-faune" style="display: none;" >
				 	<input type="submit" name="CTA-microorganismes" value="CTA-microorganismes" style="display: none;" >
				 	
				 	
				 	<input type="submit" name="Annuaire" value="Annuaire" style="display: none;" >
				 	<input type="submit" name="Reglementation" value="Reglementation" style="display: none;" >
				 	
				 	
				 	
				 	
				 	<input type="submit" name="Inscription" value="Inscription" style="display: none;" >
				 </form> 
 
 
 
 
 
 
 
 
 
  <!--==========================
    Slider Section
  ============================-->

  
<div id="demo" class="carousel slide" data-ride="carousel">

  <!-- Indicators -->
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
    <li data-target="#demo" data-slide-to="3"></li>
    <li data-target="#demo" data-slide-to="4"></li>
  </ul>

  <!-- The slideshow -->
  <div class="carousel-inner" style="height:550px;">
    <div class="carousel-item active">
      <img src="lot2/image/agriculture.jpg" style="height:550px; width:1400px;">
    </div>
    <div class="carousel-item">
      <img src="lot2/image/2.jpg" style="height:600px; width:1400px;" >
    </div>
    <div class="carousel-item">
      <img src="lot2/image/marine.jpg" style="height:600px; width:1400px;" >
    </div>
    <div class="carousel-item">
      <img src="lot2/image/3.jpg" style="height:600px; width:1400px;">
    </div>
    <div class="carousel-item">
      <img src="lot2/image/microorganisme.jpg" style="height:600px; width:1400px;">
    </div>
  </div>

  <!-- Left and right controls -->
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>

</div>















  <main id="main">

    <!--==========================
      About Us Section
    ============================-->
    <section id="about" class="section-bg">
      <div class="container-fluid">
        <div class="section-header">
          <h3 class="section-title">BIO.DEV</h3>
          <span class="section-divider"></span>
        </div>

        <div class="row" style="margin-top:80px;">
          <div class="col-lg-6 about-img wow fadeInLeft">
            <img src="lot2/image/directeur.jpg" alt="">
          </div>
          <div class="col-lg-6 content wow fadeInRight" style="margin-top:-30px;">
          	<blockquote class="blockquote text-center">
          	  <h1 class="quotation-mark display-1">&ldquo; </h1>
			  <p class="mb-0" style="font-family: 'Helvetica Neue',Helvetica,Arial,sans-serif;font-size:16px;">Une solution innovante visant la gestion optimale des ressources g&eacute;n&eacute;tique en conformit&eacute; avec les dispositions de la convention sur la diversit&eacute; biologique. Ces ressources ont une valeur &eacute;conomique que leur attribue le march&eacute; et qui se concr&eacute;tise dans les investissements que leur consacrent les institutions publiques et priv&eacute;es. Elles sont l&#146;objet d&#146;un statut juridique complexe, national et international, qui &eacute;tablit les r&eacute;gimes de leur appropriation ainsi que la reconnaissance des droits de l&#146;innovation (brevet). Cette solution facilite l&#146;acc&egrave;s et l&#146;exploitation de ces richesses et ceci en permettant la gestion des demandes de permis d&#146;usage d&#146;une ressource g&eacute;n&eacute;tique conform&eacute;ment aux lois nationales.</p>
			  <footer class="blockquote-footer">Directeur de RGTech <cite title="Source Title">Monsieur Ould kara</cite></footer>
			</blockquote>
          </div>
        </div>

      </div>
    </section><!-- #about -->
    
    
    
    
    
    
    
    
    
    <section id="call-to-action">
      <div class="container">
        <div class="row">
          <div class="col-lg-3  "></div>
          <div class="col-lg-9 text-center ">
            <h1 class="cta-title text-center">BIO.DEV</h1>
            <h3 class="cta-text"> Le developpement sans destruction </h3>
          </div>
        </div>

      </div>
    </section>
    
    
    
    
    
    
    
    
    

    <!--==========================
     Nos services
    ============================-->
    <section id="features">
      <div class="container">

        <div class="row">

          <div class="col-lg-8 offset-lg-4">
            <div class="section-header wow fadeIn" data-wow-duration="1s">
              <h3 class="section-title">Nos services</h3>
              <span class="section-divider"></span>
            </div>
          </div>

          <div class="col-lg-4 col-md-5 features-img">
            <img src="lot2/image/service.png" alt="" class="wow fadeInLeft" style="height:400px;min-width:500px; margin-top:100px;margin-left:-120px;" >
          </div>

          <div class="col-lg-8 col-md-7 ">

            <div class="row">

              <div class="col-lg-6 col-md-6 box wow fadeInRight">
                <div class="icon"><i class="  ion-ios-book"></i></div>
                <h4 class="title"><a href="#features">Dictionnaire de ressources génétiques</a></h4>
                <p class="description">Un dictionnaire englobant toutes les ressources génétiques existantes en Algérie classées par catégories</p>
              </div>
              
              <div class="col-lg-6 col-md-6 box wow fadeInRightion-ios-copy" data-wow-delay="0.1s">
                <div class="icon"><i class="ion-ios-copy"></i></div>
                <h4 class="title"><a href="#features">Un annuaire complet</a></h4>
                <p class="description">Annuaires des ressources génétiques et des institutions nationales publiques et privées impliquées dans l’APA (Accès et Partage des Avantages).</p>
              </div>
              <div class="col-lg-6 col-md-6 box wow fadeInRight" data-wow-delay="0.2s">
                <div class="icon"><i class="ion-social-buffer-outline"></i></div>
                <h4 class="title"><a href="#features">Gestion des demandes de permis d’usage</a></h4>
                <p class="description">un outil qui permet la gestion des demandes de permis d’usage d’une ressource génétique conformément à la loi n° 14-07 relative aux ressources biologiques.</p>
              </div>
              <div class="col-lg-6 col-md-6 box wow fadeInRight" data-wow-delay="0.3s">
                <div class="icon"><i class="ion-help"></i></div>
                <h4 class="title"><a href="#features">Nouveauté et reglementation</a></h4>
                <p class="description">Une actualité enrichissante contenant des nouveautés, des descritopn relatives aux ressources génétiques ainsi que des lois régissant leur utilisation</p>
              </div>
            </div>

          </div>

        </div>

      </div>

    </section><!-- #features -->
    
    
    
    
     <!--==========================
      Devider Section
    ============================-->
    
    
    
    
    <section id="call-to-action">
      <div class="container">
        <div class="row">
          <div class="col-lg-3  "></div>
          <div class="col-lg-9 text-center ">
            <h1 class="cta-title text-center">BIO.DEV</h1>
            <h3 class="cta-text"> Le developpement sans destruction </h3>
          </div>
        </div>

      </div>
    </section>
    
     
    
    
    
    
      <!--==========================
      Ressources génétiques
    ============================-->
    <section id="more-features" class="section-bg">
      <div class="container">

        <div class="section-header">
          <h3 class="section-title">Les classes de ressources génétiques</h3>
          <span class="section-divider"></span>
          <p class="section-description">
          	Les ressources génétiques sont la fraction de la diversité génétique générale du vivant dont les hommes font
		  	usage par la domestication et la sélection. Voici une classification de cette richesse:
		  </p>
        </div>

        <div class="row">
          <div class="col-lg-6" id="titre1">
            <div class="box wow fadeInLeft">
              <div class="icon"> <img alt="" style=" height: 80px; width: 80px; " src="lot2/image/microorganismeClassification.jpg"> </div>
              <h4 class="title"><a href="">Les microorganismes</a></h4>
              <p class="description">
              	Les microorganismesdes sont des organismes trop petits pour être vus à l’œil nu. Leur taille est généralement inférieure à un millimètre : ils doivent être observés
				au microscope (photonique ou électronique) et cultivés dans des milieux permettant leur
				croissance et leur isolement. La microbiologie est divisée en plusieurs branches, en fonction
				du type de « microbe » étudié
              </p>
              <div class=" cta-btn-container text-right" style="margin-left:-350px;">
	            <a class="cta-btn1" href="MicroOrganismes">En savoir plus</a>
	          </div>

            </div>
          </div>

          <div class="col-lg-6">
            <div class="box wow fadeInRight">
              <div class="icon"><img alt="" style=" height: 130px; width: 90px; " src="lot2/image/foretClassement.jpg"></div>
              <h4 class="title"><a href="">Les ressources forestières</a></h4>
              <p class="description">
              	 Une ressource forestière est la ressource qui provient des forêts tel que: le bois, le liège, plantes aromatiques et médicinales... et qui permet de satisfaire
				 un besoin humain, directement ou indirectement.
				 Différents produits peuvent être générés à partir des ressources forestières. <br> <br> <br>
              </p>
             <div class="  cta-btn-container text-right" style="  width:300px;">
	            <a class="cta-btn1" href="" style="  margin-right:-150px;" >En savoir plus</a>
	          </div>
            </div>
          </div>

			<div class="col-lg-3">
	        </div>
	        <div class="col-lg-6">
	         <div class="box wow fadeInLeft">
              <div class="icon"><img alt="" style=" height: 100px; width: 90px; " src="lot2/image/fauneClassement.jpg"></div>
              <h4 class="title"><a href="">Les ressources génétique de la faune sauvage et doméstique</a></h4>
              <p class="description">
              	 Les ressources génétiques animales rassemblent les espèces, races, lignées expérimentales
				 ou commerciales qui sont issues de la domestication et de la sélection. <br> <br>
              </p>
              <div class=" cta-btn-container text-right" style="margin-left:-350px;">
	            <a class="cta-btn1" href="/BioDevApp/rgfaune"  >En savoir plus</a>
	          </div>
            </div>
	        </div>
	        <div class="col-lg-3">
	        </div>


			
          <div class="col-lg-6">
            <div class="box wow fadeInLeft">
              <div class="icon"><img alt="" style=" height: 100px; width: 90px; " src="lot2/image/hytogenetiqueClassification.jpeg"></div>
              <h4 class="title"><a href="">Les ressources phytogénétiques</a></h4>
              <p class="description">
              	 Ressources phytogénétiques pour l’alimentation et l’agriculture  désigne le matériel
				 génétique d’origine végétale ayant une valeur effective ou potentielle pour l’alimentation et
				 l’agriculture.  <br> <br> <br> <br> <br>
              </p>
              <div class="  cta-btn-container text-right" style="margin-left:-350px;">
	            <a class="cta-btn1" href="/BioDevApp/classifications" onclick="document.getElementsByName('RG-agriculture')[0].click();">En savoir plus</a>
	          </div>
            </div>
          </div>

          <div class="col-lg-6">
            <div class="box wow fadeInRight">
              <div class="icon"><img alt="" style=" height: 100px; width: 90px; " src="lot2/image/marineClassement.PNG"></div>
              <h4 class="title"><a href="">Les ressources marines</a></h4>
              <p class="description">
              	Les ressources génétiques marines comportent l’ensemble de : animaux, plantes,
				champignons et bactéries, vivant dans l’eau, pour l’Algérie c’est celles vivant dans la mer
				méditerranéenne. Elles étaient utilisées depuis plusieurs années pour développer de nouveaux
				produits, mettre au point de nouveaux médicaments pour combattre le cancer et les maladies
				incurables et chroniques.
              </p>
              <div class="  cta-btn-container text-right" style="  width:300px;">
	            <a class="cta-btn1" href="StartRGMarines" style="  margin-right:-150px;" onclick="document.getElementsByName('RG-marine')[0].click();">En savoir plus</a>
	          </div>
            </div>
          </div>

        </div>
      </div>
    </section><!-- #Ressources génétiques -->
    
    
    
   
   
   <section id="advanced-features" style="padding-left: 100px; padding-right: 100px; background: #eff5f5;padding-bottom: 100px;"> 
      <div class="features-row" style=" background: #fff;">
        <div class="container">
          <div class="row">
            <div class="col-12">
              <img class="advanced-feature-img-left" src="lot2/image/exploitation.jpg" alt="">
              <div class="wow fadeInRight">
                <h2>Comment peut-on exploiter une Ressource génétique tout en la préservant ? </h2>
                <span class="section-divider-news" style="text-align: center;margin-left:150px;"></span>
                <span class="section-divider-news" style="text-align: center;margin-left:800px;"></span>
                <h3>Avec le développement des biotechnologies, de nouvelles questions surgissent. La principale d'entre elles tient à la protection de la biodiversité génétique</h3>
                <p>Toute nouvelle variété enrichit notre patrimoine commun ; si certaines ressources génétiques sont confisquées, comment la création variétale pourra-t-elle se poursuivre ?
					Actuellement, seul le Certificat d'obtention végétale garantit cet accès aux ressources. Son maintien est donc indispensable pour toutes les variétés.</p>
                <p></p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    
    
     <!--==========================
      Call To Action Section
    ============================-->
    <section id="call-to-action">
      <div class="container">
        <div class="row">
          <div class="col-lg-4 text-center text-lg-left"> </div>
          <div class="col-lg-8 text-center text-lg-left">
            <h3 class="cta-title">Conditions et réglementations nécessaires à l’émergence d’un marché portant sur des ressources génétiques.</h3>
            <h4 class="cta-text"> Il ya t'il une réglementation régissant l'exploitation de cette richesse ?</h4>
            <div class="text-lg-right"><a class="cta-btn " href="#" onclick="document.getElementsByName('Reglementation')[0].click();">En savoir plus</a></div>
            
          </div>
          
            
      
        </div>
      </div>
    </section><!-- #call-to-action -->
    
    
    
<div class="container">  

  <h3 class="text-center section-title" >EVENEMENTS & NEWS</h3>
  
 <span class="section-divider-news"></span>
  <div class="row">
    <div class="col-lg-push-4 col-md-4 col-md-push-4">
      <div class="searchForm type2">
        
      </div>
    </div>
    <div class="clearfix visible-sm visible-xs">
      &nbsp;
    </div>
    <div class="col-lg-push-4 col-md-4 col-md-push-4">
    
    </div>   
    <div class="clearfix visible-sm visible-xs">
      &nbsp;
    </div>
    <div class="col-lg-4 col-lg-pull-8 col-md-4 col-md-pull-8">
      <ul class="nav choice" role="tablist">
        <li class="active">
          <a data-toggle="tab" href="#tab1" role="tab">News</a>
        </li>
        <li>
          <a data-toggle="tab" href="#tab2" role="tab">Events</a>
        </li>
      </ul>
    </div>-
  </div><!-- / row -->
  <hr>
  <div class="tab-content">
   <!-- ************************ Tab1 *************** -->
  <div class="tab-pane fade in active" id="tab1">
      <div class="row">
      <c:forEach items="${requestScope.listeNews}" var="news"  >
        <div class="col-md-6">
          <div class="media" style="margin-top: 40px;" >
            <a class="pull-left" href="#"><span class="dateEl"><em> <c:out value="${news.getjour()}" /> </em> <c:out value="${news.getmois()}" /></span></a>
            <div class="media-body">
              <h4 class="media-heading" style="color: #7c7b7b;" >
                <button class="primary-btn  text-left" style="background-color:transparent;  border: none;text-transform: uppercase;"  onclick="document.getElementsByName('<c:out value="${news.getTitre()}" />')[0].click();">  <c:out value="${news.getTitre()}" /> Chahrazed Touati Chahrazed Touati Chahrazed TouatiChahrazed Touati </button>
                 
                 <form action="BioDev" method="post" >
                 			<input type="hidden"  name="path"  value="<c:out value="${news.getPath()}" />"  >
                 			<input type="hidden"  name="boolnews"  value="true"  >
                            <input type="hidden"  name="titre"  value="<c:out value="${news.getTitre()}" />"  >
                            <input type="hidden"  name="date"  value="<c:out value="${news.getDate() }" />"  >
                            <input type="hidden"  name="contenu"  value="<c:out value="${news.getContenu()}" />"  >
                            <input type="hidden"  name="description"  value="<c:out value="${news.getDescription()}" />"  >
				       		<input type="submit" name="<c:out value="${news.getTitre()}" />" value="Redirection" style="display: none;" >
				 </form> 
              </h4>
              <!--  
              <div class="meta-data">
                <span class="longDate"> <c:out value="${news.getmois()}" />  <c:out value="${news.getjour()}" />,  <c:out value="${news.getannee()}" /></span> 
              </div>-->
              <p>
                <c:out value="${news.getDescription()}" />
              </p>
            </div><!-- / media-body -->
          </div><!-- / media -->
         </div>
         </c:forEach>
         </div>
         <div class="text-center">
	        <br>
	        <a class="btn btn-default" href="#"  onclick="document.getElementsByName('<c:out value="${requestScope.listeNews.get(0).getTitre()}" />')[0].click();">VOIR PLUS  </a>
	     </div>
        </div>
          
    
    <!-- ************************ Tab2 *************** -->
    <div class="tab-pane fade" id="tab2"  >
      <div class="row">
      <c:forEach items="${requestScope.listeEvents}" var="event"  >
        <div class="col-md-6">
          <div class="blogPost--small">
            <div class="media">
              <span class="pull-left"><a href="#"><span class="date"><span><c:out value="${event.getjour()}" /></span> <small><c:out value="${event.getmois()}" /></small></span></a></span>
              <div class="media-body">
                <h4 class="media-heading">
                 <button class="primary-btn text-left" style="background-color:transparent;  font-size: 18px;  border: none;text-transform: uppercase;"  onclick="document.getElementsByName('<c:out value="${event.getTitre()}" />')[0].click();">  <c:out value="${event.getTitre()}" />  </button>
                 <form action="BioDev" method="post" >
                 			<input type="hidden"  name="boolnews"  value="false"  >
                            <input type="hidden"  name="titreEvent"  value="<c:out value="${event.getTitre()}" />"  >
                            <input type="hidden"  name="dateEvent"  value="<c:out value="${event.getDate() }" />"  >
                            <input type="hidden"  name="contenuEvent"  value="<c:out value="${event.getContenu()}" />"  >
                            <input type="hidden"  name="descriptionEvent"  value="<c:out value="${event.getDescription()}" />"  >
				       		<input type="hidden"  name="pathEvent"  value="<c:out value="${event.getPath()}" />"  >
				       		<input type="submit"  name="<c:out value="${event.getTitre()}" />" value="Redirection" style="display: none;" >
				 </form> 
                </h4>
                <div class="meta-data">
                	<span class="longDate"> <c:out value="${event.getmois()}" />  <c:out value="${event.getjour()}" />,  <c:out value="${event.getannee()}" /></span> 
                </div>
                <p>
                   <c:out value="${event.getDescription()}" />
                </p>
              </div>
            </div>
          </div><!-- / blogPost -->
          </div>
          </c:forEach>
  		</div>
  		<div class="text-center" >
          <br>
          <a class="btn btn-default" href="#" href="#"  onclick="document.getElementsByName('<c:out value="${requestScope.listeEvents.get(0).getTitre()}" />')[0].click();">VOIR PLUS</a>
        </div>
	</div>
   </div>
</div>    
    
    
    
 
    
<div class="container" style="margin-bottom: 50px; margin-top: 100px;">  
    <h3 class="text-center section-title" >Articles</h3>
	<span class="section-divider-news"></span>
	
	
	<div class="col-lg-12">


        <div class="row">
			<c:forEach items="${requestScope.listeArticle}" var="article"  >
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
	                <small class="text-muted">  </small>
	                
	              </div>
	            </div>
	          </div>
	         </c:forEach>
          

        </div>
        <!-- /.row -->

      </div>
      
      <div class="text-center" >
          <br>
          <a class="btn btn-default" href="#" href="#"  onclick="document.getElementsByName('<c:out value="${requestScope.listeArticle.get(0).getTitre()}" />')[0].click();">VOIR PLUS</a>
      </div>
</div>
    
    
    
    <!--==========================
      Call To Action Section
    ============================-->
    <section id="call-to-action" style="margin-left: 0px; margin-right: 0px;">
      <div class="container">
        <div class="row">
          <div class="col-lg-6 text-center text-lg-left">
            <h3 class="cta-title">Inscrivez vous!</h3>
            <p class="cta-text"> Inscrivez vous pour bénéficier de nos services</p>
          </div>
          <div class="col-lg-6 cta-btn-container text-right" style="margin-left:-350px;">
            <a class="cta-btn " href="#" onclick="document.getElementsByName('Inscription')[0].click();">Inscription</a>
          </div>
        </div>
      </div>
    </section><!-- #call-to-action -->
    
  








<!--==========================
     Institutions
    ============================-->
    <section id="clients">
      <div class="container">
      
        <div class="section-header text-center">
          <h3 class="section-title">Institutions impliquées dans l'APA (Accès et Partage des Avantages)</h3>
          <span class="section-divider"></span>
          <p class="mb-0 text-center">De par sa taille et son emplacement géographique, l’Algérie est un pays important en termes d’écosystèmes et de diversité des
			 espèces. Il y a cependant une tendance générale à la dégradation des écosystèmes dans les régions vulnérables d’Algérie et à
			 la perte de la biodiversité. De nombreuses institutions éxistent en Algérie et qui ont une relation directe ou indirecte avec l'APA. 
			  <section class="centered-container text-center">
			    <a class="link link--arrowed"  href="InstitutionsSer" >Acceder à l'annuaire
				    <svg class="arrow-icon" xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 32 32">
				      <g fill="none" stroke="#2175FF" stroke-width="1.5" stroke-linejoin="round" stroke-miterlimit="10">
				        <circle class="arrow-icon--circle" cx="16" cy="16" r="15.12"></circle>
				        <path class="arrow-icon--arrow" d="M16.14 9.93L22.21 16l-6.07 6.07M8.23 16h13.98"></path>
				      </g>
				    </svg>
			    </a>
			   </section>
		  </p>
		  
        </div>
        
        <div class="row wow fadeInUp" style="margin-top: 40px;">

          <div class="col-md-2">
            <img src="lot2/image/institution1.png" alt="">
          </div>

          <div class="col-md-2">
            <img src="lot2/image/institution3.png" alt="">
          </div>

          <div class="col-md-2">
            <img src="lot2/image/institution4.jpg" alt="">
          </div>

          <div class="col-md-2">
            <img src="lot2/image/institutions6.png" alt="">
          </div>

          <div class="col-md-2">
            <img src="lot2/image/institution6.jpg" alt="">
          </div>

          <div class="col-md-2">
	         <img src="lot2/image/institution5.jpg" alt="">
          </div>

        </div>
      </div>
    </section><!-- #Institutions -->
    
     <!--==========================
      Frequently Asked Questions Section
    ============================-->
    <section id="faq">
      <div class="container">

        <div class="section-header">
          <h3 class="section-title">Questions fréquemment posées</h3>
          <span class="section-divider"></span>
          <!-- <p class="section-description">Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque</p> -->
        </div>

        <ul id="faq-list" class="wow fadeInUp">
          <li>
            <a data-toggle="collapse" class="collapsed" href="#faq1"> Qu'est-ce qu'une ressource génétique? <i class="ion-android-remove"></i></a>
            <div id="faq1" class="collapse" data-parent="#faq-list">
              <p>
                Une "Ressource Génétique" ou "Ressource Biologique" est définie par la Convention sur Diversité Biologique (CDB) comme du "matériel d'origine végétale, animale, microbienne ou autre, contenant des unités fonctionnelles de l'hérédité". Une ressource génétique est également définie par la CDB comme un « matériel génétique ayant une valeur effective ou potentielle ». Sont incluses les ressources génétiques conservées in situ et ex situ donc sur le terrain ou en collections.
              </p>
            </div>
          </li>

          <li>
            <a data-toggle="collapse" href="#faq2" class="collapsed"> Sur quoi porte le protocole de Nagoya ? <i class="ion-android-remove"></i></a>
            <div id="faq2" class="collapse" data-parent="#faq-list">
              <p>
               Le Protocole de Nagoya sur l'accès aux ressources génétiques et le partage juste et équitable des avantages découlant de leur utilisation à la Convention sur la diversité biologique, plus communément appelé Protocole de Nagoya sur l'accès et le partage des avantages (APA), est un accord international sur la biodiversité. Il a été adopté par la dixième réunion de la Conférence des Parties à la Convention sur la diversité biologique des Nations unies, le 29 octobre 2010 à Nagoya, au Japon, et est entré en vigueur le 12 octobre 2014.
              </p>
            </div>
          </li>

          <li>
            <a data-toggle="collapse" href="#faq3" class="collapsed"> Comment puis-je exploiter ces ressources ? <i class="ion-android-remove"></i></a>
            <div id="faq3" class="collapse" data-parent="#faq-list">
              <p>
                L'exploitation de ces ressources est régie par le protocole de Nagoya et la Convention sur Diversité Biologique (CDB) qui exigent un permis d'exploitation afin de pouvoir extraire et utiliser les ressources génétiques. Pour obtenir le permis, il suffit de lancer la demande d'obtention à partir de ce site sous la rubrique dédiée.
              </p>
            </div>
          </li>

          <li>
            <a data-toggle="collapse" href="#faq4" class="collapsed"> Comment puis-je exploiter ces ressources ? <i class="ion-android-remove"></i></a>
            <div id="faq4" class="collapse" data-parent="#faq-list">
              <p>
                La Convention sur la diversité biologique (CDB)  est un traité international juridiquement contraignant qui a trois principaux objectifs:
					la conservation de la diversité biologique,
					l'utilisation durable de la diversité biologique et
					le partage juste et équitable des avantages découlant de l'utilisation des ressources génétiques.
				Son but général est d'encourager des mesures qui conduiront à un avenir durable.
				La conservation de la diversité biologique est une préoccupation commune de l'humanité. 
              </p>
            </div>
          </li>


        </ul>

      </div>
    </section><!-- #faq -->
    <!--==========================
      Contact Section
    ============================-->
    <section id="contact">
      <div class="container">
        <div class="row wow fadeInUp">

          <div class="col-lg-4 col-md-4">
            <div class="contact-about">
              <h3>BioDev</h3>
              <p>Votre solution innovante visant la gestion optimale des ressources génétique en conformité avec les dispositions de la convention sur la diversité biologique. <br> Contactez nous pour plus d'informations et suivez nous sur nos réseaux sociaux </p>
              <div class="social-links">
                <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
                <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
                <a href="#" class="instagram"><i class="fa fa-instagram"></i></a>
                <a href="#" class="google-plus"><i class="fa fa-google-plus"></i></a>
                <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
              </div>
            </div>
          </div>

          <div class="col-lg-4 col-md-4">
            <div class="info">
              <div>
                <i class="ion-ios-location-outline"></i>
                <p style="color:#888;">Ecole Nationale Supérieure d'Informatique (ESI ex.INI),<br>Alger Oued Smar,، 16309، Oued Smar 16309</p>
              </div>

              <div>
                <i class="ion-ios-email-outline"></i>
                <p style="color:#888;">BioDev@esi.dz</p>
              </div>

              <div>
                <i class="ion-ios-telephone-outline"></i>
                <p style="color:#888;">023 93 91 32</p>
              </div>

            </div>
          </div>

          <div class="col-lg-4 col-md-8" id="rubrique">
		      <nav id="nav-menu-container" style="color: #000">
		        <ul class="nav-menu">
		        <li class="menu-active"><a href="#rubrique"  style ="font-weight: 300;letter-spacing: 3px; font-size: 36px; color:#1dc8cd;">Rubriques</a></li> 
		        <br> <li class="menu-active"><a href="#" onclick="document.getElementsByName('Accueil')[0].click();" style =" font-size: 20px;color:#888;">Accueil</a></li> 
		          <br><li><a href="#" onclick="document.getElementsByName('Annuaire')[0].click();" style ="font-size: 20px;color:#888;">Annuaire</a></li>
		          <br><li><a href="#" onclick="document.getElementsByName('Reglementation')[0].click();" style ="font-size: 20px;color:#888;">Réglementation</a></li> 
		          <br><li><a href="#" style ="font-size: 20px;color:#888;text-align: left">RG</a> 
		            <ul>
		                <li><a href="#" onclick="document.getElementsByName('RG-foret')[0].click();" >Ressources forestières</a></li>
			            <li><a href="#" onclick="document.getElementsByName('RG-agriculture')[0].click();">Alimentation et l’agriculture</a></li>
			            <li><a href="#" onclick="document.getElementsByName('RG-marine')[0].click();" >Ressources marines</a></li>
			            <li><a href="#" onclick="document.getElementsByName('RG-faune')[0].click();">la faune sauvage et domestique</a></li>
			            <li><a href="#" onclick="document.getElementsByName('RG-microorganismes')[0].click();">Microorganismes</a></li>
		          	</ul>
		          </li><br>
		          <br> <li><a href="#" style =" font-size: 20px;color:#888;">CTA</a>
			        <ul>
			        	<li><a href="#" onclick="document.getElementsByName('CTA-foret')[0].click();">Ressources forestières</a></li>
			            <li><a href="#" onclick="document.getElementsByName('CTA-agriculture')[0].click();">Alimentation et l’agriculture</a></li>
			            <li><a href="#" onclick="document.getElementsByName('CTA-marine')[0].click();">Ressources marines</a></li>
			            <li><a href="#" onclick="document.getElementsByName('CTA-faune')[0].click();">la faune sauvage et domestique</a></li>
			            <li><a href="#" onclick="document.getElementsByName('CTA-microorganismes')[0].click();">Microorganismes</a></li>
		          	</ul>
		          </li>
		          
		          <br><li><a href="#contact" style ="font-size: 20px;color:#888;">Contact</a></li>
		        </ul>
		      </nav><!-- #nav-menu-container -->
          </div>

        </div>

      </div>
    </section><!-- #contact -->

  </main>
  
  


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
  <script src="js/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>
  
  
  
  
  
  <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

</body>
</html>

