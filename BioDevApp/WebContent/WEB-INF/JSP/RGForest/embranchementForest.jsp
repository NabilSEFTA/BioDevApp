<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${ sessionScope.nom2}</title>
</head>
<body>
 	<%@include file="header.jsp"  %>
 	<h2 style="text-align:center; color:#8F8F8F">RG Forestieres --> ${ sessionScope.nom1} --> ${ sessionScope.nom2}</h2><br><br>
 	<div>
 	<div style="float:left;" class="text-left"><img style="width:500px; height:300px; margin-left:20px; margin-right:35px" alt="RGF" src="${sessionScope.image2}"></div>
 	<div class="text-justify" style="margin-left:10%;margin-right:10%; text-align:center;">
 		<p style = "font-size:130%">
 			${sessionScope.description2}
 		</p>
 	</div>
 	</div>
 	<br>
 	<div class="text-center">
 		<button onclick="location.href = 'EspecesForest';" type="button" class="btn" style="color: white; background-color: #208247;">Especes</button>
 	</div>
 	<%@include file="footer.jsp" %>
</body>
</html>