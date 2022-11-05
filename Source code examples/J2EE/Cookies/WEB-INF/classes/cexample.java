import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class cexample extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

String name=req.getParameter("nm");
String password=req.getParameter("ps");

Cookie c=new Cookie(name,password);
c.setMaxAge(2*24*60*60);
res.addCookie(c);

out.println("<html><body>");
out.println("Dear "+ name + ", Your cookie has been saved successfuly.");
out.println("</body></html>");
}

}