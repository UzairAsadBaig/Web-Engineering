<html>
<head>
<title>Information</title></head>
<%@ page language = "java" import = "java.sql.Statement,java.sql.ResultSet,java.sql.Connection,java.sql.DriverManager" %>
<body>
<h1>Information</h1>

<table border = "1" width = "400">
<tr>
<td><b>Name</b></td>
<td><b>City</b></td>
</tr>
<%

try{
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://127.0.0.1/class_test";
    Connection con=DriverManager.getConnection(url, "root", "root");

String name = "";
String city = "";

Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("select * from info");

while(rs.next()) {
 name = rs.getString("username");
 city = rs.getString("city");
%>

<tr>
<td><% out.println(name); %></td>
<td><%= city %></td>
</tr>
<%
}
%>
<%
stmt.close();
con.close();
}
catch(Exception e){System.out.println("Exception");}
%>

</table>
</body>
</html>