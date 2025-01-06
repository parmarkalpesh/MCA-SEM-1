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
		String str = "Java is interesting dear";
		//InputStream bi = new ByteArrayInputStream(str.getBytes());
		InputStream bi = new FileInputStream(args[0]);
		System.out.print((char)bi.read());
		System.out.print((char)bi.read());
		System.out.print((char)bi.read());
		System.out.print((char)bi.read());
		System.out.print((char)bi.read());
		bi.mark(6);
		System.out.println((char)bi.read());
		if(bi.markSupported())
			bi.reset();
		System.out.print((char)bi.read());
		System.out.print((char)bi.read());
		System.out.println((char)bi.read());

		
	}
}






