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
			catch(Exception e)
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
		start();	
	}
}

class TestDemo
{
	public static void main(String []args)
	{
		Test t1 = new Test()
		{
			public void run()
			{
				Table.printTable(15);
			}
		};
		Test t2 = new Test()
		{
			public void run()
			{
				Table.printTable(100);
			}
		};
	}
}












