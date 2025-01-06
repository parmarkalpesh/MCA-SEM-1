import java.io.*;
import java.util.Date;
class T2
{
public static void main(String args[])
	{
	File f1=new File("../12");
	File[] a = f1.listFiles(new FileFilter()
		{
			public boolean accept(File path)
				{
				 	Date d1=new Date(114,10,11);
					return (path.lastModified() > d1.getTime());
				}
		});
	for(File s1:a)
		System.out.println(s1.getName());
	
	}
}
