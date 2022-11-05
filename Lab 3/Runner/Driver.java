import java.util.Scanner;
import Zoo.*;

public class Driver{
	
	public static void main(String[] args){
		
	  Animal[] animals={new Animal(1,"lion","brown","Khaaaw"),new Animal(2,"Dog","White","Bau Bau")};
	  Bird[] birds={new Bird(1,"parot","green","trr trr"),new Bird(1,"hawk","dark brow","eeeeee")};
	  Scanner in=new Scanner(System.in);
	  System.out.print("Kido, what do you wanna see?\n 1)Birds \n 2)Animals\n");
	  int sel=in.nextInt();
	  System.out.print("\n\n");
	  if(sel==1)
		  for(int i=0;i<birds.length;i++)
          System.out.print(birds[i]);	  
	  
	  if(sel==2)
		  for(int i=0;i<animals.length;i++)
          System.out.print(animals[i]);	
	}
}