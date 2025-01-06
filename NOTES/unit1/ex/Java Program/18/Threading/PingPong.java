class SharedClass
{
	synchronized void printMessage(String str)
	{
		System.out.print(str);	
	}
}
class TestDemo
{
	public static void main(String []args)
	{
		final SharedClass s = new SharedClass();
		Thread t1 = new Thread()
		{
			public void run()
			{
				while(true)
				{				
					s.printMessage("ping--->");
					try{
					Thread.sleep(1000);
					}catch(Exception e){}
				}
			}	
		};
		t1.start();

		Thread t2 = new Thread()
		{
			public void run()
			{
				while(true)
				{
					s.printMessage("<---pong\n");
					try{
					Thread.sleep(1000);
					}catch(Exception e){}
				}
			}	
		};
		t2.start();
		while(true)
		{
			try{
			Thread.sleep(5000);
			System.out.println("Java is interesting");
			}catch(Exception e){}	
		}		
	}
}












