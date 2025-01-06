import java.util.*;

public class ex73
{
        public static void main(String args[]) 
	{
                SortedMap Smap = new TreeMap();
                Smap.put(1, "Singh");
                Smap.put(3, "Kumar");
                Smap.put(4, "Kumar");
                Smap.put(2, "Nagar");
                Smap.put(6, "Prakash");
                SortedMap submap = Smap.subMap(2, 5);
                System.out.println("The Sorted map elements are : " + Smap);
                System.out.println("The Sub Map from sortedMap is as : " + submap);
        }
}