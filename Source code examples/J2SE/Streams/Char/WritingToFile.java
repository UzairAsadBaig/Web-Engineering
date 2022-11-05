import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WritingToFile {

    private static void doWrite() {

        
        try{
            String fileName = "WritingToFile.txt";

            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            
            out.write("+---------- Testing output to a file ----------+");

            // Print several new line characters. I use two styles here.
            out.write("\n");
            out.write("\n");
            
            out.write("+---------- Testing output to a file ----------+");

            out.close();

        } catch (IOException e) {

            System.out.println("IOException:");
            e.printStackTrace();

        }

    }


    public static void main(String[] args) {
        doWrite();
    }

}

 
