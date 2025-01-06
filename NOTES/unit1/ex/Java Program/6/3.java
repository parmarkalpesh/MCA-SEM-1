class Cube
{
int h;
Cube()
{
h=3;
}
Cube(int w)
{
this.h=w;
}

}
class Rect extends Cube
{
int l,b;
Rect()
{

}
Rect(int i)
{
super(i);
this.l=i;
this.b=i;
}
Rect(int i, int j)
{
super(i);
this.l=i;
this.b=j;
}
Rect(int i, int j,int k)
{
super(k);
this.l=i;
this.b=j;
}

public String toString()
{
 return " Length : "+l+" Breath : "+b;
}

public boolean equals (Object o)
	{
	return ((this.l * this.b)==(((Rect)o).l * ((Rect)o).b));
	}

public static void main(String s[])
	{
	Rect r1 = new Rect(6);
	Rect r2 = new Rect(12,3,6);
	Rect r3 = new Rect(9,4);
	Rect r4 = new Rect(6);

	System.out.println(r1.equals(r2));
	System.out.println(r2.equals(r3));
	System.out.println(r3.equals(r1));
	System.out.println(r1);
	System.out.println(r2+ " " +r3);

	System.out.println(r1.hashCode());
	
	System.out.println(r4.hashCode());
        
	}
}