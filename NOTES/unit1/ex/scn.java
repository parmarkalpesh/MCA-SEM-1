import java.util.Scanner;
import java.io.*;       
public class scn
{
	public static void main(String[] args)
  	{
    		Scanner in = new Scanner(System.in);
    		int integer;
    		long longInteger;
	    	float realNumber;
    		double doubleReal;
    		String string1;
    		String string2;
   
     		System.out.println("Enter an integer, a long integer and a floating-point");
    		System.out.println("number, another floating-point number, and a string.");
    		System.out.println("Separate each with a blank or return.");   
 
    		integer = in.nextInt();
    		longInteger = in.nextLong();
    		realNumber = in.nextFloat();
    		doubleReal = in.nextDouble();
    		string1 = in.nextLine();
    		System.out.println("Now enter another value.");
    		string2 = in.next();
   
    		System.out.println("Here is what you entered: ");
    		System.out.println(integer + " " + longInteger + " " + realNumber +
                       " " + doubleReal + " " + string1 +
                       " and " + string2);
  	}
 
}

/*

Output:
Enter an integer, a long integer, a floating-point
number, another floating-point number, and a string.
Separate each with a blank or return.
23
24
25.0 233333333333333.444 Hello
Now enter another value.
23.4
Here is what you entered:
23 24 25.0 2.3333333333333344E14  Hello and 23.4

*/
