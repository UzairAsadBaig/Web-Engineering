import java.net.*;
import java.io.*;

public class Clint {
    
    public static void main(String argv[]) {
        
    Socket Soc;
    BufferedReader in;
    String message;
	try {	   
	    Soc = new Socket("127.0.0.1",2001);
            in = new BufferedReader(new InputStreamReader(Soc.getInputStream()));
            for (int i = 0; i < 100; i++) {
                message = in.readLine();
                System.out.println(message); }

        }
        catch (Exception e) {
            System.out.println("Died... " +
            e.toString());
        }

    }
}