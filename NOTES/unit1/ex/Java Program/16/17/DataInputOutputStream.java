import java.io.*;
class DataInputOutputStreamDemo
{
	public static void main(String []args) throws Exception
	{		
		DataOutputStream dos = 
		new DataOutputStream(new FileOutputStream(args[0]));
		dos.writeInt(15);
		dos.writeFloat(3.14f);
		dos.close();

		DataInputStream di = new DataInputStream(new FileInputStream(args[0]));
		System.out.println(di.readInt());
		System.out.println(di.readFloat());
	}
}




