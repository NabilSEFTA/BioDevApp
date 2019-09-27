package RGforest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ValiderCTAForest")
public class ValiderCTAForest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ValiderCTAForest() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		CTAForest ctap = (CTAForest) session.getAttribute("ctap");
		ctap.setValidee(true);
		CtaForestDaoImpl ctadi = new CtaForestDaoImpl(); 
		ctadi.validerCTAP(ctap);
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGForest/homeSpecialisteF.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
