<link href='http://fonts.googleapis.com/css?family=Cookie' rel='stylesheet' type='text/css'>
<link type="text/css" rel="stylesheet" href="Styles/RGMarines/header.css" />

<a href="StartRGMarines"><img src="images/RGMarines/logo.png" alt="logo" style="width:80px;height:80px; float:left; padding:0px 0px;"></a>

<header class="header-login-signup">
	
	
	<div class="header-limiter">
		<h1><a href="#" style="color:#208247">BIO.</a><a href="#" style="color:#808080">dev</a></h1>
		
		<nav>
			<a href="StartRGMarines" class="selected">RG</a>
			<a href="#">CTA</a>
			<a href="#">Annuaire</a>
			<a href="#">Règlementation</a>
			<a href="#">Contact</a>
		</nav>
		
		<c:if test="${empty sessionScope.prenomNom}">
			<ul>
				<li><a href="connexion">Connexion</a></li>
				<li><a href="inscription">S'inscrire</a></li>
			</ul>
		</c:if>
		
		<c:if test="${ !empty sessionScope.prenomNom }">
		<div style="float:right;">
        	<ul>
        		<li><a href="deconnexion">Déconnexion</a></li>
				<li>${sessionScope.prenomNom}</li>
			</ul>
		</div>
    	</c:if>
	</div>
    
</header>