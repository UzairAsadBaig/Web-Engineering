<%@ page language="java" contentType="text/html"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>

<jsp:plugin type="applet" code="EgApplet.class" codebase="/html">
	<jsp:params>
		<jsp:param name="molecule" value="molecules/benzene.mol" />
	</jsp:params>
	<jsp:fallback>
		<p>Unable to load applet</p>
	</jsp:fallback>
</jsp:plugin>


</body>
</html>