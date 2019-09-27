<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>RG Forestieres</title>
</head>
<body>

	<%@include file="header.jsp"  %><br>
	
	<h2 style="text-align:center; color:#8F8F8F">Connaissances traditionnelles associées en attente de validation</h2>
	
	<div class="container">
		<div class="row">
			<c:forEach var="i" begin="1" end="${sessionScope.listCTAP.size() }" step="1">
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="${sessionScope.listCTAP.get(i-1).getImage()}" alt="Lights" class="roundedImageShadow">
		          
		          	<form method="GET" action="DetailsCTAP">
			          <div class="caption">
			          	<input type="hidden" name="numCTAP" value="${i}">
			          	<input type="hidden" name="idCTAP" value="${sessionScope.listCTAP.get(i-1).getId()}">
			          	<h3>${sessionScope.listCTAP.get(i-1).getIntitule()}</h3>
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