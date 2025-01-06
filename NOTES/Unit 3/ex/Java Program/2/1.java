import java.io.*;

class System
{
public static PrintStream mca = new PrintStream(new OutputStream());
}
class Kapil
{
public static PrintStream shukla = new PrintStream(System.out);
}

class Txt
{
public static void main(String args[])
	{
	Kapil.shukla.println("Hello World");
	Kapil.shukla.println("Hi I am Here");
	}
}