interface i1
{
	class B
	{
	static int i=30;
	}
}
class C
{
	static class D
	{
	static int j=50;
	}
}
class A 
{
	public static void main(String s[])
	{
	System.out.println(i1.B.i);
	System.out.println(C.D.j);
	}
}

