<!DOCTYPE html>
<html lang="en">
<head>
	<title>Connexion</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
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
	<%@include file="/WEB-INF/JSP/RGAlim/Nav.jsp" %>
	<div class="limiter" id= "body2" >
		<div class="container-login100" style="background: none!important; ">
			<div class="wrap-login100" style="background-color: white;">
				<div class="login100-form-title" style="background-color: #2eca6a;">
					<span class="login100-form-title-1">
						Sign In
					</span>
				</div>

				<form class="login100-form validate-form" method="post" action="connexion?from=non">
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<span class="label-input100">Username</span>
						<input class="input100" type="text" name="username" placeholder="Enter username">
						
						<span class="focus-input100"></span>
						<small>${erreurs['email']}</small>
					</div>

					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Password</span>
						<input class="input100" type="password" name="password" placeholder="Enter password">
						
						<span class="focus-input100"></span>
						<small>${erreurs['motdepasse']}</small>
					</div>

					<div class="flex-sb-m w-full p-b-30">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								Remember me
							</label>
						</div>

						<div>
							<a href="dependencies/Login/#" class="txt1">
								Forgot Password?
							</a>
						</div>
					</div>

					<div class="container-login100-form-btn">
						<button type="submit" class="login100-form-btn">
							Login
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	
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

</body>
</html>