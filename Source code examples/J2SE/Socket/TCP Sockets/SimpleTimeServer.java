import java.net.*;
import java.util.*;
import java.io.*;

public class SimpleTimeServer
{
 public SimpleTimeServer()
  {
    Socket Soket = null;
    try
    {
      ServerSocket serverSocket = new ServerSocket(8001);
     
     while(true)
      {
        try
        {
          Soket = serverSocket.accept();
          System.out.println("Connection Established");

          PrintStream ps = new PrintStream(Soket.getOutputStream());

          Date nowDate = new Date();
          ps.write( nowDate.toString().getBytes() );

          Soket.close();
        }
        catch (Exception e)
        {
          e.printStackTrace();
          serverSocket = null;
        }
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  public static void main(String args[])
  {
    new SimpleTimeServer();
  }
}
