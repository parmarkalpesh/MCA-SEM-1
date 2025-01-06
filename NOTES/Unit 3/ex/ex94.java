import java.io.*;
class ex94
{
	public static void main(String args[])
	{
		try
		{
			RandomAccessFile raf=new RandomAccessFile(args[0],"r");
			long count=Long.valueOf(args[1]).longValue();
			long pos=raf.length();
			pos=pos-count;
			if(pos<0)
				pos=0;
			raf.seek(pos);
			while(true)
			{
				try
				{
					byte b=raf.readByte();
					System.out.print((char)b);
				}
				catch(Exception eo)
				{
					break;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}