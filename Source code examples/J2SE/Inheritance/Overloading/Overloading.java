import javax.swing.*;

public class Overloading {

 
    private static double getDouble(String prompt)
   {
        String tempStr;
        tempStr = JOptionPane.showInputDialog(prompt);
        return Double.parseDouble(tempStr);
    }


    private static double getDouble(String prompt, double low, double high) {
        double result;
        String rangePrompt = prompt + "  Value must be in range "
                                    + low + " to " + high;

        do {
            result = getDouble(rangePrompt);
           } while (result < low || result > high);

        return result;
    }


    private static void displayString(String output)
	 {JOptionPane.showMessageDialog(null, output);}




    public static void main(String[] args) {

	
        double n1   = getDouble("Enter the First number");
        double n2   = getDouble("Enter Second number", 0.0, 100.0);

        double average = (n1 + n2) / 2.0;

        displayString("Average is " + average);
    }

}
