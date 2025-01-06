class A
{
	interface P //Inner Interface
	{
	public String myString();
	}

	class B
	{
	int i=20;
	int j=15;
	public String test()
		{
		return "Print Test";
		}
	}

	class C
	{
	public String test1()
		{
		class T extends B implements P //Local Class extends and implemetes
		{
		 public String myString()
			{
				return " From Intiliazer Block ";
			}
		 public String test() //Overriding test() Method of Class B
			{
				return new B().test() + " - Local Class" + this.myString();
			}
		}
		return (new T().test());
		}
	}

public static void main(String args[])
	{
	 A a=new A();
	 System.out.println(a.new B().i);
	 System.out.println(a.new B().j);
	 System.out.println(a.new B().test());
	 System.out.println(a.new C().test1());
	}
}