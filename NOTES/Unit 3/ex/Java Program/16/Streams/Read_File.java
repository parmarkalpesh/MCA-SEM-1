import java.io.*;
class TestDemo
{
	public static void main(String []args) throws Exception
	{
		File f = new File(args[0]);
		InputStream i = new FileInputStream(f);
		while(i.available()>0)
			System.out.print((char)i.read());
		System.out.println("\n"+i.available()+" "+f.length());

		/*
		2nd Way to read Content
		File f = new File(args[0]);
		InputStream i = new FileInputStream(f);
		int ch;
		while((ch=i.read())!=-1)
			System.out.print((char)ch);
		System.out.println("\n"+i.available()+" "+f.length());*/

		/*
		3rd Way to Read
		InputStream i = new FileInputStream(args[0]);
		byte []buf = new byte[i.available()];
		i.read(buf);
		System.out.println(new String(buf));
		*/

		
	}
}