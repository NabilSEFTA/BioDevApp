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
	 	<h2 style="text-align:center; color:#8F8F8F">Ressources génétiques marines _ ${ sessionScope.nom1}</h2><br><br>
	 	<div class="text-center"><img alt="faune" src="${sessionScope.image1}" class="img-thumbnail"></div><br>
	 	<div class="text-center" style="text-align:center;" >
	 		<h3  style="color:#8F8F8F">${sessionScope.pre_description1}</h3> <br>
	 		<p class="text-justify" style = "font-size:130%; margin-left: 100px; margin-right: 100px;">
	 			${sessionScope.description1}
	 		</p>
	 	</div>
 	<br><br>
 	<h3 style ="text-align: center;">ACTUELLEMENT, ${sessionScope.nb_especes1} ESPÈCES DE MÉDITERRANÉE  DANS LA PHOTOTHÈQUE !</h3><br><br>
 	<div class="text-center">
 		<button onclick="location.href = 'Embranchements';" type="button" class="btn" style="color: white; background-color: #208247;">Embranchements</button>
 	</div>
 	<br><br>
 	<%@include file="footer.jsp" %>
</body>
</html>