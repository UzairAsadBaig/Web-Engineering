public class ExcepDemo{



	public void amethod()
	{
 		try{
  			System.out.println("Starting");
    			System.out.println("Continuing");

			throw new Exception();

    		   }
		catch(Exception e)
    		   {
    			System.out.println("Exception");
		   }
    		finally
		   {
    			System.out.println("Doing finally");
    		   }
  }

	public static void main(String argv[])
	{
       		ExcepDemo e = new ExcepDemo();
		e.amethod();
	}	




}
