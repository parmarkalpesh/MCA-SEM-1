import java.util.*;

public class ex74
{
	public static void main(String[] args) 
	{
  		StringTokenizer stringTokenizer = new StringTokenizer("You are tokenizing a string");
  		System.out.println("The total no. of tokens generated :  " + stringTokenizer.countTokens());
  		
		while(stringTokenizer.hasMoreTokens())
		{
  			System.out.println(stringTokenizer.nextToken());
  		}
  	}
}