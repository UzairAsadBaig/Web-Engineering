import java.sql.*;
import java.util.*;


public class InsertionAccess{

public static void main(String[] args) throws Exception {
   
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    String url = "jdbc:ucanaccess://J:/web/JDBC/person.accdb";
    Connection con=DriverManager.getConnection(url);
    Statement st=con.createStatement();

	Scanner inp = new Scanner(System.in);

	System.out.println("Please enter Name: ");
	String u_name = inp.nextLine();

	System.out.println("Please enter password: ");
	String pass = inp.nextLine();

	System.out.println("Please enter address: ");
	String address = inp.nextLine();


	System.out.println("Please enter City: ");
	String city= inp.nextLine();

	System.out.println("Please enter Phone: ");
	int phone = inp.nextInt();
    
     String query="insert into info(username,password,address,phone,city) values('"+u_name+"', '"+pass+"', '"+address+"', "+phone+" , '"+city+"' )";

	    
     int rs = st.executeUpdate( query );
   
     if(rs > 0){
	    System.out.println("Record inserted successfully.");
	  }
     
     else{
    	 System.out.println("Record could not inserted.");
         }


    }

 
}
