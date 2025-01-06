import java.util.*;
class A
{
	@Deprecated
	void display()
	{
	}
}
class Test
{
	
	public String toString()
	{
		return "";
	}
	
	public static void main(String []args)
	{
		new A().display();
		ArrayList a = new ArrayList();
		a.add("Ram");
		a.add(123);
		a.add(3.14f);
	}
}