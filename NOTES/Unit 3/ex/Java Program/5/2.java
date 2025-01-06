
class E
{
int i;

static int cnt=0;
{
cnt++;
}

E()
{
i=cnt;
System.out.println("Object - "+cnt+" Created");
}

/*protected void runFinalization()
{
System.out.println("Object - "+cnt+" Deleted");
cnt--;
}*/
protected void finalize()
{
System.out.println("Object - "+cnt+" Deleted");
cnt--;
}  

public static void main(String s[])
	{
	
		E e1 = new E();
		E e2 = new E();
		
		e1=null;
		e2=null;
	System.out.println("Test1"); 	
		System.gc();
	
		System.out.println("Test2"); 
	}
}