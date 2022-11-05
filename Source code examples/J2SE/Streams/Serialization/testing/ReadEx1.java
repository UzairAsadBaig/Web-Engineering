import java.io.*;

public class ReadEx1{

public static void main(String args[]){
try {

//attaching FileInput stream with "ali.txt"
FileInputStream fis = new FileInputStream("ali.txt");

// attaching FileInput stream over ObjectInput stream
ObjectInputStream in = new ObjectInputStream(fis);

PersonInfo temp;
boolean isExist = true;

while(isExist)
{	
  if(fis.available() != 0)
   {
	temp = (PersonInfo) in.readObject();
	temp.printPersonInfo();
   }
  else
  {
   isExist =false;
  }
}

// closing streams
in.close();
fis.close();
} catch (Exception ex){
System.out.println(ex);}

}// end of main method
} // end class

