<html>
<body>

<%! 
String global_var="Global variables are declared here";

public int sum(int no,int no1){
int s=no+no1;
return s;
}
%>
<%= "Output of sum function is " + sum(7,3) %>

<%
String local_var="Local variables are declared here";
%>

<% out.println(local_var);%>

</body>
</html>