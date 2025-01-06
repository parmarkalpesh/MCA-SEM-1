import java.io.*;
import java.util.Date;
class TestDemo
{
	public static void main(String []args)
	{
		File f = new File(args[0]);
		if(f.isDirectory())
		{
		File name[] = f.listFiles(new FileFilter()
		{
			public boolean accept(File f1)
			{			
				return f1.length()>2048;
				//return f1.getName().endsWith(".java");
			}
		});
		for(File n : name)
		{		
			System.out.println(n.getName()+" "+n.length()+" "+n.isHidden());
		}
		}
	}
}



