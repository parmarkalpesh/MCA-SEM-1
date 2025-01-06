class Cal
{
public static void main( String args[])
	{
        int i=0,n=0;
	n=Integer.parseInt(args[0]);
        
        String str[] = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
	
	int []arr;
        arr=new int[10];

        System.out.print(n + " : ");

	for(i=0;n>0;i++)
	  {
	  arr[i]=n%10;
	  n = n/10;
	  }
        
        for(i=i-1; i >=0; i --)
          {
           System.out.print(str[arr[i]]+ " ");
	  }
	}
}