<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Institutions</title>
</head>
<body>
   
    
    <ul>
        <c:forEach var="inst" items="${ insts }">
            <li> <c:out value="le nom :${ inst.nom_inst}" /></li>
        </c:forEach>
    </ul> 
 
</body>


</html>