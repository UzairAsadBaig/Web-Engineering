import java.sql.*;
import java.util.*;

public class Selection2{

public static void main(String[] args) throws Exception {
   
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://127.0.0.1/class_test";
    Connection con=DriverManager.getConnection(url,"root","root");
   
    PreparedStatement pst=con.prepareStatement("Select * from info",			ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

	
	ResultSet rs = pst.executeQuery(); 

	rs.next();
	System.out.println("\n Moving cursor forward\n");
	String name = rs.getString("username");
	System.out.println(name);

	rs.next();
	rs.next();

	rs.previous();
	System.out.println("\n Moving cursor backward \n");
	name = rs.getString("username");
	System.out.println(name);  

	rs.absolute(2); 
	System.out.println("\n Moving cursor on Second Line \n");
	name = rs.getString("username");
	System.out.println(name); 

	rs.updateString("username", "Hassan Khan");
	rs.updateString(3, "pucit");
	rs.updateRow();


	System.out.println("\n After updation \n");
	String pwd = rs.getString(3);
	System.out.println("Password is " + pwd); 


	System.out.println("\n Adding one more row \n");

	rs.moveToInsertRow();
	rs.updateString("username", "imitaz");
	rs.updateString("password", "myname");
	rs.updateString("address", "cantt");
	rs.updateString("phone", "9201211");
	rs.updateString("city", "Multan");
	rs.insertRow();

	
    }

 
}
