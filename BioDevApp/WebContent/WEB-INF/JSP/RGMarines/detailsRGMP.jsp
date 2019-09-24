<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Détails</title>
<link rel = "stylesheet" type = "text/css" href = "Styles/RGMarines/map.css" />

</head>
<body>
	<%@include file="header.jsp"  %>
	<div class="container" style="color:#4D4F5C;">
		<div>
			<h3 style="text-align:center;">RG Marines --> Faune --> Poissons --> POISSONS-CARTILAGINEUX-ELASMOBRANCHES</h3><br><br>
			<img align="right" src="${sessionScope.rgp.getImage()}" class="img-thumbnail" style="height:400px; weight:400px;">
			<h4 style="text-align:left">${sessionScope.rgp.getNom_francais()}</h4>
			<h6 style="text-align:left;">${sessionScope.rgp.getNom_latin()} | (Cocco, 1833) <br>N°168</h6>
			
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
			      		${sessionScope.rmp.getCleIdentif()}
				  </td>
			    </tr>
			    <tr>
			      <th scope="row">BITOPE</th>
			      <td>P. rouxi se rencontre de 3 à 40 mètres sur substrats* durs, de type rochers lisses et éboulis à faible profondeur ou sur du coralligène</td>
			    </tr>
			    <tr>
			      <th scope="row">NOMS</th>
			      <td>
			      		Noms communs Arabes          :                                  ${sessionScope.rgp.getNom_arabe()}<br>
			      		Noms communs Amazigh         :                                  ${sessionScope.rgp.getNom_amazigh()}<br>
						Noms communs internationaux  :                               	${sessionScope.rgp.getNom_latin()}<br>
						Autres noms scientifiques parfois utilisés,mais non valides	:	${sessionScope.rmp.getAutres_noms()}<br>                          
			      </td>
			    </tr>
			    <tr>
			      <th scope="row">IMAGES</th>
			      <td class="text-center">
			      		<img src="${sessionScope.rmp.getImage1()}" class="img-thumbnail" style="height:400px; weight:500px;">
			      		<img src="${sessionScope.rmp.getImageMale()}" class="img-thumbnail">
			      		<img src="${sessionScope.rmp.getImageFemale()}" class="img-thumbnail">
			      </td>
			    </tr>
			    <tr>
			      <th scope="row">DESCRIPTION</th>
			      <td>
			      		${sessionScope.rgp.getDescription()}
			      </td>
			    </tr>
			    
			    
			    
			    <tr>
			      <th scope="row">ALIMENTATION</th>
			      <td>
			      		${sessionScope.rmp.getAlimentation()}
			      </td>
			    </tr>
			    <tr>
			      <th scope="row">ECOSYSTEME</th>
			      <td>
			      		Quantité O2 : ${sessionScope.emp.getQt_o2()}%<br>
			      		Quantité CO2 : ${sessionScope.emp.getQt_co2()}%<br>
			      		Température de la mer : ${sessionScope.emp.getTemperature_mer()}°C<br>
			      		Salinité : ${sessionScope.emp.getSalinite()}%<br>
			      </td>
			    </tr>
			    <tr>
			      <th scope="row">LOCALISATION</th>
			      <td>
			      		Nombre approximatif en l'Algerie : ${sessionScope.rgp.getNombre()}<br>
			      		Régions    : ${sessionScope.lmp.getRegion()}<br>
			      		Wilayas    : ${sessionScope.lmp.getWilaya()}<br>
			      		Profondeur : ${sessionScope.lmp.getAltitude()}m<br>
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
		<button onClick="location.href = 'ValiderRGM';" type="button" class="btn btn-primary btn-lg" data-toggle="tooltip" title="Valider cette ressource génétique marine">Marquer comme VALIDEE</button>
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