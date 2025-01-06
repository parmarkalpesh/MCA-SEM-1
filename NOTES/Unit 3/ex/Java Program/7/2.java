class A
{
int i;
A()
{
i=1;
}
A(int i)
	{
	this.i=i;
	}
}

class B extends A
{
int j;

B(int j)
	{
	this.j=j;
	}

protected Object clone() throws CloneNotSupportedException 
{
    return new A(this.j);
}


public static void main(String s[]) throws CloneNotSupportedException
	{
	A a=new A(0);
	B b=new B(10);
	B b1=new B(3);

	System.out.println(b.j);
	System.out.println(b1.j);
	a=(A)b.clone();
	System.out.println(a.i);
	}
}