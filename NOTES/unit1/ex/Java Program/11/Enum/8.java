enum Mobile
{
	Samsung(400),Apple(500),Nokia(300);
	private int price;
	Mobile(int price)
	{
		this.price=price;
	}
	int getPrice()
	{
		return price;
	}
}
class TestDemo
{
	public static void main(String []args) 
	{
		Mobile ma[] = Mobile.values();
		for(Mobile m : ma)
			System.out.println(m.name()+" "+m.ordinal()+" "+m.getPrice());	
	}
}