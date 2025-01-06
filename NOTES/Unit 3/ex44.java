import java.io.*;
class ex44
{
        public static void main(String args[])
        {
                int a=10;
                int b=5;
                int c=5;

                int x=0,y=0;

                try
                {
                        x=a/(b-c);
                }
                catch(ArithmeticException e)
                {
                        System.out.println("Division By Zero");
                }
                y=a/(b+c);
                System.out.println("Y = "+y);
        }
}
        
