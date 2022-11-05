//Creating your multiple threads, You main thread must be the last thread to finish
//In this program we will handle it by using the sleep function of Thread class (Bad Approach)


class NewThread implements Runnable
 {
	String t_name;     //holds the thread name
	Thread t;      //holds the threa information


	//parameterized constructor
	NewThread(String t_name)
	{
 	 this.t_name = t_name; //intializing thread name

 	 t = new Thread(this, t_name);//creating thread by calling the constructor of Thread class with thread name

	 System.out.println("New thread: " + t); //displaying thread information

	 t.start();
	}

	//defining the run method, (entry point for the thread)
	public void run()
	{
	try
	 {
 	  //displaying the loop number with delay of half second
 	  for(int i=0; i<5; i++)
	   {
 	    System.out.println("Thread " + t_name + " : " + i);
 	    Thread.sleep(500);
	   }
 	 }
	catch(InterruptedException e)
	 {
	  System.out.println("Child thread interrupted " + e.getMessage());
	 }
	System.out.println("Thread "+ t_name + " Exiting");
 	}
}

class MultipleThreads
{

public static void main(String args[])
{

 //creating object(s) of NewThread class
 NewThread t1 = new NewThread("One");
 NewThread t2 = new NewThread("Two");
 NewThread t3 = new NewThread("Three");

 	try
 	{
 	   Thread.sleep(10000);
	}
 catch(InterruptedException e)
 {
 	System.out.println("Main interrupted " + e.getMessage());
 }
System.out.println("Main Exiting");

 }
}
