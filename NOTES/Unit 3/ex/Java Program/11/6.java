abstract class Test
{
	void display()
	{
		System.out.println("Display from Test");
	}
	abstract void show();
}
class TestDemo
{
	public static void main(String []args)
	{
		
		Test t2 = new Test()
		{
			void display()
			{
				System.out.println("Display from Anonymous");
			}
			void show(){}
		};
		
		t2.display();
	}
}