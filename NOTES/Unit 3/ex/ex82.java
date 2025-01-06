import java.io.*;
class ex82
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr=new FileReader(args[0]);
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
	}
}