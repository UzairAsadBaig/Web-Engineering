import javax.swing.*;
import java.awt.*;

public class Form1 extends JFrame{

	// Text Field
	JTextField tf1 = new JTextField(15);
	JTextField tf2 = new JTextField(20);

	//Button
	JButton bt = new JButton("Find Meaning");

	public Form1(){

	Container container = getContentPane();
	container.setLayout(new FlowLayout());

	container.add(tf1);
	container.add(bt);
	container.add(tf2);

		this.setVisible(true);
		this.setSize(300,300);

	}


    public static void main(String args[]){
        Form1 form1 = new Form1();
    }
}
