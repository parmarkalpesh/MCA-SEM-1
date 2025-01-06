import java.io.*;
class DataInputStreamDemo
{
	public static void main(String []args) throws Exception
	{
	DataInputStream d = new DataInputStream(new FileInputStream(args[0]));
	String str;
	while((str = d.readLine())!=null)
		System.out.println(str);
	}
}