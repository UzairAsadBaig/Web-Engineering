import java.io.*;


public class Fis{


public static void main(String argv[]){

        try{
                FileInputStream in = new FileInputStream("Fis.class");
                int ch=0;
                
                while((ch = in.read())> -1){
								                		System.out.print((char) ch);
                        }
                }catch (IOException e){System.out.println(e.getMessage());}
        }
}
