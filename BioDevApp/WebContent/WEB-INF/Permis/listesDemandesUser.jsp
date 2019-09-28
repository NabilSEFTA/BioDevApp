<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="business.Permis"%>
<%@page import="dao.PermisDAO"%>
<%@page import="java.util.Collections"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<meta name="viewport" content="width=device-width, initial-scale=1" />

    <!-- css -->
    <link rel="stylesheet" href="Styles/bootstrap.min.css" />
    <link rel="stylesheet" href="Styles/style.css" />
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/smoothness/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	</head>
	<body>
		<%@include file="/Header.jsp" %>
		
		<div class="container">
 		<div class="row" style="margin-top: 140px;">
  				<div class="row justify-content-center">
           		 <center><h1>Mes demandes</h1></center>
          		</div>
    <div class="col-12">
      <table class="table table-bordered">
        <thead>
          <tr>
            <th scope="col">Type de permis</th>
            <th scope="col">Nature</th>
            <th scope="col">Duree</th>
            <th scope="col">Operateur</th>
            <th scope="col">Quantite</th>
            <th scope="col">Etat</th>
            <th scope="col">Actions</th>
          </tr>
        </thead>
        <tbody>
        <%
        				List<Permis> demandes = PermisDAO.getListeDemandesUser((String)request.getAttribute("UserID"));//@TODO get simlpe user id from session
        				Collections.sort(demandes);
                   		for(Permis p : demandes){
         %>
          <tr>
            <td><%=p.getType() %></td>
            <td><%=p.getNature() %></td>
            <td><%=p.getDuree() %></td>
            <th><%=p.getOperateur()%></th>
            <th><%=p.getQuant()%></th>
            <td><%=p.getEtat() %></td>
            <td>
              <a href="permisdetail?type=<%=p.getType()%>&id=<%=p.getId()%>&view=user" ><button type="button" class="btn btn-primary" >Details</button></a>
            </td>	
          </tr>
          <%
          		}
          %>
          
          
        </tbody>
      </table>
    </div>
  </div>
</div>


	</body>
</html>