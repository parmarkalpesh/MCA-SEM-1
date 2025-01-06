import java.io.*;
class OutputStreamWriterDemo
{
	public static void main(String []args) throws Exception
	{
	String str="MCA-3 is interesting class....";
	Writer w = new OutputStreamWriter(new FileOutputStream(args[0]));	
	w.write(str);
	w.flush();
	w.close();	
	}
}



