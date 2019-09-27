<!DOCTYPE html>
<html>
<head>
	<!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>Ajout RGM</title>

    <!-- Icons font CSS-->
    <link href="Styles/RGForest/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="Styles/RGForest/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="Styles/RGForest/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="Styles/RGForest/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="Styles/RGForest/css/main.css" rel="stylesheet" media="all">
</head>
</head>
<body>
	<%@include file="header.jsp"  %>
	<br><br>
	<h2 style="text-align:center; color:#8F8F8F">Ajouter une ressource génétique Forestiere</h2>
	<br><br>
	<div class="page-wrapper bg-green p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">Nouvelle RG Forestiere</h2>
                </div>
                <div class="card-body">
                    <form method="POST" action="ProposerRGF">
                        <div class="form-row m-b-55">
                            <div class="name">Définition</div>
                            <div class="value">
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="nomLatin">
                                            <label class="label--desc">Nom Latin</label>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="nomFrancais">
                                            <label class="label--desc">Nom Français</label>
                                        </div>
                                    </div>
                                </div>
                                <br><br>
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="nomArabe">
                                            <label class="label--desc">Nom Arabe</label>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="nomAmazigh">
                                            <label class="label--desc">Nom Amazigh</label>
                                        </div>
                                    </div>
                                </div>
                                <br><br>
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="autresNoms">
                                            <label class="label--desc">Autres Noms</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                        <br><br>
                        
                        
                        <div class="form-row m-b-55">
                            <div class="name">Déscription</div>
                            <div class="value">
                                <div class="input-group">
                                    <textarea class="textarea--style-6" name="description" placeholder="Informations"></textarea>
                                </div>
                            </div>
                        </div>
                       
                        
                        
                        <br><br>
                        
                        <div class="form-row">
                            <div class="name">Localisation</div>
                            <div class="value">
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="wilaya">
                                            <label class="label--desc">Wilaya</label>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="ville">
                                            <label class="label--desc">Ville</label>
                                        </div>
                                    </div>
                                </div>
                                <br><br>
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="region">
                                            <label class="label--desc">Région</label>
                                        </div>
                                    </div>
                                    
                                </div>
                            </div>
                        </div>
                        
                        <br><br>
                        
                        <div class="form-row">
                            <div class="name">Caracteristiques</div>
                            <div class="value">
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="HauteurMin">
                                            <label class="label--desc">Hauteur min</label>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="HauteurMax">
                                            <label class="label--desc">Hauteur max</label>
                                        </div>
                                    </div>
                                </div>
                                <br><br>
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="TypeFeuille">
                                            <label class="label--desc">Type des feuilles</label>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="CouleurFeuille">
                                            <label class="label--desc">Couleur des feuilles</label>
                                        </div>
                                    </div>
                                </div>
                                <br><br>
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="TypeFleur">
                                            <label class="label--desc">Type des fleurs</label>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="CouleurFleur">
                                            <label class="label--desc">Couleur des fleurs</label>
                                        </div>
                                    </div>
                                </div>
                                <br><br>
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="TypeTige">
                                            <label class="label--desc">Type du tige</label>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="PeriodeFloraison">
                                            <label class="label--desc">Periode de floraison</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                        <br><br>
                        
                        
                        <div class="form-row">
                            <div class="name">Ecosystème</div>
                            <div class="value">
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="co2">
                                            <label class="label--desc">Quantité CO2</label>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="o2">
                                            <label class="label--desc">Quantité O2</label>
                                        </div>
                                    </div>
                                </div>
                                <br><br>
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="temper">
                                            <label class="label--desc">Température</label>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="gravite">
                                            <label class="label--desc">Gravité</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                        <br><br>
                        
                        
                        <div class="form-row">
                            <div class="name">Classification</div>
                            <div class="value">
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
		                                    <div class="rs-select2 js-select-simple select-search">
		                                        <select name="regne">
		                                            <option disabled="disabled" selected="selected">Choose option</option>
		                                            <option>Arbre</option>
		                                            <option>Plante medicinale</option>
		                                            <option>Plante aromatique</option>
		                                        </select>
		                                        <div class="select-dropdown"></div>
		                                    </div>
                                            <label class="label--desc">Règne</label>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <div class="rs-select2 js-select-simple select-search">
		                                        <select name="embranch">
		                                            <option disabled="disabled" selected="selected">Choose option</option>
		                                            <option>Arbre fruitier</option>
		                                            <option>Arbre a bois</option>
		                                            <option>Arbre ornemental</option>
		                                            <option>entomophile</option>
		                                            <option>anemophile</option>
		                                        </select>
		                                        <div class="select-dropdown"></div>
		                                    </div>
                                            <label class="label--desc">Embranchement</label>
                                        </div>
                                    </div>
                                </div>
                                <br><br>
                                <div class="row row-space">
                                   
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <div class="rs-select2 js-select-simple select-search">
		                                        <select name="cta">
		                                            <option disabled="disabled" selected="selected">Choose option</option>
		                                            <option>CTA1</option>
		                                            <option>CTA2</option>
		                                            <option>CTA3</option>
		                                            <option>CTA4</option>
		                                            <option>CTA5</option>
		                                            <option>CTA6</option>
		                                        </select>
		                                        <div class="select-dropdown"></div>
		                                    </div>
                                            <label class="label--desc">CTA (S'il y en a !)</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                        
                        
                        <br><br>
                        
                        <div class="form-row">
                            <div class="name">Image</div>
                            <div class="value">
                                <div class="input-group js-input-file">
                                    <input class="input-file" type="file" name="imgrgm" id="file">
                                    <label class="label--file" for="file">Choisir une image</label>
                                    <label class="label--desc"></br></br>Charger une image pour la CTA. Taille MAX 10 MB</label>
                                </div>
                            </div>
                        </div>
                        
                        <br><br>
                        
                        <div>
                        <button class="btn btn--radius-2 btn--red" type="submit">Sauvegarder</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    
	<%@include file="footer.jsp" %>

<!-- Jquery JS-->
    <script src="Styles/RGForest/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="Styles/RGForest/vendor/select2/select2.min.js"></script>
    <script src="Styles/RGForest/vendor/datepicker/moment.min.js"></script>
    <script src="Styles/RGForest/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="Styles/RGForest/js/global.js"></script>

</body>
</html>