import java.util.*;
class ex67
{
        public static void main(String args[])
        {
                Hashtable hs=new Hashtable();

                hs.put("Apple","Red");
                hs.put("Grapes","Green");
                hs.put("Mango","Orange");
		hs.put("Tomato","Red");

                Enumeration e=hs.keys();

                while(e.hasMoreElements())
                {
                        Object k=e.nextElement();
                        Object v=hs.get(k);
                        System.out.println("Key = "+k+" Value = "+v);
                }
                System.out.print("The Color Of Apple Is = ");
                Object x=hs.get("Apple");
                System.out.println(x);
        }
}
