import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame 
{
   private JTextField textField; // used to display font changes
   private Font plainFont; // font for plain text
   private Font boldFont; // font for bold text
   private Font italicFont; // font for italic text
   private Font boldItalicFont; // font for bold and italic text
   private JRadioButton plainJRadioButton; // selects plain text
   private JRadioButton boldJRadioButton; // selects bold text
   private JRadioButton italicJRadioButton; // selects italic text
   private JRadioButton boldItalicJRadioButton; // bold and italic
   private ButtonGroup radioGroup; // buttongroup to hold radio buttons

   // RadioButtonFrame constructor adds JRadioButtons to JFrame
   public RadioButtonFrame()
   {
      super( "RadioButton Test" );
      Container c = getContentPane();
      c.setLayout( new FlowLayout() ); // set frame layout

      textField = new JTextField( "Watch the font style change", 25 );
      c.add( textField ); // add textField to JFrame

      // create radio buttons
      plainJRadioButton = new JRadioButton( "Plain", true );
      boldJRadioButton = new JRadioButton( "Bold", false );
      italicJRadioButton = new JRadioButton( "Italic", false );
      boldItalicJRadioButton = new JRadioButton( "Bold/Italic", false );
      c.add( plainJRadioButton ); // add plain button to JFrame
      c.add( boldJRadioButton ); // add bold button to JFrame
      c.add( italicJRadioButton ); // add italic button to JFrame
      c.add( boldItalicJRadioButton ); // add bold and italic button

      // create logical relationship between JRadioButtons
      radioGroup = new ButtonGroup(); // create ButtonGroup
      radioGroup.add( plainJRadioButton ); // add plain to group
      radioGroup.add( boldJRadioButton ); // add bold to group
      radioGroup.add( italicJRadioButton ); // add italic to group
      radioGroup.add( boldItalicJRadioButton ); // add bold and italic

      // create font objects
      plainFont = new Font( "Serif", Font.PLAIN, 14 );
      boldFont = new Font( "Serif", Font.BOLD, 14 );
      italicFont = new Font( "Serif", Font.ITALIC, 14 );
      boldItalicFont = new Font( "Serif", Font.BOLD + Font.ITALIC, 14 );
      textField.setFont( plainFont ); // set initial font to plain
      
      // register events for JRadioButtons
      plainJRadioButton.addItemListener( new RadioButtonHandler( plainFont ) );
      boldJRadioButton.addItemListener(  new RadioButtonHandler( boldFont ) );
      italicJRadioButton.addItemListener( new RadioButtonHandler( italicFont ) );
      boldItalicJRadioButton.addItemListener( new RadioButtonHandler( boldItalicFont ) );
   } // end RadioButtonFrame constructor

   // private inner class to handle radio button events
   private class RadioButtonHandler implements ItemListener 
   {
      private Font font; // font associated with this listener

      public RadioButtonHandler( Font f )
      {
         font = f; // set the font of this listener
      } 
           
      // handle radio button events
      public void itemStateChanged( ItemEvent event )
      {
         textField.setFont( font ); // set font of textField
      }
   } // end private inner class RadioButtonHandler
} // end class RadioButtonFrame 
