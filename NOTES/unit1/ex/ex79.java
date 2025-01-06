public class ex79 
{
	public static void main(String[] args) 
	{
                ThreadGroup grp = new ThreadGroup("group1");
		ThreadGroup grp1 = new ThreadGroup("group 2");
                mythread m1 = new mythread(grp, "thread1");
                mythread m2 = new mythread(grp1, "thread2");
                mythread m3 = new mythread(grp, "thread3");
                m1.start();
                m2.start();
                m3.start();
        }
}
class mythread extends Thread 
{
        public mythread(ThreadGroup g, String s) 
	{
                super(g, s);
        }
        public void run() 
	{
                System.out.println("Thread name, prority, thread group " + Thread.currentThread());
        }
}

