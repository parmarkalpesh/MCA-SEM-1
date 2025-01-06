interface i1
{
	class A
	{
		static int i = 50;
		A()
		{
			System.out.println(i);
		}
	}
	class B extends A{}
}

class i3 extends i1.A
{
	static class A
	{
		static int i = 50;
		A()
		{
			System.out.println(i);
		}
	}
}
interface i2
{
}
class Bapa
{
int j;
}

class Tikona extends Bapa implements i1,i2
{

  public static void main(String[] args) 
{
    Integer i = new Integer(10);
    Tikona t1=new Tikona();
    Bapa b=new Bapa();
    Class c = t1.getClass();
    Class d = b.getClass();
    Class e[]=c.getInterfaces();
    System.out.println(t1.getClass().getName() );
    System.out.println(d.getName());
    System.out.println(e[0].getName());
    System.out.println(e[1].getName());
    System.out.println(c.getSuperclass().getName());

	System.out.println(t1.getClass().getSuperclass().getName());

	System.out.println(i1.A.i=100);
  }

	
}
           
 




        