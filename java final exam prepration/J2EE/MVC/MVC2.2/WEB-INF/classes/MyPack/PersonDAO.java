package MyPack;

import MyPack.PersonInfo;
import java.util.*; 
import java.sql.*; 

public class PersonDAO{ 

private Connection con; 

public PersonDAO() throws ClassNotFoundException,SQLException{
establishConnection(); } 

private void establishConnection() throws ClassNotFoundException,SQLException{ 
Class.forName("com.mysql.jdbc.Driver"); 
String conUrl = "jdbc:mysql://127.0.0.1/PersonDSN"; 
con = DriverManager.getConnection(conUrl,"root","root"); 
} 


public ArrayList retrievePersonList(String Name) throws SQLException { 

ArrayList personList = new ArrayList(); 

String sql = " SELECT * FROM Person WHERE uname = ?"; 
PreparedStatement pStmt = con.prepareStatement(sql); 
pStmt.setString( 1, Name); 

ResultSet rs = pStmt.executeQuery(); 

String name; 
String add; 
int pNo; 

while ( rs.next() ) { 
name = rs.getString("uname"); 
add = rs.getString("address"); 
pNo = rs.getInt("phoneNumber"); 

PersonInfo personBean = new PersonInfo(); 
personBean.setName(name); 
personBean.setAddress(add); 
personBean.setPhoneNum(pNo); 

personList.add(personBean); 

} 

 return personList; 

}

public void addPerson(PersonInfo person) throws SQLException{ 

String sql = " INSERT INTO Person VALUES (?, ?, ?)"; 
PreparedStatement pStmt = con.prepareStatement(sql); 

String name = person.getName(); 
String add = person.getAddress(); 
int pNo = person.getPhoneNum(); 

pStmt.setString( 1 , name ); 
pStmt.setString( 2 , add ); 
pStmt.setInt( 3 , pNo );

pStmt.executeUpdate(); 

} 



}
