class A
{
public void display(String str)
	{
	System.out.println(str);
	}
}

class B
{
void display1(String str)
	{
	 new A().display(str);
	}
void display(String str)
	{
	class T extends A
		{
		 public void display(String str)
			{
			System.out.println((new StringBuffer(str)).reverse());
			}
		}
	 new T().display(str);
	}
public static void main(String args[])
	{
	 B b=new B();
	 b.display1("GARDI");
	 b.display("GARDI");	
	}
}