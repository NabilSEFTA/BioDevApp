<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
      <!-- Custom fonts for this template-->
  <link href="dependencies/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="dependencies/admin/css/sb-admin-2.min.css" rel="stylesheet">
	</head>
	<body id="page-top">
  <div id="wrapper">
		<%@include file="/WEB-INF/JSP/RGAlim/adminNav.jsp" %>	
	<div class="container" >
          <div class="row justify-content-center">
            <center><h1>Ajouter Fichier ${connectedUser.login }</h1></center>
          </div>
          <div class="row" style="margin-top: 40px;">
            <div class="col-md-2">
      
            </div>
      
            <div class="col-md-9">
              <form method="post" action="ajouterLoi" enctype="multipart/form-data">
                <label>Nom de Fichier :</label>
                <input type="text" class="form-control" name="fileName"/>
                
                <label>Reference :</label>
                <input type="text" class="form-control" name="fileRef"/>
                
                <label>Date :</label>
                <input type="text" class="form-control" name="date" id="datepicker" placeholder="DD-MM-YYYY"/>
                
                <label>Type :</label>
                <select name="type" class="form-control">
                  <option value="LOI_RG">Lois relatives aux RG</option>
                  <option value="LOI_CTA">Lois relatives aux CT</option>
                  <option value="LOI_PI">Lois relatives à propriete intellectuelle</option>
                  <option value="LOI_APA">Accords enregistres sur APA</option>
                </select>
                <br/>
                
                <input name="file" type="file"> <br/>

                
                <div class="text-center"> 
                  <button class="btn btn-primary" type="submit" style="margin-top: 40px;">Ajouter le fichier</button>
                </div>
                <br />
				<div class="errorMessage">${errorMessage}</div>

               </form>
               </div>
              
            </div>
          </div>	


	<script>
 	 $( function() {
  	  $( "#datepicker" ).datepicker({
  		dateFormat: "dd-mm-yy"	
  	  });
 	} );
  </script>
		<script src="dependencies/admin/vendor/jquery/jquery.min.js"></script>
 <script src="dependencies/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
 <script src="dependencies/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
 <script src="dependencies/admin/js/sb-admin-2.min.js"></script>
	</body>
</html>