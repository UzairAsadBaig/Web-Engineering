import java.io.*;

public class WriteEx{

public static void main(String args[ ]){

PersonInfo pWrite =new PersonInfo("ali", "Lahore", "123456");
PersonInfo pWrite1 =new PersonInfo("ahmed", "karachi", "23432423");

try {

// attaching FileOutput stream with "ali.txt"
FileOutputStream fos =new FileOutputStream("ali.txt");

// attaching ObjectOutput stream over FileOutput// stream
ObjectOutputStream out =new ObjectOutputStream(fos);

//serialization writing object to ‘ali.dat’
out.writeObject(pWrite);
out.writeObject(pWrite1);


// closing streams
out.close();
fos.close();

} catch (Exception ex){
System.out.println(ex);
}

} //end main method

} // end class

