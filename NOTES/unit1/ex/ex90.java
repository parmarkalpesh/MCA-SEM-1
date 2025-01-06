import java.io.*;
class ex90
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fos=new FileOutputStream(args[0]);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			for(int i=0;i<12;i++)
			{
				bos.write(i);
			}
			bos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}