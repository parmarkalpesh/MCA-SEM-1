import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str;
		while(!(str=br.readLine()).equals("."))
			System.out.println(str);
		
	}
}