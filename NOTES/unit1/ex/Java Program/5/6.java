class Z
{

int i;

static final int cnt=3;

Z(int i)
{
this.i = i + 5;	
}

static int voting()
{
return i;
}

int getI()
{
return cnt;
}
}

class TestDemo
{
public static void main(String s[])
	{
	Z z1=new Z(3);
	Z z2=new Z(4);

	System.out.println(Z.voting());
	System.out.println(z1.getI());
	}
}