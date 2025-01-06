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
	public void printB()
	{
	A a =new A();
	System.out.println("Print-B "  + a.j + " " + a.k + " " + a.l);
	}
}

