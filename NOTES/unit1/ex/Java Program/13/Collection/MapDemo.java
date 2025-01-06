import java.util.*;

class Test
{
	public static void main(String []args)
	{
		Map<Integer,String> m = new TreeMap<Integer,String>();
		m.put(1,"Gardi");
		m.put(2,"MCA");
		m.put(-2,"Batch");
		m.put(-3,"GTU");
		m.put(-3,"JAVA");
		m.put(0,"0");
		System.out.println(m);

		Set s = m.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
	}
}





