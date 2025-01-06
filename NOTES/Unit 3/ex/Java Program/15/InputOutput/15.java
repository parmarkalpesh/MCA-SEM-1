import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{	
		PipedInputStream i1=new PipedInputStream();
		PipedOutputStream o1=new PipedOutputStream();
		o1.connect(i1);
		o1.write(65);
		System.out.println((char)i1.read());
		
	}
}