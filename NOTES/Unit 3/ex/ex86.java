import java.io.*;

class ex86
{
	public static void main(String args[])
	{
		try
		{
                        InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.println(s.length());
			}
			isr.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception " + e);
		}
	}
}
