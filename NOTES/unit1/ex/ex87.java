import java.io.*;

class ex87
{
	public static void main(String args[])
	{
		try
		{
			PrintWriter pw = new PrintWriter(System.out);
			pw.println(true);
			pw.println('A');
			pw.println(500);
			pw.println(40000L);
			pw.println(45.67f);
			pw.println("Hello");
			pw.println(new Integer("99"));

			pw.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception " + e);
		}
	}
}
