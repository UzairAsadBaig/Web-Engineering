import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class Greeting extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        
	
	
	response.setContentType("text/html");
    PrintWriter out = response.getWriter();

    String firstName = request.getParameter("firstName");
    String surname = request.getParameter("surname");

    out.println("<html>");
    out.println("<head>");
    out.println("<title>Servlet GreetingServlet</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<p>Welcome " + firstName + " " + surname + "</p>");
    out.println("</body>");
    out.println("</html>");
    out.close(); 

	
	}


}