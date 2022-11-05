import java.awt.*; import java.awt.event.*; import javax.swing.*;

public class MouseDetailsFrame extends JFrame
{
   private String details;

   // constructor sets title bar String and register mouse listener
   public MouseDetailsFrame()
   {
      super( "Mouse clicks and buttons" );
      Container c = getContentPane();
      c.setLayout( new FlowLayout() );

      addMouseListener( new MouseClickHandler() ); // add handler
   }

   public static void main( String args[] )
   {
      MouseDetailsFrame mouseDetailsFrame = new MouseDetailsFrame();
      mouseDetailsFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      mouseDetailsFrame.setSize( 600, 150 );
      mouseDetailsFrame.setVisible( true );
   }

   // inner class to handle mouse events
   private class MouseClickHandler extends MouseAdapter
   {
      public void mouseClicked( MouseEvent event )
      {
         int xPos = event.getX(); // get x position of mouse
         int yPos = event.getY(); // get y position of mouse

         details = "Xpos: " + xPos+ " & Ypos " + yPos + " Clicked " +
         			event.getClickCount() + "time(s)";

         if ( event.isMetaDown() ) // right mouse button
            details += " with right mouse button";

         else if ( event.isAltDown() ) // middle mouse button
            details += " with center mouse button";

         else // left mouse button
            details += " with left mouse button";

         setTitle( details ); // display message in statusBar
      } // end method mouseClicked

   } // end private inner class MouseClickHandler
} // end class MouseDetailsFrame

