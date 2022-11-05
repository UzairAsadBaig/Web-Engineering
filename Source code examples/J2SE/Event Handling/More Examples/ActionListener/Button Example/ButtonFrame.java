import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ButtonFrame extends JFrame
{

   // ButtonFrame adds JButtons to JFrame
   public ButtonFrame()
   {

      Container c = getContentPane();
      c.setLayout( new FlowLayout() );

      JButton button1 = new JButton( "Button1" );
      c.add( button1);

      JButton button2 = new JButton( "Button2");
      c.add( button2 );

      // create new ButtonHandler for button event handling
      ButtonHandler handler = new ButtonHandler();
      button1.addActionListener( handler );
      button2.addActionListener( handler );

   } // end ButtonFrame constructor

   // inner class for button event handling
   private class ButtonHandler implements ActionListener
   {
      // handle button event
      public void actionPerformed( ActionEvent event )
      {
         JOptionPane.showMessageDialog( null, "You pressed:"+ event.getActionCommand() );
      } // end method actionPerformed
   } // end private inner class ButtonHandler
}