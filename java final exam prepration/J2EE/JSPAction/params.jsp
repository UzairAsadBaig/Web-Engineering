<%@ page language="java" contentType="text/html"%>
<html>
<head></head>
<body>


This is from params.jsp<br/>
<%String sn1 = request.getParameter("username");%>
<% out.println("The name comes from param.jsp and getting and printing here <b>" + sn1 + "</b>" );%>
<br/>

<br/>
</body>
</html>