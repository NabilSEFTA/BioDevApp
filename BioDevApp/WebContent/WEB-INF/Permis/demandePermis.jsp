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
	
	<div class="container" style="margin-top: 140px;">
          <div class="row justify-content-center">
            <center><h1>Demander  ${type}</h1></center>
          </div>
          <div class="row" style="margin-top: 40px;">
            <div class="col-md-2">
      
            </div>
      
            <div class="col-md-9">
            <form method="post" action="demandePermis" id="myform" >
				<input type="hidden" name="type" value="<%= request.getParameter("type") %>" />              
              
              	<label>Nature :</label>
                <select name="nature" class="form-control">
                  <option value="Scientifique">Scientifique</option>
                  <option value="Commercial">Commercial</option>
                </select>
                <br/>
              
              
                <label>Duree :</label>
                <input type="text" class="form-control" name="Duree"/>
                
                <label>Date d'operation :</label>
                <input type="text" class="form-control" name="dateOperation" id="datepicker" placeholder="DD-MM-YYYY"/>
                
                <label>Operateur :</label>
                <input type="text" class="form-control" name="Operateur"/>
                
                <label>Quantite :</label>
                <input type="text" class="form-control" name="Quant"/>
                				
				<% 
					if ("Premis d'acces".equals((String)request.getAttribute("type"))) {
				%> 
					<label>Formalite sanitaire :</label>
                	<input type="text" class="form-control" name="AccFormaliteSanitaire"/>
                	
                	<label>Precautions :</label>	
                	<input type="text" class="form-control" name="AccPrecautions"/>
                	
                	<label>Prescription imposee par l'organe :</label>
                	<input type="text" class="form-control" name="AccPrescription"/>	
				
				
				<% 
					}else if ("Permis de circulation".equals((String)request.getAttribute("type"))) {
				%>
					<label>Moyen de transport :</label>
                	<input type="text" class="form-control" name="CirMoyTransport"/>
                
                	<label>Itineraire :</label>
                	<input type="text" class="form-control" name="CirItineraire"/>
				<% 
					}else if ("Permis de transfert".equals((String)request.getAttribute("type"))) {
				%>
					<label>Type de transfert :</label>
		                <select name="TranType" class="form-control">
		                  <option value="entree">Entree</option>
		                  <option value="sortie">Sortie</option>
		                </select>
                	<br/>
					<label>Point d'entre/Sortie :</label>
                	<input type="text" class="form-control" name="TranPoint"/>
				
				<% 
					}else if ("Permis de valorisation".equals((String)request.getAttribute("type"))) { 
				%>
					<label>Destination des produits:</label>
                	<input type="text" class="form-control" name="ValdestProduit"/>
                	
                	<label>Marches envisages :</label>
                	<input type="text" class="form-control" name="Valmarche"/>
                	
                
				
				<% 	
					} 
				%> 
                
                <br/>

                
                <div class="text-center"> 
                  <button id="tbn"class="btn btn-primary" type="submit" value="Submit" style="margin-top: 40px;">Valide la demande</button>
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
		
	</body>
</html>