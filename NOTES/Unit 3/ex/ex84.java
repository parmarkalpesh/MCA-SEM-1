import java.io.*;
class ex84
{
	public static void main(String args[])
	{
		try
		{
			FileWriter fw=new FileWriter(args[0]);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<12;i++)
			{
				bw.write("Line no = "+i+"\n");
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
	}
}