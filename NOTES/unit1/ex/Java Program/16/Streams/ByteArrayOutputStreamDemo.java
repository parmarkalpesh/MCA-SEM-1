import java.io.*;
class TestDemo
{
	public static void main(String []args) throws Exception
	{
	BufferedReader br = new 
	BufferedReader(new InputStreamReader(System.in));
	ByteArrayOutputStream bo= new ByteArrayOutputStream();
	String str;
	while(!(str=br.readLine()).equals("."))
		bo.write(str.getBytes());

	bo.writeTo(new FileOutputStream(args[0]));
	}
}




