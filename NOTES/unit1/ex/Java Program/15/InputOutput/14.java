import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		ByteArrayOutputStream cw = new ByteArrayOutputStream();
		String str;
		while(!(str=br.readLine()).equals("."))
		{
			cw.write((str+"\n").getBytes());
		}
		System.out.println(cw);

		cw.writeTo(new FileOutputStream(args[0]));
		
	}
}