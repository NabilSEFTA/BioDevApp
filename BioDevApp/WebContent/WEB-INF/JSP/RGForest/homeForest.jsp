<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>RG Forestieres</title>
</head>
<body>

	<%@include file="header.jsp"  %>
	
	<h3 style="text-align:center; color:#8F8F8F">Ressources génétiques forestieres</h3>
	<br>
	<div style="display: table;margin: 0 auto; min-height: 100%;color:#8F8F8F">
		<table>
			<tr>
			  <c:forEach var="i" begin="1" end="${ sessionScope.listClassifications1.size() }" step="1">
			  	<td><img onclick="location.href = 'RGF?numRGF='+${i};" alt="${sessionScope.listClassifications1.get(i-1).getNom()}" src="${sessionScope.listClassifications1.get(i-1).getImage()}" style="padding: 20px;border-radius:50%;width:300px;height:300px;"></td>			  	
			  </c:forEach>
				
			  
			</tr>
			<tr style="text-align:center; font-size:30px">
			  <c:forEach var="i" begin="1" end="${ sessionScope.listClassifications1.size() }" step="1">
			  	<td style = "font-size:80%;">${sessionScope.listClassifications1.get(i-1).getNom()}</td>
			  </c:forEach>
				
			</tr>
		</table>
	</div>
	<br><br>
	<c:if test="${(empty sessionScope.prenomNom) || (sessionScope.categUser==1) }">
		<div style="text-align:center;">
			<button onclick="location.href = 'ProposerRGFform'" type="button" class="btn btn-warning btn-lg" data-toggle="tooltip" title="Proposer une ressource génétique forestiere">Proposer une RGF</button>
			<button onclick="location.href = 'ProposerCTAForestform'" type="button" class="btn btn-info btn-lg" data-toggle="tooltip" title="Proposer une connaissance traditionnelle associée à une RG">Proposer une CTA</button>
		</div>
	</c:if>
	
	<c:if test="${(not empty sessionScope.prenomNom) && (sessionScope.categUser==2) }">
		<div style="text-align:center;">
			<button onclick="location.href = 'HomeSpecialisteF'" type="button" class="btn btn-info btn-lg" data-toggle="tooltip" title="Pour moi le spécialiste">Revenir à ma page Spécialiste</button>
		</div>
	</c:if>
	
	<br><br>
	<%@include file="footer.jsp" %>

</body>
<script>
$(document).ready(function(){
  $('[data-toggle="tooltip"]').tooltip();
});
</script>
</html>