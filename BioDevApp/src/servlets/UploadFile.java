package servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.FileDAO;

/**
 * Servlet implementation class UploadFile
 */
@MultipartConfig
@WebServlet("/ajouterLoi")
public class UploadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("fileName","");
    	request.setAttribute("errorMessage","");
		request.getRequestDispatcher( "/ged/uploadFile.jsp" ).forward( request, response );
   	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        

        
        String title=request.getParameter("fileName");
        Part filePart = request.getPart("file");
        System.out.println(filePart.getName());
        if (filePart != null && !title.isEmpty()) 
        {
            System.out.println("non nuules");

                      

            //inputStream = filePart.getInputStream();
            boolean isUploaded = false;
            try {
				isUploaded = FileDAO.uploadFile(request);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            if (isUploaded == true) {
            	request.setAttribute("errorMessage","Le loi:  "+title +"  est bien trasmis");
            	request.getRequestDispatcher( "/ged/uploadFile.jsp" ).forward( request, response );
            }
        }
        else {
        		request.setAttribute("errorMessage","Parametre non valide");
            	request.getRequestDispatcher( "/ged/uploadFile.jsp" ).forward( request, response );
        }
        
        
        
	}

}