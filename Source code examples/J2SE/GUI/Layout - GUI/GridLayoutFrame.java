
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutFrame extends JFrame
{

	public static void main(String[] args) {
        GridLayoutFrame window = new GridLayoutFrame();
        window.setVisible(true);
    }

    GridLayoutFrame(){
//... Create content pane, set layout, add components
	Container content = getContentPane();
    content.setLayout(new GridLayout(2,2));
    //the following constructor will produce horizental and
    //vertical spaces between components
    //content.setLayout(new GridLayout(2,2,3,3));

	content.add(new JButton("Button 1"));
	content.add(new JButton("2"));
	content.add(new JButton("3"));
	content.add(new JButton("This is button four"));

	setTitle("GridLayout Demo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
	}
} // end class GridLayoutFrame

