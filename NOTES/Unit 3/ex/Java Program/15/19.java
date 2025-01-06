
/*
	OutputStreamWriter - Bridge between OutputStream and Writer
*/

import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{
		InputStream o = new FileInputStream(args[0]);
		InputStreamReader ow = new InputStreamReader(o);		
		char []b=new char[o.available()];
		ow.read(b);
		System.out.println(new String(b));
	}
}