import java.util.*;

public class Account
{
        public double balance;

        // Defaultt constructor for empty balance
public Account()
	{
		balance = 0.0;
	}

        // Parametrized Constructor to initialize balance
public Account( double amount )
	{
		balance = amount;
	}

public void deposit( double amount )
	{
		balance += amount;
	}

public double withdraw( double amount )
	{
			return balance -= amount;
	}

public double getbalance()
	{
                return balance;
	}


public static void main(String args[]){

        	// Create an empty account
        	Account obj1 = new Account();
        	Account obj2 = new Account(1000.00);
               	Account obj3 = new Account();

		// Create an arraylist andadd items
		ArrayList bank = new ArrayList();
		bank.add(obj1);
		bank.add(obj2);
		bank.add(obj3);	
		
		System.out.println("The size of arraylist: "+ bank.size());

		int i=0;
		int size = bank.size();
		// Retrieve items from ArrayList
		while( i< size)
		{
		Account obj = (Account) bank.get(i);
		double bal = obj.getbalance();

		// Removalof item inside the ArrayList
		if(bal <= 0)
		{
			System.out.println("Deleteing");
			bank.remove(i);
			
		}

		i++;
		} // end of loop

		System.out.println("The size of arraylist after deletion: "+ bank.size());

  }// end of main
} // end of class