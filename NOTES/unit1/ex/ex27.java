class Account
{
	private int balance=0;
	synchronized void deposit(int amount)
	{
		balance=balance+amount;
	}
	int getBalance()
	{
		return balance;
	}
}
class Customer extends Thread
{
	Account acc;
	Customer(Account acc)
	{
		this.acc=acc;
	}
	public void run()
	{
		try
		{
			for(int i=0;i<100000;i++)
			{
				acc.deposit(10);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class ex27
{
	private final static int NUMCUST=10;
	public static void main(String args[])
	{
		Account act = new Account();
		Customer cst[] = new Customer[NUMCUST];
		for(int i=0;i<NUMCUST;i++)
		{
			cst[i]=new Customer(act);
			cst[i].start();
		}
		for(int i=0;i<NUMCUST;i++)
		{
			try
			{
				cst[i].join();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(act.getBalance());

	}
}