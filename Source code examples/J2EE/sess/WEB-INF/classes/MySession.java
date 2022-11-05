import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MySession extends HttpServlet {

  public void doGet(HttpServletRequest req, HttpServletResponse res)
                               throws ServletException, IOException {
    String str = "click.count";
	res.setContentType("text/html");
    PrintWriter out = res.getWriter();

   
    HttpSession session = req.getSession(true);

    Integer count = (Integer)session.getAttribute(str);
  
        
    if (count == null)   count = new Integer(1);
    else   	         count = new Integer(count.intValue() + 1);  

    
    session.setAttribute(str, count);
  

    out.println("<HTML><HEAD><TITLE>Session </TITLE></HEAD>");
    out.println("<BODY><H1>Session Click Counter</H1>");
    out.println("You've visited this page " + count + " times.");
    out.println("<P>");
        
    out.println("<H3>Here are some vital stats on your session:</H3>");
    out.println("Session id: " + session.getId() + "<BR>");
    out.println("New session: " + session.isNew() + "<BR>");
    out.println("Creation time: " + session.getCreationTime());
    out.println("<I>(" + new Date(session.getCreationTime()) + ")</I><BR>");
    out.println("Last access time: " + session.getLastAccessedTime());
    out.println("<I>(" + new Date(session.getLastAccessedTime()) + ")</I><BR>");
    out.println("Requested session ID valid: " + req.isRequestedSessionIdValid() + "<BR>");
    out.println("Timeout: " + session.getMaxInactiveInterval()+"<br>");
    session.setMaxInactiveInterval(2*24*60*60);
    out.println("New Timeout Time: " + session.getMaxInactiveInterval()+ "<br>");
   
       
    out.println("</BODY></HTML>");
  }
}
