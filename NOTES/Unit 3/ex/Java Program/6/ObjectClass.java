class B
{
int j;
B()
{
j=3;
}
B(int j)
{
this.j=j;
}
}
class A extends B
{
int i;
A()
{
i=3;
}
A(int i)
{
super(i);
this.i=i;
}
A(int i, int j)
{
super(j);
this.i=i;
}
public String toString()
{
 return " i : "+i;
}

public boolean equals (Object o)
	{
	return (this==o);
	}

public static void main(String s[])
	{
	 B b = new B(12);
	 A a = new A(8);
	 A a2 = new A(8);
	 A a1 = new A(8,12);
	 
	 System.out.println(a.equals(a));
	 System.out.println(a.equals(a2));
	 System.out.println(a1.equals(b));

	 System.out.println(a1.equals(a));
	 System.out.println(b.equals(a));
	 System.out.println(b.equals(a1));
	}
}