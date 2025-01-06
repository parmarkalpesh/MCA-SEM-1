import java.util.*;
class IteratorDemo
{
	public static void main(String []args)
	{
		Collection c = new ArrayList();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		System.out.println(c);
		Iterator i = c.iterator();

		while(i.hasNext())
		{
			Object o = i.next();
			if(o==(Integer)40)
				i.remove();
			else
				System.out.println(o);	
		}
		System.out.println(c);
	}
}





