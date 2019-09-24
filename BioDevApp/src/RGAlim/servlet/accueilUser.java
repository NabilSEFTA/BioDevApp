package RGAlim.servlet;

import static com.sdzee.dao.DAOUtilitaire.MapArticle;
import static com.sdzee.dao.DAOUtilitaire.MapEvents;
import static com.sdzee.dao.DAOUtilitaire.MapNews;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sdzee.dao.DAOFactory;
import com.sdzee.dao.newsInt;

import RGAlim.model.Utilisateur;

/**
 * Servlet implementation class accueilUser
 */
@WebServlet("/accueilUser")
public class accueilUser extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	private newsInt newsInt; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public accueilUser() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init() throws ServletException {
        /* Récupération d'une instance de notre DAO Utilisateur */
        this.newsInt = ( (DAOFactory) getServletContext().getAttribute( "daofactory" ) ).getUtilisateurDao();
        
 }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String idSession = session.getId();
		Utilisateur user = (Utilisateur) session.getAttribute(idSession);
		request.setAttribute("utilisateur", user);

		
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		ResultSet res = this.newsInt.recupererEvents();
		ResultSet resultSet = this.newsInt.recupererNews();
		ResultSet articleSet = this.newsInt.recupererArticle();
		request.setAttribute("listeEvents", MapEvents(res));
		request.setAttribute("listeNews", MapNews(resultSet));
		request.setAttribute("listeArticle", MapArticle(articleSet));
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGAlim/accueil.jsp").forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
