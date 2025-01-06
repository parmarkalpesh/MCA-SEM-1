import java.util.*;
class ex16
{
	public static void main(String args[])
	{
		Vector v1=new Vector();
		int length=args.length;
		
		for(int i=0;i<length;i++)
		{
			v1.addElement(args[i]);
		}
		
		v1.insertElementAt("Cobol",2);
		int size=v1.size();
		
		String str1[]=new String[size];

		v1.copyInto(str1);
		System.out.println("List Of Arguments");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(str1[i]);
		}
	}
}