class A
{
        B b;
        synchronized void A1()
        {
                System.out.println("A1 Started");
                b.B2();
        }
        synchronized void A2()
        {
                System.out.println("Starting A2");
        }
}
class B
{
        A a;
        synchronized void B1()
        {
                System.out.println("B1 Started");
                a.A2();
        }
        synchronized void B2()
        {
                System.out.println("Starting B2");
        }
}

class thread1 extends Thread
{
        A a;
        thread1(A a)
        {
                this.a=a;
        }
        public void run()
        {
                for(int i=0;i<100000;i++)
                {
                        a.A1();
                }
        }
}
class thread2 extends Thread
{
        B b;
        thread2(B b)
        {
                this.b=b;
        }
        public void run()
        {
                for(int j=0;j<100000;j++)
                {
                        b.B1();
                }
        }
}
class ex28
{
        public static void main(String args[])
        {
                A a=new A();
                B b=new B();
                a.b=b;
                b.a=a;
                thread1 t1=new thread1(a);
                thread2 t2=new thread2(b);
                t1.start();
                t2.start();

                try
                {
                        t1.join();
                        t2.join();
                }
                catch(Exception e)
                {
                        System.out.println("Error = "+e);
                }
                System.out.println("DONE");
        }
}
