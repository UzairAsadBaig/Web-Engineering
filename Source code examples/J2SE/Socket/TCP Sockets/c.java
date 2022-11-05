import java.io.*;
import java.net.*;

public class c{
public static void main(String args[]) throws IOException,ClassNotFoundException{

Socket c=new Socket("127.0.0.1",1000);

BufferedReader bis=new BufferedReader(new InputStreamReader(c.getInputStream()));

System.out.println(bis.readLine());


bis.close();
c.close();

}
}