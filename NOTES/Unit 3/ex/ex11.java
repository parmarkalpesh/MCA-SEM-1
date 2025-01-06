class Room
{
	int l,w;
	Room(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	int area()
	{
		return (l*w);
	}
}
class BedRoom extends Room
{
	int h;
	BedRoom(int x,int y,int z)
	{
		super(x,y);
		h=z;
	}
	int volume()
	{
		return(l*w*h);
	}
}
class ex11
{
	public static void main(String args[])
	{
		BedRoom r1=new BedRoom(14,12,10);
		int a1=r1.area();
		int v1=r1.volume();
		System.out.println("Area= " +a1);
		System.out.println("Volume = "+v1);
	}
}