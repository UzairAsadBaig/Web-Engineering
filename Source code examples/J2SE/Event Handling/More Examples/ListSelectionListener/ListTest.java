import javax.swing.JFrame;

public class ListTest 
{
   public static void main( String args[] )
   { 
      ListFrame listFrame = new ListFrame(); // create ListFrame
      listFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      listFrame.setSize( 350, 150 ); // set frame size
      listFrame.setVisible( true ); // display frame
   } // end main
} // end class ListTest