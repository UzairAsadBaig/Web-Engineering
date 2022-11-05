// use of Anonymous Inner classes for ItemListner
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AwtItemEvent extends JFrame{
	JTextArea txtArea;

	//Constructor
	public AwtItemEvent(String title){
		super("Text Area with Combo Box");

		Container c = getContentPane();
	    c.setLayout( new FlowLayout() );

	    txtArea = new JTextArea();
		c.add(txtArea);

		JComboBox jcb = new JComboBox();
		jcb.addItem("red");
		jcb.addItem("green");
		jcb.addItem("blue");
		c.add(jcb);

		jcb.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				txtArea.setText("This is the " + e.getItem() + " color.\n");
			}
		});

		setSize(400,150);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	public static void main(String[] args){
		AwtItemEvent f = new AwtItemEvent("AWT Demo");
	} }
