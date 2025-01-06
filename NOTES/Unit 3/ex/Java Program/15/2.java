
/*
Writer
======
void write(int b)
void write(char[])
void write(char[],int pos,int len)
void write(str)
void write(str,int pos,int len)
void append(charsequence c)

flush()
close()
*/

import java.io.*;
class Test
{
	public static void main(String []args) throws Exception
	{
		char c[] = {'j','a','v','a'};
		Writer w = new FileWriter(args[0]);
		w.write(65);
		w.write(c);
		w.write("Java is interesting");
		w.append("\n It is amazing");
		w.close();
	}
}