import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
 
public class SessionEx extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        out.println("<html>");
        out.println("<body bgcolor=\"white\">");
        out.println("<h1>" + "Session Example First Page" + "</h1>");
 
        /* Display session ID, creation time, and access time. */
        
        HttpSession session = request.getSession();

        out.println("Session ID: " + session.getId() + "<br>");
        out.println("Is New: " + session.isNew() + "<br>");
        out.println("Created: " + new Date(session.getCreationTime()) + "<br>");
        out.println("Last accessed: " + new Date(session.getLastAccessedTime())+ "<br>");

 
        String dataName = request.getParameter("nm");
        String dataValue = request.getParameter("ps");


        
           session.setAttribute(dataName, dataValue);
 
        out.println("<h3>Now You can view these information on evey page of your website where session is valid.</h3>");
        
  }
 

        
 
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {

    }
 }
