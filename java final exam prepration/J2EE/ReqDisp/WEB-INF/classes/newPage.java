import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class newPage extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)
                 throws IOException,ServletException
    {
      PrintWriter out = res.getWriter();

      res.setContentType("text/html");
      out.println("<html><head><title>New Servlet</title></head>");
      out.println("<body>New page loaded.</body></html>");
      out.close();
    }
}
