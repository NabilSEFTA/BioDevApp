<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>RG Marines</title>
</head>
<body>

	<%@include file="header.jsp"  %>
	
	<h2 style="text-align:center; color:#8F8F8F">Ressources génétiques marines en attente de validation</h2><br><br>
	
	<div class="container">
		<div class="row">
			<c:forEach var="i" begin="1" end="${sessionScope.listRMP.size() }" step="1">
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="${sessionScope.listRMP.get(i-1).getImage()}" alt="Lights" class="roundedImageShadow" style="width:70%">
		          	<form method="GET" action="DetailsRGMP">
			          <div class="caption">
			          	<input type="hidden" name="numRGMP" value="${i}">
			          	<input type="hidden" name="idRGMP" value="${sessionScope.listRMP.get(i-1).getId()}">
			          	<br>
			          	<h5>${sessionScope.listRMP.get(i-1).getNom_latin()}</h5>
			          	<br>
			          </div>
		          	<button type="submit" class="btn" style="color: white; background-color: #208247;">En savoir plus</button>
		          	</form>
		      </div>
		    </div>
		    </c:forEach> 
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