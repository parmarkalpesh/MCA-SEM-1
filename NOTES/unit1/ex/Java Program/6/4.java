class Test
{
	public static void main(String args[])
	{
		int a[][][]=new int[5][3][3];		
		int cnt=1,cnt1=9;		

		for(int i=0;i<3;i++)
				for(int j=0;j<3;j++,cnt++,cnt1--)
				{
					a[0][i][j]=cnt;
					a[1][i][j]=cnt1;
				}
		for(int i=0;i<3;i++)
				for(int j=0;j<3;j++,cnt++,cnt1--)
				{
					a[2][i][j]=a[0][i][j]+a[1][i][j];
					a[3][i][j]=a[0][i][j]-a[1][i][j];
				}			

		for(int k=0;k<a.length;k++)
		{
			for(int i=0;i<a[k].length;i++)
			{
				for(int j=0;j<a[k][i].length;j++)
					System.out.print(a[k][i][j]+" ");
				System.out.println();
			}
				System.out.println();
		}
			
	}
}