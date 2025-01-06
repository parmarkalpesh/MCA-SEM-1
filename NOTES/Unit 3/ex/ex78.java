import java.util.*;

public class ex78
{

    	public static void main(String[] args) 
	{
        	//... Initialization
	        double n;                // Holds the next input number.
       	 	double sum = 0;          // Sum of all input numbers.
        	Scanner in = new Scanner(System.in);

        	//... Prompt and read input in a loop.
        	System.out.println("Will add numbers.  Non-number stops input.");
        
        	while (in.hasNextDouble()) 
		{
            		n = in.nextDouble();
            		sum = sum + n;
        	}
        	in.close(); 

        	//... Display output
        	System.out.println("The total is " + sum);
    	}
}