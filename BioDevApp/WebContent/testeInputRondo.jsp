<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
	<c:forEach var="i" begin="0" end="7" step="1">
		<input placeholder ="${i}"  name="input${i}" />
	</c:forEach>
</body>
</html>