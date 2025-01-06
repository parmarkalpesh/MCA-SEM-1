class A 
{

static 
{
System.out.println("1");
}

static
{
System.out.println("2");
}


{
System.out.println("3");
}

{
System.out.println("4");
}

A()
{
System.out.println("5");
}

	public static void main(String s[])
	{
	A a = new A();
	}
}

