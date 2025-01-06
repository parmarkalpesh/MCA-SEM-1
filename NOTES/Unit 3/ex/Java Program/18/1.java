import java.io.*;
import java.util.*;
/*
class A implements Runnable
{
int i;
	A()
	{
	i=50;
	}

	A(int i)
	{
	this.i=i;	
	}

	public String toString()
	{
	return "i = "+i;
	}
	
	public void run()
	{
	int sum=0;
	for(int j=0;j<i;j++)
		{
		sum+=j;
		}
	
	System.out.println("SUM = "+sum);
	//Thread t = new Thread(this);
	//t.start();
	}
}
class TestDemo
{
	public static void main(String []args) throws Exception
	{
		A a = new A();
		System.out.println(a);
		a.run();
	}
}
*/
class CurrentThreadDemo 
{
	public static void main(String args[]) 
	{
	Thread t = Thread.currentThread();
	System.out.println("Current thread: " + t);
	
	t.setName("NewThread");
	System.out.println("After name change: " + t);
	try 
	{
		for(int n = 5; n > 0; n--) 
		{
		System.out.println(n);
		Thread.sleep(1000);
		}
	} 
	catch (InterruptedException e) 
	{
		System.out.println("Main thread interrupted");
	}
}
}