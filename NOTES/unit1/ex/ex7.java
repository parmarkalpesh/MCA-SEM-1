class NewForArray 
{
	public static void main(String[] args)
	{
		int[] squares = {0,1,4,9,16,25};
		int j=0;
		for (int i : squares)
		{
			System.out.println("%d squared is %d \n",j++, i);
		}
	}
}