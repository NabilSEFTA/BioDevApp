package RGAlim.servlet;

import java.io.IOException;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RGAlim.model.Utilisateur;
import RGAlim.users.connexionForm;

/**
 * Servlet implementation class connexion
 */
@WebServlet("/connexion")
public class connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public connexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("from", request.getParameter("from"));
		this.getServletContext().getRequestDispatcher( "/WEB-INF/JSP/RGAlim/connexion.jsp"
				).forward( request, response );  
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		connexionForm form = new connexionForm();
		String nomUtilisateur = connexionForm.getValeurChamp(request,"username");
		System.out.println(nomUtilisateur);
		
		String motDePasse = connexionForm.getValeurChamp(request,"password");
		System.out.println("dans la servlet"+motDePasse);
		Utilisateur user;
		HttpSession session;
		String IdSession;
		try {
			System.out.println("je suis dans try");
			user = form.connecterUtilisateur(nomUtilisateur, motDePasse);
			System.out.println("erreur apres user");
			session = request.getSession();
			IdSession = session.getId();
			String prenomNom;
			if (form.getErreurs().isEmpty()) {
				System.out.println(form.getErreurs().isEmpty());
				session.setAttribute(IdSession, user); 
				
				prenomNom = user.getPrenom()+" "+user.getNom();
				session.setAttribute("prenomNom", prenomNom);
				System.out.println(prenomNom);
				String ug = user.getCategorie();
				int userCateg = Integer.valueOf(ug);
				session.setAttribute("categUser",userCateg);
				System.out.println(request.getParameter("from").equals("rgMarine"));
				if (session.getAttribute("from")!=null && session.getAttribute("from").equals("rgMarine")) {
					System.out.println("je sui dans le premier if");
					if(userCateg==2) response.sendRedirect( request.getContextPath() +"/HomeSpecialiste" );
					else response.sendRedirect( request.getContextPath() +"/StartRGMarines" );
				}
				else 
				{	System.out.println("je suis dans accueil user");
					response.sendRedirect( "/BioDevApp/accueilUser" );}
			} 
			else {
				System.out.println("jesuis ici");
				session.setAttribute(IdSession, null);
				request.setAttribute("erreurs", form.getErreurs());
				for(Entry<String, String> entry : form.getErreurs().entrySet()) {
				    String cle = entry.getKey();
				    String valeur = entry.getValue();
				    System.out.println(cle + " : " + valeur); 
				}
				this.getServletContext().getRequestDispatcher( "/WEB-INF/JSP/RGAlim/connexion.jsp"
						).forward( request, response );
			}
			
		} catch (Exception e) { 
			e.getStackTrace();
		}
		//doGet(request, response);
	}

}
