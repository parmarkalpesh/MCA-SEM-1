import java.util.Date;
enum Weekdays
{
	Sunday("Ravivar"),Monday("Somvar"),Tuesday("Mangalvar"),Wed("Budhvar");
	private String des;
	Weekdays(String des)
	{
		this.des=des;
	}
	String getDes()
	{
		return des;
	}
}
class TestDemo
{
	public static void main(String []args) throws Exception
	{
		Weekdays ma[] = Weekdays.values();
		for(Weekdays m : ma)
			System.out.printf("%-12s%-12s\n",m.name(),m.getDes());	
	}
}