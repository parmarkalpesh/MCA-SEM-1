public class ex80 extends Thread 
{
  	public void run() 
	{
  		System.out.println("Entering run method");
		try 
		{
  			System.out.println("In run Method: currentThread() is" + Thread.currentThread());
  			while (true) 
			{
  				try 
				{
  					Thread.sleep(500);
  				} 
				catch (InterruptedException x) 
				{
  				}
				System.out.println("In run method: woke up again");
  			}
  		} 
		catch(Exception e)
		{
		}
		finally 
		{
  			System.out.println("Leaving run Method");
  		}
  	}
  	public static void main(String[] args) 
	{
  		System.out.println("Entering main Method");
                ex80 t = new ex80();
  		t.setDaemon(true);
  		t.start();
		try 
		{
  			Thread.sleep(3000);
  		} 
		catch (InterruptedException x) 
		{
  		}
		System.out.println("Leaving main method");
  	}
}
