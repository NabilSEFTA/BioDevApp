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

/**
 * Servlet implementation class ClasseVertébrés
 */
@WebServlet("/ClasseVertébrés")
public class ClasseVertébrés extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClasseVertébrés() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String numClasse = request.getParameter("numClasse");
		int indice=Integer.valueOf(numClasse)-1;
		RgClassificationFauneDao rgcdi = new RgClassificationFauneDao();
		List<RgClassificationFaune> listRGCF=new ArrayList<RgClassificationFaune>();
		listRGCF = rgcdi.listerRGFaune(1, 0);
		RgClassificationFaune rgcf = new RgClassificationFaune();
		rgcf = listRGCF.get(indice);		
		session.setAttribute("rgcf", rgcf);
		int idEmbr = rgcf.getId();
		session.setAttribute("idEmbr", idEmbr);
		
	/*******************************************************************/	
		int parent_id= (int) session.getAttribute("idEmbr");
		List<RgClassificationFaune> listRGCF2=new ArrayList<RgClassificationFaune>(); 
		listRGCF2 = rgcdi.listerRGFaune(2, parent_id);
		session.setAttribute("listRGCF2", listRGCF2);

		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGFaune/Classe-vertébrés.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
