class Student extends Thread
{
	Student()
	{
		super("Student Thread");
		System.out.println(Thread.currentThread());
		System.out.println(isAlive());
		this.setDaemon(false);
		System.out.println(isDaemon());
		start();
	}
	public void run()
	{
		System.out.println("Now thread is : "+isAlive());
		System.out.println(Thread.currentThread());
		System.out.println(isDaemon());
	}
}
class TestDemo
{
	public static void main(String []args)
	{
		Student s = new Student();
	}
}