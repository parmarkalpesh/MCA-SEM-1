import java.lang.*;
class runna implements Runnable
{
        public void run()
        {
                for(int i=1;i<=5;i++)
                {
                        System.out.println("From Thread A : i = "+i);
                }
                System.out.println("Exit From Thread A");
        }
}
class runnb implements Runnable
{
        public void run()
        {
                for(int j=1;j<=5;j++)
                {
                        System.out.println("From Thread B : j = "+j);
                }
                System.out.println("Exit From Thread B");
        }
}
class runnc implements Runnable
{
        public void run()
        {
                for(int k=1;k<=5;k++)
                {
                        System.out.println("From Thread C : k = "+k);
                }
                System.out.println("Exit From Thread C");
        }
}
class ex26
{
        public static void main(String args[])
        {
                runna ra = new runna();
                runnb rb = new runnb();
                runnc rc = new runnc();

                Thread ta = new Thread(ra);
                System.out.println("Thread A Started");
                ta.start();

                Thread tb = new Thread(rb);
                System.out.println("Thread B Started");
                tb.start();

                Thread tc = new Thread(rc);
                System.out.println("Thread C Started");
                tc.start();

                System.out.println("End Of Main Thread");
        }
}
