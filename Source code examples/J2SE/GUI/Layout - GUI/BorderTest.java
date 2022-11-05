import java.awt.*; import javax.swing.*;

class BorderTest extends JFrame {
    //======================================================= main
    public static void main(String[] args) {
        JFrame window = new BorderTest();
        window.setVisible(true);
    }
    //================================================ constructor
    BorderTest() {
        //... Create components (but without listeners)
        JButton north  = new JButton("North");
        JButton east   = new JButton("East");
        JButton south  = new JButton("South");
        JButton west   = new JButton("West");
        JButton center = new JButton("Center");

        //... Create content pane, set layout, add components
        Container content = getContentPane();
        content.setLayout(new BorderLayout());

        content.add(north , BorderLayout.NORTH);
        content.add(east  , BorderLayout.EAST);
        content.add(south , BorderLayout.SOUTH);
        content.add(west  , BorderLayout.WEST);
        content.add(center, BorderLayout.CENTER);

        //... Set window characteristics.
        setTitle("BorderTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }   }
