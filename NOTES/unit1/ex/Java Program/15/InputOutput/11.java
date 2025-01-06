import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{	
		InputStreamReader isr = new InputStreamReader(new FileInputStream(args[0]));
		BufferedReader br = new BufferedReader(isr);
		String str;
		while((str=br.readLine())!=null)
			System.out.println(str);
		
	}
}