<%@page import="java.sql.*"%> 
<html> 
<body>
 <center> 
    <h2> Welcome to Mobile Portal </h2> 
    

<table border="1" > 

<tr> 
   <th>Comapny Name</th> 
   <th>Model</th> 
   <th>Price</th> 
</tr> 


<% 
try{
// establishing conection 
Class.forName("com.mysql.jdbc.Driver"); 
String conUrl = "jdbc:mysql://127.0.0.1/mobile"; 
Connection con = DriverManager.getConnection(conUrl, "root", "root"); 

String sql = "SELECT a.companyName,b.model,b.price from company as a,detail as b where a.companyName=? and a.id=b.id"; 

PreparedStatement pStmt = con.prepareStatement(sql); 
pStmt.setString( 1 , "Nokia"); 

ResultSet rs = pStmt.executeQuery(); 

String company; 
String model; 
int price; 

while (rs.next()) { 
company = rs.getString("companyName");
model = rs.getString("model"); 
price = rs.getInt("price");
%>

<tr> 
<td> <%=company%> </td> 
<td> <%=model%> </td> 
<td> <%="Rs. "%><%=price%> </td> 
</tr> 

<%
} // end while loop

}
catch(Exception e){System.out.print(e);}
%> 


</table> 
</center> 
</body> 
</html>