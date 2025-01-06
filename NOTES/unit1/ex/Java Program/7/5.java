class D
{
int i;
D(int i)
{
this.i=i;
}
	public static void main(String[] args) 
	{
    	D d1=new D(10);
	D d2=new D(10);
	System.out.println(d1==d2);
	System.out.println(d1.equals(d2));
	}
}
           
         