import java.lang.*;
class a extends Thread
{
        public void run()
        {
                for(int i=1;i<=5;i++)
                {
                        if(i==1)
                        {
                                yield();
                        }
                        System.out.println("From Thread A : i = "+i);
                }
                System.out.println("Exit From Thread A");
        }
}
class b extends Thread
{
        public void run()
        {
                for(int j=1;j<=5;j++)
                {
                        System.out.println("From Thread B : j = "+j);
                        if(j==3)
                        {
                                stop();
                        }
                }
                System.out.println("Exit From Thread B");
        }
}
class c extends Thread
{
        public void run()
        {
                for(int k=1;k<=5;k++)
                {
                        System.out.println("From Thread c : k = "+k);
                        if(k==2)
                        {
                                try
                                {
                                        sleep(4000);
                                }
                                catch(Exception e)
                                {}
                        }
                }
                System.out.println("Exit From Thread C");
        }
}
class ThreadLifeCycle
{
        public static void main(String args[])
        {
                a Thread_A = new a();
                b Thread_B = new b();
                c Thread_C = new c();

                System.out.println("Start Thread A");
                Thread_A.start();

                System.out.println("Start Thread B");
                Thread_B.start();

                System.out.println("Start Thread C");
                Thread_C.start();

                System.out.println("End Of Main Thread");
        }
}
