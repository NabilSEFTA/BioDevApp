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
    <title>Ajout CTA</title>

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
	<h2 style="text-align:center; color:#8F8F8F">Ajouter une connaissance traditionnelle associée</h2>
	<br><br>
	<div class="page-wrapper bg-green p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title">Nouvelle CTA</h2>
                </div>
                <div class="card-body">
                    <form method="POST" action="ProposerCTAForest">
                        <div class="form-row m-b-55">
                            <div class="name">Définition</div>
                            <div class="value">
                                <div class="row row-space">
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="intitule">
                                            <label class="label--desc">Intitulé</label>
                                        </div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="brevet">
                                            <label class="label--desc">Brevet</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Propriétaire</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="proprietaire">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Région</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="region">
                                </div>
                            </div>
                        </div>
                        <div class="form-row m-b-55">
                            <div class="name">Déscription</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="description">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Préparation</div>
                            <div class="value">
                                <div class="input-group">
                                    <textarea class="textarea--style-6" name="preparation" placeholder="Méthode de préparation"></textarea>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Ingrédients</div>
                            <div class="value">
                                <div class="input-group">
                                    <textarea class="textarea--style-6" name="ingredients" placeholder="Les autres ingrédients nécéssaires à la préparation de cette CTA"></textarea>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Image</div>
                            <div class="value">
                                <div class="input-group js-input-file">
                                    <input class="input-file" type="file" name="imgcta" id="file">
                                    <label class="label--file" for="file">Choisir une image</label>
                                    <br><br>
                                    <label class="label--desc">Charger une image pour la CTA. Taille MAX 10 MB</label>
                                </div>
                            </div>
                        </div>
                        <div><br><br>
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