import java.io.*;
class ex83
{
	public static void main(String args[])
	{
		try
		{
			FileWriter fw=new FileWriter(args[0]);
			for(int i=0;i<12;i++)
			{
				fw.write("Line no = "+i+"\n");
			}
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
	}
}