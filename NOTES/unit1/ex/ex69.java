import java.util.*;

public class ex69
{
        public static void main(String[] args) 
	{
                HashSet hst = new HashSet();
                hst.add("Gyan");
                hst.add("Rohit");
                hst.add("Anand");
                hst.add("Arunesh");
                boolean bl = hst.contains("Gyan");
                System.out.println("Is Gyan exists? :" + bl);
        }
}