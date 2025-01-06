import java.util.*;
class Table
{
	public static void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print(i*n+" ");
			try
			{
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{}
		}
		System.out.println();
	}
}
class Test extends Thread
{	
	Table tab;
	Test(Table tab)
	{
		super("MyThread");
		this.tab=tab;
		start();
	}
	public void run()
	{			
		synchronized(tab)
		{
			tab.printTable(5);
		}
	}	
}
class Test1 extends Thread
{		
	Table tab;
	Test1(Table tab)
	{
		super("My Thread1");
		this.tab=tab;
		start();
	}
	public void run()
	{			
		synchronized(tab)
		{
			tab.printTable(15);
		}
	}	
}
class TestDemo
{
	public static void main(String args[])
	{
		Table tab = new Table();
		Test t = new Test(tab);
		Test1 t1 = new Test1(tab);
	}
}




