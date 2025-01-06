import java.io.*;
import java.util.*;
class TestDemo
{
	public static void main(String []args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		FileWriter fw = new FileWriter("data.doc");
		String str;
		while(!(str=s.nextLine()).equals("."))
			fw.write(str+"\n");
		fw.close();
	}
}