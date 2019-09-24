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
 	<h2 style="text-align:center; color:#8F8F8F">RG Marines --> ${ sessionScope.nom1} --> ${ sessionScope.nom2}</h2><br><br>
 	<div>
 	<div style="float:left;" class="text-left"><img alt="faune" src="${sessionScope.image2}"></div>
 	<div class="text-justify" style="margin-left:10%;margin-right:10%; text-align:center;">
 		<p style = "font-size:130%">
 			${sessionScope.description2}
 		</p>
 	</div>
 	</div>
 	<br>
 	<h4 style ="text-align: center;">ACTUELLEMENT, ${sessionScope.nb_especes2} ESPÈCES DE ${ sessionScope.nom2} DE MÉDITERRANÉE  DANS LA PHOTOTHÈQUE !</h4><br><br>
 	<div class="text-center">
 		<button onclick="location.href = 'Categories';" type="button" class="btn" style="color: white; background-color: #208247;">Catégories</button>
 	</div>
 	<%@include file="footer.jsp" %>
</body>
</html>