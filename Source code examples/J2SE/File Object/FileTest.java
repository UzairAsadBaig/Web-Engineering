import java.io.*;
import java.util.*;

class FileTest {
    public static void main(String[] args) {
        try {
            File f = new File("test.txt");
            long d;

            System.out.println("getName()          = " + f.getName());
            boolean exists = f.exists();
            System.out.println("exists()           = " + exists);
            if (!exists) {
                System.exit(1);
            }
            System.out.println("canRead()          = " + f.canRead());
            System.out.println("canWrite()         = " + f.canWrite());
            System.out.println("getPath()          = " + f.getPath());
            System.out.println("getAbsolutePath()  = " + f.getAbsolutePath());
            System.out.println("getAbsoluteFile()  = " + f.getAbsoluteFile());
            System.out.println("toURL()            = " + f.toURL());
            System.out.println("getParent()        = " + f.getParent());

            boolean isDirectory = f.isDirectory();
            System.out.println("isDirectory()      = " + isDirectory);
            System.out.println("isFile()           = " + f.isFile());
            System.out.println("isHidden()         = " + f.isHidden());
            System.out.println("lastModified()     = " + (d = f.lastModified())
                               + " = " + new Date(d));
            System.out.println("length()           = " + f.length());
            if (isDirectory) {
                String[] subfiles = f.list();
                for (int i=0; i<subfiles.length; i++) {
                    System.out.println("file in this dir   = " + subfiles[i]);
                }
            }
        } catch (IOException iox) {
           System.err.println(iox);
        }
    }//endmethod main
}//endclass FileTest
