// Adapter class use
// This class implements two Listner "KeyListner" and "ActionListner"

import javax.swing.*; import java.awt.*;
import java.awt.event.*;

public class KeyPress extends JFrame{
	JLabel label;
	JTextField txtField;
	JButton btn;

	public static void main(String[] args) {
		KeyPress k = new KeyPress();
	}

	public KeyPress(){
		super("Key Press Event Frame");

		MyKeyListener a = new MyKeyListener();
		MyActionListener b = new MyActionListener();

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		label = new JLabel();
		txtField = new JTextField(20);
		btn = new JButton("Exit");

		c.add(label);
		c.add(txtField);
		c.add(btn);

		txtField.addKeyListener(a);
		btn.addActionListener(b);

		setSize(400,100);
		setVisible(true);
	}

	// This class implement keyListner functionalities
private class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent ke){
			char i = ke.getKeyChar();
			System.out.println(i);
			String str = Character.toString(i);
			label.setText(str);
		}
	}

// This class implement ActionListner functionalities
private class MyActionListener implements ActionListener {
	  public void actionPerformed(ActionEvent ae) {
		  String s = ae.getActionCommand();
		  if (s.equals("Exit")) {
			  System.out.println("Exiting.....");
			  System.exit(0);
			  }
			}
	}
}
