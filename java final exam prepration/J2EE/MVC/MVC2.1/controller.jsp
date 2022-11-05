<%@page errorPage="addbookerror.jsp" %> 
<%@page import ="java.util.*" %>
<%@page import = "MyPack.*" %> 

<html><body> 

<jsp:useBean id="pDAO" class="MyPack.PersonDAO" scope="page" /> 


<% 
String action = request.getParameter("action"); 

// if "Add Person" hyperlink is clicked 
if (action.equals("addperson") ){ 
response.sendRedirect("addperson.jsp"); 

 // if "Search Person" hyperlink is clicked 
} else if (action.equals("searchperson")){ 
response.sendRedirect("searchperson.jsp"); 

// if "save" button is clicked of addperson.jsp 
}else if (action.equals("save")) { 
%> 
// declaring PersonInfo obeject 

<jsp:useBean id="personBean" class="MyPack.PersonInfo" scope="page"/> 


<jsp:setProperty name="personBean" property="*" /> 


<% 
pDAO.addPerson(personBean); 

response.sendRedirect("saveperson.jsp"); 
%> 


<% 
}else if (action.equals("search") ) { 

String pName = request.getParameter("name"); 
ArrayList personList = pDAO.retrievePersonList(pName); 

request.setAttribute("list", personList);
%> 

 <jsp:forward page="showperson.jsp" /> 
<% 
} 
%> 

</body></html>