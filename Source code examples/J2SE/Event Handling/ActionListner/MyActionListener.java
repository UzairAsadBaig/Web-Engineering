import java.awt.event.*;

public class MyActionListener implements ActionListener {

  public void actionPerformed(ActionEvent ae) {

	  String s = ae.getActionCommand();

	  if (s.equals("Exit")) {
		  System.exit(0);
		  }
		  else {
				  System.out.println(s + " clicked");
				  }
		}
}
