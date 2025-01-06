import java .util.*;
public class ex18
{
        public static void main(String args[])
        {
                Stack mystack = new Stack();
                mystack.push(new Integer(10));
                mystack.push(new Integer(20));
                Integer s1=(Integer)mystack.pop();
                Integer s2=(Integer)mystack.pop();
                int sum = s1.intValue()+s2.intValue();
                System.out.println(sum);
        }
}
