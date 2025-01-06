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
		boolean flag=true;
		while((i=in.read())!=-1)
		{
			
			if(flag==true)
				{
				flag=false;
				in.skip(2);
				i=in.read();
				}
			if(i==13)
				{
				o.write(i);
				in.skip(4);
				i=in.read();
				}
			o.write(i);
			
		}
	}
}