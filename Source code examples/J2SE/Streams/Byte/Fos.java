import java.io.*;

public class Fos{

          public static void main(String argv[]){

	  String s = new String("Another Line");
                
		try{
                   FileOutputStream fos = new FileOutputStream("test.txt");

                	byte buf[] = s.getBytes();

                	for(int i=0; i<buf.length; i++ )
                	{
                	  fos.write(buf[i]);
                	}
			System.out.println("File has written successfuly.");
                   }
		catch(IOException ioe) {}
              }
}
