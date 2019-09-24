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
	<br><br><br>
	<div class="container" style="color:#4D4F5C;">
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
			    	<th scope="row">Accèder au détail de la CTA</th>
			      	<td>
			      		<button type="submit" class="btn" style="color: white; background-color: #208247;" data-toggle="modal" data-target="#CTAmodal">DETAIL CONNAISSANCE TRADITIONNELLE ASSOCIEE</button>
			      		<!-- Modal -->
						<div class="modal fade" id="CTAmodal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
						  <div class="modal-dialog" role="document">
						    <div class="modal-content">
						      <div class="modal-header">
						        
						        <button type="button" class="close" data-dismiss="modal">&times;</button>
        						<h4 class="modal-title">${sessionScope.ctap.getIntitule()}</h4>
						      </div>
						      <div class="modal-body">
						      <img align="right" src="${sessionScope.ctap.getImage()}" class="img-thumbnail">
						      <p>
						        <strong>Ingrédients :</strong><br>
								${sessionScope.ctap.getIngredients()}
								<br><br>
								<strong>Préparation :</strong><br>
								${sessionScope.ctap.getPreparation()}
								<br><br>
								<strong>Utilisation :</strong><br>
								${sessionScope.ctap.getDescription()}
								<br><br>
								<strong>Propriétaire :</strong><br>
								${sessionScope.ctap.getProprietaire()}
								<br><br>
								<strong>Brevet :</strong><br>
								${sessionScope.ctap.getBrevet()}
								<br><br>
								<strong>Région(s) :</strong><br>
								${sessionScope.ctap.getRegion()} 
								<br><br>
								
							  </p>
						      </div>
						      <div class="modal-footer">
						        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
						        <a href="javascript:window.print()"><button type="button" class="btn btn-primary">Imprimer</button></a>
						        <button onClick="location.href='ValiderCTA';" type="button" class="btn btn-success">Valider</button>
						      </div>
						    </div>
						  </div>
						</div>
			      		<img align="right" src="images/RGMarines/cta.png" style="height:20%; weight:20%;">
			     	</td>
			     </tr>
			    </tbody>
			    </table>
		</div>
	</div>	
	
	<%@include file="footer.jsp" %>
	
	
	
	
	
	
	
	
	
</body>
</html>