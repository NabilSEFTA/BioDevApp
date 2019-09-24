package RGFaune;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import RGFaune.CTA;

/**
 * Servlet implementation class CTA1
 */
@WebServlet("/CTADetails")
public class CTADetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CTADetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String numCta = request.getParameter("numCta");
		int indice = Integer.valueOf(numCta)-1;
		List<CTA> listCTAF=new ArrayList<CTA>(); 
		listCTAF = (List<CTA>) session.getAttribute("listCTAF");
		
		CTA rgcta = new CTA();
		rgcta = listCTAF.get(indice);	
		session.setAttribute("rgcta", rgcta);
		int idCta = rgcta.getId();
		session.setAttribute("idCta", idCta);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGFaune/CTADetails.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
