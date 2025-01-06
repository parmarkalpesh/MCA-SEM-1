import java.io.*;
class ex91
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis=new FileInputStream(args[0]);
			BufferedInputStream bis=new BufferedInputStream(fis);
			int i;
			while((i=bis.read())!=-1)
			{
				System.out.println(i);
			}
			bis.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}