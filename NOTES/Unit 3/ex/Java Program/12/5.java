import java.util.*;
import java.lang.*;
class B
{
public static void main(String[] args)
	{

	
	ArrayList<String> d = new ArrayList<String>();
    	
    	d.add("Kapil");
    	d.add("Gardi");
    	d.add("4");
	d.add("5");
	
	String s[]= new String[d.size()];
	s= d.toArray(s);
	for(String a:s)
		System.out.println(a);
	
	}
}