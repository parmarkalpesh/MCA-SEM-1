import java.io.*;
import java.util.*;
class CopyFile
{
	public static void main(String []args) throws Exception
	{	
	InputStream i = new FileInputStream(args[0]);
	byte[] b = new byte[i.available()];
	i.read(b);
	FileWriter f = new FileWriter(args[1]);
	f.write(new String(b));
	f.close();
	}
}