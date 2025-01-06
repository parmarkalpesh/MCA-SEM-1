package p;
class A
{
private int i=10;
int j=20;
protected int k=30;
public int l=40;
void printA()
	{
	System.out.println("Print-A " + this.i + " " + this.j + " " + this.k + " " + this.l);
	}
}

public class B extends A
{
	void printB()
	{
	A a =new A();
	System.out.println("Print-B "  + a.j + " " + a.k + " " + a.l);
	}
}

class C
{
void printC()
	{
	A a =new A();
	System.out.println("Print-B " + a.j + " " + a.k + " " + a.l);
	}

public static void main(String s[])
	{
	A a = new A();
	B b = new B();
	C c = new C();
	a.printA();
	b.printB();
	c.printC();
	}
}