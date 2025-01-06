import java.util.*;
class A
{
public static void main(String[] args)
	{

	Collection c = new ArrayList();

    	c.add("1");
    	c.add("Kapil");
    	c.add("5");
    	c.add("Parag");
    	c.add("4");
	c.add("5");
	System.out.println("Collection Size : "+c.size());
	System.out.println("Collection Value : "+c);

	c.remove("5");
	System.out.println("Collection Size : "+c.size());
	System.out.println("Collection Value : "+c);
	
	c.remove("5");
	System.out.println("Collection Size : "+c.size());
	System.out.println("Collection Value : "+c);

	c.clear();
	System.out.println("Collection Size : "+c.size());
	System.out.println("Collection Value : "+c);
	System.out.println(" Is Collection Empty ? : "+c.isEmpty());

	c.add("1");
    	c.add("Kapil");
    	c.add(5);
	c.add("5");
	System.out.println("Collection Size : "+c.size());
	System.out.println("Collection Value : "+c);
	
	if(c.contains(5))
		c.remove(5);
	System.out.println("Collection Size : "+c.size());
	System.out.println("Collection Value : "+c);

	System.out.println(" Is Collection Empty ? : "+c.isEmpty());

	}
}