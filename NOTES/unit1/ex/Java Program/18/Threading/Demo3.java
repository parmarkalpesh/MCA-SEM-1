import java.util.*;
class Student extends Thread
{
	Student()
	{
		super("Student Thread");
		start();
	}
	public void run()
	{
		while(true)
		{
			Date d = new Date();
			System.out.println(d);
			try{
			Thread.sleep(1000);
			}catch(InterruptedException e){}
		}
	}
}
class TestDemo
{
	public static void main(String []args) throws Exception
	{
		Student s = new Student();
		while(true){
			Thread.sleep(5000);
			System.out.println("Java is Interesting");
		}		
	}
}




