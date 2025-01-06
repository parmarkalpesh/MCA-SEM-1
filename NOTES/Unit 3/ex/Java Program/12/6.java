import java.util.*;

class C
{
public static void main(String[] args)
	{

	Collection c = new ArrayList();
	Collection d = new ArrayList();
    	c.add(1);
	c.add(2);
	c.add(3);
	c.add(4);	
	d.add(1);
	d.add(2);
	d.add(3);
	d.add(4);
	
	System.out.println("Demostration of addAll() Function :");
	System.out.println(" A = "+c);
	System.out.println(" B = "+d);
	System.out.println("After A U B : ");
	c.addAll(d);
	System.out.println(" A = "+c);
	System.out.println(" B = "+d);
	System.out.println("====================================");
	
	}
}