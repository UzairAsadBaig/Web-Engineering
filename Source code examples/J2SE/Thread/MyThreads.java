//Creating your own thread, You can create thread either by implementing the Runnable interface
//and defining the run() method (preferred approach) Or by extending the Thread class
//class implements the Runnable interface

class NewThread implements Runnable
{
 //defining the run method, (entry point for the thread)
 public void run()
 {
 try
 {
 	//displaying the loop number with delay of half second
 	for(int i=1; i<=5; i++)
 	{
 	System.out.println("Child Thread: "+ i);
 	Thread.sleep(500);
 	}
 }
 catch(InterruptedException e)
 {
 	System.out.println("Child thread interrupted " + e.getMessage());
 }

System.out.println("Child Exiting");

}

}

class MyThreads
{
 public static void main(String []args)
 {
 	//creating object of NewThread class
 	NewThread ct = new NewThread();

 	//creating new thread with the help of Thread class
 	Thread t1 = new Thread(ct);

 	//starting the thread, it will call the run() mehtod of NewThread class
 	t1.start();


 try
 {
 	//displaying the loop number with delay of 1 second
 	for(int i=1; i<=5; i++)
 	{
 	System.out.println("Main Thread: "+ i);
 	Thread.sleep(1000);
 	}
 }

 catch(InterruptedException e)
 {
 System.out.println("Main thread interrupted " + e.getMessage());
 }
 	System.out.println("Main Exiting");
 }

}
