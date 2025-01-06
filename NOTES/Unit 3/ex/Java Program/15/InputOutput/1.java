
/*void write(int b)
void write(byte[])
void write(byte[],int pos,int len)

flush()
close()
*/

import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{
		byte b[] = {97,98,99};
		OutputStream o = new FileOutputStream(args[0]);
		o.write(65);
		o.write(66);
		o.write(b);
		o.write("\nHello All How r you".getBytes());
		o.write("Kapil K Shukla".getBytes(),5,5);
		o.flush();
		o.close();

	}
}