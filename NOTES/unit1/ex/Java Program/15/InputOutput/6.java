/*
InputStream

	int read() - it returns value in range of 0 to 255 and -1 at EOF
	int read(byte[])
 
	int available() - it returns no of bytes that are remaining for reading
*/


import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{
		InputStream in = new FileInputStream(args[0]);
		byte b[] = new byte[in.available()];
		in.read(b);
		System.out.println(new String(b));
	}
}