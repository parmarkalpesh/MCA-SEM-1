class D
{
 int i=5;
}

class E extends D
{
int i=10;
int getI()
	{
	return super.i;
	}
}


class Test
{
int i = 20;
int getITest()
{
return this.i;
}
public static void main(String s[])
	{
	E e = new E();
	Test t = new Test();
	int i=30;
	System.out.println(i);
	System.out.println(t.getITest());
	System.out.println(e.i);
	System.out.println(e.getI());
	}
}