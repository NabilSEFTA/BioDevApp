<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Ajout d'une RG faunistique</title>
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

  <!-- =======================================================
    Theme Name: EstateAgency
    Theme URL: https://bootstrapmade.com/real-estate-agency-bootstrap-template/
    Author: BootstrapMade.com
    License: https://bootstrapmade.com/license/
  ======================================================= -->
</head>

<body>
<%@include file="./header.jsp" %>

  <!--/ Intro Single star /-->
  <section class="intro-single">
    <div class="container">
      <div class="row">
        <div class="col-md-12 col-lg-8">
          <div class="title-single-box">
            <h1 class="title-single">Ajouter une nouvelle ressource génétique faunistique </h1>
            <span class="color-text-a">Dans cette page, vous pouvez ajouter une nouvelle ressource génétique faunistique.
                Une fois toute les informations introduites dans le formulaire d'ajout, cette demande d'ajout de la nouvelle ressource génétique sera traité par des spécialistes sur la biodiversité algérienne afin d'approuver cet ajout ou de le refuser en cas de non conformité.

               </span>
          </div>
        </div>
       <!-- <div class="col-md-12 col-lg-4">
          <nav aria-label="breadcrumb" class="breadcrumb-box d-flex justify-content-lg-end">
            <ol class="breadcrumb">
              <li class="breadcrumb-item">
                <a href="index.html">Home</a>
              </li>
              <li class="breadcrumb-item active" aria-current="page">
                Contact
              </li>
            </ol>
          </nav>
        </div>  -->
      </div>
    </div>
  </section>
  <!--/ Intro Single End /-->



      <img src="image/animaux2.png">

  <!--/ Contact Star /-->
  <section class="contact">
    <div class="container">
      <div class="row">
        <div class="col-sm-12">
         <!-- <div class="contact-map box">
            <div id="map" class="contact-map">
              <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3022.1422937950147!2d-73.98731968482413!3d40.75889497932681!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89c25855c6480299%3A0x55194ec5a1ae072e!2sTimes+Square!5e0!3m2!1ses-419!2sve!4v1510329142834"
                width="100%" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
            </div>
          </div>
        </div>  -->
        <div class="col-sm-12 section-t8">
          <div class="row">
            <div class="col-md-10">
            
            
            <!-- 
              <form class="form-a contactForm" action="" method="post" role="form">
                <div id="sendmessage">Votre demande a bien été envoyé. Merci!</div>
                <div id="errormessage"></div>
                <div class="row">
                  <label for="Type" style="font-size: 20px;">Informations sur la ressource génétique :</label>

                  <div class="col-md-6 mb-3">
                    <div class="form-group">
                      <input type="text" name="nomLatin" class="form-control form-control-lg form-control-a" placeholder="Nom latin de la RG" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
                      <div class="validation"></div>
                    </div>
                  </div>
                     <div class="col-md-6 mb-3">
                    <div class="form-group">
                      <input type="text" name="nomArabe" class="form-control form-control-lg form-control-a" placeholder="Nom arabe de la RG" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
                      <div class="validation"></div>
                    </div>
                  </div>
                  <div class="col-md-6 mb-3">
                    <div class="form-group">
                      <input name="nombreRg" type="number" class="form-control form-control-lg form-control-a" placeholder="Taille de la population de la RG" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
                      <div class="validation"></div>
                    </div>
                  </div>
                  


                             <div class="col-md-12 mb-3">
                    <div class="form-group">
                      <input type="File" name="image" class="form-control form-control-lg form-control-a" placeholder="Uploader l'image de la RG"  data-msg="">
                      <div class="validation"></div>
                    </div>
                  </div>

                  <div class="col-md-12 mb-3">
                    <div class="form-group">
                      <textarea name="message" class="form-control" name="message" cols="45" rows="8" data-rule="required" data-msg="Please write something for us" placeholder="Description de la RG"></textarea>
                      <div class="validation"></div>
                    </div>
                  </div>

                
               

                  <div>
                     <label for="Type" style="font-size: 20px;">Informations de localisation :</label>
                     <br>
                   <div class="col-md-10 mb-5">
                    <div class="form-group">
                      <input type="text" name="nomLatin" class="form-control form-control-lg form-control-a" placeholder="Région" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
                      <div class="validation"></div>
                    </div>
                  </div>

                   <div class="col-md-10 mb-5">
                    <div class="form-group">
                      <input type="text" name="nomLatin" class="form-control form-control-lg form-control-a" placeholder="Wilaya" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
                      <div class="validation"></div>
                    </div>
                  </div>
                  </div>

                
                </div>    -->

               
             <!--       <div class="col-md-6 mb-2">
                         <div class="form-group">
                          
                              <select class="form-control form-control-lg form-control-a" id="Type">
                                <option>All Type</option>
                                <option>For Rent</option>
                                <option>For Sale</option>
                                <option>Open House</option>
                              </select>
                          </div>
                    </div>    -->


            
            <!-- 
            <div>
                  <label for="Type" style="font-size: 20px;">Caractéristiques morphologiques :</label>
                  <br>
                  <div class="col-md-4 mb-2">
                    <div class="form-group">
                      <label for="Type" class="form-control form-control-lg form-control-a" style="display: inline-block;">Noyau Cellulaire</label>
                      <input type="checkbox" name="noyauCellulaire" style="display: inline;" class="form-control form-control-lg form-control-a"  >
                      
                      <div class="validation"></div>
                    </div>
                  </div>

                    <div class="col-md-4 mb-2">
                    <div class="form-group">
                      <label for="Type" class="form-control form-control-lg form-control-a" style="display: inline-block;">Vertèbres</label>
                      <input type="checkbox" name="vertèbres" style="display: inline;" class="form-control form-control-lg form-control-a"  >
                     
                      <div class="validation"></div>
                    </div>
                  </div>

                    <div class="col-md-4 mb-2">
                    <div class="form-group">
                      <label for="Type" class="form-control form-control-lg form-control-a" style="display: inline-block;">Poils</label>
                      <input type="checkbox" name="poils" style="display: inline;" class="form-control form-control-lg form-control-a"  >
                     
                      <div class="validation"></div>
                    </div>
                  </div>

                    <div class="col-md-4 mb-2">
                    
                    <div class="form-group">
                      <label for="Type" class="form-control form-control-lg form-control-a" style="display: inline-block;">Membres</label>
                      <input type="checkbox" name="membres" style="display: inline;" class="form-control form-control-lg form-control-a"  >
                    
                      <div class="validation"></div>
                    </div>
                  </div>

                    
                   </div>

       
                  <div class="col-md-12">
                    <button type="submit" class="btn btn-a">Envoyer la demande d'ajout</button>
                  </div>
                </div>
              </form>   
              
                 -->     
              <!-- ********************************************** -->
              
                   
             <form class="form-a contactForm" method="post" action="ajt">
        
        <p>
            <label for="nom_latin" class="form-control form-control-lg form-control-a" style="background-color:#000000; color:#FFFFFF;">Nom latin : </label>
            <input type="text" name="nom_latin" id="nom_latin" class="form-control form-control-lg form-control-a"/>
   
        </p>
       
        <p>
            <label for="nom_arabe" class="form-control form-control-lg form-control-a" style="background-color:#000000; color:#FFFFFF;">Nom arabe : </label>
            <input type="text" name="nom_arabe" id="nom_arabe" class="form-control form-control-lg form-control-a"/>
        </p>
        <p>
            <label for="nom_amazigh" class="form-control form-control-lg form-control-a" style="background-color:#000000; color:#FFFFFF;">Nom amazigh : </label>
            <input type="text" name="nom_amazigh" id="nom_amazigh" class="form-control form-control-lg form-control-a"/>
        </p>
        <p>
            <label for="description" class="form-control form-control-lg form-control-a" style="background-color:#000000; color:#FFFFFF;">Description : </label>
            <input type="text" name="description" id="description" class="form-control form-control-lg form-control-a"/>
        </p>
         <p>
            <label for="nombre" class="form-control form-control-lg form-control-a" style="background-color:#000000; color:#FFFFFF;">Nombre : </label>
            <input type="number" name="nombre" id="nombre" class="form-control form-control-lg form-control-a"/>
        </p>
        
         <p>
            <label for="utilisateur" class="form-control form-control-lg form-control-a" style="background-color:#000000; color:#FFFFFF;">Utilisateur : </label>
            <input type="text" name="utilisateur" id="utilisateur" class="form-control form-control-lg form-control-a"/>
        </p>
        
        
         <p>
            <label for="noyau_cellulaire" class="form-control form-control-lg form-control-a" style="background-color:#000000; color:#FFFFFF;">Présence de noyau céllulaire	? </label>
          
            <select class="form-control form-control-lg form-control-a"  name="noyau_cellulaire" id="noyau_cellulaire">
               <option value="true">oui</option>
                <option value="false">non</option>
             </select>
       
        </p>         
        <p>
            <label for="utilisateur" class="form-control form-control-lg form-control-a" style="background-color:#000000; color:#FFFFFF;">Présence de poils ? </label>
            
             <select class="form-control form-control-lg form-control-a"  name="poils" id="poils">
               <option value="true">oui</option>
                <option value="false">non</option>
             </select>
        </p>         
        <p>
            <label for="utilisateur" class="form-control form-control-lg form-control-a" style="background-color:#000000; color:#FFFFFF;">Présence de membres ? </label>
         <select class="form-control form-control-lg form-control-a"  name="membres" id="membres">
             <option value="true">oui</option>
                <option value="false">non</option>
         </select>
        </p>        
         <p>
            <label for="utilisateur" class="form-control form-control-lg form-control-a" style="background-color:#000000; color:#FFFFFF;">Présence de vertèbres ? </label>
              <select class="form-control form-control-lg form-control-a"  name="vertèbres" id="vertèbres">
                <option value="true">oui</option>
                <option value="false">non</option>
              </select>
        </p>        
        <!--  
        <p>
         <label for="noyau_cellulaire" class="form-control form-control-lg form-control-a" style="display: inline-block;">Noyau Cellulaire</label>
         <input type="checkbox" name="noyau_cellulaire" style="display: inline;" class="form-control form-control-lg form-control-a"  >             
        </p>
        <p>
         <label for="membres" class="form-control form-control-lg form-control-a" style="display: inline-block;">Membres</label>
         <input type="checkbox" name="membres" style="display: inline;" class="form-control form-control-lg form-control-a"  >             
        </p>
        <p>
         <label for="poils" class="form-control form-control-lg form-control-a" style="display: inline-block;">Poils</label>
         <input type="checkbox" name="poils" style="display: inline;" class="form-control form-control-lg form-control-a"  >             
        </p>
        <p>
         <label for="vertèbres" class="form-control form-control-lg form-control-a" style="display: inline-block;">Vertèbres</label>
         <input type="checkbox" name="vertèbres" style="display: inline;" class="form-control form-control-lg form-control-a"  >             
        </p>
        -->
        
         <p>
            <label for="region" class="form-control form-control-lg form-control-a" style="background-color:#000000; color:#FFFFFF;">Région : </label>
            <select class="form-control form-control-lg form-control-a"  name="region" id="region">
               <option value="nord">nord</option>
               <option value="sud">sud</option>
               <option value="est">est</option>
               <option value="ouest">ouest</option>
               <option value="nord est">nord est</option>
               <option value="nord ouest">nord ouest</option>
               <option value="sud est">sud est</option>
               <option value="sud ouest">sud ouest</option>
             </select>
        </p>
        <p>
            <label for="wilaya" class="form-control form-control-lg form-control-a" style="background-color:#000000 ; color:#FFFFFF;">Wilaya : </label>
             <select class="form-control form-control-lg form-control-a"  name="wilaya" id="wilaya">
               <option value="adrar">adrar</option>
               <option value="chlef">chlef</option>
               <option value="laghouat"> laghouat  </option>
               <option value="oum el bouaghi">  oum el bouaghi </option>
               <option value="batna">  batna </option>
               <option value="béjaia"> béjaia  </option>
               <option value="biskra"> biskra  </option>
               <option value="béchar"> béchar  </option>
               <option value="blida">  blida </option>
               <option value="bouira">  bouira </option>
               <option value="tamanrasset"> tamanrasset  </option>
               <option value="tébessa">  tébessa </option>
               <option value="tlemcen">  tlemcen </option>
               <option value="tiaret">  tiaret </option>
               <option value="tizi ouzou"> tizi ouzou  </option>
               <option value="alger"> alger  </option>
               <option value="djelfa"> djelfa  </option>
               <option value="jijel"> jijel  </option>
               <option value="sétif"> sétif   </option>
               <option value="saida"> saida  </option>
               <option value="skikda"> skikda  </option>
               <option value="sidi bel abbés"> sidi bel abbés  </option>
               <option value="annaba"> annaba  </option>
               <option value="guelma"> guelma  </option>
               <option value="constantine"> constantine  </option>
               <option value="médéa"> médéa  </option>
               <option value="mostaganem"> mostaganem  </option>
               <option value="m'sila"> m'sila  </option>
               <option value="mascara"> mascara   </option>
               <option value="ouargla"> ouargla  </option>
               <option value="oran"> oran  </option>
               <option value="el bayadh"> el bayadh  </option>
               <option value="illizi"> illizi  </option>
               <option value="bordj bou arreridj"> bordj bou arreridj   </option>
               <option value="boumerdés"> boumerdés  </option>
               <option value="el tarf"> el tarf  </option>
               <option value="tindouf"> tindouf  </option>
               <option value="tissemsilt"> tissemsilt   </option>
               <option value="el oued"> el oued  </option>
               <option value="khenchela"> khenchela  </option>
               <option value="souk ahras"> souk ahras  </option>
               <option value="tipaza"> tipiza </option>
               <option value="mila"> mila  </option>
               <option value="ain defla"> ain defla  </option>
               <option value="naama"> naama   </option>
               <option value="ain témouchent"> ain témouchent   </option>
               <option value="ghardaia"> ghardaia  </option>
               <option value="relizane"> relizane   </option>
              
             </select>
        </p>
        
        
        <input type="submit" class="btn btn-a"/>
    </form>
    
  <!--    <ul>
        <c:forEach var="rgf" items="${ rgfs }">
            <li><c:out value="${ rgf.nom_latin }" /> <c:out value="${ rgf.nom_arabe }" />
               <c:out value="${ rgf.nom_amazigh }" /> <c:out value="${ rgf.description }" />
               <c:out value="${ rgf.nombre }" /> <c:out value="${ rgf.region }" />
            
            </li>
        </c:forEach>
    </ul>    -->
            
            <!-- ************************************* -->
            </div>
        
          </div>
        </div>
      </div>
    </div>
  </section>
  <!--/ Contact End /-->

   
   <%@ include file="./footer.jsp" %>

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
