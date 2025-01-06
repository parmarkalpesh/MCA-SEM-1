import java.util.Date;
class A extends Thread
{
	A()
	{
		super("One");
		start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(new Date());
			try{
			Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
class B extends Thread
{
	B()
	{
		super("Two");
		start();
	}
	public void run()
	{
		int cnt=1;
		for(int i=0;i<10;i++)
		{
			if(cnt%2==0)
			{
				System.out.println(cnt+" is even");
				try{
				Thread.sleep(3000);
				}catch(Exception e){}
			}
			cnt++;
		}
	}
}
class C extends Thread
{
	C()
	{
		super("Three");
		start();
	}
	public void run()
	{
		int cnt=1;
		for(int i=0;i<10;i++)
		{
			if(cnt%2!=0)
			{
				System.out.println(cnt+" is Odd");
				try{
				Thread.sleep(2000);
				}catch(Exception e){}
			}
			cnt++;
		}
	}
}
class TestDemo
{
	public static void main(String []args)
	{
		A a = new A();
		B b = new B();
		C c = new C();

		try{
		a.join();
		b.join();
		c.join();
		}catch(Exception e){}
		System.out.println("Main exit");
	}
}

















