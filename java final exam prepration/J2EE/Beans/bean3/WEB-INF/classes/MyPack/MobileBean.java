package MyPack;
import java.io.*; 
public class MobileBean implements Serializable{ 

private int price; 
private String comapny; 
private String model; 

// no argument constructor 
public MobileBean() { 
price = 0; 
comapny = ""; 
model = ""; 
} 

// setters 
public void setPrice(int p){ 
 price = p; 
} 

public void setCompany(String c){ 
 comapny = c; 
} 

public void setModel(String m){ 
 model = m; 
}
 
// getters 
public int getPrice( ){ 
 return price; 
} 

public String getCompany( ){ 
 return comapny; 
} 

public String getModel( ){ 
 return model; 
} 

} // end class 

