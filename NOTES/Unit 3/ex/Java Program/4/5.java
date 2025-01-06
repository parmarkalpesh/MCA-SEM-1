class Test
{
static int i=0;
int p=100;

{
p++;
i++;
}

static
{

}

Test()
{
//System.out.print("i = "+i+"  ");
System.out.println(" Object Created " + i);
}

protected void finalize()
	{
	System.out.println("Object Deallocated "+i);
	i--;
	}

}

class TestDemo
{
public static void main(String s[])
	{
	
	//Test t[] = new Test[5];
	//for(int a=0;a<5;a++)
	//	t[a]=new Test();
	
	Test t1= new Test();
	Test t2=new Test();
	//t1=null;
	t2=t1;
	t1=null;	
	System.gc();
	}
}




