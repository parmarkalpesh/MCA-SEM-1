class a extends Thread
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
class b extends Thread
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
class c extends Thread
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
class ex25
{
        public static void main(String args[])
        {
                a threada=new a();
                b threadb=new b();
                c threadc=new c();

                threadc.setPriority(Thread.MIN_PRIORITY);
                threadb.setPriority(Thread.NORM_PRIORITY);
                threada.setPriority(Thread.MAX_PRIORITY);

                System.out.println("Thread A Started");
                threada.start();

                System.out.println("Thread B Started");
                threadb.start();

                System.out.println("Thread C Started");
                threadc.start();
        }
}
