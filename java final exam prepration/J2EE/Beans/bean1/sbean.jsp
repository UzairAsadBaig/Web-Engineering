<html>
<head>
	<title>SimpleBean Test Page</title>
</head>
<body>

<%-- Creating JavaBeans --%>
	<jsp:useBean id="simple" class="MyPack.SimpleBean" />
	<jsp:setProperty name="simple" property="name" />
	<jsp:setProperty name="simple" property="age"  />
	<jsp:setProperty name="simple" property="email" />

<%-- <jsp:setProperty name="simple" property="*" />  --%>

<%-- Displaying JavaBean property's value --%>
<p>Name retrieved from JavaBean has the value of : 
	<b><jsp:getProperty name="simple" property="name" /></b>.<br>
Age retrieved from JavaBean has the value of :
	<b><jsp:getProperty name="simple" property="age" /></b> years.<br>
Email retrieved from JavaBean has the value of :
	<b><jsp:getProperty name="simple" property="email" /></b>
</p>

</body>
</html>
