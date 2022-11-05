import javax.swing.*;

public class calcGui{
	public static void main(String[] args){
		String exp=JOptionPane.showInputDialog("UzairCalc: Please perfrom one calculation at a time");
		if(exp.contains("+")){
		String[] num= exp.split("\\+");
		JOptionPane.showMessageDialog(null,Integer.parseInt(num[0])+Integer.parseInt(num[1]));
		}
		if(exp.contains("-")){
		String[] num= exp.split("\\-");
		JOptionPane.showMessageDialog(null,Integer.parseInt(num[0])-Integer.parseInt(num[1]));
		}
		if(exp.contains("*")){
		String[] num= exp.split("\\*");
		JOptionPane.showMessageDialog(null,Integer.parseInt(num[0])*Integer.parseInt(num[1]));
		}
		if(exp.contains("/")){
		String[] num= exp.split("\\/");
		JOptionPane.showMessageDialog(null,Integer.parseInt(num[0])/Integer.parseInt(num[1]));
		}
		
	}	
}