import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class viewCookie extends HttpServlet{

public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{

res.setContentType("text/html");
PrintWriter out=res.getWriter();

Cookie c[]=req.getCookies();
String name;
String password;
out.println("<html><body>");

for(int i=0;i<c.length;i++){
name=c[i].getName();
password=c[i].getValue();
out.println("Welcome " + name+"<br>Your password is "+password+"<br>");
}
out.println("</body></html>");
}
}