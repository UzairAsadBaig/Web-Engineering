import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class SessionEx1 extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h3>" + "Session Example Second Page" + "</h3>");
 
/* Display session ID, creation time, and access time. */
 
        HttpSession session = request.getSession(false);
        out.println("Session ID: " + session.getId() + "<br>");
        out.println("Is New: " + session.isNew() + "<br>");
        out.println("Created: " + new Date(session.getCreationTime()) + "<br>");
        out.println("Last accessed: " + new Date(session.getLastAccessedTime())+ "<br>");

        
/* Display all attributes. */
 
        out.println("<P>");
        out.println("<h3>The following data has been found in the session: </h3>");
        Enumeration attributeNames = session.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
           String name = attributeNames.nextElement().toString();
           String value = session.getAttribute(name).toString();
           out.println(name + " = " + value + "<br>");
        }
        
        
    }
 

    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
    
    	
    }
 }
