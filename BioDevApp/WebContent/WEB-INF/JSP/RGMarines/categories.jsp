<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Catégories</title>

<link rel = "stylesheet" type = "text/css" href = "Styles/RGMarines/images.css" />

</head>
<body>

	<%@include file="header.jsp"  %>
	<h3 style="text-align:center; color:#8F8F8F">RG Marines --> ${ sessionScope.nom1} --> ${ sessionScope.nom2} (Catégories)</h3><br><br>
	
	<div class="container">
		<div class="row">
			<c:forEach var="i" begin="1" end="${ sessionScope.listClassifications3.size() }" step="1">
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="${ sessionScope.listClassifications3.get(i-1).getImage()}" alt="Lights" class="roundedImageShadow"><br><br>
		          
		          	<form method="GET" action="Especes">
			          <div class="caption">
			          	<input type="hidden" name="numCATEG" value="${i}">
			          	<input type="hidden" name="idCATEG" value="${sessionScope.listClassifications3.get(i-1).getId()}">
			          	<h6><c:out value="${ sessionScope.listClassifications3.get(i-1).getNom() }" /></h6>
			            <p>${sessionScope.listClassifications3.get(i-1).getNb_especes()} espèces</p>
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