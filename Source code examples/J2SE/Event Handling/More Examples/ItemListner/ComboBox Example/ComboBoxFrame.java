import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame 
{
   private JComboBox imagesJComboBox; // combobox to hold names of icons
   private JLabel label; // label to display selected icon

   private String names[] = 
      { "bug1.gif", "bug2.gif",  "travelbug.gif", "buganim.gif" };
   private Icon icons[] = { 
      new ImageIcon( "ItemListner/ComboBox Example/"+names[ 0 ] ),
      new ImageIcon( "ItemListner/ComboBox Example/"+names[ 1 ] ), 
      new ImageIcon( "ItemListner/ComboBox Example/"+names[ 2 ] ),
      new ImageIcon( "ItemListner/ComboBox Example/"+names[ 3 ] )  };

   // ComboBoxFrame constructor adds JComboBox to JFrame
   public ComboBoxFrame()
   {
      super( "Testing JComboBox" );
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );     

      imagesJComboBox = new JComboBox( names ); // set up JComboBox
      imagesJComboBox.setMaximumRowCount( 3 ); // display three rows

      imagesJComboBox.addItemListener(
         new ItemListener() // anonymous inner class
         {
            // handle JComboBox event
            public void itemStateChanged( ItemEvent event )
            {
               // determine which item selected
               if ( event.getStateChange() == ItemEvent.SELECTED )
                  label.setIcon( icons[ imagesJComboBox.getSelectedIndex() ] );
            } // end method itemStateChanged
         } // end anonymous inner class
         
      ); // end call to addItemListener

      c.add( imagesJComboBox ); // add combobox to JFrame
      label = new JLabel( icons[ 0 ] ); // display first icon
      c.add( label ); // add label to JFrame
   } // end ComboBoxFrame constructor
} // end class ComboBoxFrame
