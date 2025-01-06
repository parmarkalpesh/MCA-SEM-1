import java.io.*;
class ex92
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fos=new FileOutputStream(args[0]);
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeBoolean(false);
			dos.writeByte(Byte.MAX_VALUE);
			dos.writeChar('a');
			dos.writeDouble(Double.MAX_VALUE);
			dos.writeFloat(Float.MAX_VALUE);
			dos.writeInt(Integer.MAX_VALUE);
			dos.writeLong(Long.MAX_VALUE);
			dos.writeShort(Short.MAX_VALUE);
			dos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}