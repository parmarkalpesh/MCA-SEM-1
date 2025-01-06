import java.io.*;
class TestDemo
{
	public static void main(String []args) throws Exception
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	CharArrayWriter ca= new CharArrayWriter();
	String str;
	while(!(str=br.readLine()).equals("."))
		ca.write(str.toCharArray());

	System.out.println(ca);
	FileWriter f = new FileWriter(args[0]);
	ca.writeTo(f);
	f.close();
	}
}




