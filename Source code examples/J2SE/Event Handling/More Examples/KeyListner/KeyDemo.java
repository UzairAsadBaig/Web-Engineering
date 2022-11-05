// Fig. 11.37: KeyDemo.java
// Testing KeyDemoFrame.
import javax.swing.JFrame;

public class KeyDemo 
{
   public static void main( String args[] )
   { 
      KeyDemoFrame keyDemoFrame = new KeyDemoFrame(); 
      keyDemoFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      keyDemoFrame.setSize( 350, 100 ); // set frame size
      keyDemoFrame.setVisible( true ); // display frame
   } // end main
} // end class KeyDemo

