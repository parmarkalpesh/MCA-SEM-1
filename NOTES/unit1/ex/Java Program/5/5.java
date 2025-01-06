class Y
{
public static void printMat(int a[][])
	{
	System.out.println(a.length + " " + a[0].length);
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
		System.out.print(a[i][j]);
		}
	System.out.println("");
	}
	}
public static void main(String s[])
	{
	int a[][] = new int[3][4];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		a[i][j]=i+j;
		}
	}
	
	printMat(a);
	}
}