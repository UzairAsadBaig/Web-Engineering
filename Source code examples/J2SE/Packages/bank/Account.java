package bank;
import java.util.*;


public class Account
{
        public double balance;
	
      	
  	    public void deposit( double amount )
	{
		balance += amount;
	}

        public double withdraw( double amount )
	{
                // See if amount can be withdrawn
		if (balance >= amount)
		{
			balance -= amount;
                        return amount;
		}
		else
                // Withdrawal not allowed
                        return 0.0;
	}

        public double getbalance()
	{
                return balance;
	}


public static void main(String args[])
	{
         Scanner in = new Scanner(System.in);

        	// Create an empty account
        	Account obj = new Account();

                // Deposit money
		System.out.print("Enter the amount that you want to deposit: ");
        	double deposit_amount = in.nextDouble();      
		obj.deposit(deposit_amount);

                // Print current balance
		System.out.println ("Current balance after deposit the amount: " +obj.getbalance());


                // Withdraw money
		System.out.print("Enter the amount that you want to withdraw:");
		double witdraw_amount = in.nextDouble();      
		obj.withdraw(witdraw_amount);

                // Print remaining balance
		System.out.println ("Remaining balance after withdrawing the amount: " +obj.getbalance());
	}


}
