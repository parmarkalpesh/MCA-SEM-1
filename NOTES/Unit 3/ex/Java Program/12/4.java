import java.util.*;
class B
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

	Iterator itr = c.iterator(); 
	while(itr.hasNext()) 
	{
		System.out.println("Element : " +itr.next());
		

	} 
	
	}
}