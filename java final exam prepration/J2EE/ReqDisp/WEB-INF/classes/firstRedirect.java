import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class firstRedirect extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)
                 throws IOException,ServletException
    {
      PrintWriter out = res.getWriter();
      out.println("<html><head><title>Redirect Servlet</title></head><body>");
      out.println("Hello");
      res.sendRedirect("newPage");
      res.setContentType("text/html");
      out.println("First Servlet</body></html>");
      out.close();
      
    }
}
