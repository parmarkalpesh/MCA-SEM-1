class ex13
{
        static void abc(String...person)
	{
		for(String name:person)
		{
			System.out.println("Hello :"+name);
		}
	}
	public static void main(String args[])
	{
		abc("Sachin","abc","sehvag","xyz");
	}
}