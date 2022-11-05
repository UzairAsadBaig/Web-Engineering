import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame 
{
   private JTextField textField; // displays text in changing fonts
   private JCheckBox boldJCheckBox; // to select/deselect bold
   private JCheckBox italicJCheckBox; // to select/deselect italic

   // CheckBoxFrame constructor adds JCheckBoxes to JFrame
   public CheckBoxFrame()
   {
      super( "JCheckBox Test" );
      Container c = getContentPane();
      c.setLayout( new FlowLayout() ); // set frame layout

      // set up JTextField and set its font
      textField = new JTextField( "Watch the font style change", 20 );
      textField.setFont( new Font( "Serif", Font.PLAIN, 14 ) );
      c.add( textField ); // add textField to JFrame

      boldJCheckBox = new JCheckBox( "Bold" ); // create bold checkbox
      italicJCheckBox = new JCheckBox( "Italic" ); // create italic
      c.add( boldJCheckBox ); // add bold checkbox to JFrame
      c.add( italicJCheckBox ); // add italic checkbox to JFrame

      // register listeners for JCheckBoxes
      CheckBoxHandler handler = new CheckBoxHandler();
      boldJCheckBox.addItemListener( handler );
      italicJCheckBox.addItemListener( handler );
   } // end CheckBoxFrame constructor

   // private inner class for ItemListener event handling
   private class CheckBoxHandler implements ItemListener 
   {
      private int valBold = Font.PLAIN; // controls bold font style
      private int valItalic = Font.PLAIN; // controls italic font style

      // respond to checkbox events
      public void itemStateChanged( ItemEvent event )
      {
         // process bold checkbox events
         if ( event.getSource() == boldJCheckBox )
            valBold = boldJCheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
               
         // process italic checkbox events
         if ( event.getSource() == italicJCheckBox )
            valItalic = italicJCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN;

         // set text field font
         textField.setFont( new Font( "Serif", valBold + valItalic, 14 ) );
      } // end method itemStateChanged
   } // end private inner class CheckBoxHandler
} // end class CheckBoxFrame