<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Login Admin</title>

  <!-- Custom fonts for this template-->
  <link href="dependencies/admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="dependencies/admin/css/sb-admin-2.min.css" rel="stylesheet">
  <link href="inc/dashboard.css" rel="stylesheet">

</head>
<body >
	<div id="wrapper">
    <%@include file="/WEB-INF/JSP/RGAlim/adminNav.jsp" %>
      <div class="container">
        <div class="container contact" id="art" >
          <div class="row">
            <div class="col-md-3" style="height: 500px; background: #2eca6a!important;">
              <div class="contact-info text-center">
                <h2></h2>
                <h1 style="color:#fff;margin-top: 100px;">Ajouter un article</h1> 
                <!--  -->
              </div>
            </div>
            <div class="col-md-9" >
              <div class="contact-form">
                <form action="dashboard" method="post" enctype="multipart/form-data">
                   <div class="form-group"> 
                    <div><label class="control-label " for="fname">Titre:</label>
                    </div>
                    <div class="">  
                      <input style="display: none;" value="article" name="bool">        
                      <input type="text" class="form-control" id="fname" placeholder="Entrer le titre" name="titre">
                    </div>
                    <div>
                      <label class="control-label " for="fname">Description:</label>
                    </div>
                    <div class="">          
                      <input type="text" class="form-control" id="fname"  placeholder="Entrer la description" name="description">
                    </div>
                  </div>
                  <div class="form-group">
                    <div>
                      <label class="control-label " for="email">Image:</label>
                    </div>
                    <div class="">
                      <input type="file" class="form-control" id="image" accept="image/png, image/jpeg,image/jpg" placeholder="Selectionner une image" name="image">
                    </div>
                  </div>
                  <div class="form-group">
                    <div><label class="control-label " for="comment">Article:</label></div>
                    <div class="">
                      <textarea class="form-control" rows="5" id="comment" name="contenu" placeholder="Entrer le corps de l'article"></textarea>
                    </div>
                  </div>
                  <div class="form-group">        
                    <div class="col-sm-offset-2 col-sm-10">
                      <button type="submit" class="btn btn-default">Submit</button>
                    </div>
                  </div>
                </form>
              </div>
            </div>
           </div>
          </div> 
          <div class="container contact" id="news" style="display: none;">
           <div class="row">
              <div class="col-md-3" style="height: 500px; background: #2eca6a!important;">
                <div class="contact-info text-center">
                 <h1 style="color:#fff;margin-top: 100px;">Ajouter une nouveauté</h1> 
                  <!-- <h4>Le développement durable n'est ni une utopie ni même une contestation, mais la condition de survie de l'économie de marché !</h4> -->
                </div>
              </div>
              <div class="col-md-9">
                <div class="contact-form">
                  <form action="dashboard" method="post" enctype="multipart/form-data">
                    <div class="form-group"> 
                      <div><label class="control-label " for="fname">Titre:</label></div>
                      <div class="">          
                        <input style="display: none;" value="news" name="bool"> 
                        <input type="text" class="form-control" id="fname" placeholder="Entrer le titre" name="titreNews">
                      </div>
                      <div><label class="control-label " for="fname">Description:</label></div>
                      <div class="">          
                        <input type="text" class="form-control" id="fname"  placeholder="Entrer la description" name="descriptionNews">
                      </div>
                    </div>
                    <div class="form-group">
                      <div><label class="control-label " for="email">Image:</label></div>
                      <div class="">
                        <input type="file" class="form-control" id="image" accept="image/png, image/jpeg,image/jpg" placeholder="Selectionner une image" name="imageNews">
                      </div>
                    </div>
                    <div class="form-group">
                     <div><label class="control-label " for="comment">Article:</label></div>
                      <div class="">
                        <textarea class="form-control" rows="5" id="comment" name="contenuNews" placeholder="Entrer le contenu de la nouveauté"></textarea>
                      </div>
                    </div>
                    <div class="form-group">        
                      <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Submit</button>
                      </div>
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>       
        <div class="container contact" id="event" style="display: none;" >
          <div class="row">
          <div class="col-md-3" style="height: 500px;background: #2eca6a!important;">
            <div class="contact-info text-center">
              <h1 style="color:#fff;margin-top: 100px;">Ajouter un evenement</h1>     
            </div>
          </div>
          <div class="col-md-9">
            <div class="contact-form">
              <form action="dashboard" method="post" enctype="multipart/form-data">
                <div class="form-group"> 
                  <div><label class="control-label " for="fname">Titre:</label></div>
                  <div class="">     
                    <input style="display: none;" value="event" name="bool">      
                    <input type="text" class="form-control" id="fname" placeholder="Entrer le titre" name="titreEvent">
                  </div>
                  <div><label class="control-label " for="fname">Description:</label></div>
                  <div class="">          
                    <input type="text" class="form-control" id="fname"  placeholder="Entrer la description" name="descriptionEvent">
                  </div>
                </div>
                 <div class="form-group">
                  <div><label class="control-label " for="email">Image:</label></div>
                  <div class="">
                    <input type="file" class="form-control" id="image" accept="image/png, image/jpeg,image/jpg" placeholder="Selectionner une image" name="imageEvent">
                  </div>
                </div>
                <div class="form-group">
                  <div><label class="control-label " for="comment">Article:</label></div>
                  <div class="">
                   <textarea class="form-control" rows="5" id="comment" name="contenuEvent" placeholder="Entrer le corps de l'evenement" ></textarea>
                  </div>
                </div>
                <div class="form-group">        
                  <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">Submit</button>
                  </div>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
     </div>
    </div> 
        
        
        
        
        
  
  <script type="text/javascript">
     $(document).ready(function () {
    var trigger = $('.hamburger'),
        overlay = $('.overlay'),
       isClosed = false;

      trigger.click(function () {
        hamburger_cross();      
      });

      function hamburger_cross() {

        if (isClosed == true) {          
          overlay.hide();
          trigger.removeClass('is-open');
          trigger.addClass('is-closed');
          isClosed = false;
        } else {   
          overlay.show();
          trigger.removeClass('is-closed');
          trigger.addClass('is-open');
          isClosed = true;
        }
    }
    
    $('[data-toggle="offcanvas"]').click(function () {
          $('#wrapper').toggleClass('toggled');
    });  
  });

</script>

<script type="text/javascript">
    function afficherArticle(){
      var e = document.getElementById('art');
      e.style.display='block';
      var e1 = document.getElementById('news');
      e1.style.display='none';
      var e2 = document.getElementById('event');
      e2.style.display='none';
    }
    function afficherNews(){
      var e = document.getElementById('news');
      e.style.display='block';
      var e1 = document.getElementById('art');
      e1.style.display='none';
      var e2 = document.getElementById('event');
      e2.style.display='none';
    }
    function afficherEvent(){
      var e = document.getElementById('event');
      e.style.display='block';
      var e1 = document.getElementById('news');
      e1.style.display='none';
      var e2 = document.getElementById('art');
      e2.style.display='none';
    }

</script>


 <script src="dependencies/admin/vendor/jquery/jquery.min.js"></script>
 <script src="dependencies/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
 <script src="dependencies/admin/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
 <script src="dependencies/admin/js/sb-admin-2.min.js"></script>
</body >
</html>