package myPack;
import java.io.*; 
public class User  implements Serializable{

  private String name;
  private String email;
  private String phone;
  private String password;
  

  public User(){

  }

  public User(String name,String email,String phone,String password){
  this.name=name;
  this.email=email;
  this.phone=phone;
  this.password=password;
  }

  //Getters
  public String getname( ){ 
    return name; 
   } 
  public String getemail( ){ 
    return email; 
   } 
  public String getPhone( ){ 
    return phone; 
   } 
  public String getpassword( ){ 
    return password; 
   }

  //Setters
  public void setname(String c){ 
    name = c; 
   } 
  public void setemail(String c){ 
    email = c; 
   } 
  public void setPhone(String c){ 
    phone = c; 
   } 
  public void setpassword(String c){ 
    password = c; 
   } 
 
  public String toString(){
   return "\nName : "+this.name+" Email: "+" Password: "+this.password+" Phone: "+this.phone+"\n";
  }  
}
