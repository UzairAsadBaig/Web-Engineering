import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class First extends HttpServlet{

 public void doGet(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException
 {
	 PrintWriter out = res.getWriter();
	 
	 out.println("<html><body><h1>Output generated by First servlet.</h1>"); 





	 String value = "HelloWorld from servlet first";
	 req.setAttribute("key", value);
	 
    //ServletContext sc = getServletContext();
    RequestDispatcher rd = req.getRequestDispatcher("/Second");
	 
	 rd.forward(req,res);




   
   out.println("<h1>End of First </h1></body></html>");

   
 }
}
//038













