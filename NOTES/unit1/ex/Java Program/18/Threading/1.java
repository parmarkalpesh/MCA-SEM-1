class Table
{
	public static void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print(i*n+" ");
			try{
			Thread.sleep(1000);
			}catch(Exception e){}
		}
		System.out.println();
	}
}
class Table1
{
	public static void printTable1(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.print(i*n+" ");
			try{
			Thread.sleep(1000);
			}catch(Exception e){}
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
		final Table tab = new Table();
		final Table1 tab1 = new Table1();
		Test t1 = new Test()
		{
			public void run()
			{
				synchronized(tab)
				{
				tab.printTable(15);
				}
			tab1.printTable1(10);
			}
		};
		Test t2 = new Test()
		{
			public void run()
			{
				synchronized(tab)
				{
				tab.printTable(25);
				}
			tab1.printTable1(20);
			}
		};

	}
}












