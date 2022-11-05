// Fig. 11.48: TextAreaDemo.java
// Copying selected text from one textarea to another. 
import javax.swing.JFrame;

public class TextAreaDemo
{
   public static void main( String args[] )
   { 
      TextAreaFrame textAreaFrame = new TextAreaFrame(); 
      textAreaFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      textAreaFrame.setSize( 425, 200 ); // set frame size
      textAreaFrame.setVisible( true ); // display frame
   } // end main
} // end class TextAreaDemo

