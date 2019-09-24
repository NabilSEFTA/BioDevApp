<%@ page language="java" 
    pageEncoding="UTF-8"%>
   <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar" >
      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">${utilisateur.nom}<sup>2</sup></div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">
      <!-- Nav Item - Dashboard -->
      <li class="nav-item active">
        <a class="nav-link" href="dashboard">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Accueil</span></a>
      </li>

      <li class="nav-item active">
        <a class="nav-link" href="listRg" data-toggle="collapse" data-target="#collapseUtilities2">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Ressources genetiques</span></a>
        <div id="collapseUtilities2" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header">Gestion des Ressources</h6>
            <a class="collapse-item" href="AjouterRessourcePhytogenetique">Ajouter Ressource</a>
          </div>
        </div>
      </li>
      <hr class="sidebar-divider">
      <li class="nav-item active">
        <a class="nav-link" href="deconnexion">
          <span>Déconnexion</span></a>
      </li>
      <hr class="sidebar-divider">
       <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>
      <!-- Divider -->
    </ul>