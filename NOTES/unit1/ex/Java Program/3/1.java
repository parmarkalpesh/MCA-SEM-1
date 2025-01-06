class B1
{
	public static void main(String args[])
	{
	String text="gardi mca gtu   sooadm    java";
	String s1="";
	int k2,k1,i=0,j=0;
	k2=k1=text.length()-1;
	for(i=k2;i>=0;i--,k1--)
	{
	  if(text.charAt(i)==' ' || i==0)
		{
		 
		 for(j=(i==0)?0:i+1;j<=k2;j++)
			{
			s1=s1+text.charAt(j);
			}
		s1=s1+' ';
		k2=k1-1;
		}
		
	}
	System.out.println(s1);
	}
}