<%@ page language="java" contentType="text/html"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Hello this is JSPParam.jsp page <br/><br/><br/>

<jsp:include page="params.jsp">	
   <jsp:param name="username" value="Ajmal khan" />	
</jsp:include>

<br/>
<br/>
<br/>
Hello this is again from JSParam.jsp page
</body>
</html>