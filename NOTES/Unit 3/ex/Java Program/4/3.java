class D
{
 int no=0;
	D(int i)	
	{
	no=i;
	}
int getNo(D d3)
	{
	//int no=50;
	return this.no + d3.no ;
	}
}



class Test
{
public static void main(String s[])
	{
	D d1=new D(5);
	D d2=new D(10);
	System.out.println(d1.getNo(d2));
	}
}