package RGMarines;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ValiderRGM")
public class ValiderRGM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ValiderRGM() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		RessourceMarine rmp = (RessourceMarine) session.getAttribute("rmp");
		RessourceGenetiqueMa rgp = (RessourceGenetiqueMa) session.getAttribute("rgp");
		rgp.setValidee(true);
		rmp.setValidee(true);
		RessourceMarineDaoImpl rmdi = new RessourceMarineDaoImpl(); 
		RessourceGenetiqueDaoImpl rgdi = new RessourceGenetiqueDaoImpl(); 
		rmdi.validerRGMP(rmp);
		rgdi.validerRGP(rgp);
		response.sendRedirect( request.getContextPath() +"/HomeSpecialiste" );

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
