// use of Inner class by ActionListner
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class AwtEvent extends JFrame
{
   JButton btn1,btn2;
   public AwtEvent()
   {
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );

      btn1 = new JButton( "Button 1" );
      c.add( btn1 );
      btn2 = new JButton( "Button 2" );
      c.add( btn2 );

      // create Handler for button event handling
      ButtonHandler handler = new ButtonHandler();
      btn1.addActionListener( handler );
      btn2.addActionListener( handler );
   }
   public static void main( String args[] )
   {
	  AwtEvent AE = new AwtEvent(); // create ButtonFrame
	  AE.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      AE.setSize( 275, 110 ); // set frame size
      AE.setVisible( true ); // display frame
   } // end main
  // inner class for button event handling
   private class ButtonHandler implements ActionListener
   {  // handle button event
    public void actionPerformed( ActionEvent event )
    {JOptionPane.showMessageDialog( null, "You pressed:"+ event.getActionCommand() );}
   }  }
















