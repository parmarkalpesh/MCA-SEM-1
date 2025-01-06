class A
{

static
{
System.out.println("Class Initializer Block Called");
}


{
System.out.println("Initializer Block Called");
}
A()
{
System.out.println("OBJECT Created");
}

public static void main(String s[])
	{
	
	System.out.println("Program Stated - Main Block Called");
	A a=new A();
	}
}