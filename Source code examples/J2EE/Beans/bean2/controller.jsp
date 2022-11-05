<html> 
<body> 

<% 

 String mobile_name = request.getParameter("mobile"); 

// redirecting user based on selection made 
if (mobile_name.equals("Nokia")) 
{
 response.sendRedirect("Nokia.jsp"); 
} 
else if (mobile_name.equals("Samsung") ) 
{
 response.sendRedirect("Samsung.jsp"); 
} 

%>

</body> 
</html>