import java.io.*;
class OutputStreamDemo
{
	public static void main(String []args) throws Exception
	{
	byte[]b = {65,66,67,68,69,70};
	String str = "\nAtmiya MCA-3 is interesting ..";
	OutputStream o = new FileOutputStream(args[0]);
	o.write(100);
	o.write(b);
	o.write(str.getBytes());
	o.write(str.getBytes(),3,5);
	o.flush();
	o.close();
	}	
}





