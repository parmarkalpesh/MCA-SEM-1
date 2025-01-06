import java.util.*;
class TestDemo
{
	public static void main(String []args)
	{
	List l = new ArrayList();
	l.add(10);	
	l.add(20);
	l.add(0,5);
	l.add(30);
	l.add(2,15);
	l.add(40);
	l.add(6,45);
	l.add(40);

	List l1 = l.subList(2,6);
	//1st Way
	for(Object o : l)
		System.out.print(o+" ");
	System.out.println("");	

	// 2nd Way
	Iterator i = l.iterator();
	while(i.hasNext())
	   System.out.print(i.next()+" ");	
	System.out.println();

	//3rd Way
	ListIterator li = l.listIterator();
	while(li.hasNext())
	   System.out.print(li.next()+" ");	

	System.out.println("\nNow Backwards");
	while(li.hasPrevious())
		System.out.print(li.previous()+" ");

	System.out.println("");

	//4th Way
	for(int i1=l.size()-1;i1>=0;i1--)
		System.out.print(l.get(i1)+" ");
	System.out.println("");	

	//5th Way
	Object obj[]=l.toArray();
	for(Object o : obj)
		System.out.print(o+" ");
	System.out.println("");	


	}
}









