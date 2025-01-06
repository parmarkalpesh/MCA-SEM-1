import java.util.*;
class ex62
{
        public static void main(String args[])
        {
                String str="123/45.3/-11.2/41/-90.1/100/99.99/-50/-20";
                StringTokenizer st=new StringTokenizer(str,"/");

                while(st.hasMoreElements())
                {
                        String s=st.nextToken();
                        System.out.println(s);
                }
        }
}
