class A
{
int i;
A()
	{
	i=10;
	}
A(int i)
	{
	this.i=i;
	}
int getI()
	{
	return i;
	}	
}

class B extends A
{
int i;
B()
	{
	super(10);
	i=20;
	
	}

B(int i)
	{
	super(i);
	this.i=i;
	
	}
int getI()
	{
	return i;
	}
int getSuperI()
	{
	return super.i;
	}
}

class C
{
public static void main(String s[])
	{
	A a=new A();
	B b=new B();
	B b1=new B(30);
	System.out.println(b.getI());
	System.out.println(b1.getI());
	System.out.println(b.getSuperI());
	System.out.println(b1.getSuperI());
	}
}