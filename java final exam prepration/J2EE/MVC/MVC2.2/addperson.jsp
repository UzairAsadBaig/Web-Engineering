<html><body><center> 

<h2> Address Book </h2> 
<h3> Add New Person</h3> 


<form name ="register" action="ControllerServlet" > 

<TABLE BORDER="1" > 

<TR> 
  <TD> <h4 > Name </h4> </TD> 
 <TD> <input type="text" name="name" /> </TD> 
</TR> 

<TR>
  <TD> <h4> Address </h4> </TD> 
  <TD> <input type="text" name="address" /> </TD> 
</TR> 

<TR> 
  <TD> <h4>Phone Number</h4> </TD> 
  <TD> <input type="text" name="phoneNum" /> </TD> 
</TR> 

<TR> 
  <TD COLSPAN="2" ALIGN="CENTER"><input type="submit" value="save" name="action" />
			<input type="reset" value="clear" /></TD> 
</TR> 


</TABLE></form> 

<h4><a href="ControllerServlet?action=searchperson" > Search Person </a></h4> 

</center></body></html>