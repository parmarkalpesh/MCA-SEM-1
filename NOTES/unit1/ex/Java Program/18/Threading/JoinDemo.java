class Test extends Thread
{
	Test(String name)
	{
		super(name);
		start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" : "+this);
			try{
			Thread.sleep(1500);
			}catch(Exception e){}
		}
	}
}
class TestDemo
{
	public static void main(String []args)
	{
		Test t1 = new Test("One");
		Test t2 = new Test("Two");
		Test t3 = new Test("Three");
		try{
		t1.join();
		t2.join();
		t3.join();
		}catch(Exception e){}
		System.out.println("Main Exit");		
	}
}