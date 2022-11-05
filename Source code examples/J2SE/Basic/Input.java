import java.util.*;

public class Input{

    public static void main(String[] args) {
        //... Initialization
        String degree, batch, section, id;
        Scanner in = new Scanner(System.in);

        //... Prompt and read input.
        System.out.println("What's your Degree?");
        degree = in.nextLine();      // Read one line from the console.

        System.out.println("What's your Batch?");
        batch = in.nextLine();      // Read one line from the console.

        System.out.println("Enter your section?");
	section = in.nextLine();      // Read one line from the console.

        System.out.println("What's your ID?");
        id = in.nextLine();      // Read one line from the console.

       in.close();

        //... Display output
       System.out.println("Your Roll Number: " + degree+batch+section+id);
    }
}
