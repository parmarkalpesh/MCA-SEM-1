class ex48
{
	public static void main (String[] args)
	{
		int x = 10;
		try
		{
			x = x / 0;
		}
		catch(ArithmeticException e )
		{
			e.printStackTrace();	
			System.out.println(e);
		}
		System.out.println("program still running");
	}
}