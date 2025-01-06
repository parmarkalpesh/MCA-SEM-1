import java.util.Date;
class TestDemo 
{
	public static void main(String []args) throws Exception
	{
		Runnable r = new Runnable()
		{
			public void run()
			{
				Date d;
				while(true)
				{
					d = new Date();
					System.out.println(d);
					try{
					Thread.sleep(1000);
					}catch(Exception e){}
				}
			}	
		};
		Thread t = new Thread(r);
		t.start();
		
		while(true)
			{
					
				System.out.println("Java is interesting");
				try{
				Thread.sleep(5000);
				}catch(Exception e){}
			}			
	}
}