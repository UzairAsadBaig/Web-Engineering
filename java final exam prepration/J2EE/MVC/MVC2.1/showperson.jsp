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

<% 
 ArrayList personList = (ArrayList)request.getAttribute("list"); 
 PersonInfo person = null; 

for(int i=0; i<personList.size(); i++) { 
person = (PersonInfo)personList.get(i); %> 

<TR> <TD> <%= person.getName()%> </TD>
<TD> <%= person.getAddress()%> </TD>
<TD> <%= person.getPhoneNum()%> </TD> 
</TR> 

<% 
} // end for 
%> 

</TABLE > 
<h4><a href="controller.jsp?action=addperson"> Add Person </a>
<a href="controller.jsp?action=searchperson">Search Person</a></h4> 
</center> </body></html> 

