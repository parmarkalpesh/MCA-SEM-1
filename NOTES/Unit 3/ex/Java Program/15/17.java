import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{	
		FileOutputStream fo = new FileOutputStream(args[0],true);
		byte b[] = {65,66,67,68};
		fo.write(b);
		
	}
}