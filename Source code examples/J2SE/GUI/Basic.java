import javax.swing.*;
import java.awt.*;


public class Basic{

	public Basic(){

		JFrame f = new JFrame();

		Container container = f.getContentPane();
		container.setLayout(new FlowLayout());

		f.setVisible(true);
		f.setSize(250,500);
	}


    public static void main(String args[]){
        Basic basic = new Basic();

    }
}
