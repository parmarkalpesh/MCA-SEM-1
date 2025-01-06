import java.io.*;
class ex93
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis=new FileInputStream(args[0]);
			DataInputStream dis=new DataInputStream(fis);
			System.out.println(dis.readBoolean());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readDouble());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			dis.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}