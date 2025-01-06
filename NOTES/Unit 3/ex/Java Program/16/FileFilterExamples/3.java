import java.io.*;
import java.util.Date;
class TestDemo
{
	public static void main(String []args)
	{
		File f = new File(args[0]);
		if(f.isDirectory())
		{
		File name[] = f.listFiles(new FilenameFilter()
		{
			public boolean accept(File path,String name)
			{
				File f1 = new File(path,name);
				//return f1.isHidden();
				return name.endsWith(".java");
			}
		});
		for(File n : name)
		{		
			System.out.println(n.getName()+" "+n.length()+" "+n.isHidden());
		}
		}
	}
}



