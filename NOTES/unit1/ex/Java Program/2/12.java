import java.io.*;



class Txt
{
public static void main(String args[]) throws Exception
	{
		Thread.sleep(2000);
		
		File f = File.createTempFile("kapil",".doc",new File("e:/java"));
		Thread.sleep(3000);
		f.deleteOnExit();
		
	}
}