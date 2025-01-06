class abc
{
	int x;
	abc(int x)
	{
		this.x=x;
	}
        void display()
	{
		System.out.println("Output From Base Class x = "+x);
	}
}
class xyz extends abc
{
	int y;
	xyz(int x,int y)
	{
		super(x);
		this.y=y;
	}
	void display()
	{
		System.out.println("Output From Derived Class x = "+x+" y = "+y);
	}
}
class ex12
{
	public static void main(String args[])
	{
		xyz p1=new xyz(100,200);
		p1.display();
        }
}
