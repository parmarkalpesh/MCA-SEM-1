import java.io.*;
class TestDemo
{
	public static void main(String []args) throws Exception
	{
		PipedReader in = new PipedReader();
		PipedWriter out = new PipedWriter();

		in.connect(out);

		out.write(70);
		out.write(71);

		for(int i=0;i<2;i++)
			System.out.println((char)in.read());
		
	}
}



