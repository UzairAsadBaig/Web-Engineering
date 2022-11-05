import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

 public class SmallCalcApp implements ActionListener{
 JFrame frame;
 JLabel firstOperand, secondOperand;
 JTextField op1, op2, ans;
 JButton plus, mul;

public void initGUI ( ) {
	frame = new JFrame();

 		 firstOperand = new JLabel("No1");
		 secondOperand = new JLabel("No2");

		 op1 = new JTextField (15);
		 op2 = new JTextField (15);
		 ans = new JTextField (15);

		 plus = new JButton("+");
		 mul = new JButton("*");

		Container cont = frame.getContentPane();
 		cont.setLayout(new FlowLayout());

 		cont.add(firstOperand);
 		cont.add(op1);
 		cont.add(secondOperand);
 		cont.add(op2);
		cont.add(plus);
		cont.add(mul);
		cont.add(ans);


		plus.addActionListener(this);
  		mul.addActionListener(this);

 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		frame.setSize(230, 170);
  		frame.setVisible(true);
  }

  //constructor
  public SmallCalcApp ( ) {
  initGUI();
  }

  public void actionPerformed(ActionEvent event) {
  String oper, result;
  int num1, num2, res;
 /* All the information regarding an event is contained
 inside the event object. Here we are calling the
 getSource() method on the event object to figure out
 the button that has generated that event. */
  if (event.getSource() == plus) {
  oper = op1.getText();
  num1 = Integer.parseInt(oper);
  oper = op2.getText();
  num2 = Integer.parseInt (oper);
  res = num1+num2;
  result = res+"";
  ans.setText(result);
  }
  else if (event.getSource() == mul) {
  oper = op1.getText();
  num1 = Integer.parseInt(oper);
  oper = op2.getText();
  num2 = Integer.parseInt (oper);
  res = num1*num2;
   result = res+"";
   ans.setText(result);
   }
}
   public static void main(String args[]) {
   SmallCalcApp scApp = new SmallCalcApp();
   }  }// end class
