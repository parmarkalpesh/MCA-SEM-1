class A
{
public void printp()
	{
	System.out.println("Testing");
	}
}

class B
{
public static A a=new A();
}

class C
{
	public static void main(String arghs[])
	{
	B.a.printp();
	}
}