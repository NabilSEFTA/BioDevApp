<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Ajout d'une Ressource Phytogenetique</title>      
  <meta content="width=device-width, initial-scale=1.0" name="viewport">    
  <meta content="" name="keywords">    
  <meta content="" name="description">           
  <!-- Favicons -->             
  <link href="dependencies/img/favicon.png" rel="icon">
  <link href="dependencies/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts --> 
  <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="dependencies/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="dependencies/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="dependencies/lib/animate/animate.min.css" rel="stylesheet">
  <link href="dependencies/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="dependencies/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="dependencies/css/style.css" rel="stylesheet">

  <!-- Datepicker style -->
  <link href="dependencies\lib\gijgo\css\gijgo.min.css" rel="stylesheet" type="text/css" />
  
  <!-- DatePicker script -->
    <script src="dependencies\lib\jquery\dist\jquery.min.js"></script>
     <script src="dependencies\lib\gijgo\js\gijgo.min.js" type="text/javascript"></script>

  <style type="text/css">#contenu {
                                    margin-top: 5%;
                                    margin-left:15%;
                                    margin-right: 15%;
                                   
                                    background-color: white;
                                   
                                    
                                      }
                          #body {
                                   padding-top: 5%;
                                   padding-bottom: 5%; 
                                   background-image: url("dependencies/img/canada-2250105_960_720.jpg");
                                   background-repeat: no-repeat;
                                   
                                   background-size: 100%;
                                   background-attachment: fixed;
                                 
                          } 
  </style>
</head>
<body>
	<div id ="body">
  <div>
  <nav class="navbar navbar-default navbar-trans navbar-expand-lg fixed-top">
    <div class="container">
      <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbarDefault"
        aria-controls="navbarDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span></span>
        <span></span>
        <span></span>
      </button>
      <a class="navbar-brand text-brand" href="index.html">bio<span class="color-b">.DEV</span></a>
      <button type="button" class="btn btn-link nav-search navbar-toggle-box-collapse d-md-none" data-toggle="collapse"
        data-target="#navbarTogglerDemo01" aria-expanded="false">
        <span class="fa fa-search" aria-hidden="true"></span>
      </button>
      <div class="navbar-collapse collapse justify-content-center" id="navbarDefault">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link active" href="index.html">Accueil</a>
          </li>

          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">
              RG
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="property-single.html">Marine</a>
              <a class="dropdown-item" href="rgfaune.html">Faunistique</a>
              <a class="dropdown-item" href="agents-grid.html">Phylogénétique</a>
              <a class="dropdown-item" href="agent-single.html">Micro organisme</a>
              <a class="dropdown-item" href="agent-single.html">Forestière</a>
            </div>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">
            CTA
          </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="property-single.html">Marine</a>
              <a class="dropdown-item" href="ctafaune.html">Faunistique</a>
              <a class="dropdown-item" href="agents-grid.html">PhylogÃ©nÃ©tique</a>
              <a class="dropdown-item" href="agent-single.html">Micro organisme</a>
              <a class="dropdown-item" href="agent-single.html">ForestiÃ¨re</a>
            </div>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="property-grid.html">Annuaire</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="blog-grid.html">Réglementation</a>
          </li>
         
          <li class="nav-item">
            <a class="nav-link" href="contact.html">Contact</a>
          </li>
        </ul>
      </div>
      <button type="button" class="btn btn-b-n navbar-toggle-box-collapse d-none d-md-block" data-toggle="collapse"
        data-target="#navbarTogglerDemo01" aria-expanded="false">
        <span class="fa fa-search" aria-hidden="true"></span>
      </button>
    </div>
  </nav>
  </div>
  	<div id="contenu">
  				<form  class="text-center border border-light p-5 form-a" action="#!" method="post" id="form">
  		<p class="h4 mb-4">Ajouter une Ressource Phytogenetique</p>
  		<div class="form-row mb-4">
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Nom Latin" name="nomLatin">
        </div>
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Nom Arabe" name="nomArabe">
        </div>
      </div>
      <div class="form-row mb-4">
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Nom Amazigh" name="nomAmazigh">
        </div>
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Nom Français" name="nomFrancais">
        </div>
        </div>
 
            <div class="form-group">
              <textarea  class="form-control" name="descriptionRessouce" cols="45" rows="8" data-rule="required"  placeholder="Description de la RG"></textarea>
              <div class="validation"></div>
            </div>
      	
      	<div class="form-group">
	          <input type="File" name="image" class="form-control form-control-lg form-control-a" placeholder="Uploader l'image de la RG" >
	          <div class="validation"></div>
	          <small>
	          	Insérez une image de la Ressource 
	          </small>
        </div>
        <div class="form-row mb-4">
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Arrosage" name="arrosage">
        </div>
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Hauteur Maturité" name="hauteurMaturite">
        </div>
      </div>
      <div class="form-row mb-4">
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Largeur Maturité" name="largeurMaturite">
        </div>
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Niveau de soin" name="niveauSoin">
        </div>
        </div>
        <div class="form-row mb-4">
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Periode de floraison" name="periodeFloraison">
        </div>
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Rusticité" name="rusticite">
        </div>
      </div>
      <div class="form-row mb-4">
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Saison d'interet" name="saisonInteret">
        </div>
        <div class="col">
            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Utilisation en jardin" name="utilisationjardin">
        </div>
        </div>
   		<p class="h4 mb-4">Caractéristique Anatomique</p>
	    <div class="form-row mb-4">
	        <div class="col">
	            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Type des Racines" name="typeRacine">
	        </div>
	        <div class="col">
	            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Feuille" name="feuille">
	        </div>
      	</div>
      	<div class="form-row mb-4">
	        <div class="col">
	            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Graine" name="graine">
	        </div>
	        <div class="col">
	            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Fleure" name="fleure">
	        </div>
      	</div>
      	<div class="form-row mb-4">
	        <div class="col">
	            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Fruit" name="fruit">
	        </div>
	        <div class="col">
	            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Tige" name="tige">
	        </div>
      	</div>
      	<p class="h4 mb-4">Caractéristique Morphologique</p>
      	<div class="form-row mb-4">
	        <div class="col">
	            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Maturité" name="maturite">
	        </div>
	        <div class="col">
	            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Tubercule" name="tubercule">
	        </div>
      	</div>
      	<div class="form-row mb-4">
	        <div class="col">
	            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Couleur de la fleure" name="couleurFleure">
	        </div>
	        <div class="col">
	            <input type="text" class="form-control form-control-lg form-control-a" placeholder="Germe" name="germe">
	        </div>
      	</div>
      	<p class="h5 mb-4">Caractéristique Morphologique : la phane</p>
        <div class="form-group">
              <textarea  class="form-control" name="descriptionPort" cols="45" rows="8" data-rule="required"  placeholder="Description des ports"></textarea>
              <div class="validation"></div>
        </div>
        <div class="form-row mb-4">
          <div class="col">
              <input type="text" class="form-control form-control-lg form-control-a" placeholder="Caractère feuille " name="caracFeuille">
          </div>
          <div class="col">
              <input type="text" class="form-control form-control-lg form-control-a" placeholder="Caractère Tige" name="caracTige">
          </div>
        </div>
        <p class="h5 mb-4">Ecosystème de la Ressource Phytogenetique</p>
        <div class="form-row mb-4">
          <div class="col">
              <button type="button" id="rajouterEco" class="btn btn-a"> Rajouter un ecosysteme</button>
              <script type="text/javascript">
                var ecosysteme = document.getElementById("rajouterEco");
                var i = 2;
                ecosysteme.onclick = function (){
                   var divecosysteme = document.getElementById("form");
                   var input = document.createElement ("input");
                   var loc = document.getElementById("loc");
                   var divs = [];
                   var divs2 = [];
                   var divs3 = [];
                   for (var it=0;it<3;it++){
                    divs[it] = document.createElement('div');
                    divs[it].className = "form-row mb-4";
                   }
                   for (var it=0;it<4;it++){
                    divs2[it] = document.createElement('div');
                    divs2[it].className = "col";
                   }
                   for (var it=0;it<3;it++){
                    divs3[it] = document.createElement('div');
                    divs3[it].className = "col";
                   }
                   var input1 = document.createElement ('input');
                   input1.type = "number";
                   input1.step = "0.01";
                   input1.className = 'form-control form-control-lg form-control-a';
                   input1.placeholder = "Température" ;
                   input1.name = "temperature" + i.toString(10);
                   divs2[0].appendChild(input1);

                   var input2 = document.createElement ('input');
                   input2.type = "number";
                   input2.step = "0.01";
                   input2.className = 'form-control form-control-lg form-control-a';
                   input2.placeholder = "Degrès de gravité" ;
                   input2.name = "degreGravite" + i.toString(10);
                   divs2[1].appendChild(input2);

                   var input3 = document.createElement ('input');
                   input3.type = "number";
                   input3.step = "0.01";
                   input3.className = 'form-control form-control-lg form-control-a';
                   input3.placeholder = "Degrès de Radiation" ;
                   input3.name = "degreRadiation" + i.toString(10);
                   divs2[2].appendChild(input3);

                   var input4 = document.createElement ('input');
                   input4.type = "number";
                   input4.step = "0.01";
                   input4.className = 'form-control form-control-lg form-control-a';
                   input4.placeholder = "Degrès de PH" ;
                   input4.name = "degrePh" + i.toString(10);
                   divs2[3].appendChild(input4);

                   divs[0].appendChild(divs2[0]);
                   divs[0].appendChild(divs2[1]);
                   divs[0].appendChild(divs2[2]);
                   divs[0].appendChild(divs2[3]);

                   var input5 = document.createElement ('input');
                   input5.type = "number";
                   input5.step = "0.01";
                   input5.className = 'form-control form-control-lg form-control-a';
                   input5.placeholder = "Quantité d'eau en litre" ;
                   input5.name = "quantiteEau" + i.toString(10);
                   divs3[0].appendChild(input5);

                   var input6 = document.createElement ('input');
                   input6.type = "number";
                   input6.step = "0.01";
                   input6.className = 'form-control form-control-lg form-control-a';
                   input6.placeholder = "Quantité Oxygène" ;
                   input6.name = "quantiteOxygene" + i.toString(10);
                   divs3[1].appendChild(input6);

                   var input7 = document.createElement ('input');
                   input7.type = "number";
                   input7.step = "0.01";
                   input7.className = 'form-control form-control-lg form-control-a';
                   input7.placeholder = "Quantité CO2" ;
                   input7.name = "quantiteCo2" + i.toString(10);
                   divs3[2].appendChild(input7);

                   divs[1].appendChild(divs3[0]);
                   divs[1].appendChild(divs3[1]);
                   divs[1].appendChild(divs3[2]);

                   var input8 = document.createElement ('input');
                   input8.type = "text";
                   input8.className = 'form-control form-control-lg form-control-a';
                   input8.placeholder = "Les Ions Minéreaux" ;
                   input8.name = "ionsMinereaux" + i.toString(10);
      

                   var divlast = document.createElement('div');
                   divlast.className = 'col';
                   divlast.appendChild(input8);

                   divs[2].appendChild(divlast);

                   var div = document.createElement("div");
                   div.id = "ecosysteme" + i.toString(10);
                   var p = document.createElement ('p')
                   p.className = "h5 mb-4";
                   p.innerHTML = "Ecosystème N°" + i.toString(10);
                   div.appendChild (p);
                   div.appendChild (divs[0]);
                   div.appendChild(divs[1]);
                   div.appendChild(divs[2]);
                   i++;
                   document.getElementById("form").insertBefore (div,loc);
                };
              </script>
          </div>

        </div>
        <div id="ecosysteme" >
          <div class="form-row mb-4">
          <div class="col">
              <input type="number" step = "0.01" class="form-control form-control-lg form-control-a" placeholder="Température " name="temperature1">
          </div>
          <div class="col">
              <input type="number" step = "0.01"  class="form-control form-control-lg form-control-a" placeholder="Degrès de gravité" name="degreGravite1">
          </div>
          <div class="col">
              <input type="number" step = "0.01"  class="form-control form-control-lg form-control-a" placeholder="Degrès de radiation" name="degreRadiation1">
          </div>
            <div class="col">
              <input type="number" step = "0.01"  class="form-control form-control-lg form-control-a" placeholder="Degrès de PH" name="degrePh1">
           </div>
        </div>
        <div class="form-row mb-4">
          <div class="col">
              <input type="number" step = "0.01"  class="form-control form-control-lg form-control-a" placeholder="Quantité d'eau en litre " name="quantiteEau1">
          </div>
          <div class="col">
              <input type="number" step = "0.01"  class="form-control form-control-lg form-control-a" placeholder="Quantité Oxygène" name="quantiteOxygene1">
          </div>
          <div class="col">
              <input type="number" step = "0.01"  class="form-control form-control-lg form-control-a" placeholder="Quantité CO2" name="quantiteCo21">
          </div>
        </div>
        <div class="form-row mb-4">
          <div class="col">
              <input type="text" class="form-control form-control-lg form-control-a" placeholder="Les Ions Minéreaux" name="ionsMinereaux1">
          </div>
        </div>
        </div>
        <p class="h5 mb-4" id="loc">Localisation de la Ressource Phytogenetique</p>
        <div class="form-row mb-4">
          <div class="col">
              <button type="button" id="rajouterLoc" class="btn btn-a"> Rajouter une localisation</button>
              <script type="text/javascript">
                var localisation = document.getElementById("rajouterLoc");
                var j = 2;
                localisation.onclick = function (){
                   var divecosysteme = document.getElementById("form");
                   var input = document.createElement ("input");
                   var classfication = document.getElementById("classfication");
                   var divs = [];
                   var divs2 = [];
                   var divs3 = [];
                   for (var it=0;it<2;it++){
                    divs[it] = document.createElement('div');
                    divs[it].className = "form-row mb-4";
                   }
                   for (var it=0;it<3;it++){
                    divs2[it] = document.createElement('div');
                    divs2[it].className = "col";
                   }
                   for (var it=0;it<2;it++){
                    divs3[it] = document.createElement('div');
                    divs3[it].className = "col";
                   }
                   var input1 = document.createElement ('input');
                   input1.type = "number";
                   input1.step = "0.01";
                   input1.className = 'form-control form-control-lg form-control-a';
                   input1.placeholder = "Région" ;
                   input1.name = "region" + i.toString(10);
                   divs2[0].appendChild(input1);

                   var input2 = document.createElement ('input');
                   input2.type = "number";
                   input2.step = "0.01";
                   input2.className = 'form-control form-control-lg form-control-a';
                   input2.placeholder = "Wilaya" ;
                   input2.name = "wilaya" + i.toString(10);
                   divs2[1].appendChild(input2);

                   var input3 = document.createElement ('input');
                   input3.type = "number";
                   input3.step = "0.01";
                   input3.className = 'form-control form-control-lg form-control-a';
                   input3.placeholder = "Ville" ;
                   input3.name = "ville" + i.toString(10);
                   divs2[2].appendChild(input3);

    

                   divs[0].appendChild(divs2[0]);
                   divs[0].appendChild(divs2[1]);
                   divs[0].appendChild(divs2[2]);
                  

                   var input5 = document.createElement ('input');
                   input5.type = "number";
                   input5.step = "0.0001";
                   input5.className = 'form-control form-control-lg form-control-a';
                   input5.placeholder = "Longitude" ;
                   input5.name = "longitude" + i.toString(10);
                   divs3[0].appendChild(input5);

                   var input6 = document.createElement ('input');
                   input6.type = "number";
                   input6.step = "0.0001";
                   input6.className = 'form-control form-control-lg form-control-a';
                   input6.placeholder = "Latitude" ;
                   input6.name = "latitude" + i.toString(10);
                   divs3[1].appendChild(input6);



                   divs[1].appendChild(divs3[0]);
                   divs[1].appendChild(divs3[1]);
      


                   var div = document.createElement("div");
                   div.id = "localisation" + i.toString(10);
                   var p = document.createElement ('p')
                   p.className = "h5 mb-4";
                   p.innerHTML = "Localisation N°" + i.toString(10);
                   div.appendChild (p);
                   div.appendChild (divs[0]);
                   div.appendChild(divs[1]);
                   j++;
                   document.getElementById("form").insertBefore (div,classfication);
                };
              </script>
          </div>

        </div>
        <div id="localisation" >
        <div class="form-row mb-4">
          <div class="col">
              <input type="text" class="form-control form-control-lg form-control-a" placeholder="Région" name="region1">
          </div>
          <div class="col">
              <input type="text" class="form-control form-control-lg form-control-a" placeholder="Wilaya" name="wilaya1">
          </div>
          <div class="col">
              <input type="text" class="form-control form-control-lg form-control-a" placeholder="Ville" name="ville1">
          </div>
          </div>
        </div>
        <div class="form-row mb-4">
          <div class="col">
              <input type="number" step="0.0001" class="form-control form-control-lg form-control-a" placeholder="Longitude" name="longitude1">
          </div>
          <div class="col">
              <input type="number" step="0.0001" class="form-control form-control-lg form-control-a" placeholder="Latitude" name="latitude1">
          </div>
        </div>
        <p class="h5 mb-4" id="classfication">Classifications de la Ressource Phytogenetique</p>
        <div class="form-row mb-4">

          <div class="col">
          	<small> Classfication classique</small>
           <select class="form-control form-control-lg form-control-a">
           	<option>Genre</option>
           </select>
          </div>
          	<div class="col">
          	<small> Classfication Phylogenetique</small>
           <select class="form-control form-control-lg form-control-a">
           	<option>clade</option>
           </select>
          </div>
        </div>
        


        <div id="buttonSubmit" class="col-md-12">
                    <button type="submit" class="btn btn-a" >Envoyer la demande d'ajout</button>
    </div>
  	</form>
    
  </div>
</body>
</html>