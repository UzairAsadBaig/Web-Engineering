import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutFrame extends JFrame
{
   public static void main(String[] args) {
       FlowLayoutFrame window = new FlowLayoutFrame();
       window.setVisible(true);
    }

   public FlowLayoutFrame()
   {
	//... Create content pane, set layout, add components
	Container content = getContentPane();

	content.setLayout(new FlowLayout());
	content.add(new JButton("Button 1"));
	content.add(new JButton("2"));
	content.add(new JButton("This is button three"));
	content.add(new JButton("four"));

	setTitle("FlowLayout Demo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
	}

} // end class FlowLayoutFrame

