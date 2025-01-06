import p.B;

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