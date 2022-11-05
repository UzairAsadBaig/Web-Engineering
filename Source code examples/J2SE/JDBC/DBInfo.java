import java.sql.*;
import java.util.*;

public class DBInfo{

public static void main(String[] args) throws Exception {
   
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://127.0.0.1/class_test";
   
    Connection con=DriverManager.getConnection(url,"root","root");
   
    DatabaseMetaData dbMetaData = con.getMetaData();

	String pName = dbMetaData.getDatabaseProductName();
	System.out.println("Database: " + pName);

	String pVer = dbMetaData.getDatabaseProductVersion();
	System.out.println("Version: " + pVer);

	String dName = dbMetaData.getDriverName();
	System.out.println("Driver: " + dName);

	boolean rOnly = dbMetaData.isReadOnly();
	System.out.println("Read-Only: " + rOnly);
     
     

    }

 
}
