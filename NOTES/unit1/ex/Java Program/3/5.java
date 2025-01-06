class Test
{
static int i=0;
int p=100;

{
p++;
i++;
}

static
{
i=100;
}

Test()
{
System.out.println("i = "+i);
System.out.println("p = "+p);
}

}

class TestDemo
{
public static void main(String s[])
	{
	Test t = new Test();
	}
}