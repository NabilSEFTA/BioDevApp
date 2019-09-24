package com.annuaire.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.annuaire.beans.Institution;
import com.annuaire.dao.CategorieInstitutionDao;
import com.annuaire.dao.DAOFactory;
import com.annuaire.dao.InstitutionDao;

/**
 * Servlet implementation class RechercheSer
 */
@WebServlet("/rechSer")
public class RechercheSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CONF_DAO_FACTORY = "daofactory";
	public static final String VUE ="/WEB-INF/institutions.jsp";
	private CategorieInstitutionDao categorieInstitutionDao;
	private InstitutionDao institutionDao;
	
       

	  public void init() throws ServletException 
	   { 
	        DAOFactory daoFactory = DAOFactory.getInstance();
	        this.categorieInstitutionDao = daoFactory.getCategorieInstitutionDao();
	        this.institutionDao = daoFactory.getInstitutionDao();
	    }
    public RechercheSer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	/*************************/
	public Boolean ComparerInst(Institution inst1, Institution inst2) 
	{
		Boolean equal = false;
		if (inst1.getId_inst()==inst2.getId_inst()) equal= true;
		return equal;
	}
	/*************************/
	
	public List<Institution> InterListInst(List<Institution> insts1, List<Institution>  insts2) 
	{
	
		List<Institution> insts= new ArrayList<Institution>();

		Institution inst1 = new Institution();
	    Institution inst2 = new Institution();
	    
		Boolean equal = false;
		if (insts1.isEmpty() && !insts2.isEmpty())
			{
			
			ListIterator<Institution> it2 = insts2.listIterator();
			insts= insts2;
			}
		
		if (insts2.isEmpty() && !insts1.isEmpty())
			{
			ListIterator<Institution> it1 = insts1.listIterator();
			insts= insts1;
			}
		
		
		if(!insts1.isEmpty() && !insts2.isEmpty())
		{
			ListIterator<Institution> it1 = insts1.listIterator();	
			ListIterator<Institution> it2 = insts2.listIterator();

			 while(it1.hasNext() )
			 {
				 inst1 = it1.next();
				 while(it2.hasNext() && equal== false)
				 {
					inst2= it2.next();
					equal =  ComparerInst(inst1,inst2);
					 if (equal==true) insts.add(inst1);
				 }
		      equal= false;         
	         }	
		}

		return insts;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* Récupération des champs du formulaire. */
		String acronyme = request.getParameter( "acronyme_inst");
		
		String  nomInst= request.getParameter( "nom_inst");
		int idcatInst= Integer.parseInt(request.getParameter("cat_inst"));	
		
		List<Institution> insts = new ArrayList<Institution>();
		List<Institution> insts12 = new ArrayList<Institution>();
		
		try {
	        Boolean enter = false;
			
			List<Institution> insts1 = new ArrayList<Institution>();
			List<Institution> insts2 = new ArrayList<Institution>();
			List<Institution> insts3 = new ArrayList<Institution>();
			String path= getServletContext().getRealPath("/BDImgs");
			insts1= institutionDao.rechInstParAcro(acronyme,path);
		    insts2= institutionDao.rechInstParNom(nomInst,path) ;
			insts3= institutionDao.rechInstParCat(idcatInst,path);
			insts12= InterListInst(insts1,insts2);
			
			if (!insts1.isEmpty() || !insts2.isEmpty())  enter=true;
				
			if (enter == false || !insts12.isEmpty())  
				{insts= InterListInst(insts12,insts3);}
			String message="";
		    if (insts.isEmpty()) 
		    {
		    	message=" Aucune institution ne correspond à votre recherche";
		    }
		    request.setAttribute("message",message);
			request.setAttribute("insts",insts);
			this.getServletContext().getRequestDispatcher(VUE).forward( request, response );
		}
		   catch (Exception e)
			{
			 System.out.println("There is a problem");
			}
		
	}
	
	

}
