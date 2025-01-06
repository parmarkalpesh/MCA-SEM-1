import java.util.Comparator;

class A implements Comparator
{
int length=0;
int breath=0;

A()
{
length=10;
breath=10;
}

A(int i)
{
length=i;
breath=i;
}

A(int i,int j)
{
length=i;
breath=j;
}

public int area()
{
return (this.length * this.breath);
}


public int compare(Object o1, Object o2)
{
return (((A)o1).area() - ((A)o2).area());
}


	public static void main(String s[])
	{
	A a1=new A(10,12);
	A a2=new A(11,10);
	//compareTo Methods Implementations
	System.out.println(a1.compare(a1,a2));

	
	}
}

