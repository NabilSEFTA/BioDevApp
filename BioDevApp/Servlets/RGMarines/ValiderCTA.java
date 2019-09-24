package RGMarines;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ValiderCTA")
public class ValiderCTA extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ValiderCTA() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		CTAMa ctap = (CTAMa) session.getAttribute("ctap");
		ctap.setValidee(true);
		CtaDaoImpl ctadi = new CtaDaoImpl(); 
		ctadi.validerCTAP(ctap);
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGMarines/homeSpecialiste.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
