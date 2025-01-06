import java.io.*;
class TestDemo
{
	public static void main(String []args) throws Exception
	{
	LineNumberReader br = new LineNumberReader(new 
		InputStreamReader(new FileInputStream(args[0])));
	String str;
	while((str = br.readLine())!=null)
		System.out.println(br.getLineNumber()+" : "+str);	
	}
}