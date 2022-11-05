import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class Second extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {


    PrintWriter out = response.getWriter();


    out.println("<html><head><title>My First Servlet</title></head>");
    out.println("<body>");
    out.println("<h1>Welcome to my First Servlet</h1>");
    out.println("</body>");
    out.println("</html>");

    out.close();


    }


}