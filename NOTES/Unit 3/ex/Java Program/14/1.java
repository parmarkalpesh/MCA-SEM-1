import java.io.*;
import java.util.Date;
class T
{
public static void main(String args[])
	{
	//File f1=new File("../12/1.java");
	File f1=new File("1.java");
	System.out.println("getName() : " + f1.getName());
	System.out.println("getAbsolutePath() : " + f1.getAbsolutePath());
	System.out.println("isDirectory() : " + f1.isDirectory());
	System.out.println("isFile() : " + f1.isFile());
	System.out.println("canRead() : " + f1.canRead());
	System.out.println("canWrite() : " + f1.canWrite());
	System.out.println("canExecute() : " + f1.canExecute());
	System.out.println("lastModified() : " + new Date(f1.lastModified()));
	}
}
