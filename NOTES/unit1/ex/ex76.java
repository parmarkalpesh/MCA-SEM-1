import java.util.regex.Pattern;

public class ex76
{
	public static void main(String args[]) 
	{
		String regex = "ad*";
		String input = "add";

		boolean isMatch = Pattern.matches(regex, input);
    		System.out.println(isMatch);//return true
	}
}