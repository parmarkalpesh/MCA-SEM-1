import java.util.*;
class ex60
{
        public static void main(String args[])
        {
                Stack s=new Stack();

                for(int i=0;i<args.length;i++)
                {
                        s.push(new Integer(args[i]));
                }
                while(!s.empty())
                {
                        Object obj=s.pop();
                        System.out.println(obj);
                }
        }
}
