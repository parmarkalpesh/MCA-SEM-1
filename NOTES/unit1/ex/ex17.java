import java.io.*;
class ex17
{
	public static void main(String args[])
	{
		Float p=new Float(0);
		Float r=new Float(0);
		int n=0;

		try
		{
			DataInputStream in=new DataInputStream(System.in);
			System.out.print("Enter Principal Amount = ");
			System.out.flush();
			p=Float.parseFloat(in.readLine());
			System.out.print("Enter Rate Of Interest = ");
			System.out.flush();
			r=Float.parseFloat(in.readLine());
			System.out.print("Enter Number Of Years  = ");
			System.out.flush();
			n=Integer.parseInt(in.readLine());
		}
		catch(IOException e)
		{
			System.out.println("Error Generated");
			System.exit(1);
		}
		float a=si(p,r,n);
		System.out.println("Simple Interest = "+a);
	}
	static float si(float p,float r,int n)
	{
		float x;
		x=(p*r*n)/100;
		return(x);
	}
}