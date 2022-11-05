import java.io.*;
import java.net.*;

public class client1{
public static void main(String args[]) throws IOException{
DatagramSocket s=new DatagramSocket();
String msg="this is message from client machine";

byte b[]=msg.getBytes();
DatagramPacket p=new DatagramPacket(b,b.length,InetAddress.getByName("localhost"),1000);
System.out.println("Sending...");
s.send(p);

}
}
