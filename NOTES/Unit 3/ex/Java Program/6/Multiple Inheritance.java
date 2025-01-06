abstract class A
{
abstract void printP();
}

interface B
{
void printR();
}

abstract class D extends A
{
void printP()
	{
	System.out.println("printP");
	}
abstract void printQ();
}


class C extends D implements B
{
public void printQ()
	{
	System.out.println("printQ");
	}

public void printP()
	{
	System.out.println("printP");
	}

public void printR()
	{
	System.out.println("printR");
	}

public static void main(String s[])
	{
	 C c=new C();
	 c.printP();
	 c.printQ();
	 c.printR();
	}
}