import java.sql.*;
import java.util.*;


public class Insertion{

public static void main(String[] args) throws Exception {
   
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://127.0.0.1/class_test";
    Connection con=DriverManager.getConnection(url,"root","root");
    Statement st=con.createStatement();

	Scanner inp = new Scanner(System.in);

	System.out.print("Please enter Name: ");
	String u_name = inp.nextLine();

	System.out.print("Please enter password: ");
	String pass = inp.nextLine();

	System.out.print("Please enter address: ");
	String address = inp.nextLine();

	System.out.print("Please enter City: ");
	String city= inp.nextLine();
	
	System.out.print("Please enter Phone: ");
	int phone = inp.nextInt();

	

     String query="insert into info(username,password,address,phone,city) values('"+u_name+"', '"+pass+"', '"+address+"', "+phone+" , '"+city+"' )";

 
     int rs = st.executeUpdate( query );

	 System.out.println(rs);
   
     if(rs > 0){
	    System.out.println("Record inserted successfully.");
	  }
     
     else{
    	 System.out.println("Record could not inserted.");
         }


    }

 
}
