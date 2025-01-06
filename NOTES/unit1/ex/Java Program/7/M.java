package p;

class N
{
	int j;
	private int k;
	protected int l;

	N()
	{
	j=10;
	k=15;
	l=20;
	}
	int getK()
	{
	return k;
	}
}

public class M extends N
{
	public static int iVal=5;
	public int getJ()
		{
		return new N().j;
		}
	public int getK()
		{
		return new N().getK();
		}
	public int getL()
		{
		return new N().l;
		}
}