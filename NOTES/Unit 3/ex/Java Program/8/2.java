
public class C
{

	static class D
	{
	static int j=50;
	}
}
class A extends C
{
	public static void main(String s[])
	{
	A a=new A();
	Class c=a.getClasses();
	System.out.println(c.getName());
	System.out.println(C.D.j);
	
	}
}

