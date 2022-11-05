package MyPack;

import java.io.*; 
public class PersonInfo implements Serializable{ 

private String name; 
private String address; 
private int phoneNum;


public PersonInfo() { 
name = ""; 
address = ""; 
phoneNum = 0; 
} 


public void setName(String n){ 
name = n; } 

public void setAddress(String a){ 
address = a; } 

public void setPhoneNum(int pNo){ 
phoneNum = pNo;} 



public String getName( ){ 
return name;} 

public String getAddress( ){ 
return address; } 

public int getPhoneNum( ){ 
return phoneNum;} 

} // end class PersonInfo 