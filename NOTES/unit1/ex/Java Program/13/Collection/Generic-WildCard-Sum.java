import java.util.*;
class TestDemo
{
	public static void printCollection(Collection<? extends Number> c)
	{	
		double sum=0;
		for(Object o : c)
		{		
			sum += ((Number)o).doubleValue();
			System.out.println(o);
		}
		System.out.println(sum);
	}
	public static void main(String []args)
	{
		Collection<Number> c= new ArrayList<Number>();
		c.add(10l);	
		c.add(20.2);
		c.add(30.3);
		c.add(40);
		TestDemo.printCollection(c);
	}
}