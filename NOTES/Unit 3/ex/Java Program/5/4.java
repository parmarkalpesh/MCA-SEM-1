class X
{
int i;
X(int i)
{
this.i=i;
System.out.println("Object Cteated With Value "+i);
}

int getI()
	{
	return i;
	}
}

class Y extends X
{
int i,j;

Y(int i,int j)
	{
	super(i+5);
	this.i=i+5; this.j=j+5;
	System.out.println("Object Cteated With Value "+i+" and "+j);
	}

int getI()
	{
	return this.i;
	}

int getJ()
	{
	return this.j;
	}
}

class Z extends Y
{
int i,j,k;

Z(int i,int j, int k)
{
super(i+5,j+5);
this.i=i; this.j=j; this.k=k;
System.out.println("Object Cteated With Value "+i+" and "+j+" and "+k);
}

int getI()
	{
	return this.i;
	}
int getJ()
	{
	return this.j;
	}
int getK()
	{
	return this.k;
	}
}

class TestDemo
{
public static void main(String s[])
	{
	//Y y=new Y(3,4);
	Z y=new Z(3,4,5);
	System.out.println(" i = "+y.getI()+" j = "+y.getJ()+" k = "+y.getK());
	System.out.println(" i = "+((X)y).getI()+" j = "+((Y)y).getJ());
	}
}