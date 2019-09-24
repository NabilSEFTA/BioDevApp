package RGAlim.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import RGAlim.ConnexionSuperUser;
import RGAlim.model.AjoutRph;
import RGAlim.model.ClassificationDAOImp;
import RGAlim.model.RessoucePhDAOImp;
import RGAlim.model.RessourcePhytogenetique;
import RGAlim.model.Rgclassification;

/**
 * Servlet implementation class modifRg
 */
@WebServlet("/modifRg")
public class modifRg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RessourcePhytogenetique Rg;
	private EntityManager em;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifRg() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init () {
    	this.em = ConnexionSuperUser.getEmf().createEntityManager();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(em == null);
		RessoucePhDAOImp daoImp = new RessoucePhDAOImp (em);
		try {
			Rg = daoImp.trouverRessourcePhytogenetique(request.getParameter("nomRg"));
			//System.out.println(listRg.get(0).isValidee()+"efe"); 
		} catch (Exception e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("ressource", Rg);
		this.getServletContext().getRequestDispatcher( "/WEB-INF/JSP/RGAlim/modifRg.jsp"
				).forward( request, response ); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AjoutRph ajoutRph =  new AjoutRph();
		EntityManager em = ConnexionSuperUser.getEmf().createEntityManager();
		System.out.println(em == null);
		RessoucePhDAOImp daoImp = new RessoucePhDAOImp (em);
		ClassificationDAOImp classificationDAOImp;
		try {
			Rg = daoImp.trouverRessourcePhytogenetique(request.getParameter("nomRg"));
			em.getTransaction().begin();
			classificationDAOImp = new ClassificationDAOImp(em);
			String genre = request.getParameter("genre");
			//String clade = request.getParameter("clade");
			Rgclassification rgclassificationGenre = classificationDAOImp.trouverRgclassification(genre);
			//Rgclassification rgclassificationClade = classificationDAOImp.trouverRgclassification(clade);
			List<Rgclassification> rgclassifications = new ArrayList<Rgclassification>();
			//rgclassifications.add(rgclassificationClade);
			rgclassifications.add(rgclassificationGenre);
			RessourcePhytogenetique phytogenetique = ajoutRph.getResouPhytogenetique(request, rgclassifications);
			int id = Rg.getId();
			//Rg = phytogenetique;
			Rg.setArrosage(phytogenetique.getArrosage());
			System.out.println(Rg.getArrosage());
			Rg.setCaracAnatomique(phytogenetique.getCaracAnatomique());
			Rg.setCaracMorphologique(phytogenetique.getCaracMorphologique());
			Rg.setDescription(phytogenetique.getDescription());
			Rg.setHauteurMaturité(phytogenetique.getHauteurMaturité());
			Rg.setLargeurMaturité(phytogenetique.getLargeurMaturité()); 
			Rg.setNiveauSoin(phytogenetique.getNiveauSoin());
			Rg.setNomAmazigh(phytogenetique.getNomAmazigh());
			Rg.setNomArabe(phytogenetique.getNomArabe());
			Rg.setNomFrancais(phytogenetique.getNomFrancais());
			Rg.setNomLatin(phytogenetique.getNomLatin());
			Rg.setPeriodeFloraison(phytogenetique.getPeriodeFloraison());
			Rg.setRusticite(phytogenetique.getRusticite());
			Rg.setSaisonInteret(phytogenetique.getSaisonInteret());
			Rg.setUtilisationEnJardin(phytogenetique.getUtilisationEnJardin());
			Rg.getEcosystemeResPhytos().addAll(phytogenetique.getEcosystemeResPhytos());
			Rg.getGeolocalisations().addAll(phytogenetique.getGeolocalisations());
			em.merge(Rg);
			em.getTransaction().commit(); 
			//System.out.println(listRg.get(0).isValidee()+"efe"); 
		} catch (Exception e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		doGet(request, response);  
	}

}
