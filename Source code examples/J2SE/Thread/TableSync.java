class Table 
{
 synchronized void GenerateTable(int table, int s_limit, int e_limit)
 {
  for(int i=s_limit; i<=e_limit; i++)
  {
   System.out.println(table + " * " + i + " = " + (i * table));
  }
 System.out.println();
 }
}



class NewThread implements Runnable
 {
 Thread t; 
 Table obj_t;
 int table; 
 int s_limit; 
 int e_limit; 

 //parameterized constructor
	NewThread(Table obj_t, int table, int s_limit, int e_limit)
	{
 	 this.obj_t = obj_t;
 	 this.table = table; 
 	 this.s_limit = s_limit; 
 	 this.e_limit = e_limit; 
 	 t = new Thread(this);
 	 t.start();
	}

 //defining the run method, (entry point for the thread)
	public void run()
	{
	 obj_t.GenerateTable(table, s_limit, e_limit);
 	}
}


class TableSync
{

public static void main(String []args)
{
 //creating object of Table class
 Table obj_t = new Table();

 //creating threads
 NewThread t1 = new NewThread(obj_t, 2, 0, 10);
 NewThread t2 = new NewThread(obj_t, 3, 0, 10);

 }
} 
