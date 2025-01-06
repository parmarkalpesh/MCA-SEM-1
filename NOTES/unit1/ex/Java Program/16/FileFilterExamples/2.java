import java.io.*;
import java.util.Date;
class TestDemo
{
	public static void main(String []args)
	{
		File f = new File(args[0]);
		if(f.isDirectory())
		{
		File name[] = f.listFiles();
		for(File n : name)
		{		
			System.out.println(n.getName()+" "+n.length()+" "+n.isHidden());
		}
		}
	}
}



