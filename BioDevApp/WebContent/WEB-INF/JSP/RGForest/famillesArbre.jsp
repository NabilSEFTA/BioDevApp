<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Varietes d'arbres</title>

<link rel = "stylesheet" type = "text/css" href = "Styles/RGForest/images.css" />

</head>
<body>

	<%@include file="header.jsp"  %>
	<h4 style="text-align:center; color:#8F8F8F">RG Forestiere --> ${sessionScope.nom1} --> ${sessionScope.nom2} --> ${sessionScope.nom3} (Variete)</h4><br><br>
	
	<div class="container">
		<div class="row">
			<c:forEach var="i" begin="1" end="${sessionScope.listRF.size() }" step="1">
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="${sessionScope.listRF.get(i-1).getImage()}" alt="Lights" class="roundedImageShadow">
		          
		          	<form method="GET" action="DetailsForest">
			          <div class="caption">
			          	<input type="hidden" name="numEspfor" value="${i}">
			          	<input type="hidden" name="idEspfor" value="${sessionScope.listRF.get(i-1).getId_RGForestiere()}">
			          	<br>
			          	<h5>${sessionScope.listRF.get(i-1).getNom_latin()}</h5>
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
</html>