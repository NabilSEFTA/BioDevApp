<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${ sessionScope.nom1}</title>
</head>
<body>
 	<%@include file="header.jsp"  %>
	 	<h2 style="text-align:center; color:#8F8F8F">Ressources génétiques forestieres _ ${ sessionScope.nom1}</h2><br><br>
	 	<div class="text-center"><img style="width:600px; height:400px" alt="rgf" src="${sessionScope.image1}" class="img-thumbnail"></div><br>
	 	<div class="text-center" style="text-align:center;" >
	 		<p class="text-justify" style = "font-size:130%; margin-left: 100px; margin-right: 100px;">
	 			${sessionScope.description1}
	 		</p>
	 	</div>
 	<br><br>
 	<div class="text-center">
 		<c:choose> 
  			<c:when test="${sessionScope.id1==1}">
 				<button onclick="location.href = 'EmbranchementsForest';" type="button" class="btn" style="color: white; background-color: #208247;">Embranchements</button>
  			</c:when>
  			<c:otherwise>
 				<button onclick="location.href = 'OrdresForest';" type="button" class="btn" style="color: white; background-color: #208247;">Ordres</button>
  			</c:otherwise>
		</c:choose>
 	</div>
 	<br><br>
 	<%@include file="footer.jsp" %>
</body>
</html>