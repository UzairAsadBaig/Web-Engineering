import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class Search extends HttpServlet {

  //Process the HTTP Get request
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    
    PrintWriter out = response.getWriter();

    String u_name=request.getParameter("name");
    
    out.println("<html>");
    out.println("<head><title>Response</title></head>");
    out.println("<body bgcolor=\"#ffffff\">");


    try{
    Class.forName("com.mysql.jdbc.Driver");

    String url = "jdbc:mysql://127.0.0.1/class_test";

    Connection con=DriverManager.getConnection(url,"root","root");

    Statement st=con.createStatement();
    
     String query="Select * from info where username='"+u_name+"' ";
   
     ResultSet rs = st.executeQuery( query );
   
     if(rs.next()){

	    out.println("<h1>Record found</h1>");

    	    String name = rs.getString("username");
    	    String address = rs.getString("address");

    	    out.println("<h1>User Name: "+name+" </h1>");
	    out.println("<h1>User Address: "+ address+ " </h1>");

	  }
     
     else{
    	 out.println("<h1>No record found</h1>");
          }


out.println("</body></html>");
           st.close();
           con.close();

    }catch(Exception e){

      out.println(e);
    }

  }

}
