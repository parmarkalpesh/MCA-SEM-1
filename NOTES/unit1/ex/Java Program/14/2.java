import java.io.*;
import java.util.Date;
class T1
{
public static void main(String args[])
	{
	
	File f1=new File("../12");
	String[] a = f1.list(new FilenameFilter()
		{
			public boolean accept(File path,String name)
				{
					return (name.endsWith(".class") || name.endsWith(".java"));
				}
		});
	for(String s1:a)
		System.out.println(s1);
	
	}
}
