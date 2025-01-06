
/*
	OutputStreamWriter - Bridge between OutputStream and Writer
*/

import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{
		OutputStream o = new FileOutputStream(args[0]);
		OutputStreamWriter ow = new OutputStreamWriter(o);		

		ow.write("This should be written to file");
		ow.append("Hello");
		ow.close();
	}
}