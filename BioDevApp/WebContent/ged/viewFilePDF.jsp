<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@page import="business.File"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>

<%@page import="dao.FileDAO"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View File</title>
    </head>
    <body>
        
     	<%
        		String id=(request.getParameter("id"));
     			String name=(request.getParameter("name"));
     			String fileName = URLEncoder.encode(name, "UTF-8");
     			fileName = URLDecoder.decode(fileName, "ISO8859_1");
     			
     			String serverHomeDir = System.getenv("CATALINA_HOME");

   			    byte[] fileData = FileDAO.getFileBlob(Integer.parseInt(id));
      			
        		response.setContentType("application/pdf");
                response.setHeader("Content-Disposition","inline; filename="+ fileName+".pdf");
                response.setContentLength(fileData.length);
                
                OutputStream output = response.getOutputStream();
                output.write(fileData);
                
                output.flush();
                output.close();
                         
        %>
        
        <br><br>
        <a href="viewFiles.jsp">Go to Main Page...</a>        
                
        <div style="position: relative">
            <div style="position: fixed ; bottom: 0 ; width:100% ; text-align:center ">
                <p><a href="https://www.youtube.com/user/TechWorld3g?sub_confirmation=1">CLICK HERE TO SUBSCRIBE</a></p>
            </div>
        </div>
        
    </body>
</html>