class Message
{

	synchronized void Go(String msg)
	{
 	 System.out.print("[" + msg);
 	try
 	 {
	  Thread.sleep(1000);
	 }
	catch(InterruptedException e)
	 {
	  System.out.println("Interrupted " + e.getMessage());
	 }
	System.out.println("]");
 	}
}

class NewThread implements Runnable
 {
 Thread t; //holds the thread information
 Message obj_m; //holds the Message class object
 String msg; //holds the message string

 //parameterized constructor
 	NewThread(Message obj_m, String msg)
 	{
	 this.obj_m = obj_m; //initializing Message object
 	 this.msg = msg; //initializing the message
	 t = new Thread(this);
 	 t.start(); //starting the thread

 	}

	public void run()
 	{
 	 obj_m.Go(msg); //calls the Go(String msg) method
	}
}

class MethodSync
{

 public static void main(String []args)
 {
 //creating object of Message class
 Message obj_msg = new Message();

 //creating threads
 NewThread t1 = new NewThread(obj_msg, "Hello");
 NewThread t2 = new NewThread(obj_msg, "World");


 }
}
