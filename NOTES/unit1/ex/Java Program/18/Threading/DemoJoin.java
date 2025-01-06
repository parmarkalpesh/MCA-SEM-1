class Test  extends Thread
{
	Test(ThreadGroup tg, String name)
	{
		super(tg,name);
		start();
	}
	synchronized public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(Thread.currentThread());
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
}
class TestDemo
{
	public static void main(String []args)
	{
		ThreadGroup tg = new ThreadGroup("MCA-3");
		System.out.println(tg.isDaemon());
		Test t1 = new Test(tg,"One");
		Test t2 = new Test(tg,"Two");
		Test t3 = new Test(tg,"Three");
		try
		{
		t1.join();
		t2.join();
		t3.join();
		}
		catch(InterruptedException e)
		{}
		System.out.println("Main is Exiting");
	}
}




