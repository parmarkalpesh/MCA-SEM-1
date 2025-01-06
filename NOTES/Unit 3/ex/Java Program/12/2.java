import java.util.*;
class Tm 
{
public static void main(String[] args) 
	{
	TimeZone t1=TimeZone.getDefault();
	System.out.println(t1);
	System.out.println(t1.getID());
	System.out.println(t1.getDisplayName());
	System.out.println(t1.getOffset(new Date().getTime())/1000/60 + " " + "Minutes");	
	}
}