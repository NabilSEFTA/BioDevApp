<%@ page language="java" 
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="business.File"%>
<%@page import="dao.FileDAO"%>
<%@ page trimDirectiveWhitespaces="true" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html" >
		<title>Insert title here</title>
		
    

    		<!-- css -->
   		  <link rel="stylesheet" href="Styles/bootstrap.min.css" />
   		 <link rel="stylesheet" href="Styles/style.css" />
    	<link rel="stylesheet" href="Styles/GED.css" />
    	
    	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/smoothness/jquery-ui.css">
    	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	
	</head>
	
	
	
	<body>

		<%@include file="../WEB-INF/JSP/RGFaune/header.jsp" %>
	
	<div class="container"  style="margin-top: 140px;">
      <div class="row h-100">
        <div class="col-md-3 sidenav">
          <div class="bg-light border-right" id="sidebar-wrapper">
          
          	<!-- <form id= "go" action="">    
      	
                <input id="myInput" />
                <button class="btn btn-primary" type="submit" >Rechercher</button>
             </form> -->
                
            <div class="sidebar-heading" onclick="filterSelection('all')"><center><h4> Afficher tous </h4></center></div>
            <div class="list-group list-group-flush">
              <a
                href="#"
                class="list-group-item list-group-item-action bg-light"
				onclick="filterSelection('LOI_RG')"
                >Lois relatives au resources genetiques</a
              >
              <a
                href="#"
                class="list-group-item list-group-item-action bg-light"
                onclick="filterSelection('LOI_CTA')"
                >Lois relatives aux connaissances traditionnelles</a
              >
              <a
                href="#"
                class="list-group-item list-group-item-action bg-light"
                onclick="filterSelection('LOI_PI')"
                >Lois relatives a propriete intellectuelle</a
              >
              <a
                href="#"
                class="list-group-item list-group-item-action bg-light"
                onclick="filterSelection('LOI_APA')"
                >Accords enregistres sur l'acces et le partage des
                avantages</a
              >
              
            </div>
          </div>
        </div>
        <div class="col-md-9">
          <div class="row" id="files">

          
            <%
	                    ArrayList<File> files = new ArrayList<File>();//@TODO test if empty
                   		files = FileDAO.getFilesInfos();
                    	for(File f : files){
             %>
            <div class="col-md-3 file <%=f.getType() %>">
            <a href="viewFilePDF.jsp?id=<%out.print(f.getIdFile());%>&name=<%out.print(f.getName());%> " target="pdf-frame">
                <div class="card">
                  <img
                    class="card-img-top"
                    src="img/pdf.png"
                    alt="Card image cap"
                  />
                  <span class="hiddenName" style="display: none;"><%=f.getName() %></span>
                  <div class="card-block">
                    <div class="card-title displayName"><h4 class="display-4">Loi <%=f.getRef() %></h4></div>
                    <div class="card-text">
                      <%= f.getDate()%>
                    </div>
                  </div>
                </div>
                </a>
                </div>
                <%
                    	}
                    	
                     %>
          


        </div>
        </div>
      </div>
    </div>
	
	
	<!-- JS CODE -->
	
	
	<script type="text/javascript">
	filterSelection("all") // Execute the function and show all columns
	function filterSelection(c) {
	  var x, i;
	  x = document.getElementsByClassName("file");
	  if (c == "all") c = "";
	  // Add the "show" class (display:block) to the filtered elements, and remove the "show" class from the elements that are not selected
	  for (i = 0; i < x.length; i++) {
		w3RemoveClass(x[i], "show");
	    if (x[i].className.indexOf(c) > -1) w3AddClass(x[i], "show");
	  }
	}
	// Show filtered elements
	function w3AddClass(element, name) {
	  var i, arr1, arr2;
	  arr1 = element.className.split(" ");
	  arr2 = name.split(" ");
	  for (i = 0; i < arr2.length; i++) {
	    if (arr1.indexOf(arr2[i]) == -1) {
	      element.className += " " + arr2[i];
	    }
	  }
	}
	// Hide elements that are not selected
	function w3RemoveClass(element, name) {
	  var i, arr1, arr2;
	  arr1 = element.className.split(" ");
	  arr2 = name.split(" ");
	  for (i = 0; i < arr2.length; i++) {
	    while (arr1.indexOf(arr2[i]) > -1) {
	    	arr1.splice(arr1.indexOf(arr2[i]), 1);
	    }
	  }
	  element.className = arr1.join(" ");
	}
	
	/* $(document).ready(function(){
		$("#myInput").on("keyup", function() {
		var value = $(this).val().toLowerCase();
		  $("#go").submit(function() {
			 
			  var matcher = new RegExp($(this).val(), 'gi');
		        $('.file').show().not(function(){
		        	alert($(this).find('.hiddenName, .displayName').text());
		        	return matcher.test($(this).find('.hiddenName, .displayName').text());
		        }).hide();
		         
	            
		        
		//    $("#files *").filter(function() {
		  //    $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
		    //});
		    
		    
		  });
		});
		}); */
	
	
	
	</script>
	
	</body>
</html>