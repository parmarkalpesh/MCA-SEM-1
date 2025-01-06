import java.io.*;
import java.util.Date;
class T4
{
public static void main(String args[]) throws Exception
	{
	File f1=new File("../12");
	Thread.sleep(1000);
	
	System.out.println(f1.getName());
	File []f = f1.listFiles(new FileFilter()
	{
		public boolean accept(File f)
			{
				return f.length()>1024;
			}
	});
	for(File f2:f)
		System.out.println(f2.getName() + " - " + new Date(f2.lastModified()));
	}
}
