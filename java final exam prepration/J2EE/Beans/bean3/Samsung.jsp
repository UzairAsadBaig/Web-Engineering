<%@page import="java.util.*" %> 
<%@page import="MyPack.*" %>

<html> 
<body> 
<center> 
<h2> Welcome to Mobile Portal</h2> 

<table border="1" > 

<tr> 
<th>Company Name</th> 
<th>Model</th> 
<th>Price</th>
</tr>
 
<% 
MobileDAO mobileDAO = new MobileDAO(); 
ArrayList mobileList = mobileDAO.retrieveMobileList("Samsung"); 
MobileBean mBean = null; 

// iterating over ArrayList to display course outline 
for(int i=0; i<mobileList.size(); i++){ 
 mBean = (MobileBean)mobileList.get(i); 
%> 

<tr> 
<td> <%= mBean.getCompany()%> </td> 
<td> <%= mBean.getModel()%> </td> 
<td> <%= mBean.getPrice()%> </td> 
</tr> 

<% 
} // end for 
%> 

</table></center> 
</body></html> 

