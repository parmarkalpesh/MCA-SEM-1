interface C
{
public String toString();
}

class R
{

public static C getC()
	{
	return new C()
		{
		public String toString()
			{
			return "From Annonymous Class";
			}
		};
	}

public static void main(String args[])
	{
	 System.out.println(R.getC());
	}
}