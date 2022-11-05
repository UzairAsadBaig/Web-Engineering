import java.io.*;

public class ReadEx{

public static void main(String args[]){
try {

//attaching FileInput stream with "ali.txt"
FileInputStream fis = new FileInputStream("ali.txt");

// attaching FileInput stream over ObjectInput stream
ObjectInputStream in = new ObjectInputStream(fis);


//de-serialization reading object from ‘ali.txt’
PersonInfo pRead = (PersonInfo) in.readObject();
PersonInfo pRead1 = (PersonInfo) in.readObject();
// calling printPersonInfo method to confirm that object contains same set of values
//before serializatoion
pRead.printPersonInfo();
pRead1.printPersonInfo();

// closing streams
in.close();
fis.close();
} catch (Exception ex){
System.out.println(ex);}

}// end of main method
} // end class

