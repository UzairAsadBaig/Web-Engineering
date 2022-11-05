package myPack;
import java.sql.*;
import java.io.*; 
public class UserDAO  implements Serializable{
  Statement st=null;
  public UserDAO(){
   try {
    Class.forName("com.mysql.jdbc.Driver");
    
    String url = "jdbc:mysql://127.0.0.1/finalproject";

    Connection con=DriverManager.getConnection(url, "root", "root");

    st=con.createStatement();
   } catch (Exception e) {}
   }
  
   public boolean addUser(User temp){
    String query = "INSERT INTO users(name,email,phone,password)VALUES('"+ temp.getname() + "','" + temp.getemail() + "','" + temp.getPhone()+"','"  + temp.getpassword()+ "') ";
    int rs=0;
    try {
      rs = st.executeUpdate( query );
    } catch (Exception e) {}
 
    if(rs==1)
    return true;
    else
    return false;
  }

  public User getUser(String name,String password){
      User temp=null;
      try {
      String query = "Select * from users where name='"+name+"' AND "+"password='"+password+"'";
          ResultSet rs= st.executeQuery( query );   
          if(rs.next()){
              temp=new User(rs.getString("name"),rs.getString("email"),rs.getString("phone"),rs.getString("password"));
             return temp; 
					   }
  } catch (Exception e) {}
  return temp;
  }

  public boolean deleteUser(String name,String password){
     String query="Delete from users where name = '"+name+"' AND password='"+password+"'";
     int rs=0;
     try {
       st.executeUpdate(query);
       rs=1;
     } catch (Exception e) {}

     return rs==1?true:false;
  }
  // public static void main(String args[]){
  //   // UserDAO temp=new UserDAO();
  //   // temp.addUser(new User("uzair","uzairasad26@gmail.com","03045937445","uzair007"));
  //   // System.out.print(temp.getUser("uzair", "uzair007"));
  //   // System.out.print(temp.deleteUser("uzair", "uzair007"));
  // }
}



