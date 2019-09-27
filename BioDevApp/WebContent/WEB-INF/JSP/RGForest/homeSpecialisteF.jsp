<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>RG Forestiere</title>
</head>
<body>

	<%@include file="header.jsp"  %>
	<br>
	<h2 style="text-align:center; color:#8F8F8F">Bienvenue Mr le spécialiste en ressources génétiques et CTA</h2>
	<br><br>
	<div style="display: table;margin: 0 auto; min-height: 100%;color:#8F8F8F; text-align:center;">
		
		<!--  mettre à jour une rg/cta au niveau des pages normales (ajouter un boutton pour l'admin pour lui parmettre ça) -->
		
		<div class="container">
		<div class="row">
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="images/RGForest/rgf.jpg" alt="Lights" style="width:70%"><br><br>
			      <div class="caption">
			          <h4>RGF proposées</h4>
			      </div><br>
			      <button onClick="location.href = 'RGFproposes';" type="button" class="btn btn-warning btn-lg" data-toggle="tooltip" title="voir les RG proposées en attente de validation">Voir</button><br><br>
		      </div>
		    </div> 
		    
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="images/RGForest/cta.jpg" alt="Lights" style="width:70%"><br><br>
			      <div class="caption">
			          <h4>CTA proposées</h4>
			      </div><br>
				  <button onClick="location.href = 'CTAForestproposes';" type="button" class="btn btn-info btn-lg" data-toggle="tooltip" title="voir les CTA proposées en attente de validation">Voir</button><br><br>
		      </div>
		    </div> 
		    
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="images/RGForest/addrgf.jpg" alt="Lights" style="width:70%"><br><br>
			      <div class="caption">
			          <h4>Ajouter RGF</h4>
			      </div><br>
				  <button onClick="location.href = 'AjoutRGFform';" type="button" class="btn btn-warning btn-lg" data-toggle="tooltip" title="Ajouter une ressource génétique marine">+ RGM</button><br><br>
		      </div>
		    </div> 
		    
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="images/RGForest/cta.png" alt="Lights" style="width:70%"><br><br>
			      <div class="caption">
			          <h4>Ajouter CTA</h4>
			      </div><br>
			      <button onClick="location.href = 'AjoutCTAForestform';" type="button" class="btn btn-info btn-lg" data-toggle="tooltip" title="Ajouter une connaissance traditionnelle associée à une RG">+ CTA</button><br><br>
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