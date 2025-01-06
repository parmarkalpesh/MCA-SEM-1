import java.io.*;
import java.util.*;
class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}
public class ex49
{
	public static void main(String args[]) throws MyException, IOException
	{
        	try
		{
           		int rs=10/0;
      		}
       		catch(Exception e)
         	{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			throw new MyException("Chained ArithmeticException");
            	}
      	}
}
