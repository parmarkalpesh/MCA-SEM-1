import java.util.*;
import java.io.*;
class T
{
	static void display(Object ... val)
	{
		for(Object o:val)
			System.out.println(o);	
	}
	
public static void main(String args[])throws Exception
	{
		display();
		display(45);
		display(10,20.2f,30,"Hello");
		display(45,43,67,23);
	}
}
