import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonFrame1 extends JFrame
{
   private JTextField textField;
   private JRadioButton male;
   private JRadioButton female;
   private ButtonGroup radioGroup;

   // RadioButtonFrame constructor adds JRadioButtons to JFrame
   public RadioButtonFrame1()
   {
      super( "Class Selection" );
      Container c = getContentPane();
      c.setLayout( new FlowLayout() ); // set frame layout

      textField = new JTextField( "Please choose your class",25);
      c.add( textField ); // add textField to JFrame

      // create radio buttons
      male = new JRadioButton( "BS(SE) Morning", false );
      female = new JRadioButton( "BS(SE) Afternoon", false );

      c.add( male );
      c.add( female );


      radioGroup = new ButtonGroup(); // create ButtonGroup
      radioGroup.add( male );
      radioGroup.add( female );

      // register events for JRadioButtons
      male.addItemListener( new RadioButtonHandler( ) );
      female.addItemListener(  new RadioButtonHandler( ) );
       }

   public static void main( String args[] )
   {
      RadioButtonFrame1 radioButtonFrame = new RadioButtonFrame1();
      radioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      radioButtonFrame.setSize( 300, 100 ); // set frame size
      radioButtonFrame.setVisible( true ); // display frame
   } // end main


   private class RadioButtonHandler implements ItemListener
   {
      public void itemStateChanged( ItemEvent event )
      {
    	  if ( event.getSource() == male )
    	  {
    		  textField.setText("You have choosen BS(SE) Morning");
    	  }
    	  else if( event.getSource() == female )
    	  {
    		  textField.setText("You have choosen BS(SE) Afternoon");
    	  }

      }
   }
}