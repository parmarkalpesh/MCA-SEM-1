/*
InputStream

	int read() - it returns value in range of 0 to 255 and -1 at EOF
	int read(byte[])
	int read(byte[],int pos,int len)
 
	int available() - it returns no of bytes that are remaining for reading
	skip(long l)
	void mark(int readLimit)
	void reset()
	boolean markSupported();
*/


import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{
		InputStream in = new FileInputStream(args[0]);
		in.skip(100);
		byte b[] = new byte[in.available()];
		in.read(b);
		if(in.markSupported())
			in.reset();
		System.out.println(new String(b));
	}
}