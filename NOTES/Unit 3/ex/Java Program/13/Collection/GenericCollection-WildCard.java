import java.util.*;
class TestDemo
{
	public static void printCollection(Collection<? extends Number> c)
	{
		for(Object o : c)
			System.out.println(o);	
	}
	public static void main(String []args)
	{
		Collection<Number> c = new ArrayList();
		c.add(10l);
		c.add(20.2);
		c.add(30.3f);
		c.add(40);
		TestDemo.printCollection(c);
	}
}





