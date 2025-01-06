import java.util.*;
class Student
{
	int rno;
	String name;
	Student(int rno,String name)
	{
		this.rno=rno;this.name=name;
	}
	public String toString()
	{
		return rno+" "+name;
	}
}
class Test
{
	public static void main(String []args)
	{
		Collection<Student> c = new ArrayList<Student>();
		Student s1 = new Student(101,"Hare");
		Student s2 = new Student(102,"Ram");
		Student s3 = new Student(103,"Krishn");
		Student s4 = new Student(100,"OM");
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		System.out.println(c);
		Iterator i = c.iterator();
		while(i.hasNext())
			System.out.println(((Student)i.next()).rno);

		ListIterator li = c.listIterator();				
		while(li.hasNext())
			System.out.println(li.next());

		while(li.hasPrevious())
			System.out.println(li.previous());			
	}
}























