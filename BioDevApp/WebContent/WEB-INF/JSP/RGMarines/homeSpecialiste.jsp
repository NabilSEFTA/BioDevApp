<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>RG Marines</title>
</head>
<body>

	<%@include file="header.jsp"  %>
	<br>
	<h2 style="text-align:center; color:#8F8F8F">Bienvenue Mr le sp�cialiste en ressources g�n�tiques et CTA</h2>
	<br><br>
	<div style="display: table;margin: 0 auto; min-height: 100%;color:#8F8F8F; text-align:center;">
		
		<!--  mettre � jour une rg/cta au niveau des pages normales (ajouter un boutton pour l'admin pour lui parmettre �a) -->
		
		<div class="container">
		<div class="row">
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="images/RGMarines/rgm.jpg" alt="Lights" style="width:70%"><br><br>
			      <div class="caption">
			          <h4>RGM propos�es</h4>
			      </div><br>
			      <button onClick="location.href = 'RGMproposes';" type="button" class="btn btn-warning btn-lg" data-toggle="tooltip" title="voir les RG propos�es en attente de validation">Voir</button><br><br>
		      </div>
		    </div> 
		    
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="images/RGMarines/cta.jpg" alt="Lights" style="width:70%"><br><br>
			      <div class="caption">
			          <h4>CTA propos�es</h4>
			      </div><br>
				  <button onClick="location.href = 'CTAproposes';" type="button" class="btn btn-info btn-lg" data-toggle="tooltip" title="voir les CTA propos�es en attente de validation">Voir</button><br><br>
		      </div>
		    </div> 
		    
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="images/RGMarines/addrgm.jpg" alt="Lights" style="width:70%"><br><br>
			      <div class="caption">
			          <h4>Ajouter RGM</h4>
			      </div><br>
				  <button onClick="location.href = 'AjoutRGMform';" type="button" class="btn btn-warning btn-lg" data-toggle="tooltip" title="Ajouter une ressource g�n�tique marine">+ RGM</button><br><br>
		      </div>
		    </div> 
		    
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="images/RGMarines/cta.png" alt="Lights" style="width:70%"><br><br>
			      <div class="caption">
			          <h4>Ajouter CTA</h4>
			      </div><br>
			      <button onClick="location.href = 'AjoutCTAform';" type="button" class="btn btn-info btn-lg" data-toggle="tooltip" title="Ajouter une connaissance traditionnelle associ�e � une RG">+ CTA</button><br><br>
		      </div>
		    </div> 
		    
		</div>  
		</div>
		
		
	</div>
	<%@include file="footer.jsp" %>

</body>
<script>
$(document).ready(function(){
  $('[data-toggle="tooltip"]').tooltip();
});
</script>
</html>