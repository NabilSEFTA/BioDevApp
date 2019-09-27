package RGforest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CTAForestproposes")
public class CTAForestproposes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CTAForestproposes() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<CTAForest> listCTAP = new ArrayList<CTAForest>();
		CtaForestDaoImpl ctadi = new CtaForestDaoImpl(); 
		listCTAP = ctadi.listerCTAProposes();
		request.getSession().setAttribute("listCTAP", listCTAP);
		/*if(listRMP==null) System.out.println(0);
		else System.out.println(listRMP.size());*/
		this.getServletContext().getRequestDispatcher("/WEB-INF/JSP/RGForest/ctaForestProposes.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
