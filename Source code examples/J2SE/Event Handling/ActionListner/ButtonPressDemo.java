// use of External Hadnler class
import javax.swing.*;
import java.awt.*;

public class ButtonPressDemo extends JFrame {

	public ButtonPressDemo(){
		  JButton b;

		   //Handler Class object
		    MyActionListener a = new MyActionListener();

		    Container c = getContentPane();
		    c.setLayout(new FlowLayout());

		    //add component and register with handler
		    c.add(b = new JButton("Good Morning"));
		    b.addActionListener(a);

		    c.add(b = new JButton("Good Day"));
		    b.addActionListener(a);

		    c.add(b = new JButton("Exit"));
		    b.addActionListener(a);

			this.setVisible(true);
			this.setSize(400,100);
			this.setTitle("Button Pressing Action");

	}
	public static void main(String[] args){
		ButtonPressDemo btdemo = new ButtonPressDemo();
  }  }

