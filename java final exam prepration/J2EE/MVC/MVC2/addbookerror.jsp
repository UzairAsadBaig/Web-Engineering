<%@page isErrorPage="true" %> 
<%@page import = "java.sql.SQLException" %> 

<html><head> <title>Error</title></head><body> 

<h2>Error Page</h2> 

<h3> 
<% if (exception instanceof SQLException) { %> 

An SQL Exception 

<% } else if (exception instanceof ClassNotFoundException){ %> 

A Class Not Found Exception 

<%} else { %> 
A Exception 

<% } // end if-else %> 

<%-- end scriptlet to determine exception type --%> 

occured while interacting with the database</h3> 

<h3>The Error Message was <%= exception.getMessage() %></h3>
<h3 > Please Try Again Later! </h3> 

<h3> <a href="controller.jsp?action=addperson" > Add Person </a> 
<a href="controller.jsp?action=searchperson" > Search Person </a> </h3> 

</body></html> 