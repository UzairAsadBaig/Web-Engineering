import java.io.*;
import java.net.*;

public class server1{
public static void main(String args[]) throws IOException{
DatagramSocket s=new DatagramSocket(1000);
byte b[]=new byte[100];

DatagramPacket p=new DatagramPacket(b,b.length);
s.receive(p);
b=p.getData();
int len=p.getLength();
for(int i=0;i<len;i++){
 System.out.println((char) b[i]);

}

}
}
