class A
{
void printI()
	{
	System.out.println("A Class");
	}
}

class TestDemo extends A
{
void printI()
	{
	System.out.println("TestDemo Class");
	}

public static void main(String s[])
	{
		super.printI();
		
	}
}