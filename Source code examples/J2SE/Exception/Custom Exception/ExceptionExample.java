import java.io.*;
import java.util.*;

class CustomExcepDemo extends Exception
{
	private int n;
	private int d;

	public CustomExcepDemo (int num, int den)
	{  n = num;    d = den;}

	public String toString()
	{return "Result of " + n + " / " + d + " is non-integer";}
}

public class ExceptionExample
{

	public static void main(String [] args)
	{
		int numer[] = {4, 6, 0, 1};
		int denom[] = {2, 3, 7, 8};

		for (int i = 0; i < 4; i++)
		{
			try
			{
				if ( (numer[i]%denom[i]) != 0) throw new CustomExcepDemo (numer[i], denom[i]);
					System.out.println( numer[i] + " % " + denom[i] + " = " + numer[i]%denom[i]);
			}

			catch (CustomExcepDemo ex)
			{
				System.out.println(ex);
			}
		}
	}
}

