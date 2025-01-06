abstract class Z
{
int i;
int moveTo()
{
return i;
}

int count(){ return 1;};
}

interface Y
{
public void print1();
}

class TestDemo extends Z implements Y
{

public void print1()
{
System.out.println("Kapil Shukla");
}

int count()
{
return super.i;
}

TestDemo(int i)
{
super.i=i;
}

public static void main(String s[])
	{
		TestDemo t=new TestDemo(10);
		System.out.println(t.i);
	}
}