package MyPack;

import java.io.*;
import java.sql.*;
import java.util.*; 
import javax.servlet.*;
import javax.servlet.http.*; 
public class ControllerServlet extends HttpServlet { 


// This method only calls processRequest() 

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException { 
processRequest(request, response); 
} 

// This method only calls processRequest() 
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException { 
processRequest(request, response); 
} 

protected void processRequest(HttpServletRequest request, 
HttpServletResponse response) throws ServletException, IOException {

// retrieving value of action parameter 
String userAction = request.getParameter("action"); 


// if request comes to move to addperson.jsp from hyperlink 
if (userAction.equals("addperson") ) { 
response.sendRedirect("addperson.jsp"); 
}
// if request comes to move to searchperson.jsp from hyperlink 
else if (userAction.equals("searchperson")) { 
response.sendRedirect("searchperson.jsp"); 
}
 
// if â€œsaveâ€? button clicked on addperson.jsp to add new record 
if (userAction.equals("save"))
{ addPerson(request,response); }
else if (userAction.equals("search")) 
{  searchPerson(request,response); } 

} // end processRequest() 


private void addPerson(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException 
{ try 

{
 PersonDAO pDAO = new PersonDAO(); 

 PersonInfo person = new PersonInfo();

 String pName = request.getParameter("name"); 
 person.setName(pName); 

 String add = request.getParameter("address"); 
 person.setAddress(add); 
 
 String pNo = request.getParameter("phoneNum"); 
 int phoneNum = Integer.parseInt(pNo); 
 person.setPhoneNum(phoneNum); 


pDAO.addPerson(person); 


 response.sendRedirect("saveperson.jsp"); 
}catch (SQLException sqlex){ 

// setting SQLException instance 
request.setAttribute("javax.servlet.jsp.JspException" , sqlex);
RequestDispatcher rd = request.getRequestDispatcher("addbookerror.jsp"); 
rd.forward(request, response); } 

catch (ClassNotFoundException cnfe){ 

 // setting ClassNotFoundException instance 
request.setAttribute("javax.servlet.jsp.JspException" , cnfe); 
RequestDispatcher rd = request.getRequestDispatcher("addbokerror.jsp");
rd.forward(request,response); 
} 

}// end addperson() 




private void searchPerson(HttpServletRequest request, 
HttpServletResponse response) throws ServletException, IOException { 
try {

PersonDAO pDAO = new PersonDAO(); 

String pName = request.getParameter("name"); 

ArrayList personList = pDAO.retrievePersonList(pName); 
request.setAttribute("list", personList); 


 RequestDispatcher rd = request.getRequestDispatcher("showperson.jsp"); 
 rd.forward(request, response); 
}catch (SQLException sqlex){ 

// setting SQLException instance 
request.setAttribute("javax.servlet.jsp.JspException" , sqlex);
RequestDispatcher rd = request.getRequestDispatcher("addbookerror.jsp");
rd.forward(request,response); 

}catch (ClassNotFoundException cnfe){ 

 // setting ClassNotFoundException instance request.setAttribute("javax.servlet.jsp.JspException" , cnfe); 
RequestDispatcher rd = request.getRequestDispatcher("addbookerror.jsp"); 
rd.forward(request, response); 


} 
}// end searchPerson() 
} // end ControllerServlet 