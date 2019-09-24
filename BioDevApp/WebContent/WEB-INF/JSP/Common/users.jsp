<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
</head>
<body id="page-top">
	<div id="wrapper">

  <%@include file="/WEB-INF/JSP/Common/adminNav.jsp" %>
          <div class="container">
           <div class="card shadow mb-4">
            <div class="card-header py-3">
              <h6 class="m-0 font-weight-bold text-primary">Utilisateurs du système</h6>
            </div>
            <div class="card-body">
              <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>Nom</th>
                      <th>Prénom</th>
                      <th>Courriel</th>
                      <th>Date de naissance</th>
                      <th>permis</th>
                      <th>N° de Tel</th>
                      <th>Valid/Supp</th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach items="${users}" var = "user">
                    <tr>
                      <td>"${user.nom}"</td>
                      <td>"${user.prenom}"</td>
                      <td>"${user.courriel}"</td>
                      <td>"${user.dateNaissance}"</td>
                      <td>"${user.permis}"</td>
                      <td>"${user.phoneNumber}"</td>
                      <td>
                        <a href="/BioDevApp/valUser?cour=${user.courriel}" class="btn btn-success btn-circle"> <i class="fas fa-check"></i></a>
                        <a href="/BioDevApp/suppUser?cour=${user.courriel}" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a>
                      </td>
                    </tr>
                    </c:forEach>

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
</body >
</html>