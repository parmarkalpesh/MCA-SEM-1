public class ex52
{
	public void m()
	{
		int x=100;
		class B
		{
			public void displayB()
			{
				System.out.println("Output from B");
			}
		}
                B b = new B();
                b.displayB();
	}
	public void m1()
	{
		System.out.println("Output from M1");
	}
	public static void main(String args[])
	{
                ex52 a = new ex52();
		a.m();
		a.m1();
	}
}
