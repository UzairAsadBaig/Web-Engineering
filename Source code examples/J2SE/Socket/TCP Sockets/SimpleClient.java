import java.net.*;
import java.io.*;

public class SimpleClient
{
  public SimpleClient()
  {
    for (int i = 0 ; i < 5 ; i++)
    {
      try
      {
        Socket socket = new Socket("127.0.0.1", 8001);
        if (socket != null)
        {
         BufferedReader bis=new BufferedReader(new InputStreamReader(socket.getInputStream()));

         System.out.println(bis.readLine());
          socket.close();
        }
      }
      catch (IOException ioe)
      {
        ioe.printStackTrace();
      }
      try
      {
        Thread.sleep(5000);
      }
      catch (InterruptedException ie)
      {
      }
    }
  }
  public static void main(String args[])
  {
    new SimpleClient();
  }
}
