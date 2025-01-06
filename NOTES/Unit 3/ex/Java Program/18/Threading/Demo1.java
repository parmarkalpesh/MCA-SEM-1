class TestDemo
{
	public static void main(String []args)
	{
	Thread t = Thread.currentThread();
	System.out.println(t);
	t.setName("My Thread");
	t.setPriority(Thread.MAX_PRIORITY);
	System.out.println(t.isAlive());
	System.out.println(t.isDaemon());
	}
}