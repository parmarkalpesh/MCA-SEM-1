class ex4
{
	public static void main(String args[])
	{
		int count,i=0;
		String s;
		
		count=args.length;
		
		System.out.println("Number Of Arguments = "+count);
		while(i<count)
		{
			s=args[i];
			i=i+1;
			System.out.println(i+" Java Is "+s);
		}
	}
}