import java.util.Scanner;

class tooLargeNumberException extends Exception{
	
	public String toString(){
		return "The number is too large to handle";
	}
	
}
class tooSmallNumberException extends Exception{
	
	public String toString(){
		return "The number is too small to handle";
	}
	
}




public class task1 {
	
	
	int factorial(int num) throws tooLargeNumberException,tooSmallNumberException{
		if(num>16)
			throw new tooLargeNumberException();
		if(num<0)
			throw new tooSmallNumberException();
		
		int factorial=1;
		for(int i=num;i>0;i--)
			factorial=factorial*i;
		return factorial;
	}
	
	
	
	public static void main(String args[]){
		
		task1 var=new task1();
		
		Scanner in=new Scanner(System.in);
	
        System.out.println("Enter a number :");
    	int input = in.nextInt();
		
		try{
		System.out.println(var.factorial(input));	
		}
		catch(Exception err){
			System.out.println(err);
		}
		
	}
	
	
}