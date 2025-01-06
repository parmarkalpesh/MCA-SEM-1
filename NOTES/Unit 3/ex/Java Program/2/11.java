import java.io.*;


class Txt
{
public static void main(String args[]) throws Exception
	{
	PrintStream ps = new PrintStream(System.out);
	ps.println("This Will print on Screen");
	//ps = new PrintStream(args.length==0?"tmp.doc":args[0]);
	//ps.println("This Will print in File");
	}
}