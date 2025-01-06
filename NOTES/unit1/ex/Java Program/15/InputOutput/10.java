import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{
		LineNumberReader br = new LineNumberReader(new FileReader(args[0]));
		String str;
		while((str=br.readLine())!=null)
			System.out.println(br.getLineNumber()+" : "+str);
		
	}
}