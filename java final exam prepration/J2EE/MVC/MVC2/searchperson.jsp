<%@page errorPage="addbookerror.jsp" %> 

<html><body><center> 

<h2> Address Book </h2> 
<h3> Search Person</h3> 

<form name ="search" action="controller.jsp" > 
<TABLE BORDER="1" > 

<TR> 
  <TD><h4 >Name</h4></TD> 
  <TD><input type="text" name="name" /></TD> 
</TR> 

<TR>
  <TD COLSPAN="2" ALIGN="CENTER"><input type="submit" value="search" name="action" />
  <input type="reset" value="clear" /></TD> 
</TR> 

</TABLE></form> 

<h4><a href="controller.jsp?action=addperson" > Add Person </a></h4> 

</center></body></html>