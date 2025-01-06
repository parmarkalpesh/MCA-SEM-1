import java.io.*;
class ex81
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Path Separator Character = "+File.pathSeparator);
			System.out.println("File Separator Character = "+File.separator);
			File f=new File(args[0]);
			System.out.println("Use Of getName() = "+f.getName());
			System.out.println("Use Of getParent() = "+f.getParent());
			System.out.println("Use Of getAbsolutePath() = "+f.getAbsolutePath());
			System.out.println("Use Of getCanonicalPath() = "+f.getCanonicalPath());
			System.out.println("Use Of getPath() = "+f.getPath());
			System.out.println("Use Of canRead() = "+f.canRead());
			System.out.println("Use Of canWrite() = "+f.canWrite());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}