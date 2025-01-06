import java.util.Date;

class TestDemo
{
	public static void main(String []args)
	{
		Runnable r = new Runnable()
		{
			public void run()
			{
			 while(true)
			 {
				System.out.println(new Date());
				try{
				Thread.sleep(1000);
				}catch(Exception e){}
			  }
			}
		};
		Thread t = new Thread(r);
		t.start();
		

	}
}