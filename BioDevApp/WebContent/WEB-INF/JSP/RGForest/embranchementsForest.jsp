<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EmbranchementsForest/${sessionScope.nom1}</title>
</head>
<body>




	<%@include file="header.jsp"  %>
	<h2 style="text-align:center; color:#8F8F8F">Ressources génétiques forestieres _ ${ sessionScope.nom1}</h2><br><br>
	
	<div class="container">
		<div class="row">
			<c:forEach var="i" begin="1" end="${ sessionScope.listClassifications2.size() }" step="1">
		    <div class="col-md-3">
		      <div class="thumbnail text-center">
		          <img src="${ sessionScope.listClassifications2.get(i-1).getImage()}" alt="Lights" style="width:70%">
		          
		          	<form method="GET" action="EmbranchementForest">
			          <div class="caption">
			          	<input type="hidden" name="numEMBR" value="${i}">
			          	<h3><c:out value="${ sessionScope.listClassifications2.get(i-1).getNom() }" /></h3>
			           
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