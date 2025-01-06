import java.util.regex.*;
class T
{
public static void main(String args[])
	{
	//Example of Regular Expression
	Pattern p=Pattern.compile("[w|W]{3}[.][a-zA-Z0-9]+[.][a-zA-Z0-9]+");
	Matcher m=p.matcher(args[0]);
	System.out.println(m.matches());

	m=m.usePattern(Pattern.compile("[w]{3}[.][a-zA-Z0-9]+[.][a-zA-Z0-9]+"));
	System.out.println(m.matches());
	
	//Example of Split Function
	Pattern p1=Pattern.compile("[ @.]");
	String str[]=p1.split(args[1]);

	for(String s:str)
		System.out.println(s);

	System.out.println(Pattern.matches("ab", "aaaaab"));
	}
}
