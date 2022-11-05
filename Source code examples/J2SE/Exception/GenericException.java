
class GenericException
{
	static int num = 34, den = 0;
	static int quot = 0;
	
    public static void main (String args[])
    {

       try
           {
            quot = num / den;
       	   }
        catch (Exception e)
          {
            System.out.println ("Error in the code");
            System.out.println ("Exception:" + e);
          }
	 
      }
}

