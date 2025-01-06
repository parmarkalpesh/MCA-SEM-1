class Test
{
	void display()
	{
		System.out.println("Display from Test");
	}
}
class TestDemo
{
	public static void main(String []args)
	{
		Test t1 = new Test();
		Test t2 = new Test()
		{
			void display()
			{
				System.out.println("Display from Anonymous");
			}
		};
		t1.display();
		t2.display();
	}
}