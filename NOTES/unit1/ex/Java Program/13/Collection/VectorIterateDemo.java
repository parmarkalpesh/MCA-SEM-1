import java.util.*;

class TestDemo
{
	public static void main(String []args)
	{
		Vector v = new Vector(3,0);
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		System.out.println(v);
		//1st Way
		System.out.println("1st Way to iterate");
		Iterator i = v.iterator();
		while(i.hasNext())
			System.out.println(i.next());		
	
		System.out.println("2nd Way to iterate");
		//2nd way
		ListIterator li = v.listIterator();
		while(li.hasNext())
			System.out.println(li.next());

		//3rd Way
		System.out.println("3rd Way to iterate");
		Object oa[] = v.toArray();
		for(Object o:oa)
			System.out.println(o);

		//4th Way to iterate
		System.out.println("4th Way to iterate");
		for(int i1=0;i1<v.size();i1++)
			System.out.println(v.get(i1));
		
		//5th Way to iterate
		System.out.println("5th Way to iterate");
		Enumeration e = v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
	}
}










