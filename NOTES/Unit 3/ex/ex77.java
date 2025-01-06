import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex77
{
	public static void main(String s[])
	{ 
		Pattern p;
		Matcher m;
	   	String EMAIL_ADD = "^([a-zA-Z0-9])+([._+-])+([a-zA-Z0-9])+([@])+([a-zA-Z])+([.])+([a-zA-Z]{0,3})$";

	   	p=Pattern.compile(EMAIL_ADD);

     	   	m = p.matcher("nasit.chetan33@gmail.com");

        	if(m.matches())
        	{
	   		System.out.println("PERFECT MATCHING");
	   	}
	   	else
        	{
	  		System.out.println("NOT MATCHING");
    		}
	}
}
