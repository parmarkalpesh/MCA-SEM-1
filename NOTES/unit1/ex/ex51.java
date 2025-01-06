class HasStatic 
{
	static int j = 100;
}

class Outer
{
	final int z=10;
	class Inner extends HasStatic 
	{
		static final int x = 3;
		int y = 4;
	}
	static class Inner2 
	{	
		public static int size=130;
	}
	interface InnerInteface 
	{
		public static int size=100;
	}
}

public class ex51
{
	public static void main(String[] args) 
	{
		Outer outer=new Outer();
		System.out.println(outer.new Inner().y);
		System.out.println(outer.new Inner().x);
		System.out.println(outer.new Inner().j);
		System.out.println(Outer.Inner2.size);
		System.out.println(Outer.InnerInteface.size);
	}
}