class A
{
static int i=50;
}

class B extends A
{
int i=100;
int getI()
	{ 
          return super.i;
	}

}

class C extends B
{
 int i=150;
 C(int i)
 {
   System.out.println(" i = " + i);
   System.out.println(" This i = " + this.i);
   System.out.println(" Super i = " + super.i);
   System.out.println(" Super i = " + getI());
   System.out.println(" Super i = " + A.i);
 }
}

class TestDemo
{
public static void main(String []args)
	{
	C b=new C(200);
	}
}