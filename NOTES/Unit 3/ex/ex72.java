import java.util.*;

public class ex72
{
        public static void main(String args[]) 
	{
                SortedSet Sset = new TreeSet();
                Sset.add("Gyan");
                Sset.add("Ankit");
                Sset.add("Arun");
                Sset.add("Anand");
                Sset.add("Ram");
                System.out.println("The SortedSet entries is as follows : " + Sset);
                System.out.println("The tail set of the set is : " + Sset.tailSet("Gyan"));
        }
}