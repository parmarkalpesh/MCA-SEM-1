import java.io.*;
class ex85
{
	public static void main(String args[])
	{
		try
		{
			FileReader fr=new FileReader(args[0]);
			BufferedReader br=new BufferedReader(fr);
			String s;
			while((s=br.readLine())!=null)
			{
				System.out.print(s);
			}
			br.close();
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
	}
}