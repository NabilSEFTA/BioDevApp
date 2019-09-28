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
      <link href="dependencies/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="dependencies/admin/css/sb-admin-2.min.css" rel="stylesheet">
  <link href="inc/dashboard.css" rel="stylesheet">
	</head>
	<body>
		<div id="wrapper">
    <%@include file="/WEB-INF/JSP/RGAlim/adminNav.jsp" %>
		
		<div class="container">
  <div class="row" style="margin-top: 140px;">
  		<div class="row justify-content-center">
            <center><h1>Listes de demandes</h1></center>
          </div>
    <div class="col-12">
      <table class="table table-bordered">
        <thead>
          <tr>
          	<th scope="col">ID</th>
            <th scope="col">Demandeur</th>
            <th scope="col">Type de permis</th>
            <th scope="col">Nature</th>
            <th scope="col">Duree</th>
            <th scope="col">Etat</th>
            <th scope="col">Actions</th>
          </tr>
        </thead>
        <tbody>
        <%
        				List<Permis> demandes = PermisDAO.getListeDemandesAdmin();//@TODO test if empty
        				Collections.sort(demandes);
                   		for(Permis p : demandes){
         %>
          <tr>
          	<th><%=p.getId()%></th>
            <th><%=p.getDemandeur()%></th>
            <td><%=p.getType() %></td>
            <td><%=p.getNature() %></td>
            <td><%=p.getDuree() %></td>
            <td><%=p.getEtat() %></td>
            <td>
              <a href="permisdetail?type=<%=p.getType()%>&id=<%=p.getId()%>&view=admin" ><button type="button" class="btn btn-primary" >Voir</button></a>
              <a href="gestiondemandes?param1=valide&param2=<%=p.getId()%>"> <button type="button" class="btn btn-success" >Valider</button></a>
              <a href="gestiondemandes?param1=suspendre&param2=<%=p.getId()%>"><button type="button" class="btn btn-danger">Suspendre</button></a>
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
		
		
 <script src="dependencies/admin/vendor/jquery/jquery.min.js"></script>
 <script src="dependencies/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
 <script src="dependencies/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
 <script src="dependencies/admin/js/sb-admin-2.min.js"></script>


	</body>
</html>