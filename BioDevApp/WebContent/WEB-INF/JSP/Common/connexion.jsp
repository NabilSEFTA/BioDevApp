<%@ page  pageEncoding="UTF-8"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>Connexion</title>
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

  
 <%@include file="../RGFaune/header.jsp" %>

<!--/ Intro Single star /-->
  <section class="intro-single">
    <div class="container">
      <div class="row">
        <div class="col-md-12 col-lg-8">
          <div class="title-single-box">
            <h1 class="title-single">Connexion</h1>
           
          </div>
        </div>
      
      </div>
    </div>
  </section>
  <!--/ Intro Single End /-->

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
            
            
            <!-- <form class="form-a contactForm" action="http://localhost:8082/BioDevApp/rgfaune" method="post" role="form">
                <div id="sendmessage">Votre demande a bien été envoyé. Merci!</div>
                <div id="errormessage">Mot de passe invalide</div>
                <div class="row">
                  <label for="Type" style="font-size: 20px;">Pseudo :</label>

                  <div class="col-md-6 mb-3">
                    <div class="form-group">
                      <input type="text" name="username" class="form-control form-control-lg form-control-a" placeholder="Entrez votre username" data-rule="minlen:4" data-validate="Username is required" data-msg="Please enter at least 4 chars">
                      <div class="validation"></div>
                      <small>${erreur['email']} </small>
                    </div>
                  </div>
                  </div>
                 
                 
                    <div class="row">
                  <label for="Type" style="font-size: 20px;">Mot de passe :</label>
                  <div class="col-md-6 mb-3">
                    <div class="form-group">
                      <input name="password" type="password" class="form-control form-control-lg form-control-a" placeholder="Entrez le mot de passe" data-rule="minlen:4" data-validate="Password is required" data-msg="Please enter at least 4 chars">
                      <div class="validation"></div>
                       <small>${erreur['motdepasse']} </small>
                    </div>
                  </div>
          
                </div>

             
       
                  <div class="col-md-12">
                    <button type="submit" class="btn btn-a">Se connecter</button>
                  </div>
                </div>
              </form>    -->  
              
              
              <form class="login100-form validate-form" method="post" action="">
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<span class="label-input100">Nom Utilisateur</span>
						<input class="form-control form-control-lg form-control-a" type="text" name="username" placeholder="Enter username">
						
						<span class="focus-input100"></span>
						<small>${erreurs['email']}</small>
					</div>

					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Mot De Passe</span>
						<input class="form-control form-control-lg form-control-a" type="password" name="password" placeholder="Enter password">
						
						<span class="focus-input100"></span>
						<small>${erreurs['motdepasse']}</small>
					</div>

					<div class="flex-sb-m w-full p-b-30">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								Se Souvenir De Moi
							</label>
						</div>

						<div>
							<a href="dependencies/Login/#" class="txt1">
								Mot de Passe Oublié?
							</a>
						</div>
					</div>

					<div class="container-login100-form-btn">
						<button type="submit"  class="btn btn-a">
							Se Connecter
						</button>
					</div>
				</form>
              
            </div>
  
          </div>
        </div>
      </div>
    </div>
  </section>
  <!--/ Contact End /-->

   <!--/ footer Star /-->
  <section class="section-footer">
    <div class="container">
      <div class="row">
        <div class="col-sm-12 col-md-4">
          <div class="widget-a">
            <div class="w-header-a">
              <h3 class="w-title-a text-brand">RGtech</h3>
            </div>
            <div class="w-body-a">
              <p class="w-text-a color-text-a">
               RGtech est une Ã©quipe travaillant dans le domaine de la prÃ©servation des ressources gÃ©nÃ©tiques en AlgÃ©rie conformÃ©ment au protocole de NAGOYA et la convention APA.
              </p>
            </div>
            <div class="w-footer-a">
              <ul class="list-unstyled">
                <li class="color-a">
                  <span class="color-text-a">Phone .</span> +213 </li>
                <li class="color-a">
                  <span class="color-text-a">Email .</span> rgtech@gmail.org</li>
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
                <a href="#">Accueil</a>
              </li>
              <li class="list-inline-item">
                <a href="#">RG</a>
              </li>
              <li class="list-inline-item">
                <a href="#">CTA</a>
              </li>
              <li class="list-inline-item">
                <a href="#">Annuaire</a>
              </li>
              <li class="list-inline-item">
                <a href="#">RÃ©glementation</a>
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
              &copy; Copyright
              <span class="color-a">bio.DEV</span> All Rights Reserved.
            </p>
          </div>
          <div class="credits">
            <!--
              All the links in the footer should remain intact.
              You can delete the links only if you purchased the pro version.
              Licensing information: https://bootstrapmade.com/license/
              Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=EstateAgency
            -->
            Designed by <a href="https://bootstrapmade.com/">RGtech</a>
          </div>
        </div>
      </div>
    </div>
  </footer>
  <!--/ Footer End /-->

  <a href="#" class="back-to-top"><i class="fa fa-chevron-up"></i></a>
  <div id="preloader"></div>

  <!-- JavaScript Libraries -->
  <script src="lib/jquery/jquery.min.js"></script>
  <script src="lib/jquery/jquery-migrate.min.js"></script>
  <script src="lib/popper/popper.min.js"></script>
  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="lib/easing/easing.min.js"></script>
  <script src="lib/owlcarousel/owl.carousel.min.js"></script>
  <script src="lib/scrollreveal/scrollreveal.min.js"></script>
  <!-- Contact Form JavaScript File -->
  <script src="contactform/contactform.js"></script>

  <!-- Template Main Javascript File -->
  <script src="js/main.js"></script>

</body>
</html>






















<!--  
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Connexion</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1"> -->
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="dependencies/Login/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="dependencies/Login/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="dependencies/Login/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="dependencies/Login/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="dependencies/Login/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="dependencies/Login/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="dependencies/Login/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="dependencies/Login/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="dependencies/Login/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="dependencies/Login/css/util.css">
	<link rel="stylesheet" type="text/css" href="dependencies/Login/css/main.css">
<!--===============================================================================================-->
<!--  
</head>
<style type="text/css">
	#body2 {
                                   padding-top: 5%;
                                   padding-bottom: 5%; 
                                   background-image: url("dependencies/Login/images/background-1.jpg");
                                   background-repeat: no-repeat;
                                   
                                   background-size: 100%;
                                   background-attachment: fixed;
                                 
                          } 
</style>
<body>
	<%@include file="../RGMarines/header.jsp"  %>
	<div class="limiter" id= "body2" >
		<div class="container-login100" style="background: none!important; ">
			<div class="wrap-login100">
				<div class="login100-form-title" style="background-image: url(dependencies/Login/images/bg-01.jpg);">
					<span class="login100-form-title-1">
						CONNEXION
					</span>
				</div>

				<form class="login100-form validate-form" method="post" >
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<span class="label-input100">Nom Utilisateur</span>
						<input class="input100" type="text" name="username" placeholder="Enter username">
						
						<span class="focus-input100"></span>
						<small>${erreurs['email']}</small>
					</div>

					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Mot De Passe</span>
						<input class="input100" type="password" name="password" placeholder="Enter password">
						
						<span class="focus-input100"></span>
						<small>${erreurs['motdepasse']}</small>
					</div>

					<div class="flex-sb-m w-full p-b-30">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								Se Souvenir De Moi
							</label>
						</div>

						<div>
							<a href="dependencies/Login/#" class="txt1">
								Mot de Passe Oublié?
							</a>
						</div>
					</div>

					<div class="container-login100-form-btn">
						<button type="submit" class="login100-form-btn">
							Se Connecter
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	<br><br><br><br>
 	<%@include file="../RGMarines/footer.jsp" %>
 	-->
 	
<!--===============================================================================================-->
	<script src="dependencies/Login/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="dependencies/Login/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="dependencies/Login/vendor/bootstrap/js/popper.js"></script>
	<script src="dependencies/Login/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="dependencies/Login/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="dependencies/Login/vendor/daterangepicker/moment.min.js"></script>
	<script src="dependencies/Login/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="dependencies/Login/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="dependencies/Login/js/main.js"></script>
<!--  
</body>
</html>

-->