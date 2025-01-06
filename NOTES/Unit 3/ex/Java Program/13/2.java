import java.util.*;
import java.io.*;
class T
{
public static void main(String args[])throws Exception
	{
		Scanner s = new Scanner(new FileInputStream(args[0]));	
		while(s.hasNextLine())
			{
			System.out.println(s.nextLine());
			}
	}
}
