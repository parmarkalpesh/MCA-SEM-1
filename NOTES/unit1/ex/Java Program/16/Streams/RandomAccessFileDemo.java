import java.io.*;
class TestDemo
{
	public static void main(String []args) throws Exception
	{		
		RandomAccessFile r = new RandomAccessFile(args[0],"r");
		String str;
		r.seek(10);
		System.out.println(r.length());
		System.out.println(r.getFilePointer());
		while((str=r.readLine())!=null)
			System.out.println(str);
		System.out.println(r.getFilePointer());
	}
}