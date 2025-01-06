class A
{
static int i=50;
int p=100;
static
{
System.out.println("Class Initializer Block Called"+new A().p);
}


{
System.out.println("Initializer Block Called"+i);
}

A()
{
System.out.println("OBJECT Created");
}

public static void main(String s[])
	{
	
	System.out.println("Program Stated - Main Block Called");
	for(int i=0;i<5;i++)
		new A();
	}
}