<%@ page errorPage="addbookerror.jsp" %> 
<%@ page import="java.sql.*" %> 

<html><body> 

<jsp:useBean id="pDAO" class="MyPack.PersonDAO" scope="page" /> 

<jsp:useBean id="personBean" class="MyPack.PersonInfo" scope = "page" /> 

<jsp:setProperty name="personBean" property="*" /> 

<% pDAO.addPerson(personBean);%> 

<center> 
<h3> New Person Record is saved successfully!</h3> 
<h4><a href="addperson.jsp" > Add Person </a> </h4> 
<h4><a href="searchperson.jsp" > Search Person </a></h4> 
</center></body></html> 