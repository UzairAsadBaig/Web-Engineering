import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.regex.*;
import myPack.*;

public class Controller extends HttpServlet {

public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{        

    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
  	UserDAO userDAO=new UserDAO();
	  BookDAO bookDAO=new BookDAO();
  
  if(request.getParameter("action").equals("signup")){
    
        //Getting data
        String name= request.getParameter("name");
        String email= request.getParameter("email");
        String phone= request.getParameter("phone");
        String password= request.getParameter("password");
        String rePassword= request.getParameter("re_password");

        //Validation
        boolean valid=true;
        String err="";
        if(!password.equals(rePassword)){   
          err="Password and Confirm password should match";
            valid=false;
        }
        Pattern patternEmail = Pattern.compile("^(.+)@(.+)$");
        Matcher matcherEmail = patternEmail.matcher(email);
        if(!matcherEmail.matches()){
            err="Please type a valid email";
            valid=false;
        }
        Pattern patternPhone = Pattern.compile("^\\d{11}$");
        Matcher matcherPhone = patternPhone.matcher(phone);
        if(!matcherPhone.matches()){
            err="Please type a valid email";
            valid=false;
        }
        if(!valid){
            request.getSession().setAttribute("errMessage", err);
            response.sendRedirect("signup.jsp");
        }



        //Signingup
     if(valid){
        User temp=new User(name,email,phone,password);
        boolean check=userDAO.addUser(temp);        
         if(check){
            request.getSession().setAttribute("name", name);
            request.getSession().setAttribute("email", email);
            response.sendRedirect("dashboard.jsp");
         	}
        else{	    
            err="User with this email already exists";
            //request.getSession().setAttribute("errMessage", err);

            response.sendRedirect("signup.jsp");
            }
     }
           
       
	
	}
  
  else if(request.getParameter("action").equals("login")){
String name= request.getParameter("name");
        String password= request.getParameter("password");
        User temp=userDAO.getUser(name, password);
        if(temp!=null){
            request.getSession().setAttribute("name", name);
            request.getSession().setAttribute("email", temp.getemail());
            response.sendRedirect("dashboard.jsp");
         	}
        else{	    
            String message="Incorrect email or password";
            request.getSession().setAttribute("errMessage", message);
            response.sendRedirect("login.jsp");
    }
  }
  
  else if(request.getParameter("action").equals("logout")){
    request.getSession().removeAttribute("name");
    request.getSession().removeAttribute("email");
    response.sendRedirect("login.jsp");
  }
  
  else if(request.getParameter("action").equals("addbook")){
    //Getting data
    String title= request.getParameter("title");
    String author= request.getParameter("author");
    String publisher= request.getParameter("publisher");
    String genre= request.getParameter("genre");
    String link= request.getParameter("link");

   //Adding record into the database    
    Book temp = new Book(title,author,publisher,genre,link);
    boolean check=bookDAO.addBook(temp,(String)request.getSession().getAttribute("email"));
    if(check){
      String message="Book added successfully";
      request.getSession().setAttribute("message",message);
      response.sendRedirect("dashboard.jsp");
    }else{
      response.sendRedirect("addbook.jsp");
    }
  }
  
  else if(request.getParameter("action").equals("searchbook")){
    String title= request.getParameter("searchTitle");
    Book temp = bookDAO.getBook(title, (String)request.getSession().getAttribute("email"));
    if(temp != null)
      request.getSession().setAttribute("book",temp);
    response.sendRedirect("searchbook.jsp");
  }

  else if(request.getParameter("action").equals("updatebook")){
       //Getting data
       int id= Integer.parseInt(request.getParameter("id"));
       String title= request.getParameter("title");
       if(title.equals(""))
       title=null;
       String author= request.getParameter("author");
       if(author.equals(""))
       author=null;
       String publisher= request.getParameter("publisher");
       if(publisher.equals(""))
       publisher=null;
       String genre= request.getParameter("genre");
       if(genre.equals(""))
       genre=null;
       String link= request.getParameter("link");
       if(link.equals(""))
       link=null;
       //Adding record into the database    
    Book temp = new Book(title,author,publisher,genre,link,id);
    boolean check=bookDAO.updateBook(temp,(String)request.getSession().getAttribute("email"));
    if(check){
      String message="Book updated successfully";
      request.getSession().setAttribute("message",message);
      response.sendRedirect("dashboard.jsp");
    }else{
      String message="Book not found";
      request.getSession().setAttribute("message",message);
      response.sendRedirect("updatebook.jsp");
    }
  }

  else if(request.getParameter("action").equals("deletebook")){

    int id= Integer.parseInt(request.getParameter("deleteID"));

    boolean check=bookDAO.deleteBook(id,(String)request.getSession().getAttribute("email"));
    if(check){
      String message="Book deleted successfully";
      request.getSession().setAttribute("message",message);
      response.sendRedirect("dashboard.jsp");
    }else{
      String message="Book not found";
      request.getSession().setAttribute("message",message);
      response.sendRedirect("deletebook.jsp");
    }

  }
}
}
