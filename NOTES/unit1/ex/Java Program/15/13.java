import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		CharArrayWriter cw = new CharArrayWriter();
		String str;
		while(!(str=br.readLine()).equals("."))
		{
			cw.write(str+"\n");
		}
		System.out.println(cw);

		FileWriter fw = new FileWriter(args[0]);
		cw.writeTo(fw);
		fw.close();
		
	}
}