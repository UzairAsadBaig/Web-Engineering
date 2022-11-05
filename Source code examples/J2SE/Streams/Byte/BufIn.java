import java.io.*;
public class BufIn{
public static void main(String argv[]){
        
FileInputStream fin  = null;
BufferedInputStream bin = null;
	try{
                fin = new FileInputStream("fis.java");
                bin = new BufferedInputStream(fin);
		
		int ch=0;
                while((ch=bin.read())> -1){
                        System.out.print((char) ch);
                		}

                }catch(IOException e){System.out.println(e.getMessage());};
        }
}
