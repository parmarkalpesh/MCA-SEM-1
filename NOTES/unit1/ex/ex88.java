import java.io.*;
class ex88
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fos=new FileOutputStream(args[0]);
			for(int i=0;i<12;i++)
			{
				fos.write(i);
			}
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}