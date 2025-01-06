import java.util.regex.*;
class T
{
public static void main(String args[])
	{
	Pattern p=Pattern.compile("[,@$ ]");
	String str[]=p.split(args[0]);

	for(String s:str)
		System.out.println(s);

	//Matcher m=p.matcher(args[0]);
	//System.out.println(m.matches());
	
	}
}
