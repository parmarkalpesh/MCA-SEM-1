import java.io.*;
import java.util.Date;
class TestDemo
{
	public static void main(String []args)
	{
		File f = new File(args[0]);
		if(f.isDirectory())
		{
			String name[] = f.list();
			for(String n : name)
				System.out.println(n);
		}
	}
}



