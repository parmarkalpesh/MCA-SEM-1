import java.io.*;
class InputStreamDemo
{
	public static void main(String []args) throws Exception
	{
		InputStream i = new FileInputStream(args[0]);
		byte []buf = new byte[i.available()];
		i.read(buf);
		System.out.println(new String(buf));
		
		/*
		System.out.println((char)i.read());
		i.skip(10);
		i.read(buf);
		for(byte b : buf)
		        System.out.print((char)b);*/
		
	}
}










