import java.util.*;
class Table
{
	synchronized public static void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print(i*n+" ");
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
			}
		}
		System.out.println();
	}
}
class Test extends Thread
{	
	Test()
	{
		super("MyThread");
		start();
	}
	public void run()
	{			
		Table.printTable(5);
	}	
}
class Test1 extends Thread
{	
	Test1()
	{
		super("My Thread1");
		start();
	}
	public void run()
	{			
		Table.printTable(15);
	}	
}
class TestDemo
{
	public static void main(String args[])
	{
		Test t = new Test();
		Test1 t1 = new Test1();
	}
}