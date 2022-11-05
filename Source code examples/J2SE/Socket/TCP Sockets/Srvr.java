import java.net.*;
import java.io.*;


public class Srvr {

    public static void main(String argv[]) {

        try {
            ServerSocket sSoc = new ServerSocket(2001);
            while(true) {
                Socket inSoc = sSoc.accept();
                SThread ST = new SThread(inSoc);
                ST.start();}
        }
        catch (Exception e) {
            System.out.println("Oh Dear! " + e.toString());
        }
    }
}

class SThread extends Thread {

    Socket threadSoc;

    SThread(Socket inSoc) {
        threadSoc = inSoc;
    }

    public void run() {
        try {
            PrintStream ps = new PrintStream(threadSoc.getOutputStream());

            for (int i=0; i < 100; i++) {
               ps.println(i);

            }
        }
        catch (Exception e) {
            System.out.println("Whoops! " + e.toString());
        }

        try {
            threadSoc.close();
        }
        catch (Exception e) {
            System.out.println("Oh no! " + e.toString());
        }
    }
}

