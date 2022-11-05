<%@page errorPage="addbookerror.jsp" %> 
<%@page import="java.util.*" %>
<%@page import="MyPack.*" %>

<html><body><center> 
<h2> Address Book </h2> 
<h3> Following results meet your search criteria</h3> 

<TABLE BORDER="1" > 

<TR> 
  <TH> Name </TH> 
  <TH> Address </TH> 
  <TH> PhoneNum </TH> 
</TR> 

<jsp:useBean id="pDAO" class="MyPack.PersonDAO" scope="page" />

<% 
String pName = request.getParameter("name"); 

ArrayList personList = pDAO.retrievePersonList(pName); 
PersonInfo person = null; 

for(int i=0; i<personList.size(); i++) { 
person = (PersonInfo)personList.get(i); 
%> 

<TR>
  <TD> <%= person.getName()%> </TD> 
  <TD> <%= person.getAddress()%> </TD> 
  <TD> <%= person.getPhoneNum()%> </TD> 
</TR> 

<% 
} // end for 
%> 

</TABLE > 

<a href="addperson.jsp" > Add Person </a> 
<a href="searchperson.jsp" > Search Person </a> 

</center></body></html>