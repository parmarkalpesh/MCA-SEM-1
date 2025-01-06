import java.util.*;

public class ex75
{
	public static void main(String[] args) 
	{
                String s = "welcome:to:MCA:with:MEFGI:GTU";
  		StringTokenizer stringTokenizer = new StringTokenizer(s,":");
  		System.out.println("The total no. of tokens generated :  " + stringTokenizer.countTokens());
  		
		while(stringTokenizer.hasMoreTokens())
		{
  			System.out.println(stringTokenizer.nextToken());
  		}
  	}
}
