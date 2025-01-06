class MyResource 
{

  Boolean b = new Boolean(true);

  void makeFalse()
	{
	synchronized(b)
		{
		 	try
			{
			while(true)
			{
			if(this.b)
				this.b=false;
			else
				wait();
			}
			catch(Exception e)
			{
			
			}
			}
		}
	}
  void makeTrue()
	{
	synchronized(b)
		{
		try
			{
			while(true)
			{
			if(!this.b)
				this.b=true;
			else
				wait();
			}
			catch(Exception e)
			{
			
			}
			}
		}
	}
}


class Main 
	{
  	public static void main(String args[]) throws Exception 
	{
    	MyResource sObj = new MyResource();
    	sObj.start();
  }
}