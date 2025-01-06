import java.io.*;
class WriteDemo
{
	public static void main(String []args) throws Exception
	{
		String str = "\nJava is very Interestring subject";
		Writer w = new FileWriter(args[0]);
		w.write('A');
		w.write(str.toCharArray());
		w.write('\n');
		w.write(str.toCharArray(),3,8);
		w.write(str);
		w.flush(); // it ensures persistency
		w.close(); // it is used to free resource
	}
}



