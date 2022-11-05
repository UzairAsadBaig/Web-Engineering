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
    Account[] arr=new Account[3];
	arr[0] = new Account(22.2);
    arr[1] = new Account(1000.00);
    arr[2] = new Account(38.4);
	
	for(int i=0;i<3;i++)
    System.out.println(arr[i].getbalance());
	
		
		
  }// end of main
} // end of class