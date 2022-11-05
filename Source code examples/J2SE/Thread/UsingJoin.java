//Creating your multiple threads, You main thread must be the last thread to finish.
//A better approach to do this is the use of join() mehtod of Thread class
//This method waits until the thread on which it is called terminates.

class NewThread implements Runnable
{
 String t_name; //holds the thread name
 Thread t; //holds the thread information

 //parameterized constructor
	NewThread(String t_name)
	 {
 	  this.t_name = t_name; //intializing thread name
 	  t = new Thread(this, t_name);
	  System.out.println("New thread: " + t); //displaying thread information
 	  t.start(); //starting the thread
	 }

 //defining the run method, (entry point for the thread)
	public void run()
	{
	 try
	   {
 	    //displaying the loop number with delay of half second
 		for(int i=1; i<=5; i++)
		{
 		 System.out.println("Thread " + t_name + " : " + i);
 	 	 Thread.sleep(500);
		}
 	   }
	   catch(InterruptedException e)
	   {
	    System.out.println("Child thread interrupted " + e.getMessage());
	   }
	System.out.println("Thread "+ t_name + " Existing");
 	}
}



class UsingJoin
{

public static void main(String []args)
{
 //creating object(s) of NewThread class
 NewThread t1 = new NewThread("One");
 NewThread t2 = new NewThread("Two");
 NewThread t3 = new NewThread("Three");

 //Checking either the threads are alive
 System.out.println("Thread " + t1.t_name + " is alive: " +  t1.t.isAlive());
 System.out.println("Thread " + t2.t_name + " is alive: " +  t2.t.isAlive());
 System.out.println("Thread " + t3.t_name + " is alive: " +  t3.t.isAlive());

 //wait for threads to finish
try
{
 t1.t.join();
 t2.t.join();
 t3.t.join();
}
catch(InterruptedException e)
{
 System.out.println("Interrupted " + e.getMessage());
}


 //Checking either the threads are alive
 System.out.println("Thread " + t1.t_name + " is alive: " +  t1.t.isAlive());
 System.out.println("Thread " + t2.t_name + " is alive: " +  t2.t.isAlive());
 System.out.println("Thread " + t3.t_name + " is alive: " +  t3.t.isAlive());

 System.out.println("Main Exiting");

 }
}
