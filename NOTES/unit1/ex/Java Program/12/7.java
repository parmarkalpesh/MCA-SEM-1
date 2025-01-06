import java.util.*;

class D
{
public static void main(String[] args)
	{

	List l = new ArrayList();
	ListIterator li;
	l.add(0,"gardi");
	l.add(1,"Kapil");
	l.add(2,"mca");
	l.add(2014);
	l.add("mca");
	System.out.println(l);
	System.out.println("====================================");
	li = l.listIterator();
	while(li.hasNext())
		{
		Object o = li.next();
		System.out.println(l.indexOf(o) + " : " + o);
		}
	System.out.println("====================================");
	System.out.println(" List Element Kapil is replaced by shukla :");
	l.set(l.indexOf("Kapil"),"shukla");
	System.out.println(l);
	
	System.out.println("====================================");
	System.out.println(" Last index of mca : "+ l.lastIndexOf("mca"));
	}
}