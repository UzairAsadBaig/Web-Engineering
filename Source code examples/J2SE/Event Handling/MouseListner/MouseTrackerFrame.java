// A class implements two listners at the same time
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseTrackerFrame extends JFrame
{
   JLabel status;
   public MouseTrackerFrame()
   {
     super( "Demonstrating Mouse Events" );
     Container c = getContentPane();
     c.setLayout(new FlowLayout());

     status = new JLabel();
     c.add( status);

     // create and register listener for mouse and mouse motion events
      MouseHandler handler = new MouseHandler();
      this.addMouseListener( handler );
      this.addMouseMotionListener( handler );
   }

   public static void main( String args[] )
   {
      MouseTrackerFrame mouseTrackerFrame = new MouseTrackerFrame();
      mouseTrackerFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      mouseTrackerFrame.setSize( 300, 100 ); // set frame size
      mouseTrackerFrame.setVisible( true ); // display frame
   } // end main

   private class MouseHandler implements MouseListener,MouseMotionListener
   {

      // handle event when mouse released immediately after press
      public void mouseClicked( MouseEvent event )
      {
         status.setText("Clicked at [" + event.getX() + ","+ event.getY() + "]") ;
      }

      // handle event when mouse pressed
      public void mousePressed( MouseEvent event )
      {
         status.setText( "Pressed at [" + event.getX() + ","+ event.getY() + "]");
      }

      // handle event when mouse released after dragging
      public void mouseReleased( MouseEvent event )
      {
         status.setText( "Released at [" + event.getX() + ","+ event.getY() + "]");
      }

      // handle event when mouse enters area
      public void mouseEntered( MouseEvent event )
      {
         status.setText( "Mouse entered at [" + event.getX() + ","+ event.getY() );
         getContentPane().setBackground( Color.GREEN );
      }

      // handle event when mouse exits area
      public void mouseExited( MouseEvent event )
      {
         status.setText( "Mouse outside" );
         getContentPane().setBackground( Color.WHITE );
      }

      // handle event when user drags mouse with button pressed
      public void mouseDragged( MouseEvent event )
      {
         status.setText( "Dragged at [" + event.getX() + ","+ event.getY()+ "]" );
      }

      // handle event when user moves mouse
      public void mouseMoved( MouseEvent event )
      {
         status.setText( "Moved at [" + event.getX() + ","+ event.getY() + "]");
      }

   } // end inner class MouseHandler
} // end class MouseTrackerFrame

