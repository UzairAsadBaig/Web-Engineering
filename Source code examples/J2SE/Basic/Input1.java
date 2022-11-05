import javax.swing.*;

public class Input1{

    public static void main(String[] args) {
        //... Initialization
        String degree, batch, section, id;

        //... Prompt and read input.
        degree = JOptionPane.showInputDialog("Please Enter degree");

        batch = JOptionPane.showInputDialog("Please Enter batch");

	section = JOptionPane.showInputDialog("Please Enter section");

        id = JOptionPane.showInputDialog("Please Enter ID");

        //... Display output
       JOptionPane.showMessageDialog(null, "Your Roll Number: " +degree+batch+section+id);
    }
}











