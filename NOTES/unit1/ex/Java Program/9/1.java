import java.util.Arrays;
class A implements Comparable <A>
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

/*
public int compareTo(Object o)
{
return (this.area() - ((A)o).area());
}
*/
public int compareTo(A o)
{
return (this.area() - o.area());
}


	public static void main(String s[])
	{
	A a1=new A(10,12);
	A a2=new A(11,10);
	//compareTo Methods Implementations
	System.out.println(a1.compareTo(a2));

	// Implementation of java.util.Arrays method sort
	A[] a=new A[2];
	a[0]=new A(10,12);
	a[1]=new A(8,10);
	Arrays.sort(a);
	System.out.println(a[0].area());
	System.out.println(a[1].area());
	}
}

