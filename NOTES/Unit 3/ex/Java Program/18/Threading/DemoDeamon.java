class Test extends Thread
{
	Test(String name)
	{
		super(name);
		setDaemon(true);
		start();
	}
	public void run()
	{
		System.out.println("Testing");
		for(int i=0;i<5;i++)
		{
			System.out.println("hello "+i+" "+getName());
			try{
			Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
class TestDemo
{
	public static void main(String []args)
	{
		//Thread.currentThread().setDaemon(true);
		Test t = new Test("One");
		Test t1 = new Test("Two");
		try{
		t.join(); // Main will wait until Test thread get finished
		t1.join();
		}catch(Exception e){}
		System.out.println("Main Exit");
	}
}




