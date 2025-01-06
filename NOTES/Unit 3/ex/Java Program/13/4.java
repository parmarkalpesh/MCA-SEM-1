import java.util.*;
import java.io.*;
class T
{

	static void display(String str,Object ... val)
	{
		for(int o:val)
			System.out.println(o);	
	}
	
public static void main(String args[])throws Exception
	{
		int a[]={10,20,30,40};
		display(a);
		//display(45,56,87,78);
		
	}
}
