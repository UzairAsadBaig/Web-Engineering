
import java.sql.*;
import java.util.*;

public class Selection{

public static void main(String[] args) throws Exception {
   
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://127.0.0.1/class_test";
    Connection con=DriverManager.getConnection(url,"root","root");
    Statement st=con.createStatement();

	
	Scanner inp = new Scanner(System.in);
	
	System.out.print("Please enter Name to search: ");
	String u_name = inp.nextLine();
    
     String query="Select * from info where username='"+u_name+"' ";
     
   
     ResultSet rs = st.executeQuery( query );
   
     if(rs.next()){
	    String name = rs.getString("username");
    	    String address = rs.getString("address");
    	    System.out.println("Name: "+ name +"\tAddress: "+ address);

	  }
     
     else{
    	 System.out.println("No record found");
         }


    }

 
}
