/*
InputStream

	int read() - it returns value in range of 0 to 255 and -1 at EOF
*/


import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{
		InputStream in = new FileInputStream(args[0]);
		OutputStream o = new FileOutputStream(args[1]);
		int i;
		while((i=in.read())!=-1)
		{
			System.out.print((char)i);
			o.write(i);
		}
	}
}