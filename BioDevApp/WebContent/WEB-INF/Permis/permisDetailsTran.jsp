<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="business.Permis"%>
<%@page import="business.PermisAcces"%>
<%@page import="business.PermisValorisation"%>
<%@page import="business.PermisCirculation"%>
<%@page import="business.PermisTransfert"%>
<%@page import="dao.PermisDAO"%>
<%@page import="java.util.Collections"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
		<meta name="viewport" content="width=device-width, initial-scale=1" />

    <!-- css -->
    <link rel="stylesheet" href="styles/bootstrap.min.css" />
    <link rel="stylesheet" href="styles/style.css" />
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/smoothness/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	</head>
	<body>
		<%@include file="/Header.jsp" %>
		
		<div class="container" style="margin-top: 140px;">
          <div class="row justify-content-center">
          	<dir class="" ></dir>
            <center><h1>Details de Permis d'Acces </h1></center>
          <%
          	
	          
          	
    			PermisTransfert p = (PermisTransfert)request.getAttribute("permis");
    			
    		
    		

          	
          	
          %>
          
          <table class="table">
			  <thead>
			    <tr>
			      <th scope="col">Elément</th>
			      <th scope="col">Détail</th>
			    </tr>
			  </thead>
			  <tbody>
			    <tr>
			      <th scope="row">NATURE</th>
			      <td>
			      		<%=p.getNature()%>
				  </td>
			    </tr>
			    <tr>
			      <th scope="row">DUREE</th>
			      <td>
			      		<%=p.getDuree()%>
				  </td>
			    </tr>
			    <tr>
			      <th scope="row">DATE OPERATION</th>
			      <td>
			      		<%=p.getDateOperation()%>
				  </td>
			    </tr>
			    
			    <tr>
			      <th scope="row">OPERATEUR</th>
			      <td>
			      		<%=p.getOperateur()%>
				  </td>
			    </tr>
			    <tr>
			      <th scope="row">QUANTITE</th>
			      <td>
			      		<%=p.getQuant()%>
				  </td>
			    </tr>
			    <tr>
			      <th scope="row">ETAT</th>
			      <td>
			      		<%=p.getEtat()%>
				  </td>
			    </tr>
			    
			    <tr>
			      <th scope="row">TYPE DE TRANSFERT</th>
			      <td>
			      	<%=((PermisTransfert)p).getTranType()%>
				  </td>
			    </tr>
			    
			    <tr>
			      <th scope="row">POINT ENTREE / SORTIE</th>
			      <td>
			      		<%=((PermisTransfert)p).getTranPoint()%>
				  </td>
			    </tr>
			    
			    
			    
			  </tbody>
			</table>
			<%
				if ("admin".equals(request.getParameter("view"))){
			%>
			<div class="text-center"> 
                  <a href="gestiondemandes" ><button class="btn btn-primary">Retour</button></a>
            </div>
            <%	
				}else if ("user".equals(request.getParameter("view"))){  
					
            %>
            	<a href="demandes" ><button class="btn btn-primary">Retour</button></a>
          	<%
          	
          	}%>
          
          
          
          
         </div>
          
		
		


</body>
</html>