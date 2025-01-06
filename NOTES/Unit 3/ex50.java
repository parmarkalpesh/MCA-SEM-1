public class ex50
{
	public static void main(String Args[])
	{
		int[] array = new int[3];
		try
		{
			for(int i=0;i<4;++i)
			{
				array[i] = i;
			}
			System.out.println(array);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//printed just to inform that we have entered the catch block
			System.out.println("Oops, we went to far, better go back to 0!");
		}
		finally
		{
			System.out.println("We are in finally");
			//method call to continue program
		}
	}
}

