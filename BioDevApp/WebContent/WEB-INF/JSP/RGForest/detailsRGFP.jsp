<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Détails</title>
<link rel = "stylesheet" type = "text/css" href = "Styles/RGForest/map.css" />

</head>
<body>
	<%@include file="header.jsp"  %>
	<div class="container" style="color:#4D4F5C;">
		<div>
			<h3 style="text-align:center;">RG Forestiere</h3><br><br>
			<img align="right" src="${sessionScope.rgfp.getImage()}" class="img-thumbnail" style="height:400px; weight:400px;">
			<h4 style="text-align:left">${sessionScope.rgfp.getNom_francais()}</h4>
			<h6 style="text-align:left;">${sessionScope.rgfp.getNom_latin()} </h6>
			
		</div>
		<div>
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">Elément</th>
			      <th scope="col">Détail</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <th scope="row">CLE D'IDENTIFICATION</th>
			      <td>
			      		${sessionScope.rfp.getId_RGForestiere()}
				  </td>
			    </tr>
			    
			    <tr>
			      <th scope="row">NOMS</th>
			      <td>
			      		Noms communs Arabes          :                                  ${sessionScope.rgfp.getNom_arabe()}<br>
			      		Noms communs Amazigh         :                                  ${sessionScope.rgfp.getNom_amazigh()}<br>
						Noms communs internationaux  :                               	${sessionScope.rgfp.getNom_latin()}<br>
						Autres noms scientifiques parfois utilisés,mais non valides	:	${sessionScope.rfp.getAutres_noms()}<br>                          
			      </td>
			    </tr>
			    <tr>
			      <th scope="row">IMAGES</th>
			      <td class="text-center">
			      		<img src="${sessionScope.rfp.getImage1()}" class="img-thumbnail" style="height:400px; weight:500px;">
			      </td>
			    </tr>
			    <tr>
			      <th scope="row">DESCRIPTION</th>
			      <td>
			      		${sessionScope.rgfp.getDescription()}
			      </td>
			    </tr>
			    
			    
			    
			    
			    <tr>
			      <th scope="row">ECOSYSTEME</th>
			      <td>
			      		Quantité O2 : ${sessionScope.efp.getQ_o2()}%<br>
			      		Quantité CO2 : ${sessionScope.efp.getQ_co2()}%<br>
			      		Température : ${sessionScope.efp.getTemperature()}°C<br>
			      		Gravité : ${sessionScope.efp.getGravite()}%<br>
			      </td>
			    </tr>
			    <tr>
			      <th scope="row">LOCALISATION</th>
			      <td>
			      		Nombre approximatif en l'Algerie : ${sessionScope.rgfp.getNombre()}<br>
			      		Régions    : ${sessionScope.lfp.getRegion()}<br>
			      		Wilayas    : ${sessionScope.lfp.getWilaya()}<br>
			      		Carte : <br><br>
			      </td>
			    </tr>
			  </tbody>
			</table>
		</div>
	</div>
	<div id="map"></div>
	<br><br>
	<div style="text-align:center;">
		<button onClick="location.href = 'ValiderRGF';" type="button" class="btn btn-primary btn-lg" data-toggle="tooltip" title="Valider cette ressource génétique Forestiere">Marquer comme VALIDEE</button>
	</div>
	
	<%@include file="footer.jsp" %>
	
	
	
	<script>
      var map;
      function initMap() {
        map = new google.maps.Map(document.getElementById('map'), {
          center: {lat: 37.710469, lng: 3.008843},
          zoom: 7
        });
      }
    </script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC-XZsXgGTjAOhfoionM0nR15p0qDvBT54&callback=initMap" async defer></script>
	
	
	
	
	
	
</body>
</html>