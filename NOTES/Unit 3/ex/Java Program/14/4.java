import java.io.*;
import java.util.Date;
class T3
{
public static void main(String args[]) throws Exception
	{
	File f1=new File("12");
	Thread.sleep(2000);
	f1.mkdir();
	System.out.println(" Directory named 12 is created");
	Thread.sleep(2000);
	File f2=new File("18");
	f1.renameTo(f2);
	System.out.println(" Directory named 12 is renamed 18");
	Thread.sleep(2000);
	f2.delete();
	System.out.println(" Directory named 18 is deleted");
	}
}
